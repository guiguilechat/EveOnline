package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidRogueDroneCarrier
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidRogueDroneCarrier.yaml";
    private static LinkedHashMap<String, AsteroidRogueDroneCarrier> cache = (null);

    @Override
    public int getGroupId() {
        return  1691;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidRogueDroneCarrier.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidRogueDroneCarrier> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidRogueDroneCarrier.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidRogueDroneCarrier> items;
    }
}