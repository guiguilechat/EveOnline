package fr.guiguilechat.eveonline.database.retrieval.sde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.eveonline.database.esi.ESICharacter;
import fr.guiguilechat.eveonline.database.esi.ESILoyalty;
import fr.guiguilechat.eveonline.database.esi.ESILoyalty.Offer;
import fr.guiguilechat.eveonline.database.esi.ESILoyalty.Offer.ItemReq;
import fr.guiguilechat.eveonline.database.esi.ESINpcCorporations;
import fr.guiguilechat.eveonline.database.esi.ESINpcCorporations.Corporation;
import fr.guiguilechat.eveonline.database.esi.ESIUniverse;
import fr.guiguilechat.eveonline.database.esi.ESIUniverse.Station;
import fr.guiguilechat.eveonline.database.esi.ESIUniverse.Systems;
import fr.guiguilechat.eveonline.database.retrieval.sde.cache.SDEData;
import fr.guiguilechat.eveonline.database.yaml.Agent;
import fr.guiguilechat.eveonline.database.yaml.Asteroid;
import fr.guiguilechat.eveonline.database.yaml.Blueprint;
import fr.guiguilechat.eveonline.database.yaml.Blueprint.Activity;
import fr.guiguilechat.eveonline.database.yaml.DatabaseFile;
import fr.guiguilechat.eveonline.database.yaml.Hull;
import fr.guiguilechat.eveonline.database.yaml.LPOffer;
import fr.guiguilechat.eveonline.database.yaml.LPOffer.ItemRef;
import fr.guiguilechat.eveonline.database.yaml.Location;
import fr.guiguilechat.eveonline.database.yaml.MetaInf;
import fr.guiguilechat.eveonline.database.yaml.Module;
import fr.guiguilechat.eveonline.database.yaml.Type;
import fr.guiguilechat.eveonline.database.yaml.YamlDatabase;
import fr.guiguilechat.eveonline.sde.bsd.EagtAgents;
import fr.guiguilechat.eveonline.sde.bsd.EdgmTypeAttributes;
import fr.guiguilechat.eveonline.sde.bsd.EdgmTypeEffects;
import fr.guiguilechat.eveonline.sde.cache.SDECache;
import fr.guiguilechat.eveonline.sde.fsd.Eblueprints;
import fr.guiguilechat.eveonline.sde.fsd.Eblueprints.Material;
import fr.guiguilechat.eveonline.sde.fsd.EcategoryIDs;
import fr.guiguilechat.eveonline.sde.fsd.EgroupIDs;
import fr.guiguilechat.eveonline.sde.fsd.EtypeIDs;
import fr.guiguilechat.eveonline.sde.model.IndustryUsages;

public class SDEDumper {

	public static final File DB_DIR = new File("src/main/resources/SDEDump/");

	public static final String DB_HULLS_RES = "SDEDump/hulls.yaml";
	public static final File DB_HULLS_FILE = new File("src/main/resources/", DB_HULLS_RES);

	public static final String DB_MODULES_RES = "SDEDump/modules.yaml";
	public static final File DB_MODULES_FILE = new File("src/main/resources", DB_MODULES_RES);

	public static final String DB_ASTEROIDS_RES = "SDEDump/asteroids.yaml";
	public static final File DB_ASTEROIDS_FILE = new File("src/main/resources", DB_ASTEROIDS_RES);

	public static final String DB_BLUEPRINT_RES = "SDEDump/blueprints.yaml";
	public static final File DB_BLUEPRINT_FILE = new File("src/main/resources", DB_BLUEPRINT_RES);

	public static final String DB_METAINF_RES = "SDEDump/metainfs.yaml";
	public static final File DB_METAINF_FILE = new File("src/main/resources", DB_METAINF_RES);

	public static final String DB_LOCATION_RES = "SDEDump/locations.yaml";
	public static final File DB_LOCATION_FILE = new File("src/main/resources", DB_LOCATION_RES);

