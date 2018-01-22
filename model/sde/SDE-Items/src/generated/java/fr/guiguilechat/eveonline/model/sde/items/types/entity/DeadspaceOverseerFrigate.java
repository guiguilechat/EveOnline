package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceOverseerFrigate
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceOverseerFrigate.yaml";
    private static LinkedHashMap<String, DeadspaceOverseerFrigate> cache = (null);

    @Override
    public int getGroupId() {
        return  819;
    }

    @Override
    public Class<?> getGroup() {
        return DeadspaceOverseerFrigate.class;
    }

    public static LinkedHashMap<String, DeadspaceOverseerFrigate> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DeadspaceOverseerFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, DeadspaceOverseerFrigate> items;
    }
}
