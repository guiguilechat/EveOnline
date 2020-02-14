package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionCaldariStateDestroyer
    extends Entity
{
    public static final MissionCaldariStateDestroyer.MetaGroup METAGROUP = new MissionCaldariStateDestroyer.MetaGroup();

    @Override
    public IMetaGroup<MissionCaldariStateDestroyer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionCaldariStateDestroyer>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionCaldariStateDestroyer.yaml";
        private Map<String, MissionCaldariStateDestroyer> cache = (null);

        @Override
        public IMetaCategory<? super MissionCaldariStateDestroyer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  676;
        }

        @Override
        public String getName() {
            return "MissionCaldariStateDestroyer";
        }

        @Override
        public synchronized Map<String, MissionCaldariStateDestroyer> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionCaldariStateDestroyer.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionCaldariStateDestroyer> types;
        }
    }
}
