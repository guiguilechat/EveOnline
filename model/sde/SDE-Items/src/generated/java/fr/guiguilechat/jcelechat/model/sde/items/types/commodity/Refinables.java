package fr.guiguilechat.jcelechat.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Commodity;

public class Refinables
    extends Commodity
{
    public final static String RESOURCE_PATH = "SDE/items/commodity/Refinables.yaml";
    private static LinkedHashMap<String, Refinables> cache = (null);

    @Override
    public int getGroupId() {
        return  355;
    }

    @Override
    public Class<?> getGroup() {
        return Refinables.class;
    }

    public static synchronized LinkedHashMap<String, Refinables> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Refinables.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, Refinables> items;
    }
}