package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class MissionThukkerCruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/MissionThukkerCruiser.yaml";
    private static LinkedHashMap<String, MissionThukkerCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  824;
    }

    @Override
    public Class<?> getGroup() {
        return MissionThukkerCruiser.class;
    }

    public static synchronized LinkedHashMap<String, MissionThukkerCruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MissionThukkerCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MissionThukkerCruiser> items;
    }
}