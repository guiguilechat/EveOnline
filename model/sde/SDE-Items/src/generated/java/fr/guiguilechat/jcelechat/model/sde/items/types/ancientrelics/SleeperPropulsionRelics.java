package fr.guiguilechat.jcelechat.model.sde.items.types.ancientrelics;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.AncientRelics;

public class SleeperPropulsionRelics
    extends AncientRelics
{
    public final static String RESOURCE_PATH = "SDE/items/ancientrelics/SleeperPropulsionRelics.yaml";
    private static LinkedHashMap<String, SleeperPropulsionRelics> cache = (null);

    @Override
    public int getGroupId() {
        return  971;
    }

    @Override
    public Class<?> getGroup() {
        return SleeperPropulsionRelics.class;
    }

    public static synchronized LinkedHashMap<String, SleeperPropulsionRelics> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(SleeperPropulsionRelics.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, SleeperPropulsionRelics> items;
    }
}