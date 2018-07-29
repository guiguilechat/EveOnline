package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidSanshaSNationHauler
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSanshaSNationHauler.yaml";
    private static LinkedHashMap<String, AsteroidSanshaSNationHauler> cache = (null);

    @Override
    public int getGroupId() {
        return  568;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidSanshaSNationHauler.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidSanshaSNationHauler> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidSanshaSNationHauler.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidSanshaSNationHauler> items;
    }
}