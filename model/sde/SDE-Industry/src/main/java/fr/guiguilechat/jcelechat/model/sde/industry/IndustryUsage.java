package fr.guiguilechat.jcelechat.model.sde.industry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.yaml.snakeyaml.Yaml;

import fr.lelouet.tools.settings.yaml.CleanRepresenter;
import fr.lelouet.tools.settings.yaml.YAMLTools;

/** The bp names a type is used into, for each activity. */
public class IndustryUsage {

	// loading/dumping

	private static LinkedHashMap<String, IndustryUsage> cache = null;

	public static final String RESOURCE_PATH = "SDE/industry/usages.yaml";

	public static synchronized LinkedHashMap<String, IndustryUsage> load() {
		if (cache == null) {
			try (InputStreamReader reader = new InputStreamReader(
					IndustryUsage.class.getClassLoader().getResourceAsStream(RESOURCE_PATH))) {
				cache = new Yaml().loadAs(reader, Container.class).usages;
			} catch (Exception exception) {
				throw new UnsupportedOperationException("catch this", exception);
			}
		}
		return cache;
	}

	public static void export(LinkedHashMap<String, IndustryUsage> data, File folderout) {
		File output = new File(folderout, RESOURCE_PATH);
		output.mkdirs();
		output.delete();
		Container c = new Container();
		c.usages = data;
		try {
			new Yaml(new CleanRepresenter(), YAMLTools.blockDumper()).dump(c, new FileWriter(output));
		} catch (IOException e) {
			throw new UnsupportedOperationException("while exporting constellations to " + output.getAbsolutePath(), e);
		}
	}

	private static final class Container {
		public LinkedHashMap<String, IndustryUsage> usages;
	}

	// structure

	public LinkedHashSet<String> productOfManuf = new LinkedHashSet<>();

	public LinkedHashSet<String> materialInManuf = new LinkedHashSet<>();

	public LinkedHashSet<String> materialInCopy = new LinkedHashSet<>();

	public LinkedHashSet<String> materialInInvention = new LinkedHashSet<>();

	public LinkedHashSet<String> productOfInvention = new LinkedHashSet<>();

	public LinkedHashSet<String> materialInME = new LinkedHashSet<>();

	public LinkedHashSet<String> materialInTE = new LinkedHashSet<>();

	public LinkedHashMap<String, Double> reprocessInto = new LinkedHashMap<>();

	public int compressTo = 0;

	public int compressFrom = 0;

}
