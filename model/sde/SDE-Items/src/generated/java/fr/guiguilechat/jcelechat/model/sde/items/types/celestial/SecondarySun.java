package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;

public class SecondarySun
    extends Celestial
{
    public final static String RESOURCE_PATH = "SDE/items/celestial/SecondarySun.yaml";
    private static LinkedHashMap<String, SecondarySun> cache = (null);

    @Override
    public int getGroupId() {
        return  995;
    }

    @Override
    public Class<?> getGroup() {
        return SecondarySun.class;
    }

    public static synchronized LinkedHashMap<String, SecondarySun> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(SecondarySun.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, SecondarySun> items;
    }
}