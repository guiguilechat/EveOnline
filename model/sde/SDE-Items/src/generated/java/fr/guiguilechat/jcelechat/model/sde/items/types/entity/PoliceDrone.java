package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class PoliceDrone
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/PoliceDrone.yaml";
    private static LinkedHashMap<String, PoliceDrone> cache = (null);

    @Override
    public int getGroupId() {
        return  182;
    }

    @Override
    public Class<?> getGroup() {
        return PoliceDrone.class;
    }

    public static synchronized LinkedHashMap<String, PoliceDrone> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(PoliceDrone.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, PoliceDrone> items;
    }
}