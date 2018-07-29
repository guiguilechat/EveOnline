package fr.guiguilechat.jcelechat.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Commodity;

public class Lease
    extends Commodity
{
    public final static String RESOURCE_PATH = "SDE/items/commodity/Lease.yaml";
    private static LinkedHashMap<String, Lease> cache = (null);

    @Override
    public int getGroupId() {
        return  652;
    }

    @Override
    public Class<?> getGroup() {
        return Lease.class;
    }

    public static synchronized LinkedHashMap<String, Lease> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Lease.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, Lease> items;
    }
}