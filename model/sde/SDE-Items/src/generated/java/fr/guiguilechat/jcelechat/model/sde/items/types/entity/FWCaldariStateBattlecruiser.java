package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class FWCaldariStateBattlecruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/FWCaldariStateBattlecruiser.yaml";
    private static LinkedHashMap<String, FWCaldariStateBattlecruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  1184;
    }

    @Override
    public Class<?> getGroup() {
        return FWCaldariStateBattlecruiser.class;
    }

    public static synchronized LinkedHashMap<String, FWCaldariStateBattlecruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FWCaldariStateBattlecruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, FWCaldariStateBattlecruiser> items;
    }
}