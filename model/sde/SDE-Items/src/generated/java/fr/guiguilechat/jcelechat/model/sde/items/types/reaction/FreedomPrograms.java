package fr.guiguilechat.jcelechat.model.sde.items.types.reaction;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Reaction;

public class FreedomPrograms
    extends Reaction
{
    public final static String RESOURCE_PATH = "SDE/items/reaction/FreedomPrograms.yaml";
    private static LinkedHashMap<String, FreedomPrograms> cache = (null);

    @Override
    public int getGroupId() {
        return  881;
    }

    @Override
    public Class<?> getGroup() {
        return FreedomPrograms.class;
    }

    public static synchronized LinkedHashMap<String, FreedomPrograms> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FreedomPrograms.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, FreedomPrograms> items;
    }
}