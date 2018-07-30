package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceOverseerBattleship
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceOverseerBattleship.yaml";
    private static LinkedHashMap<String, DeadspaceOverseerBattleship> cache = (null);

    @Override
    public int getGroupId() {
        return  821;
    }

    @Override
    public Class<?> getGroup() {
        return DeadspaceOverseerBattleship.class;
    }

    public static synchronized LinkedHashMap<String, DeadspaceOverseerBattleship> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DeadspaceOverseerBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, DeadspaceOverseerBattleship> items;
    }
}
