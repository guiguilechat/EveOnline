package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceSleeperAwakenedDefender
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceSleeperAwakenedDefender.yaml";
    private static LinkedHashMap<String, DeadspaceSleeperAwakenedDefender> cache = (null);

    @Override
    public int getGroupId() {
        return  984;
    }

    @Override
    public Class<?> getGroup() {
        return DeadspaceSleeperAwakenedDefender.class;
    }

    public static synchronized LinkedHashMap<String, DeadspaceSleeperAwakenedDefender> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DeadspaceSleeperAwakenedDefender.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, DeadspaceSleeperAwakenedDefender> items;
    }
}
