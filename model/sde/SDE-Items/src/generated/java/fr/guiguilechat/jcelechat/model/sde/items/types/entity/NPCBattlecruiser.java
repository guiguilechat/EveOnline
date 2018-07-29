package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class NPCBattlecruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/NPCBattlecruiser.yaml";
    private static LinkedHashMap<String, NPCBattlecruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  1909;
    }

    @Override
    public Class<?> getGroup() {
        return NPCBattlecruiser.class;
    }

    public static synchronized LinkedHashMap<String, NPCBattlecruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(NPCBattlecruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, NPCBattlecruiser> items;
    }
}