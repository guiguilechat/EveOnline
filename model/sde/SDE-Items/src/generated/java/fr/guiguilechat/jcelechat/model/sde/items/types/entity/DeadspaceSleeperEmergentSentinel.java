package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class DeadspaceSleeperEmergentSentinel
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceSleeperEmergentSentinel.yaml";
    private static LinkedHashMap<String, DeadspaceSleeperEmergentSentinel> cache = (null);

    @Override
    public int getGroupId() {
        return  961;
    }

    @Override
    public Class<?> getGroup() {
        return DeadspaceSleeperEmergentSentinel.class;
    }

    public static synchronized LinkedHashMap<String, DeadspaceSleeperEmergentSentinel> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DeadspaceSleeperEmergentSentinel.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, DeadspaceSleeperEmergentSentinel> items;
    }
}