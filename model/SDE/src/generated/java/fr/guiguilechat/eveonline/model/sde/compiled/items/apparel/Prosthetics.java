
package fr.guiguilechat.eveonline.model.sde.compiled.items.apparel;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Prosthetics
    extends Apparel
{

    public final static String RESOURCE_PATH = "SDE/apparel/Prosthetics.yaml";
    private static LinkedHashMap<String, Prosthetics> cache = (null);

    @Override
    public int getGroupId() {
        return  1271;
    }

    @Override
    public Class<?> getGroup() {
        return Prosthetics.class;
    }

    public static LinkedHashMap<String, Prosthetics> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, Prosthetics> items;

    }

}