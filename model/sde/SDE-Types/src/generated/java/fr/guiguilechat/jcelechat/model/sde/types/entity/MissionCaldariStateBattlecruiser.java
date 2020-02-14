package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionCaldariStateBattlecruiser
    extends Entity
{
    public static final MissionCaldariStateBattlecruiser.MetaGroup METAGROUP = new MissionCaldariStateBattlecruiser.MetaGroup();

    @Override
    public IMetaGroup<MissionCaldariStateBattlecruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionCaldariStateBattlecruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionCaldariStateBattlecruiser.yaml";
        private Map<String, MissionCaldariStateBattlecruiser> cache = (null);

        @Override
        public IMetaCategory<? super MissionCaldariStateBattlecruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  672;
        }

        @Override
        public String getName() {
            return "MissionCaldariStateBattlecruiser";
        }

        @Override
        public synchronized Map<String, MissionCaldariStateBattlecruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionCaldariStateBattlecruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionCaldariStateBattlecruiser> types;
        }
    }
}
