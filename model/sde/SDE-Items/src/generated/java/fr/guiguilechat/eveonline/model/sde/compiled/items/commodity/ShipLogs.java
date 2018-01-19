
package fr.guiguilechat.eveonline.model.sde.compiled.items.commodity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Commodity;
import org.yaml.snakeyaml.Yaml;

public class ShipLogs
    extends Commodity
{

    public final static String RESOURCE_PATH = "SDE/items/commodity/ShipLogs.yaml";
    private static LinkedHashMap<String, ShipLogs> cache = (null);

    @Override
    public int getGroupId() {
        return  369;
    }

    @Override
    public Class<?> getGroup() {
        return ShipLogs.class;
    }

    public static LinkedHashMap<String, ShipLogs> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(ShipLogs.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, ShipLogs> items;

    }

}