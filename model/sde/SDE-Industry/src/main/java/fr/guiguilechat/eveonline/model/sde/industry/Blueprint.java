package fr.guiguilechat.eveonline.model.sde.industry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.eveonline.model.sde.yaml.CleanRepresenter;
import fr.guiguilechat.eveonline.model.sde.yaml.Tools;

public class Blueprint {

	// loading/dumping

	private static LinkedHashMap<String, Blueprint> cache = null;

	public static final String RESOURCE_PATH = "SDE/industry/blueprints.yaml";

	public static synchronized LinkedHashMap<String, Blueprint> load() {
		if (cache == null) {
			try {
				cache = new Yaml().loadAs(
						new InputStreamReader(Blueprint.class.getClassLoader().getResourceAsStream(RESOURCE_PATH)),
						Container.class).blueprints;
			} catch (Exception exception) {
				throw new UnsupportedOperationException("catch this", exception);
			}
		}
		return cache;
	}

	private static Map<Integer, Blueprint> cacheById = null;

	public static Map<Integer, Blueprint> loadById() {
		if (cacheById == null) {
			cacheById = load().entrySet().stream().collect(Collectors.toMap(e -> e.getValue().id, e -> e.getValue()));
		}
		return cacheById;
	}

	public static void export(LinkedHashMap<String, Blueprint> data, File folderout) {
		File output = new File(folderout, RESOURCE_PATH);
		output.mkdirs();
		output.delete();
		Container c = new Container();
		c.blueprints = data;
		try {
			new Yaml(new CleanRepresenter(), Tools.blockDumper()).dump(c, new FileWriter(output));
		} catch (IOException e) {
			throw new UnsupportedOperationException("while exporting constellations to " + output.getAbsolutePath(), e);
		}
	}

	private static final class Container {
		public LinkedHashMap<String, Blueprint> blueprints;
	}

	// structure


	/**
	 * used in the blueprints as requirement, or products
	 */
	public static class MaterialReq {
		public int quantity;
		public String name;
		public int id;
		public String group;
		public String category;
	}

	public static class MaterialProd extends MaterialReq {
		public float probability = 1.0f;
	}

	public static class Activity {
		public ArrayList<MaterialReq> materials = new ArrayList<>();
		public ArrayList<MaterialProd> products = new ArrayList<>();
		public LinkedHashMap<String, Integer> skills = new LinkedHashMap<>();
		public int time;

		public Activity() {
		}
	}

	public Activity copying, invention, manufacturing, research_material, research_time, reaction;

	public int id;

	public String name;

	public int maxCopyRuns;

	public boolean seeded;

}
