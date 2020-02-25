package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionCaldariStateBattleship
    extends Entity
{
    public static final MissionCaldariStateBattleship.MetaGroup METAGROUP = new MissionCaldariStateBattleship.MetaGroup();

    @Override
    public IMetaGroup<MissionCaldariStateBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionCaldariStateBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionCaldariStateBattleship.yaml";
        private Map<String, MissionCaldariStateBattleship> cache = (null);

        @Override
        public IMetaCategory<? super MissionCaldariStateBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  674;
        }

        @Override
        public String getName() {
            return "MissionCaldariStateBattleship";
        }

        @Override
        public synchronized Map<String, MissionCaldariStateBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionCaldariStateBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionCaldariStateBattleship> types;
        }
    }
}