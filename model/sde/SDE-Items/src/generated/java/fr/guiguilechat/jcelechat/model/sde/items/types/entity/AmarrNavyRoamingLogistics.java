package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AmarrNavyRoamingLogistics
    extends Entity
{
    public final static AmarrNavyRoamingLogistics.MetaGroup METAGROUP = new AmarrNavyRoamingLogistics.MetaGroup();

    @Override
    public IMetaGroup<AmarrNavyRoamingLogistics> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AmarrNavyRoamingLogistics>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AmarrNavyRoamingLogistics.yaml";
        private Map<String, AmarrNavyRoamingLogistics> cache = (null);

        @Override
        public IMetaCategory<? super AmarrNavyRoamingLogistics> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1413;
        }

        @Override
        public String getName() {
            return "AmarrNavyRoamingLogistics";
        }

        @Override
        public synchronized Map<String, AmarrNavyRoamingLogistics> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AmarrNavyRoamingLogistics.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AmarrNavyRoamingLogistics> items;
        }
    }
}
