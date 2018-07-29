package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidBloodRaidersFrigate
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidBloodRaidersFrigate.yaml";
    private static LinkedHashMap<String, AsteroidBloodRaidersFrigate> cache = (null);

    @Override
    public int getGroupId() {
        return  557;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidBloodRaidersFrigate.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidBloodRaidersFrigate> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidBloodRaidersFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidBloodRaidersFrigate> items;
    }
}