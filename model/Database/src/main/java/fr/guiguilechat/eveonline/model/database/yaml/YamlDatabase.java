package fr.guiguilechat.eveonline.model.database.yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

import fr.guiguilechat.eveonline.model.database.EveDatabase;
import fr.guiguilechat.eveonline.model.database.retrieval.sde.SDEDumper;

/**
 * tools to get existing database
 */
public class YamlDatabase extends EveDatabase {

	private static final Logger logger = LoggerFactory.getLogger(YamlDatabase.class);

	public static DatabaseFile load(InputStream stream) {
		return makeYaml().loadAs(stream, DatabaseFile.class);
	}

	public static void write(DatabaseFile db, File file) throws IOException {
		file.getParentFile().mkdirs();
		makeYaml().dump(db, new FileWriter(file));
	}

	protected static Yaml makeYaml() {
		return new Yaml(makeConstructor(), makeRepresenter(), makeOptions());
	}

	protected static BaseConstructor makeConstructor() {
		Constructor ret = new Constructor(DatabaseFile.class);
		TypeDescription td = new TypeDescription(DatabaseFile.class);
		td.putMapPropertyType("hulls", String.class, Hull.class);
		td.putMapPropertyType("asteroids", String.class, Asteroid.class);
		td.putMapPropertyType("modules", String.class, Module.class);
		td.putMapPropertyType("blueprints", String.class, Blueprint.class);
		td.putMapPropertyType("metaInfs", String.class, MetaInf.class);
		td.putMapPropertyType("locations", String.class, Location.class);
		td.putMapPropertyType("stations", String.class, Station.class);
		td.putListPropertyType("lpoffers", LPOffer.class);
		td.putMapPropertyType("agents", String.class, Agent.class);
		ret.addTypeDescription(td);
		return ret;
	}

	public static Representer makeRepresenter() {
		return new CleanRepresenter();
	}

	public static class CleanRepresenter extends Representer {

		protected static Set<Object> ZEROS = new HashSet<>(
				Arrays.asList(Integer.valueOf(0), Long.valueOf(0), Float.valueOf(0), Double.valueOf(0)));

		/**
		 * skip a field when it is set to null or to an empty collection
		 */
		@Override
		protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue,
				Tag customTag) {
			if (propertyValue == null || propertyValue instanceof Collection && ((Collection<?>) propertyValue).isEmpty()
					|| propertyValue instanceof Map && ((Map<?, ?>) propertyValue).isEmpty() || ZEROS.contains(propertyValue)) {
				return null;
			} else {
				NodeTuple ret = super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
				if (ret.getValueNode() instanceof MappingNode) {
					MappingNode mn = (MappingNode) ret.getValueNode();
					if (mn.getValue().size() == 0) {
						return null;
					}
				}
				return ret;
			}
		}

