package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceOverseerFrigate
    extends Entity
{
    public static final DeadspaceOverseerFrigate.MetaGroup METAGROUP = new DeadspaceOverseerFrigate.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceOverseerFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceOverseerFrigate>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/DeadspaceOverseerFrigate.yaml";
        private Map<String, DeadspaceOverseerFrigate> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceOverseerFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  819;
        }

        @Override
        public String getName() {
            return "DeadspaceOverseerFrigate";
        }

        @Override
        public synchronized Map<String, DeadspaceOverseerFrigate> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DeadspaceOverseerFrigate.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceOverseerFrigate> types;
        }
    }
}
