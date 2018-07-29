package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidBloodRaiderDreadnought
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidBloodRaiderDreadnought.yaml";
    private static LinkedHashMap<String, AsteroidBloodRaiderDreadnought> cache = (null);

    @Override
    public int getGroupId() {
        return  1683;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidBloodRaiderDreadnought.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidBloodRaiderDreadnought> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidBloodRaiderDreadnought.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidBloodRaiderDreadnought> items;
    }
}