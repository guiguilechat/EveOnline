package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class CustomsOfficial
    extends Entity
{
    public final static CustomsOfficial.MetaGroup METAGROUP = new CustomsOfficial.MetaGroup();

    @Override
    public IMetaGroup<CustomsOfficial> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CustomsOfficial>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/CustomsOfficial.yaml";
        private Map<String, CustomsOfficial> cache = (null);

        @Override
        public IMetaCategory<? super CustomsOfficial> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  446;
        }

        @Override
        public String getName() {
            return "CustomsOfficial";
        }

        @Override
        public synchronized Map<String, CustomsOfficial> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(CustomsOfficial.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CustomsOfficial> items;
        }
    }
}