		@Override
		protected MappingNode representJavaBean(Set<Property> properties, Object javaBean) {
			// remove the !!class
			if (!classTags.containsKey(javaBean.getClass())) {
				addClassTag(javaBean.getClass(), Tag.MAP);
			}
			MappingNode ret = super.representJavaBean(properties, javaBean);
			ret.setFlowStyle(false);
			return ret;
		}
	}

	public static DumperOptions makeOptions() {
		DumperOptions opt = new DumperOptions();
		opt.setDefaultScalarStyle(ScalarStyle.PLAIN);
		opt.setDefaultFlowStyle(FlowStyle.BLOCK);
		return opt;
	}

	protected LinkedHashMap<String, Hull> hulls = null;

	@Override
	public synchronized LinkedHashMap<String, Hull> getHulls() {
		if (hulls == null) {
			logger.debug("loading hulls");
			InputStream hullsStream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_HULLS_RES);
			DatabaseFile hullDB = hullsStream != null ? load(hullsStream) : null;
			if (hullDB != null) {
				hulls = hullDB.hulls;
			} else {
				System.err.println("can't load hulls");
				hulls = new LinkedHashMap<>();
			}
		}
		return hulls;
	}

	protected LinkedHashMap<String, Module> modules = null;

	@Override
	public synchronized LinkedHashMap<String, Module> getModules() {
		if (modules == null) {
			logger.debug("loading modules");
			InputStream modulesStream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_MODULES_RES);
			DatabaseFile moduleDB = modulesStream != null ? load(modulesStream) : null;
			if (moduleDB != null) {
				modules = moduleDB.modules;
			} else {
				System.err.println("can't load modules");
				modules = new LinkedHashMap<>();
			}
		}
		return modules;
	}

	protected LinkedHashMap<String, Asteroid> asteroids = null;

	@Override
	public synchronized LinkedHashMap<String, Asteroid> getAsteroids() {
		if (asteroids == null) {
			logger.debug("loading asteroids");
			InputStream asteroidsStream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_ASTEROIDS_RES);
			DatabaseFile asteroidsDB = asteroidsStream != null ? load(asteroidsStream) : null;
			if (asteroidsDB != null) {
				asteroids = asteroidsDB.asteroids;
			} else {
				System.err.println("can't load asteroids");
				asteroids = new LinkedHashMap<>();
			}
		}
		return asteroids;
	}

	protected LinkedHashMap<String, Blueprint> blueprints = null;

	@Override
	public synchronized LinkedHashMap<String, Blueprint> getBlueprints() {
		if (blueprints == null) {
			logger.debug("loading blueprints");
			InputStream stream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_BLUEPRINT_RES);
			DatabaseFile db = stream != null ? load(stream) : null;
			if (db != null) {
				blueprints = db.blueprints;
			} else {
				System.err.println("can't load blueprints");
				blueprints = new LinkedHashMap<>();
			}
		}
		return blueprints;
	}

	protected LinkedHashMap<String, MetaInf> metainfs = null;

	@Override
	public synchronized LinkedHashMap<String, MetaInf> getMetaInfs() {
		if (metainfs == null) {
			logger.debug("loading metainfs");
			InputStream stream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_METAINF_RES);
			DatabaseFile db = stream != null ? load(stream) : null;
			if (db != null) {
				metainfs = db.metaInfs;
			} else {
				System.err.println("can't load meta infs");
				metainfs = new LinkedHashMap<>();
			}
		}
		return metainfs;
	}

	protected LinkedHashMap<String, Location> locations = null;

	@Override
	public synchronized LinkedHashMap<String, Location> getLocations() {
		if (locations == null) {
			logger.debug("loading locations");
			InputStream stream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_LOCATION_RES);
			DatabaseFile db = stream != null ? load(stream) : null;
			if (db != null) {
				locations = db.locations;
				HashMap<String, Location> added = new LinkedHashMap<>();
				for (Entry<String, Location> e : locations.entrySet()) {
					String newName = e.getKey().toLowerCase();
					if (!newName.equals(e.getKey())) {
						added.put(newName, e.getValue());
					}
				}
				locations.putAll(added);
			} else {
				System.err.println("can't load locations");
				locations = new LinkedHashMap<>();
			}
		}
		return locations;
	}

	protected LinkedHashMap<String, Station> stations = null;

	@Override
	public synchronized LinkedHashMap<String, Station> getStations() {
		if (stations == null) {
			logger.debug("loading stations");
			InputStream stream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_STATIONS_RES);
			DatabaseFile db = stream != null ? load(stream) : null;
			if (db != null) {
				stations = db.stations;
			} else {
				System.err.println("can't load stations");
				stations = new LinkedHashMap<>();
			}
		}
		return stations;
	}

	protected ArrayList<LPOffer> lpoffers = null;

	@Override
	public synchronized ArrayList<LPOffer> getLPOffers() {
		if (lpoffers == null) {
			logger.debug("loading lpoffers");
			InputStream stream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_LPOFFERS_RES);
			DatabaseFile db = stream != null ? load(stream) : null;
			if (db != null) {
				lpoffers = db.lpoffers;
			} else {
				System.err.println("can't load lpoffers");
				lpoffers = new ArrayList<>();
			}
		}
		return lpoffers;
	}

	protected LinkedHashMap<String, Agent> agents = null;

	@Override
	public synchronized LinkedHashMap<String, Agent> getAgents() {
		if (agents == null) {
			logger.debug("loading agents");
			InputStream stream = DatabaseFile.class.getResourceAsStream("/" + SDEDumper.DB_AGENTS_RES);
			DatabaseFile db = stream != null ? load(stream) : null;
			if (db != null) {
				agents = db.agents;
			} else {
				System.err.println("can't load agents");
				agents = new LinkedHashMap<>();
			}
		}
		return agents;
	}

}