package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionContainer
    extends Entity
{
    public static final MissionContainer.MetaGroup METAGROUP = new MissionContainer.MetaGroup();

    @Override
    public IMetaGroup<MissionContainer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionContainer>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionContainer.yaml";
        private Map<String, MissionContainer> cache = (null);

        @Override
        public IMetaCategory<? super MissionContainer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  952;
        }

        @Override
        public String getName() {
            return "MissionContainer";
        }

        @Override
        public synchronized Map<String, MissionContainer> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionContainer.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionContainer> types;
        }
    }
}
