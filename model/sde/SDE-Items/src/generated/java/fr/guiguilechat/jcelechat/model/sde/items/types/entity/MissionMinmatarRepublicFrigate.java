package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class MissionMinmatarRepublicFrigate
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/MissionMinmatarRepublicFrigate.yaml";
    private static LinkedHashMap<String, MissionMinmatarRepublicFrigate> cache = (null);

    @Override
    public int getGroupId() {
        return  683;
    }

    @Override
    public Class<?> getGroup() {
        return MissionMinmatarRepublicFrigate.class;
    }

    public static synchronized LinkedHashMap<String, MissionMinmatarRepublicFrigate> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MissionMinmatarRepublicFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MissionMinmatarRepublicFrigate> items;
    }
}