package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionCaldariStateCarrier
    extends Entity
{
    public static final MissionCaldariStateCarrier.MetaGroup METAGROUP = new MissionCaldariStateCarrier.MetaGroup();

    @Override
    public IMetaGroup<MissionCaldariStateCarrier> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionCaldariStateCarrier>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionCaldariStateCarrier.yaml";
        private Map<String, MissionCaldariStateCarrier> cache = (null);

        @Override
        public IMetaCategory<? super MissionCaldariStateCarrier> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  866;
        }

        @Override
        public String getName() {
            return "MissionCaldariStateCarrier";
        }

        @Override
        public synchronized Map<String, MissionCaldariStateCarrier> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionCaldariStateCarrier.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionCaldariStateCarrier> types;
        }
    }
}
