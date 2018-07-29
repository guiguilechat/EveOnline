package fr.guiguilechat.jcelechat.model.sde.items.types.effects;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Effects;

public class LensFlares
    extends Effects
{
    public final static String RESOURCE_PATH = "SDE/items/effects/LensFlares.yaml";
    private static LinkedHashMap<String, LensFlares> cache = (null);

    @Override
    public int getGroupId() {
        return  1105;
    }

    @Override
    public Class<?> getGroup() {
        return LensFlares.class;
    }

    public static synchronized LinkedHashMap<String, LensFlares> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(LensFlares.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, LensFlares> items;
    }
}