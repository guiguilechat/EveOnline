package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class StorylineMissionBattleship
    extends Entity
{
    public static final StorylineMissionBattleship.MetaGroup METAGROUP = new StorylineMissionBattleship.MetaGroup();

    @Override
    public IMetaGroup<StorylineMissionBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<StorylineMissionBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/StorylineMissionBattleship.yaml";
        private Map<String, StorylineMissionBattleship> cache = (null);

        @Override
        public IMetaCategory<? super StorylineMissionBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  534;
        }

        @Override
        public String getName() {
            return "StorylineMissionBattleship";
        }

        @Override
        public synchronized Map<String, StorylineMissionBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(StorylineMissionBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, StorylineMissionBattleship> types;
        }
    }
}