package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AmarrNavyRoamingCapital
    extends Entity
{
    public final static AmarrNavyRoamingCapital.MetaGroup METAGROUP = new AmarrNavyRoamingCapital.MetaGroup();

    @Override
    public IMetaGroup<AmarrNavyRoamingCapital> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AmarrNavyRoamingCapital>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AmarrNavyRoamingCapital.yaml";
        private Map<String, AmarrNavyRoamingCapital> cache = (null);

        @Override
        public IMetaCategory<? super AmarrNavyRoamingCapital> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1412;
        }

        @Override
        public String getName() {
            return "AmarrNavyRoamingCapital";
        }

        @Override
        public synchronized Map<String, AmarrNavyRoamingCapital> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AmarrNavyRoamingCapital.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AmarrNavyRoamingCapital> items;
        }
    }
}
