package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidGuristasBattleship
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidGuristasBattleship.yaml";
    private static LinkedHashMap<String, AsteroidGuristasBattleship> cache = (null);

    @Override
    public int getGroupId() {
        return  560;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidGuristasBattleship.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidGuristasBattleship> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidGuristasBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidGuristasBattleship> items;
    }
}