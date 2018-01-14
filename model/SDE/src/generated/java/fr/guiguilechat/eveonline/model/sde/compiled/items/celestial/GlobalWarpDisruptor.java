
package fr.guiguilechat.eveonline.model.sde.compiled.items.celestial;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Celestial;
import org.yaml.snakeyaml.Yaml;

public class GlobalWarpDisruptor
    extends Celestial
{

    public final static String RESOURCE_PATH = "SDE/celestial/GlobalWarpDisruptor.yaml";
    private static LinkedHashMap<String, GlobalWarpDisruptor> cache = (null);

    @Override
    public int getGroupId() {
        return  368;
    }

    @Override
    public Class<?> getGroup() {
        return GlobalWarpDisruptor.class;
    }

    public static LinkedHashMap<String, GlobalWarpDisruptor> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, GlobalWarpDisruptor> items;

    }

}
