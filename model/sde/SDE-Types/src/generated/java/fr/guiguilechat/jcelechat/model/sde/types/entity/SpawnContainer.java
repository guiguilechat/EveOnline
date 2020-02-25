package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class SpawnContainer
    extends Entity
{
    public static final SpawnContainer.MetaGroup METAGROUP = new SpawnContainer.MetaGroup();

    @Override
    public IMetaGroup<SpawnContainer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SpawnContainer>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/SpawnContainer.yaml";
        private Map<String, SpawnContainer> cache = (null);

        @Override
        public IMetaCategory<? super SpawnContainer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  306;
        }

        @Override
        public String getName() {
            return "SpawnContainer";
        }

        @Override
        public synchronized Map<String, SpawnContainer> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SpawnContainer.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SpawnContainer> types;
        }
    }
}