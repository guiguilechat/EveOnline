package fr.guiguilechat.eveonline.programms.lootstats;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Stream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Week;

import fr.guiguilechat.eveonline.database.EveCentral;
import fr.guiguilechat.eveonline.database.yaml.Type;
import fr.guiguilechat.eveonline.database.yaml.YamlDatabase;

public class MakeStats {

	public static void main(String[] args) throws IOException {
		YamlDatabase db = new YamlDatabase();
		LootParser bp = new LootParser(new YamlDatabase());
		EveCentral central = new EveCentral();
		File srcDir = new File("src/main/resources");
		srcDir.mkdirs();
		for (String dirname : args) {
			File dir = new File(dirname);
			File outDir = new File(srcDir, dir.getName());
			outDir.mkdirs();
			PrintStream ps = new PrintStream(new File(outDir, "result.txt"));
			ArrayList<LootEntry> list = bp.loadDirectory(dir);

			int[] allItemsIds = list.stream().flatMapToInt(e -> e.loots.keySet().stream().mapToInt(i -> i)).distinct()
					.toArray();
			central.cache(allItemsIds);
			HashSet<Integer> allFactionItems = new HashSet<>();
			ps.println("factionloot:");
			for (int i : allItemsIds) {
				Type t = db.getTypeById(i);
				if (t != null) {
					int metal = t.metaLvl;
					if (metal > 4) {
						ps.println("  " + t.name + " : "
								+ list.stream().mapToInt(le -> le.loots.getOrDefault(i, 0)).sum());
						allFactionItems.add(i);
					}
				}
			}
			IntToDoubleFunction cost = central::getBO;
			LinkedHashMap<String, Double> catValue = new LinkedHashMap<>();
			LinkedHashMap<String, Integer> catNumber = new LinkedHashMap<>();

			HashMap<String, Double> catToAvgBO = translateLootsToCat(list.stream(), cost, catValue, catNumber, false);
			ArrayList<Entry<String, Double>> sorted = new ArrayList<>(catToAvgBO.entrySet());
			Collections.sort(sorted, (e1, e2) -> catNumber.get(e2.getKey()) - catNumber.get(e1.getKey()));
			ps.println("\ndrops:");
			for (Entry<String, Double> e : sorted) {
				ps.println("  " + e.getKey() + ": " + catNumber.get(e.getKey()));
			}

			Collections.sort(sorted, (e1, e2) -> (int) Math.signum(e2.getValue() - e1.getValue()));
			ps.println("\navgValueM:");
			DecimalFormat df = new DecimalFormat("#.##");
			for (Entry<String, Double> e : sorted) {
				ps.println("  " + e.getKey() + ": " + df.format(e.getValue() / 1000000));
			}

			catValue.clear();
			catNumber.clear();
			cost = i -> allFactionItems.contains(i) ? 1 : 0;
			catToAvgBO = translateLootsToCat(list.stream(), cost, catValue, catNumber, false);
			sorted = new ArrayList<>(catToAvgBO.entrySet());
			sorted.removeIf(e -> catNumber.get(e.getKey()) < 10);
			Collections.sort(sorted, (e1, e2) -> (int) Math.signum(e2.getValue() - e1.getValue()));
			ps.println("\nfactiondroppct:");
			df = new DecimalFormat("#.#");
			for (Entry<String, Double> e : sorted) {
				ps.println("  " + e.getKey() + ": " + df.format(e.getValue() * 100));
			}

			makeChart(outDir, list.stream(), central::getBO, le -> new String[] { "" + le.sec }, "ss value per week",
					Week::new);
			makeChart(outDir, list.stream(), central::getBO, le -> new String[] { "all", "" + le.type },
					"type value per week", Week::new);
			makeChart(outDir, list.stream(), central::getBO, le -> new String[] { "all", "" + le.type },
					" type value per month", Month::new);
			makeChart(outDir, list.stream(), central::getBO,
					le -> new String[] { "all", le.type.substring(0, 1) + "-" + le.race.substring(0, 2) },
					"type-race value per week", Week::new);
		}
	}

