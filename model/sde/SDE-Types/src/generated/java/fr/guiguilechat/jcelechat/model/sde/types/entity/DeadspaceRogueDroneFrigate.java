package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceRogueDroneFrigate
    extends Entity
{
    public static final DeadspaceRogueDroneFrigate.MetaGroup METAGROUP = new DeadspaceRogueDroneFrigate.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceRogueDroneFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceRogueDroneFrigate>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/DeadspaceRogueDroneFrigate.yaml";
        private Map<String, DeadspaceRogueDroneFrigate> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceRogueDroneFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  805;
        }

        @Override
        public String getName() {
            return "DeadspaceRogueDroneFrigate";
        }

        @Override
        public synchronized Map<String, DeadspaceRogueDroneFrigate> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DeadspaceRogueDroneFrigate.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceRogueDroneFrigate> types;
        }
    }
}