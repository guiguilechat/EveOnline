package fr.guiguilechat.eveonline.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import fr.guiguilechat.eveonline.database.apiv2.APIRoot;
import fr.guiguilechat.eveonline.database.apiv2.Account.Character;
import fr.guiguilechat.eveonline.database.apiv2.Char.BPEntry;
import fr.guiguilechat.eveonline.database.esi.ESIMarket;
import fr.guiguilechat.eveonline.database.yaml.Blueprint;
import fr.guiguilechat.eveonline.database.yaml.Blueprint.Material;
import fr.guiguilechat.eveonline.database.yaml.Location;
import fr.guiguilechat.eveonline.database.yaml.MetaInf;
import fr.guiguilechat.eveonline.database.yaml.Type;
import fr.guiguilechat.eveonline.database.yaml.YamlDatabase;

/**
 *
 * Iterate over the bpc in inventory and make the difference in item required /
 * item produced prices.
 */
public class ProdEval {

	public static class BPEval {
		public String name;
		public LinkedHashMap<String, Integer> required = new LinkedHashMap<>();
		public String outName;
		public int outNb;
		public double outValue, inValue;
		public double gain;
		public double mult;
		public MetaInf output;
	}

	public List<String[]> apis = new ArrayList<>();
	public Pattern[] nameFilter = {};
	public double intTax = 2;
	public double outTax = 03;
	public double prodTax = 02;
	public String hub = "TheForge";
	public boolean intputSO = true;
	public boolean outputSO = false;
	public double mingain = Double.NEGATIVE_INFINITY;
	public double minmult = 0.0;
	public boolean debug = false;
	public boolean skipSkills = false;

	public boolean bpo = false, bpc = false;

	// we accept to produce item which are on accept list and are not on skip
	// list.
	// if accept list is empty we only check not on skip list
	public ArrayList<Predicate<Type>> acceptList = new ArrayList<>();
	public ArrayList<Predicate<Type>> skipList = new ArrayList<>();

	public ToDoubleFunction<BPEval> bpValue = bp -> bp.gain;

	public ArrayList<BPEval> evaluateBPs() {
		ArrayList<BPEval> evaluations = new ArrayList<>();
		YamlDatabase db = new YamlDatabase();
		Location hubR = db.getLocation(hub);
		if (hubR != null) {
			if (hubR.parentRegion != null) {
				hubR = db.getLocation(hubR.parentRegion);
			}
		}
		ESIMarket market = new ESIMarket(hubR.locationID);
		for (String[] api : apis) {
			APIRoot r = new APIRoot(Integer.parseInt(api[0]), api[1]);
			// first pass we copy the bpcs to get the required and produced amount of
			// materials
			for (Character chara : r.account.characters()) {
				if (!acceptName(chara.name)) {
					continue;
				}
				HashMap<String, Integer> skills = r.chars.skillsByName(chara.characterID);
				HashSet<String> missingSkills = new HashSet<>();
				for (BPEntry bp : r.chars.blueprints(chara.characterID)) {
					// blueprint unknown ??
					Blueprint bpt = db.getBlueprints().get(bp.typeName);
					if (bpt == null) {
						if (debug) {
							System.err.println("null bp for " + bp.typeName);
						}
						continue;
					}
					MetaInf outMeta = db.getMetaInfs().get(bpt.manufacturing.products.get(0).name);
					// out type unknown? (not in database yet)
					Type outType = outMeta != null ? db.getTypeById(outMeta.id) : null;
					if (outMeta == null) {
						if (debug) {
							System.err.println("item type " + bpt.manufacturing.products.get(0).name + " unknown");
						}
						continue;
					}
					// is there a skill required by this bp we don't have ?
					if (!skipSkills && bpt.manufacturing.skills.stream().filter(sk -> skills.getOrDefault(sk.name, 0) < sk.level)
							.findAny().isPresent()) {
						if (debug && missingSkills.add(bpt.name)) {
							System.err.println("missing skills for " + bpt.name);
						}
						continue;
					} // skip bpo ?
					if (bpo != bpc && !bpo && bp.runs <= 0) {
						continue;
					}
					// skip bpc ?
					if (bpo != bpc && !bpc && bp.runs > 0) {
						continue;
					}
					// does it match the filters ?
					if (!acceptBP(outType)) {
						continue;
					}
					BPEval eval = new BPEval();
					eval.name = bp.typeName;
					for (Material required : bpt.manufacturing.materials) {
						int modifiedQtty = required.quantity == 1 ? required.quantity * Math.max(1, bp.runs)
								: (int) Math.ceil(Math.max(1, bp.runs) * 0.01 * (100 - bp.materialEfficiency) * required.quantity);
						if (modifiedQtty < 1) {
							System.err.println("error on bp " + bpt.name + " material " + required.name + " quantity "
									+ required.quantity + " becomes " + modifiedQtty);
						}
						eval.required.put(required.name, modifiedQtty);
					}
					for (Material mout : bpt.manufacturing.products) {
						eval.outName = mout.name;
						eval.outNb = mout.quantity * Math.max(1, bp.runs);
						eval.output = db.getMetaInfs().get(mout.name);
					}
					evaluations.add(eval);
				}
			}
		}
		// then we cache the materials
		int[] itemIDs = evaluations.stream()
				.flatMap(eval -> Stream.concat(Stream.of(eval.outName), eval.required.keySet().stream())).distinct()
				.mapToInt(s -> db.getMetaInfs().get(s).id).toArray();
		market.cacheBOs(itemIDs);
		market.cacheSOs(itemIDs);
		// then we retrieve sell / buy value of items and compute the gain value of
		// each bpc
		for (BPEval eval : evaluations) {
			for (Entry<String, Integer> e : eval.required.entrySet()) {
				int id = db.getMetaInfs().get(e.getKey()).id;
				eval.inValue += (intputSO ? market.getSO(id, e.getValue()) : market.getBO(id, e.getValue()))
						* (1.0 + intTax / 100);
			}
			eval.outValue += (outputSO ? market.getSO(eval.output.id, eval.outNb) : market.getBO(eval.output.id, eval.outNb))
					* (1.0 - outTax / 100);
			eval.inValue += db.ESIBasePrices().getAdjusted(eval.output.id) * eval.outNb * prodTax / 100;
			eval.gain = eval.outValue - eval.inValue;
			eval.mult = eval.outValue / eval.inValue;
		}
		evaluations.removeIf(bpce -> bpce.gain < mingain || bpce.mult < minmult);
		ToDoubleFunction<BPEval> eval = bpValue;
		Collections.sort(evaluations, (e1, e2) -> (int) Math.signum(eval.applyAsDouble(e2) - eval.applyAsDouble(e1)));
		return evaluations;
	}