	public static final String DB_LPOFFERS_RES = "SDEDump/lpoffers.yaml";
	public static final File DB_LPOFFERS_FILE = new File("src/main/resources", DB_LPOFFERS_RES);

	public static final String DB_AGENTS_RES = "SDEDump/agents.yaml";
	public static final File DB_AGENTS_FILE = new File("src/main/resources", DB_AGENTS_RES);

	public static void main(String[] args) throws IOException {
		DatabaseFile db = loadDb();
		DB_DIR.mkdirs();

		DatabaseFile dbModules = new DatabaseFile();
		dbModules.modules = db.modules;
		db.modules = new LinkedHashMap<>();
		YamlDatabase.write(dbModules, DB_MODULES_FILE);

		DatabaseFile dbAsteroids = new DatabaseFile();
		dbAsteroids.asteroids = db.asteroids;
		db.asteroids = new LinkedHashMap<>();
		YamlDatabase.write(dbAsteroids, DB_ASTEROIDS_FILE);

		DatabaseFile dbBlueprints = new DatabaseFile();
		dbBlueprints.blueprints = db.blueprints;
		db.blueprints = new LinkedHashMap<>();
		YamlDatabase.write(dbBlueprints, DB_BLUEPRINT_FILE);

		DatabaseFile dbMetaInfs = new DatabaseFile();
		dbMetaInfs.metaInfs = db.metaInfs;
		db.metaInfs = new LinkedHashMap<>();
		YamlDatabase.write(dbMetaInfs, DB_METAINF_FILE);

		DatabaseFile dbLocations = new DatabaseFile();
		dbLocations.locations = db.locations;
		db.locations = new LinkedHashMap<>();
		YamlDatabase.write(dbLocations, DB_LOCATION_FILE);

		DatabaseFile dbLPOffers = new DatabaseFile();
		dbLPOffers.lpoffers = db.lpoffers;
		db.lpoffers = new ArrayList<>();
		YamlDatabase.write(dbLPOffers, DB_LPOFFERS_FILE);

		DatabaseFile dbAgents = new DatabaseFile();
		dbAgents.agents = db.agents;
		db.agents = new LinkedHashMap<>();
		YamlDatabase.write(dbAgents, DB_AGENTS_FILE);

		YamlDatabase.write(db, DB_HULLS_FILE);
	}

	public static DatabaseFile loadDb() throws FileNotFoundException {
		SDEData sde = new SDEData();
		DatabaseFile db = new DatabaseFile();
		ESINpcCorporations corps = new ESINpcCorporations();
		ESICharacter chars = new ESICharacter();
		ESIUniverse uni = new ESIUniverse();

		loadShipModules(sde, db);

		loadAsteroids(sde, db);

		loadBlueprints(sde, db);

		loadLocations(sde, db);

		loadMetaInfs(sde, db);

		// those two must remains at the end because they need the other
		// informations.

		loadLPOffers(sde, db, corps);


		loadAgents(sde, db, corps, chars, uni);

		System.err.println("missings ids " + sde.missings);

		return db;
	}

