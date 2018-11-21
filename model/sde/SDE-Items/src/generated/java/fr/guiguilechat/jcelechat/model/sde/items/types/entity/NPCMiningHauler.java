package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class NPCMiningHauler
    extends Entity
{
    public final static NPCMiningHauler.MetaGroup METAGROUP = new NPCMiningHauler.MetaGroup();

    @Override
    public IMetaGroup<NPCMiningHauler> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<NPCMiningHauler>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/NPCMiningHauler.yaml";
        private Map<String, NPCMiningHauler> cache = (null);

        @Override
        public IMetaCategory<? super NPCMiningHauler> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1767;
        }

        @Override
        public String getName() {
            return "NPCMiningHauler";
        }

        @Override
        public synchronized Map<String, NPCMiningHauler> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(NPCMiningHauler.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, NPCMiningHauler> items;
        }
    }
}