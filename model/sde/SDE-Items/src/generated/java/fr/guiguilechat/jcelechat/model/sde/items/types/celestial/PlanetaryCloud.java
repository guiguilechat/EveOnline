package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;

public class PlanetaryCloud
    extends Celestial
{
    public final static String RESOURCE_PATH = "SDE/items/celestial/PlanetaryCloud.yaml";
    private static LinkedHashMap<String, PlanetaryCloud> cache = (null);

    @Override
    public int getGroupId() {
        return  312;
    }

    @Override
    public Class<?> getGroup() {
        return PlanetaryCloud.class;
    }

    public static synchronized LinkedHashMap<String, PlanetaryCloud> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(PlanetaryCloud.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, PlanetaryCloud> items;
    }
}