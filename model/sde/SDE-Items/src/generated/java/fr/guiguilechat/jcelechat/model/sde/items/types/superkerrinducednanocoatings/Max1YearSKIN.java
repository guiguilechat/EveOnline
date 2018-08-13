package fr.guiguilechat.jcelechat.model.sde.items.types.superkerrinducednanocoatings;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.types.SuperKerrInducedNanocoatings;
import org.yaml.snakeyaml.Yaml;

public class Max1YearSKIN
    extends SuperKerrInducedNanocoatings
{
    public final static String RESOURCE_PATH = "SDE/items/superkerrinducednanocoatings/Max1YearSKIN.yaml";
    private static Map<String, Max1YearSKIN> cache = (null);

    @Override
    public int getGroupId() {
        return  1955;
    }

    @Override
    public Class<?> getGroup() {
        return Max1YearSKIN.class;
    }

    public static synchronized Map<String, Max1YearSKIN> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Max1YearSKIN.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Max1YearSKIN> items;
    }
}