	/**
	 * do we accept to produce given type ?
	 *
	 * @param bp
	 * @return
	 */
	public boolean acceptBP(Type item) {
		if (item == null) {
			return acceptList.isEmpty() && skipList.isEmpty();
		}
		return (acceptList.isEmpty() || acceptList.stream().filter(p -> p.test(item)).findAny().isPresent())
				&& !skipList.stream().filter(p -> p.test(item)).findAny().isPresent();
	}

	public void setNameFilter(String... names) {
		nameFilter = Stream.of(names).map(s -> Pattern.compile(".*" + s.toLowerCase() + ".*")).toArray(Pattern[]::new);
	}

	public boolean acceptName(String name) {
		if (nameFilter == null || nameFilter.length == 0) {
			return true;
		}
		name = name.toLowerCase();
		for (Pattern p : nameFilter) {
			if (p.matcher(name).matches()) {
				return true;
			}
		}
		return false;
	}

	public static final Predicate<Type> isShip = t -> t != null && "Ship".equals(t.catName);
	public static final Predicate<Type> isModule = t -> t != null && "Module".equals(t.catName);
	public static final Predicate<Type> isT1 = t -> t != null && t.metaLvl < 5;
	public static final Predicate<Type> isT2 = t -> t != null && t.isT2();
	public static final Predicate<Type> isStoryline = t -> t != null && t.isStoryline();
	public static final Predicate<Type> isFaction = t -> t != null && t.isFaction();

	public static final HashMap<String, Predicate<Type>> filters = new HashMap<>();
	static {
		filters.put("ship", isShip);
		filters.put("mod", isModule);
		filters.put("t1", isT1);
		filters.put("t2", isT2);
		filters.put("story", isStoryline);
		filters.put("faction", isFaction);
	}

