package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceSerpentisBattleship
    extends Entity
{
    public static final DeadspaceSerpentisBattleship.MetaGroup METAGROUP = new DeadspaceSerpentisBattleship.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceSerpentisBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceSerpentisBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/DeadspaceSerpentisBattleship.yaml";
        private Map<String, DeadspaceSerpentisBattleship> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceSerpentisBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  630;
        }

        @Override
        public String getName() {
            return "DeadspaceSerpentisBattleship";
        }

        @Override
        public synchronized Map<String, DeadspaceSerpentisBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DeadspaceSerpentisBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceSerpentisBattleship> types;
        }
    }
}