
package fr.guiguilechat.eveonline.model.sde.compiled.items.infantry;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Infantry;
import org.yaml.snakeyaml.Yaml;

public class Warbarge
    extends Infantry
{

    public final static String RESOURCE_PATH = "SDE/items/infantry/Warbarge.yaml";
    private static LinkedHashMap<String, Warbarge> cache = (null);

    @Override
    public int getGroupId() {
        return  368666;
    }

    @Override
    public Class<?> getGroup() {
        return Warbarge.class;
    }

    public static LinkedHashMap<String, Warbarge> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Warbarge.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, Warbarge> items;

    }

}