	public static void loadShipModules(SDEData sde, DatabaseFile db) throws FileNotFoundException {

		Set<Integer> shipGroups = new HashSet<>();
		Set<Integer> modulesGroups = new HashSet<>();
		findShipModuleGroups(shipGroups, modulesGroups);

		// first pass to create the modules and the hulls
		// the attributes will be stored afterwards, once we know which attributes
		// we actually need
		for (Entry<Integer, EtypeIDs> e : sde.getTypeIDs().entrySet()) {
			EtypeIDs elem = e.getValue();
			if (elem.published) {
				Integer groupId = elem.groupID;
				if (shipGroups.contains(groupId)) {
					Hull h = new Hull();
					db.hulls.put(elem.enName(), h);
					loadTypeInformations(h, sde, e.getKey());
					h.attributes.mass = (long) elem.mass;
					h.attributes.volume = (long) elem.volume;
					HashMap<Integer, EdgmTypeEffects> m_effects = sde.getTypeEffects().get(e.getKey());
					if (m_effects != null) {
						for (Integer effect_id : m_effects.keySet()) {
							h.effects.add(sde.getEffects().get(effect_id).effectName);
						}
					}
				} else if (modulesGroups.contains(groupId)) {
					Module m = new Module();
					db.modules.put(elem.enName(), m);
					loadTypeInformations(m, sde, e.getKey());
					HashMap<Integer, EdgmTypeEffects> m_effects = sde.getTypeEffects().get(e.getKey());
					if (m_effects != null) {
						for (Integer effect_id : m_effects.keySet()) {
							m.effects.add(sde.getEffects().get(effect_id).effectName);
						}
					}
				}
			}
		}

		// for each hull, its map of attributeName->
		// attributeValue
		// skip anything that is not hull nor module to free memory
		for (Hull h : db.hulls.values()) {
			LinkedHashMap<String, Object> atts = new LinkedHashMap<>();
			for (Entry<Integer, EdgmTypeAttributes> e : sde.getTypeAttributes().get(h.id).entrySet()) {
				String attributename = sde.getAttributeTypes().get(e.getKey()).attributeName;
				EdgmTypeAttributes affect = e.getValue();
				atts.put(attributename, affect.valueFloat != 0 ? affect.valueFloat : affect.valueInt);
			}
			addHullAttributes(h, atts);
		}
		// same for modules
		for (Module m : db.modules.values()) {
			LinkedHashMap<String, Object> atts = new LinkedHashMap<>();
			for (Entry<Integer, EdgmTypeAttributes> e : sde.getTypeAttributes().get(m.id).entrySet()) {
				String attributename = sde.getAttributeTypes().get(e.getKey()).attributeName;
				EdgmTypeAttributes affect = e.getValue();
				atts.put(attributename, affect.valueFloat != 0 ? affect.valueFloat : affect.valueInt);
			}
			addModuleAttributes(m, atts);
		}
	}

	/**
	 * find the index of groups corresponding to ship category and the index of
	 * group corresponding to the module category.
	 *
	 * @param shipGroups
	 *          the ship groups
	 * @param modulesGroups
	 *          the modules groups
	 * @throws FileNotFoundException
	 *           if the database file are not found
	 */
	@SuppressWarnings("unchecked")
	public static void findShipModuleGroups(Set<Integer> shipGroups, Set<Integer> modulesGroups)
			throws FileNotFoundException {
		// find category for modules and ships
		int shipCat = -1, moduleCat = -1;
		SDECache.donwloadSDE();
		File CategoryYaml = new File(SDECache.CHECKDIR, "fsd/categoryIDs.yaml");
		HashMap<Integer, Map<String, ?>> categorys = (HashMap<Integer, Map<String, ?>>) new Yaml()
				.load(new FileReader(CategoryYaml));
		for (Entry<Integer, Map<String, ?>> e : categorys.entrySet()) {
			String catName = getElemName(e.getValue());
			if ("Module".equals(catName)) {
				moduleCat = e.getKey();
			}
			if ("Ship".equals(catName)) {
				shipCat = e.getKey();
			}
		}

		// find groups in modules and ships category
		File groupYaml = new File(SDECache.CHECKDIR, "fsd/groupIDs.yaml");
		HashMap<Integer, Map<String, ?>> groups = (HashMap<Integer, Map<String, ?>>) new Yaml()
				.load(new FileReader(groupYaml));
		for (Entry<Integer, Map<String, ?>> e : groups.entrySet()) {
			if (Boolean.TRUE.equals(e.getValue().get("published"))) {
				Integer groupCat = (Integer) e.getValue().get("categoryID");
				if (groupCat == shipCat) {
					shipGroups.add(e.getKey());
				}
				if (groupCat == moduleCat) {
					modulesGroups.add(e.getKey());
				}
			}
		}
	}

