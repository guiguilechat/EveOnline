package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class NPCDreadnought
    extends Entity
{
    public final static NPCDreadnought.MetaGroup METAGROUP = new NPCDreadnought.MetaGroup();

    @Override
    public IMetaGroup<NPCDreadnought> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<NPCDreadnought>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/NPCDreadnought.yaml";
        private Map<String, NPCDreadnought> cache = (null);

        @Override
        public IMetaCategory<? super NPCDreadnought> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1880;
        }

        @Override
        public String getName() {
            return "NPCDreadnought";
        }

        @Override
        public synchronized Map<String, NPCDreadnought> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(NPCDreadnought.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, NPCDreadnought> items;
        }
    }
}
