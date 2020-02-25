package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceGuristasBattleship
    extends Entity
{
    public static final DeadspaceGuristasBattleship.MetaGroup METAGROUP = new DeadspaceGuristasBattleship.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceGuristasBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceGuristasBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/DeadspaceGuristasBattleship.yaml";
        private Map<String, DeadspaceGuristasBattleship> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceGuristasBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  612;
        }

        @Override
        public String getName() {
            return "DeadspaceGuristasBattleship";
        }

        @Override
        public synchronized Map<String, DeadspaceGuristasBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DeadspaceGuristasBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceGuristasBattleship> types;
        }
    }
}