	/**
	 * store common informations in a type
	 *
	 * @param type
	 *          the actual type to store data into
	 * @param sde
	 *          the database from sde
	 * @param id
	 *          the int id of the type we want to store data
	 */
	public static void loadTypeInformations(Type type, SDEData sde, int id) {
		EtypeIDs elem = sde.getType(id);
		type.id = id;
		if (elem == null) {
			type.name = "unknown_" + id;
			return;
		}
		type.name = elem.enName();
		EgroupIDs group = sde.getGroupIDs().get(elem.groupID);
		EcategoryIDs cat = sde.getCategoryIDs().get(group.categoryID);
		type.groupName = group.enName();
		type.catName = cat.enName();
		type.volume = elem.volume;
	}

	public static void addHullAttributes(Hull hull, LinkedHashMap<String, Object> attributes) {

		hull.attributes.velocity = getelemInt(attributes, "maxVelocity", 0);
		hull.attributes.warpSpeed = getelemDouble(attributes, "baseWarpSpeed", 1.0)
				* getelemDouble(attributes, "warpSpeedMultiplier", 1.0);
		hull.attributes.agility = getelemDouble(attributes, "agility", 0.0);

		hull.attributes.targetRange = getelemInt(attributes, "maxTargetRange", 0);
		hull.attributes.scanRes = getelemInt(attributes, "scanResolution", 0);
		int scanLadar = getelemInt(attributes, "scanLadarStrength", 0);
		int scanRadar = getelemInt(attributes, "scanRadarStrength", 0);
		int scanGravi = getelemInt(attributes, "scanGravimetricStrength", 0);
		int scanMagne = getelemInt(attributes, "scanMagnetometricStrength", 0);
		hull.attributes.scanStr = Math.max(Math.max(scanMagne, scanGravi), Math.max(scanLadar, scanRadar));
		if (hull.attributes.scanStr == scanLadar) {
			hull.attributes.scanType = "LADAR";
		}
		if (hull.attributes.scanStr == scanRadar) {
			hull.attributes.scanType = "RADAR";
		}
		if (hull.attributes.scanStr == scanMagne) {
			hull.attributes.scanType = "Magnetometric";
		}
		if (hull.attributes.scanStr == scanGravi) {
			hull.attributes.scanType = "Gravimetric";
		}
		hull.attributes.maxTargets = getelemInt(attributes, "maxLockedTargets", 0);

		hull.attributes.highSlots = getelemInt(attributes, "hiSlots", 0);
		hull.attributes.mediumSlots = getelemInt(attributes, "medSlots", 0);
		hull.attributes.lowSlots = getelemInt(attributes, "lowSlots", 0);
		hull.attributes.launcherHardPoints = getelemInt(attributes, "launcherSlotsLeft", 0);
		hull.attributes.turretHardPoints = getelemInt(attributes, "turretSlotsLeft", 0);
		hull.attributes.cpu = getelemInt(attributes, "cpuOutput", 0);
		hull.attributes.powergrid = getelemInt(attributes, "powerOutput", 0);
		hull.attributes.capacitor = getelemInt(attributes, "capacitorCapacity", 0);
		hull.attributes.capacitorTime = getelemDouble(attributes, "rechargeRate", 0.0) / 1000;

		hull.attributes.rigSlots = getelemInt(attributes, "rigSlots", 0);
		hull.attributes.rigCalibration = getelemInt(attributes, "upgradeCapacity", 0);
		int rigSize = getelemInt(attributes, "rigSize", 0);
		switch (rigSize) {
		case 0:
			// no rig
			break;
		case 1:
			hull.attributes.rigSize = "small";
			break;
		case 2:
			hull.attributes.rigSize = "medium";
			break;
		case 3:
			hull.attributes.rigSize = "large";
			break;
		case 4:
			hull.attributes.rigSize = "capital";
			break;
		default:
			System.err.println("no rig size for " + rigSize);
			hull.attributes.rigSize = "unknown";
		}

		hull.attributes.droneCapa = getelemInt(attributes, "droneCapacity", 0);
		hull.attributes.droneBandwidth = getelemInt(attributes, "droneBandwidth", 0);

	}

