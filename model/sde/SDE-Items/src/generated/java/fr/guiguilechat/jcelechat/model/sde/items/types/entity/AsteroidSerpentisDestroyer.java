package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidSerpentisDestroyer
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSerpentisDestroyer.yaml";
    private static LinkedHashMap<String, AsteroidSerpentisDestroyer> cache = (null);

    @Override
    public int getGroupId() {
        return  583;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidSerpentisDestroyer.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidSerpentisDestroyer> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidSerpentisDestroyer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidSerpentisDestroyer> items;
    }
}