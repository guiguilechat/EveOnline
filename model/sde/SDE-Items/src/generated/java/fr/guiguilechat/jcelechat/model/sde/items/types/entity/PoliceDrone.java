package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class PoliceDrone
    extends Entity
{
    public final static PoliceDrone.MetaGroup METAGROUP = new PoliceDrone.MetaGroup();

    @Override
    public IMetaGroup<PoliceDrone> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<PoliceDrone>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/PoliceDrone.yaml";
        private Map<String, PoliceDrone> cache = (null);

        @Override
        public IMetaCategory<? super PoliceDrone> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  182;
        }

        @Override
        public String getName() {
            return "PoliceDrone";
        }

        @Override
        public synchronized Map<String, PoliceDrone> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(PoliceDrone.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, PoliceDrone> items;
        }
    }
}