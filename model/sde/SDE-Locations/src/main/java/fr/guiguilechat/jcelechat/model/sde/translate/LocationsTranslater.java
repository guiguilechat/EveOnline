package fr.guiguilechat.jcelechat.model.sde.translate;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.guiguilechat.jcelechat.model.FileTools;
import fr.guiguilechat.jcelechat.model.sde.load.bsd.EstaOperationServices;
import fr.guiguilechat.jcelechat.model.sde.load.bsd.EstaServices;
import fr.guiguilechat.jcelechat.model.sde.load.bsd.EstaStations;
import fr.guiguilechat.jcelechat.model.sde.load.fsd.EtypeIDs;
import fr.guiguilechat.jcelechat.model.sde.load.fsd.Universe;
import fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.SolarSystem.Moon;
import fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.SolarSystem.NPCStation;
import fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.SolarSystem.Planet;
import fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.SolarSystem.Stargate;
import fr.guiguilechat.jcelechat.model.sde.locations.Constellation;
import fr.guiguilechat.jcelechat.model.sde.locations.Region;
import fr.guiguilechat.jcelechat.model.sde.locations.SolarSystem;
import fr.guiguilechat.jcelechat.model.sde.locations.Station;

/**
 * translate the locations from the sde in specific collection.<br />
 * Don't call this class outside of the SDE package, as it relies on
 * SDE-compiler which is optional.<br />
 * If I could remove that class from package, that's would be better.
 */
public class LocationsTranslater {

	public static final Logger logger = LoggerFactory.getLogger(LocationsTranslater.class);

	public static enum REGION_TYPE {
		PENALTY, WORMHOLE, JOVIAN, ABYSSAL, KS
	}

	static long timeStart;

