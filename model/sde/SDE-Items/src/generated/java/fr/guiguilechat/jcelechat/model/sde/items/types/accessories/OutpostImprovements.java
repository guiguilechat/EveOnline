package fr.guiguilechat.jcelechat.model.sde.items.types.accessories;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Accessories;

public class OutpostImprovements
    extends Accessories
{
    public final static String RESOURCE_PATH = "SDE/items/accessories/OutpostImprovements.yaml";
    private static LinkedHashMap<String, OutpostImprovements> cache = (null);

    @Override
    public int getGroupId() {
        return  872;
    }

    @Override
    public Class<?> getGroup() {
        return OutpostImprovements.class;
    }

    public static synchronized LinkedHashMap<String, OutpostImprovements> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(OutpostImprovements.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, OutpostImprovements> items;
    }
}