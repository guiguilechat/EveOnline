package fr.guiguilechat.eveonline.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class TrinaryDataVaults
    extends Commodity
{
    public final static String RESOURCE_PATH = "SDE/items/commodity/TrinaryDataVaults.yaml";
    private static LinkedHashMap<String, TrinaryDataVaults> cache = (null);

    @Override
    public int getGroupId() {
        return  1977;
    }

    @Override
    public Class<?> getGroup() {
        return TrinaryDataVaults.class;
    }

    public static synchronized LinkedHashMap<String, TrinaryDataVaults> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(TrinaryDataVaults.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, TrinaryDataVaults> items;
    }
}
