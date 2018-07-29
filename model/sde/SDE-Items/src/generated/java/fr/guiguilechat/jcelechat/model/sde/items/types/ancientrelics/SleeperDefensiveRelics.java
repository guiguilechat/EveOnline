package fr.guiguilechat.jcelechat.model.sde.items.types.ancientrelics;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.AncientRelics;

public class SleeperDefensiveRelics
    extends AncientRelics
{
    public final static String RESOURCE_PATH = "SDE/items/ancientrelics/SleeperDefensiveRelics.yaml";
    private static LinkedHashMap<String, SleeperDefensiveRelics> cache = (null);

    @Override
    public int getGroupId() {
        return  993;
    }

    @Override
    public Class<?> getGroup() {
        return SleeperDefensiveRelics.class;
    }

    public static synchronized LinkedHashMap<String, SleeperDefensiveRelics> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(SleeperDefensiveRelics.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, SleeperDefensiveRelics> items;
    }
}