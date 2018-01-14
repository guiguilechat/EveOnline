
package fr.guiguilechat.eveonline.model.sde.compiled.items.accessories;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Accessories;
import org.yaml.snakeyaml.Yaml;

public class PLEX
    extends Accessories
{

    public final static String RESOURCE_PATH = "SDE/accessories/PLEX.yaml";
    private static LinkedHashMap<String, PLEX> cache = (null);

    @Override
    public int getGroupId() {
        return  1875;
    }

    @Override
    public Class<?> getGroup() {
        return PLEX.class;
    }

    public static LinkedHashMap<String, PLEX> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, PLEX> items;

    }

}
