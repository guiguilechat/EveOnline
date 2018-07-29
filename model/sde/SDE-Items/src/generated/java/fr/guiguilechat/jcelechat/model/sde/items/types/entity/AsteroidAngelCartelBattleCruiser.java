package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class AsteroidAngelCartelBattleCruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidAngelCartelBattleCruiser.yaml";
    private static LinkedHashMap<String, AsteroidAngelCartelBattleCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  576;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidAngelCartelBattleCruiser.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidAngelCartelBattleCruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidAngelCartelBattleCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidAngelCartelBattleCruiser> items;
    }
}