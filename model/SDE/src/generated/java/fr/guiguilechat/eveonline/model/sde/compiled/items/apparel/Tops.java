
package fr.guiguilechat.eveonline.model.sde.compiled.items.apparel;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Tops
    extends Apparel
{

    public final static String RESOURCE_PATH = "SDE/apparel/Tops.yaml";
    private static LinkedHashMap<String, Tops> cache = (null);

    @Override
    public int getGroupId() {
        return  1089;
    }

    @Override
    public Class<?> getGroup() {
        return Tops.class;
    }

    public static LinkedHashMap<String, Tops> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, Tops> items;

    }

}
