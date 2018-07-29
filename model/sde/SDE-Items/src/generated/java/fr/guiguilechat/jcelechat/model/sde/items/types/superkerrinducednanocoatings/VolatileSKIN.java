package fr.guiguilechat.jcelechat.model.sde.items.types.superkerrinducednanocoatings;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.SuperKerrInducedNanocoatings;

public class VolatileSKIN
    extends SuperKerrInducedNanocoatings
{
    public final static String RESOURCE_PATH = "SDE/items/superkerrinducednanocoatings/VolatileSKIN.yaml";
    private static LinkedHashMap<String, VolatileSKIN> cache = (null);

    @Override
    public int getGroupId() {
        return  1951;
    }

    @Override
    public Class<?> getGroup() {
        return VolatileSKIN.class;
    }

    public static synchronized LinkedHashMap<String, VolatileSKIN> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(VolatileSKIN.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, VolatileSKIN> items;
    }
}