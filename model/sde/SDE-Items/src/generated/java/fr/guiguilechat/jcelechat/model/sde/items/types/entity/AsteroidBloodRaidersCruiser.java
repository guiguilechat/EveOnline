package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidBloodRaidersCruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidBloodRaidersCruiser.yaml";
    private static LinkedHashMap<String, AsteroidBloodRaidersCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  555;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidBloodRaidersCruiser.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidBloodRaidersCruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidBloodRaidersCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidBloodRaidersCruiser> items;
    }
}