	public static void addModuleAttributes(Module module, LinkedHashMap<String, Object> attributes) {
		module.attributes.cpu = getelemInt(attributes, "cpu", 0);
		module.attributes.powergrid = getelemInt(attributes, "power", 0);
		if (module.effects.contains("hiPower")) {
			module.attributes.slot = "high";
		}
		if (module.effects.contains("medPower")) {
			module.attributes.slot = "medium";
		}
		if (module.effects.contains("loPower")) {
			module.attributes.slot = "low";
		}
		module.attributes.metaLevel = getelemInt(attributes, "metaLevel", 0);
		module.rawAttributes = attributes;
	}

	@SuppressWarnings("unchecked")
	public static String getElemName(Map<String, ?> elem) {
		return ((Map<String, String>) elem.get("name")).get("en");
	}

	public static final Double getelemDouble(Map<String, ?> elem, String key, Double defaultValue) {
		Object ret = elem.get(key);
		if (ret == null) {
			return defaultValue;
		}
		return ((Number) ret).doubleValue();
	}

	public static final Integer getelemInt(Map<String, ?> elem, String key, Integer defaultValue) {
		Object ret = elem.get(key);
		if (ret == null) {
			return defaultValue;
		}
		return ((Number) ret).intValue();
	}

	public static void loadAsteroids(SDEData sde, DatabaseFile db) {
		sde.getTypeIDsForCategory(25).forEach(i -> {
			EtypeIDs type = sde.getType(i);
			Asteroid a = new Asteroid();
			loadTypeInformations(a, sde, i);
			db.asteroids.put(a.name, a);
			String desc = type.description.getOrDefault("en", "");
			if (desc.contains("Available")) {
				String availables = desc.replaceAll("\\n|\\r", "").replaceAll(".*'>", "").replaceAll("</.*", "");
				a.maxSecurity = Float.parseFloat(availables);
			} else {
				a.maxSecurity = -1.0;
			}
		});
		for (Entry<String, Asteroid> e : db.asteroids.entrySet()) {
			Asteroid a = e.getValue();
			IndustryUsages usages = sde.getIndustryUsages().get(a.id);
			if (usages != null) {
				for (Eblueprints l : usages.asMaterial) {
					Material product = l.activities.manufacturing.products.get(0);
					EtypeIDs prodType = sde.getType(product.typeID);
					String prodName = prodType.enName();
					a.compressedTo = prodName;
					Asteroid astProduct = db.asteroids.get(prodName);
					astProduct.compressedFrom = e.getKey();
					astProduct.compressRatio = prodType.groupID == 465 ? 1 : 100;
				}
			}
		}
	}

	public static void loadBlueprints(SDEData sde, DatabaseFile db) {
		for (Entry<Integer, Eblueprints> e : sde.getBlueprints().entrySet()) {
			int id = e.getKey();
			Eblueprints bp = e.getValue();
			Blueprint bp2 = new Blueprint();
			EtypeIDs item = sde.getType(id);
			if (item == null || !item.published) {
				// System.err.println("skip generating data for bp " + id);
				continue;
			}
			loadTypeInformations(bp2, sde, id);
			db.blueprints.put(bp2.name, bp2);
			bp2.copying = new Activity(bp.activities.copying, sde);
			bp2.invention = new Activity(bp.activities.invention, sde);
			bp2.manufacturing = new Activity(bp.activities.manufacturing, sde);
			bp2.research_material = new Activity(bp.activities.research_material, sde);
			bp2.research_time = new Activity(bp.activities.research_time, sde);
		}
	}

