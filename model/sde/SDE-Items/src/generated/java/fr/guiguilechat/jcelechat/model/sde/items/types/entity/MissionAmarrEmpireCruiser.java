package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class MissionAmarrEmpireCruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/MissionAmarrEmpireCruiser.yaml";
    private static LinkedHashMap<String, MissionAmarrEmpireCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  668;
    }

    @Override
    public Class<?> getGroup() {
        return MissionAmarrEmpireCruiser.class;
    }

    public static synchronized LinkedHashMap<String, MissionAmarrEmpireCruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MissionAmarrEmpireCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MissionAmarrEmpireCruiser> items;
    }
}