	public static HashMap<String, Double> translateLootsToCat(Stream<LootEntry> list, IntToDoubleFunction cost,
			LinkedHashMap<String, Double> catValue, LinkedHashMap<String, Integer> catNumber, boolean addSec) {
		list.forEach(le -> {
			double lootBO = 0;
			for (Entry<Integer, Integer> e : le.loots.entrySet()) {
				lootBO += cost.applyAsDouble(e.getKey()) * e.getValue();
			}
			String[] cats = addSec
					? new String[] { "all", le.type + "-" + le.race + "-" + le.sec, le.type + "-" + le.race, "" + le.sec,
							le.type }
			: new String[] { "all", le.type + "-" + le.race, le.type };
					for (String cat : cats) {
						catValue.put(cat, lootBO + catValue.getOrDefault(cat, 0.0));
						catNumber.put(cat, 1 + catNumber.getOrDefault(cat, 0));
					}
		});
		HashMap<String, Double> catToAvgBO = new HashMap<>();
		for (Entry<String, Double> e : catValue.entrySet()) {
			catToAvgBO.put(e.getKey(), e.getValue() / catNumber.get(e.getKey()));
		}
		return catToAvgBO;
	}

	public static double getAvgValue(Stream<LootEntry> list, IntToDoubleFunction cost) {
		double totalValue = 0.0;
		int nbloots = 0;
		for (LootEntry le : list.toArray(LootEntry[]::new)) {
			totalValue += getValue(le, cost);
			nbloots++;
		}
		return totalValue / nbloots;
	}

	public static double getValue(LootEntry le, IntToDoubleFunction cost) {
		return le.loots.entrySet().stream().mapToDouble((e) -> e.getValue() * cost.applyAsDouble(e.getKey())).sum();
	}

	public static Map<String, Map<RegularTimePeriod, Double>> makeGroupToPeriodToValues(Stream<LootEntry> loots,
			IntToDoubleFunction cost, Function<LootEntry, String[]> grouper, Function<Date, RegularTimePeriod> dateGrouper) {
		Map<String, Map<RegularTimePeriod, List<LootEntry>>> groupToDateToLoots = new HashMap<>();
		// for each week
		loots.forEach(le -> {
			RegularTimePeriod period = dateGrouper.apply(le.date);
			for (String group : grouper.apply(le)) {
				Map<RegularTimePeriod, List<LootEntry>> groupWeeks = groupToDateToLoots.get(group);
				if (groupWeeks == null) {
					groupWeeks = new HashMap<>();
					groupToDateToLoots.put(group, groupWeeks);
				}
				List<LootEntry> weekLoots = groupWeeks.get(period);
				if (weekLoots == null) {
					weekLoots = new ArrayList<>();
					groupWeeks.put(period, weekLoots);
				}
				weekLoots.add(le);
			}
		});
		Map<String, Map<RegularTimePeriod, Double>> groupToDateToValue = new HashMap<>();
		for (Entry<String, Map<RegularTimePeriod, List<LootEntry>>> e : groupToDateToLoots.entrySet()) {
			Map<RegularTimePeriod, Double> weekToValue = new HashMap<>();
			groupToDateToValue.put(e.getKey(), weekToValue);
			for (Entry<RegularTimePeriod, List<LootEntry>> e2 : e.getValue().entrySet()) {
				weekToValue.put(e2.getKey(), getAvgValue(e2.getValue().stream(), cost));
			}
		}
		return groupToDateToValue;
	}

	/**
	 * make a chart on a stream of loot entries
	 *
	 * @param loots
	 *          the loot entries
	 * @param cost
	 *          the function to get the cost of an element ID
	 * @param grouper
	 *          generates the groups a LootEntry belongs to
	 * @param name
	 *          the name of the chart
	 * @param dateGrouper
	 *          translates the dates to their period (eg {@link Week}::new)
	 */
	public static void makeChart(File dir, Stream<LootEntry> loots, IntToDoubleFunction cost,
			Function<LootEntry, String[]> grouper, String name, Function<Date, RegularTimePeriod> dateGrouper) {

		TimeSeriesCollection dataset = new TimeSeriesCollection();

		for (Entry<String, Map<RegularTimePeriod, Double>> e : makeGroupToPeriodToValues(loots, cost, grouper, dateGrouper)
				.entrySet()) {
			TimeSeries ts = new TimeSeries(e.getKey());
			dataset.addSeries(ts);
			for (Entry<RegularTimePeriod, Double> e2 : e.getValue().entrySet()) {
				ts.add(e2.getKey(), e2.getValue() / 1000000);

			}
		}
		// create the chart...

		JFreeChart chart = ChartFactory.createTimeSeriesChart("average " + name, "loot date", "value in M", dataset);
		((DateAxis) chart.getXYPlot().getDomainAxis()).setDateFormatOverride(new SimpleDateFormat("yyyy-w"));
		FileOutputStream out = null;
		try {
			dir.mkdirs();
			out = new FileOutputStream(new File(dir, name + ".png"));
			ChartUtilities.writeChartAsPNG(out, chart, 1400, 800);
		} catch (IOException iOException) {
		} finally {
			try {
				out.close();
			} catch (Exception ignore) {
			}
		}
	}

}