	public static void main(String[] args) {

		ProdEval eval = new ProdEval();
		boolean help = false;
		boolean showmat = false;

		for (String arg : args) {
			if (arg.startsWith("api=")) {
				String apis = arg.substring("api=".length());
				for (String api : apis.split(",")) {
					eval.apis.add(api.split(":"));
				}
			} else if (arg.startsWith("names=")) {
				eval.setNameFilter(arg.substring("name=".length()).split(","));
			} else if (arg.startsWith("outtax=")) {
				eval.outTax = Double.parseDouble(arg.substring("outtax=".length()));
			} else if (arg.startsWith("prodtax=")) {
				eval.prodTax = Double.parseDouble(arg.substring("prodtax=".length()));
			} else if (arg.startsWith("hub=")) {
				eval.hub = arg.substring("hub=".length());
			} else if (arg.startsWith("mingain=")) {
				eval.mingain = Double.parseDouble(arg.substring("mingain=".length()));
			} else if (arg.startsWith("minmult=")) {
				eval.minmult = Double.parseDouble(arg.substring("minmult=".length()));
			} else if (arg.startsWith("if")) {
				String condition = arg.substring("if".length());
				Predicate<Type> p = filters.get(condition);
				if (p != null) {
					eval.acceptList.add(p);
				} else {
					System.err.println("no condition known for " + condition);
				}
			} else if (arg.startsWith("no")) {
				String condition = arg.substring("no".length());
				Predicate<Type> p = filters.get(condition);
				if (p != null) {
					eval.skipList.add(p);
				} else {
					System.err.println("no condition known for " + condition);
				}
			} else {
				switch (arg.toLowerCase()) {
				case "bpo":
					eval.bpo = true;
					break;
				case "bpc":
					eval.bpc = true;
					break;
				case "all5":
					eval.skipSkills = true;
					break;
				case "boso":
					eval.intputSO = false;
					eval.outputSO = true;
					break;
				case "bobo":
					eval.intputSO = false;
					eval.outputSO = false;
					break;
				case "soso":
					eval.intputSO = true;
					eval.outputSO = true;
					break;
				case "sobo":
					eval.intputSO = true;
					eval.outputSO = false;
					break;
				case "gain":
					eval.bpValue = bp -> bp.gain;
					break;
				case "mult":
					eval.bpValue = bp -> bp.mult;
					break;
				case "matlist":
					showmat = true;
					break;
				case "debug":
					eval.debug = true;
					break;
				case "help":
				case "-help":
				case "--help":
					help = true;
					break;
				default:
					System.out.println("key and code already set, can't use param " + arg);
				}
			}
		}

		if (eval.apis.isEmpty() || help) {
			System.out.println(
					"This program uses your API key and code to retrieve your blueprints. It computes the value of required/output materials of those blueprints.\n"
							+ "It then prints the blueprints by decreasing interest, as well as the list of materials to buy\n"
							+ "options:\n" + " api=KEY1:CODE1,KEY2:CODE2 set the api keys and codes\n"
							+ " names=name1[,name2] limit the characters to those whose name matches at least one filter. no case sensistive"
							+ " hub=A set the region to get the prices from. default=TheForge\n"
							+ " outtax=X set the tax of output to X(default 3.0)%\n"
							+ " intax=X set the tax of input items to X(default 2.0)%\n"
							+ " prodtax=X set the total tax (system+structure) to x%. default 2%\n"
							+ " mingain=MIN set the minimum gain of a bp to even consider it. default -inf\n"
							+ " minmult=MIN set the minimum money mult of a bp to consider it. default 0.0\n"
							+ " bobo|boso|soso|sobo to set the evaluation of materials for required/output (sobo is sell order for input, buy order output)\n"
							+ " mult|gain order the bps by isk multiplier of net isk gain\n"
							+ " bpo|bpc only consider blueprint Original or Copy\n" + " matlist print the list of materials\n"
							+ " ifCOND accept production of items which meet at least one cond\n"
							+ " noCOND prevent production of any item which meet any cond\n" + "  known cond are " + filters.keySet()
							+ "\n"
							+ "   eg ifship ifmodule not1 not2 will only show production of ships and modules which are meta 6+\n"
							+ " all5 skip the skills requirement of bp\n" + " debug output potentially uselfull information\n"
							+ " help|-help|--help print this help and exit");
			System.exit(1);
		}
		HashMap<String, Long> toBuy = new HashMap<>();
		for (BPEval e : eval.evaluateBPs()) {
			System.out.println(
					"" + e.name + (e.outNb == 1 ? "" : "*" + e.outNb) + " : " + formatPrice(eval.bpValue.applyAsDouble(e)));
			for (Entry<String, Integer> m : e.required.entrySet()) {
				toBuy.put(m.getKey(), m.getValue() + toBuy.getOrDefault(m.getKey(), 0l));
			}
		}
		if (showmat) {
			System.out.println();
			System.out.println("to buy:");
			toBuy.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(e -> {
				System.out.println(e.getKey() + "\t" + e.getValue());
			});
		}
	}

	public static String formatPrice(double price) {
		String signum = price > 0 ? "" : "-";
		price = Math.abs(price);
		String suffix = "";

		if (price > 1000000000000f) {
			price = price / 1000000000000f;
			suffix = "T";
		} else if (price > 1000000000) {
			price = price / 1000000000;
			suffix = "B";
		} else if (price > 1000000) {
			price = price / 1000000;
			suffix = "M";
		} else if (price > 1000) {
			price = price / 1000;
			suffix = "k";
		}
		if (price > 10) {
			price = (int) price;
		} else {
			price = (double) (int) (price * 10) / 10;
		}
		return signum + price + suffix;
	}

}
