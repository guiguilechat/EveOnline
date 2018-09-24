package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionMinmatarRepublicBattleship
    extends Entity
{
    public final static MissionMinmatarRepublicBattleship.MetaGroup METAGROUP = new MissionMinmatarRepublicBattleship.MetaGroup();

    @Override
    public IMetaGroup<MissionMinmatarRepublicBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionMinmatarRepublicBattleship>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/MissionMinmatarRepublicBattleship.yaml";
        private Map<String, MissionMinmatarRepublicBattleship> cache = (null);

        @Override
        public IMetaCategory<? super MissionMinmatarRepublicBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  706;
        }

        @Override
        public String getName() {
            return "MissionMinmatarRepublicBattleship";
        }

        @Override
        public synchronized Map<String, MissionMinmatarRepublicBattleship> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(MissionMinmatarRepublicBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionMinmatarRepublicBattleship> items;
        }
    }
}
