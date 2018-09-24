package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RoamingBloodRaiderFrigate
    extends Entity
{
    public final static RoamingBloodRaiderFrigate.MetaGroup METAGROUP = new RoamingBloodRaiderFrigate.MetaGroup();

    @Override
    public IMetaGroup<RoamingBloodRaiderFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RoamingBloodRaiderFrigate>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/RoamingBloodRaiderFrigate.yaml";
        private Map<String, RoamingBloodRaiderFrigate> cache = (null);

        @Override
        public IMetaCategory<? super RoamingBloodRaiderFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1734;
        }

        @Override
        public String getName() {
            return "RoamingBloodRaiderFrigate";
        }

        @Override
        public synchronized Map<String, RoamingBloodRaiderFrigate> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(RoamingBloodRaiderFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RoamingBloodRaiderFrigate> items;
        }
    }
}