	public static void loadLocations(SDEData sde, DatabaseFile db) {
		File mainFolder = new File(SDECache.CHECKDIR, "fsd/universe/eve");
		if (!mainFolder.isDirectory()) {
			System.err.println("can't create locations, folder not found " + mainFolder);
			return;
		}
		for (String regionName : mainFolder.list()) {
			File regionDir = new File(mainFolder, regionName);
			Location region = new Location();
			region.name = regionName;
			try (BufferedReader br = new BufferedReader(new FileReader(new File(regionDir, "region.staticdata")))) {
				br.lines().forEach(l -> {
					if (l.startsWith("regionID: ")) {
						region.locationID = Integer.parseInt(l.substring("regionID: ".length()));
					}
				});
			} catch (IOException e) {
				e.printStackTrace(System.err);
			}
			if (region.locationID == 0) {
				System.err.println("could not get id for region " + regionName);
				continue;
			} else {
				db.locations.put(regionName, region);
			}
			for (String constelName : regionDir.list((d, n) -> !n.contains("."))) {
				File constelDir = new File(regionDir, constelName);
				Location constel = new Location();
				constel.name = constelName;
				constel.parentRegion = regionName;
				try (BufferedReader br = new BufferedReader(new FileReader(new File(constelDir, "constellation.staticdata")))) {
					br.lines().forEach(l -> {
						if (l.startsWith("constellationID: ")) {
							constel.locationID = Integer.parseInt(l.substring("constellationID: ".length()));
						}
					});
				} catch (IOException e) {
					e.printStackTrace(System.err);
				}
				if (constel.locationID == 0) {
					System.err.println("could not get id for constel " + constelName);
					continue;
				} else {
					db.locations.put(constelName, constel);
				}
				for (String systemName : constelDir.list((d, n) -> !n.contains("."))) {
					File systemDir = new File(constelDir, systemName);
					Location system = new Location();
					system.name = systemName;
					system.parentRegion = regionName;
					system.parentConstelation = constelName;
					try (BufferedReader br = new BufferedReader(new FileReader(new File(systemDir, "solarsystem.staticdata")))) {
						br.lines().forEach(l -> {
							if (l.startsWith("solarSystemID: ")) {
								system.locationID = Integer.parseInt(l.substring("solarSystemID: ".length()));
							} else if (l.startsWith("security: ")) {
								double sec = Double.parseDouble(l.substring("security: ".length()));
								system.maxSec = system.minSec = sec;
								constel.minSec = Math.min(constel.minSec, sec);
								constel.maxSec = Math.max(constel.maxSec, sec);
								region.minSec = Math.min(region.minSec, sec);
								region.maxSec = Math.max(region.maxSec, sec);
							}
						});
					} catch (IOException e) {
						e.printStackTrace(System.err);
					}
					if (system.locationID == 0) {
						System.err.println("could not get id for system " + systemName);
						continue;
					} else {
						db.locations.put(systemName, system);
					}
				}
			}
		}
		for (Location loc : db.locations.values()) {
			switch (loc.getLocationType()) {
			case 3:
				if (loc.parentConstelation == null || loc.parentRegion == null) {
					System.err.println("error with system " + loc.name + " in constel " + loc.parentConstelation + " region "
							+ loc.parentRegion);
				}
				break;
			case 2:
				if (loc.parentRegion == null || loc.parentConstelation != null) {
					System.err.println("error with constelation " + loc.name + " in constel " + loc.parentConstelation
							+ " region " + loc.parentRegion);
				}
				break;
			case 1:
				if (loc.parentRegion != null || loc.parentConstelation != null) {
					System.err.println("error with region " + loc.name + " in constel " + loc.parentConstelation + " region "
							+ loc.parentRegion);
				}
				break;
			default:
				System.err.println("error, unknown locaiton type " + loc.getLocationType());
			}
		}
	}

	public static void loadMetaInfs(SDEData sde, DatabaseFile db) {
		for (Entry<Integer, EtypeIDs> e : sde.getTypeIDs().entrySet()) {
			EtypeIDs item = e.getValue();
			if (item.published) {
				MetaInf mi = new MetaInf();
				mi.id = e.getKey();
				db.metaInfs.put(item.enName(), mi);
			}
		}
		for (Entry<String, Blueprint> e : db.blueprints.entrySet()) {
			Blueprint bp = e.getValue();
			for (Activity act : new Activity[] { bp.copying, bp.invention, bp.manufacturing, bp.research_material,
					bp.research_time }) {
				for (fr.guiguilechat.eveonline.database.yaml.Blueprint.Material mat : act.products) {
					MetaInf mi = db.metaInfs.get(mat.name);
					if (mi == null) {
						mi = new MetaInf();
						db.metaInfs.put(mat.name, mi);
					}
					mi.productOf.add(bp.name);
				}
				for (fr.guiguilechat.eveonline.database.yaml.Blueprint.Material mat : act.materials) {
					MetaInf mi = db.metaInfs.get(mat.name);
					if (mi == null) {
						mi = new MetaInf();
						db.metaInfs.put(mat.name, mi);
					}
					mi.productIn.add(bp.name);
				}
			}
		}
	}

