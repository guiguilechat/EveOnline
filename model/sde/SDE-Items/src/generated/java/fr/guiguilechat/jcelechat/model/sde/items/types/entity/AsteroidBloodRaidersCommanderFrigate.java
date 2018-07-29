package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidBloodRaidersCommanderFrigate
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidBloodRaidersCommanderFrigate.yaml";
    private static LinkedHashMap<String, AsteroidBloodRaidersCommanderFrigate> cache = (null);

    @Override
    public int getGroupId() {
        return  792;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidBloodRaidersCommanderFrigate.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidBloodRaidersCommanderFrigate> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidBloodRaidersCommanderFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidBloodRaidersCommanderFrigate> items;
    }
}