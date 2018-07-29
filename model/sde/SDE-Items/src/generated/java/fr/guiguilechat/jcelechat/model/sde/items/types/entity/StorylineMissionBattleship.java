package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class StorylineMissionBattleship
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/StorylineMissionBattleship.yaml";
    private static LinkedHashMap<String, StorylineMissionBattleship> cache = (null);

    @Override
    public int getGroupId() {
        return  534;
    }

    @Override
    public Class<?> getGroup() {
        return StorylineMissionBattleship.class;
    }

    public static synchronized LinkedHashMap<String, StorylineMissionBattleship> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StorylineMissionBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StorylineMissionBattleship> items;
    }
}