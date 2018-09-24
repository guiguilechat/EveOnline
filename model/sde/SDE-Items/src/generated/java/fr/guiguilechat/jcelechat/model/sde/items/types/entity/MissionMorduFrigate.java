package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionMorduFrigate
    extends Entity
{
    public final static MissionMorduFrigate.MetaGroup METAGROUP = new MissionMorduFrigate.MetaGroup();

    @Override
    public IMetaGroup<MissionMorduFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionMorduFrigate>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/MissionMorduFrigate.yaml";
        private Map<String, MissionMorduFrigate> cache = (null);

        @Override
        public IMetaCategory<? super MissionMorduFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  699;
        }

        @Override
        public String getName() {
            return "MissionMorduFrigate";
        }

        @Override
        public synchronized Map<String, MissionMorduFrigate> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(MissionMorduFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionMorduFrigate> items;
        }
    }
}
