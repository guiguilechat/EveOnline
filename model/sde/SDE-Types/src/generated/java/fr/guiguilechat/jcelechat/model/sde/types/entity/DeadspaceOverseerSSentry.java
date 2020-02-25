package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceOverseerSSentry
    extends Entity
{
    public static final DeadspaceOverseerSSentry.MetaGroup METAGROUP = new DeadspaceOverseerSSentry.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceOverseerSSentry> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceOverseerSSentry>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/DeadspaceOverseerSSentry.yaml";
        private Map<String, DeadspaceOverseerSSentry> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceOverseerSSentry> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  495;
        }

        @Override
        public String getName() {
            return "DeadspaceOverseerSSentry";
        }

        @Override
        public synchronized Map<String, DeadspaceOverseerSSentry> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DeadspaceOverseerSSentry.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceOverseerSSentry> types;
        }
    }
}