	public static void loadLPOffers(SDEData sde, DatabaseFile db, ESINpcCorporations corps) {
		ESILoyalty loyalty = new ESILoyalty();
		for (Entry<Integer, Corporation> e : corps.getCorpos().entrySet()) {
			for (Offer o : loyalty.getOffers(e.getKey())) {
				LPOffer lpo = new LPOffer();
				lpo.corporation = e.getValue().corporation_name;
				lpo.requirements.isk += o.isk_cost;
				lpo.requirements.lp += o.lp_cost;
				lpo.offer_name = sde.getType(o.type_id).enName();

				for (ItemReq ir : o.required_items) {
					ItemRef translated = new ItemRef();
					translated.quantity = ir.quantity;
					translated.type_id = ir.type_id;
					lpo.requirements.items.add(translated);
				}

				Eblueprints bp = sde.getBlueprints().get(o.type_id);

				if (bp != null) {// the lp offers a BPC
					for (Material m : bp.activities.manufacturing.materials) {
						ItemRef translated = new ItemRef();
						translated.quantity = m.quantity * o.quantity;
						translated.type_id = m.typeID;
						lpo.requirements.items.add(translated);
					}
					Material prod = bp.activities.manufacturing.products.get(0);
					lpo.product.type_id = prod.typeID;
					lpo.product.quantity = prod.quantity * o.quantity;
				} else {// the lp offers a non-bpc
					lpo.product.quantity = o.quantity;
					lpo.product.type_id = o.type_id;
				}

				db.lpoffers.add(lpo);
			}
		}
		// lp offers are sorted by corporation, offer name
		Collections.sort(db.lpoffers, (o1, o2) -> {
			int ret = o1.corporation.compareTo(o2.corporation);
			if (ret == 0) {
				ret = o1.offer_name.compareTo(o2.offer_name);
			}
			if (ret == 0) {
				ret = o1.requirements.lp - o2.requirements.lp;
			}
			if (ret == 0) {
				ret =o1.requirements.isk-o2.requirements.isk;
			}
			return ret;
		});
	}


	public static void loadAgents(SDEData sde, DatabaseFile db, ESINpcCorporations corps, ESICharacter chars,
			ESIUniverse uni) {
		ArrayList<EagtAgents> sdeAgents = sde.getAgents();
		HashMap<Integer, String> agtTypes = sde.getAgentTypes();
		HashMap<Integer, String> crpDivisions = sde.getNPCDivisions();
		Map<Integer, String> names = chars.getNames(sdeAgents.stream().mapToInt(a -> a.agentID).toArray());

		sdeAgents.parallelStream().map(ea -> {
			Agent ag = new Agent();
			ag.agentID = ea.agentID;
			ag.name = names.get(ag.agentID);
			Corporation corp = corps.getCorpo(ea.corporationID);
			ag.corporation = corp.corporation_name;
			ag.faction = corp.faction;
			ag.isLocator = ea.isLocator;
			ag.level = ea.level;
			ag.agentType = agtTypes.get(ea.agentTypeID);
			ag.division = crpDivisions.get(ea.divisionID);
			Station station = uni.getStation(ea.locationID);
			if (station != null) {
				ag.location = station.name;
				Systems sys = uni.getSystem(station.system_id);
				ag.system = sys.name;
			}
			return ag;
		}).sorted((a1, a2) -> a1.name.compareTo(a2.name)).forEachOrdered(a -> db.agents.put(a.name, a));
	}

}
