package fr.guiguilechat.jcelechat.model.sde.items.types.apparel;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.types.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Prosthetics
    extends Apparel
{
    public final static String RESOURCE_PATH = "SDE/items/apparel/Prosthetics.yaml";
    private static Map<String, Prosthetics> cache = (null);

    @Override
    public int getGroupId() {
        return  1271;
    }

    @Override
    public Class<?> getGroup() {
        return Prosthetics.class;
    }

    public static synchronized Map<String, Prosthetics> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Prosthetics.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Prosthetics> items;
    }
}
