package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceRogueDroneBattleship
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceRogueDroneBattleship.yaml";
    private static LinkedHashMap<String, DeadspaceRogueDroneBattleship> cache = (null);

    @Override
    public int getGroupId() {
        return  802;
    }

    @Override
    public Class<?> getGroup() {
        return DeadspaceRogueDroneBattleship.class;
    }

    public static synchronized LinkedHashMap<String, DeadspaceRogueDroneBattleship> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DeadspaceRogueDroneBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, DeadspaceRogueDroneBattleship> items;
    }
}
