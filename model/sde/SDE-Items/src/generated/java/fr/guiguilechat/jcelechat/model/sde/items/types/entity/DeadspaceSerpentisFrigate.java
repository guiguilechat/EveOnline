package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceSerpentisFrigate
    extends Entity
{
    public final static DeadspaceSerpentisFrigate.MetaGroup METAGROUP = new DeadspaceSerpentisFrigate.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceSerpentisFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceSerpentisFrigate>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceSerpentisFrigate.yaml";
        private Map<String, DeadspaceSerpentisFrigate> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceSerpentisFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  633;
        }

        @Override
        public String getName() {
            return "DeadspaceSerpentisFrigate";
        }

        @Override
        public synchronized Map<String, DeadspaceSerpentisFrigate> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(DeadspaceSerpentisFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceSerpentisFrigate> items;
        }
    }
}