	/**
	 *
	 * @param args
	 *          should be [database destination root], typically
	 *          src/generated/resources/
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		timeStart = System.currentTimeMillis();
		File folderOut = new File(args.length == 0 ? "src/generated/resources/" : args[0]);
		FileTools.delDir(folderOut);
		folderOut.mkdirs();

		LinkedHashMap<String, Region> regions = new LinkedHashMap<>();
		LinkedHashMap<String, Constellation> constellations = new LinkedHashMap<>();
		LinkedHashMap<String, SolarSystem> systems = new LinkedHashMap<>();
		LinkedHashMap<String, Station> stations = new LinkedHashMap<>();

		translate(regions, constellations, systems, stations);

		// sort

		Stream.of(regions, constellations, systems, stations).forEach(m -> {
			ArrayList<Entry<String, ?>> list = new ArrayList<>(m.entrySet());
			Collections.sort(list, (e1, e2) -> e1.getKey().compareTo(e2.getKey()));
			m.clear();
			for (Entry<String, ?> e : list) {
				((Map<String, Object>) m).put(e.getKey(), e.getValue());
			}
		});

		// save

		Region.export(regions, folderOut);
		Constellation.export(constellations, folderOut);
		SolarSystem.export(systems, folderOut);
		Station.export(stations, folderOut);

	}

	public static void translate(LinkedHashMap<String, Region> regions,
			LinkedHashMap<String, Constellation> constellations, LinkedHashMap<String, SolarSystem> systems,
			LinkedHashMap<String, Station> stations) {
		Universe uni = Universe.load();

		uni.eve.entrySet().stream()
		.forEach(e -> addRegion(e.getKey(), e.getValue(), regions, constellations, systems, stations, REGION_TYPE.KS));
		uni.wormhole.entrySet().stream().forEach(
				e -> addRegion(e.getKey(), e.getValue(), regions, constellations, systems, stations, REGION_TYPE.WORMHOLE));

		// fill all the adjacent systems, constellations, regions
		// translate all the gates to their system
		HashMap<Integer, String> gateToSystem = new HashMap<>();
		Stream.of(uni.eve, uni.wormhole).flatMap(e -> e.values().stream()).flatMap(r -> r.constellations.values().stream())
		.flatMap(c -> c.systems.entrySet().stream()).forEach(e -> {
			for (Integer sid : e.getValue().stargates.keySet()) {
				gateToSystem.put(sid, e.getKey());
			}
		});

		Stream.of(uni.eve, uni.wormhole).parallel().flatMap(e -> e.values().stream())
		.flatMap(r -> r.constellations.values().stream()).flatMap(c -> c.systems.entrySet().stream())
		.forEachOrdered(e -> {
			SolarSystem oSystem = systems.get(e.getKey());
			Constellation oConstel = constellations.get(oSystem.constellation);
			Region oRegion = regions.get(oSystem.region);
			for (Stargate st : e.getValue().stargates.values()) {
				String destoName = gateToSystem.get(st.destination);
				{
					oSystem.adjacentSystems.add(destoName);
				}
				SolarSystem destination = systems.get(destoName);
				if (!oSystem.constellation.equals(destination.constellation)) {
					if (!oSystem.adjacentConstellations.contains(destination.constellation)) {
						oSystem.adjacentConstellations.add(destination.constellation);
					}
					if (!oConstel.adjacentConstellations.contains(destination.constellation)) {
						oConstel.adjacentConstellations.add(destination.constellation);
					}
					if (!oConstel.adjacentSystems.contains(destoName)) {
						oConstel.adjacentSystems.add(destoName);
					}
				}
				if (!oSystem.region.equals(destination.region)) {
					if (!oSystem.adjacentRegions.contains(destination.region)) {
						oSystem.adjacentRegions.add(destination.region);
					}
					if (!oConstel.adjacentRegions.contains(destination.region)) {
						oConstel.adjacentRegions.add(destination.region);
					}
					if (!oRegion.adjacentSystems.contains(destoName)) {
						oRegion.adjacentSystems.add(destoName);
					}
					if (!oRegion.adjacentRegions.contains(destination.region)) {
						oRegion.adjacentRegions.add(destination.region);
					}
					if (!oRegion.adjacentConstellations.contains(destination.constellation)) {
						oRegion.adjacentConstellations.add(destination.constellation);
					}
				}
			}

						});

	}

	public static void addRegion(String name, fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.Region region,
			LinkedHashMap<String, Region> regions, LinkedHashMap<String, Constellation> constellations,
			LinkedHashMap<String, SolarSystem> systems, LinkedHashMap<String, Station> stations, REGION_TYPE rtype) {
		Region r = new Region();
		regions.put(name, r);
		// set jovian KS to specific JOVIAN type
		if (rtype == REGION_TYPE.KS) {
			if (
					// A821-A
					region.regionID == 10000019
					// J7HZ-F is jove ?
					|| region.regionID == 10000017
					// UUA-F4
					|| region.regionID == 10000004) {
				rtype = REGION_TYPE.JOVIAN;
			}
		}
		for (Entry<String, fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.Constellation> e : region.constellations
				.entrySet()) {
			r.constellations.add(e.getKey());
			addConstellation(e.getKey(), e.getValue(), name, constellations, systems, stations, rtype);
		}
		r.isKS = rtype == REGION_TYPE.KS;
		r.name = name;
		r.id = region.regionID;
		r.isWormhole = rtype == REGION_TYPE.WORMHOLE;
	}

	public static Constellation addConstellation(String name,
			fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.Constellation constellation, String regionName,
			LinkedHashMap<String, Constellation> constellations, LinkedHashMap<String, SolarSystem> systems,
			LinkedHashMap<String, Station> stations, REGION_TYPE rtype) {
		Constellation c = new Constellation();
		constellations.put(name, c);
		for (Entry<String, fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.SolarSystem> e : constellation.systems
				.entrySet()) {
			c.systems.add(e.getKey());
			SolarSystem sys = addSystem(e.getKey(), e.getValue(), name, regionName, systems, stations, rtype);
			c.hasBorder |= sys.isBorder;
			c.hasCorridor |= sys.isCorridor;
			c.hasFringe |= sys.isFringe;
			c.hasHub |= sys.isHub;
		}
		c.name = name;
		c.id = constellation.constellationID;
		c.isWormhole = rtype == REGION_TYPE.WORMHOLE;
		c.isKS = rtype == REGION_TYPE.KS;
		return c;
	}

	public static SolarSystem addSystem(String name,
			fr.guiguilechat.jcelechat.model.sde.load.fsd.universe.SolarSystem system, String ConstellationName,
			String regionName, LinkedHashMap<String, SolarSystem> systems, LinkedHashMap<String, Station> stations,
			REGION_TYPE rtype) {
		SolarSystem s = new SolarSystem();
		systems.put(name, s);
		s.name = name;
		s.id = system.solarSystemID;
		s.constellation = ConstellationName;
		s.region = regionName;
		s.truesec = system.security;
		s.isWormhole = rtype == REGION_TYPE.WORMHOLE;
		s.isBorder = system.border;
		s.isCorridor = system.corridor;
		s.isFringe = system.fringe;
		s.isHub = system.hub;
		s.isKS = rtype == REGION_TYPE.KS;
		s.anchorStructures = system.disallowedAnchorCategories == null || system.disallowedAnchorCategories.isEmpty()
				|| !system.disallowedAnchorCategories.contains(65);

		for (Entry<Long, Planet> ePlanet : system.planets.entrySet()) {
			for (Entry<Integer, NPCStation> eSta : ePlanet.getValue().npcStations.entrySet()) {
				addStation(eSta.getValue(), eSta.getKey(), name, stations);
				if (addStation(eSta.getValue(), eSta.getKey(), name, stations) == null) {
					logger.error("can't create station name=" + name + " id=" + eSta.getKey());
				}
			}
			for (Entry<Integer, Moon> e4 : ePlanet.getValue().moons.entrySet()) {
				for (Entry<Integer, NPCStation> eSta : e4.getValue().npcStations.entrySet()) {
					if (addStation(eSta.getValue(), eSta.getKey(), name, stations) == null) {
						logger.error("can't create station name=" + name + " id=" + eSta.getKey());
					}
				}
			}
		}
		return s;
	}

	/**
	 * translates an npc station into a station, add it to the stations lists
	 *
	 * @return null if an issue occured. In this case, the station is not added
	 */
	public static Station addStation(NPCStation npcsta, int id, String solarSystemName,
			LinkedHashMap<String, Station> stations) {
		Station added = new Station();
		added.id = id;
		added.solarSystem = solarSystemName;
		added.services.addAll(operationServices().get(npcsta.operationID));
		EtypeIDs type = EtypeIDs.load().get(id);
		added.name = type == null ? "missing_" + id : type.enName();
		EstaStations esta = stationsByID().get(id);
		if (esta == null) {
			logger.error("station id " + id + " can't be retrieved from " + EstaStations.FILE);
			return null;
		}
		stations.put(esta.stationName, added);
		return added;
	}

	private static Map<Integer, Set<String>> operationServices = null;

	protected static Map<Integer, Set<String>> operationServices() {
		if (operationServices == null) {
			Map<Integer, String> servicesnames = EstaServices.loadById();
			operationServices = EstaOperationServices.loadByOperationId().entrySet().stream().collect(Collectors
					.toMap(e -> e.getKey(), e -> e.getValue().stream().map(servicesnames::get).collect(Collectors.toSet())));
		}
		return operationServices;
	}

	private static Map<Integer, EstaStations> stationsByID = null;

	protected static Map<Integer, EstaStations> stationsByID() {
		if (stationsByID == null) {
			stationsByID = EstaStations.loadById();
		}
		return stationsByID;
	}
}
