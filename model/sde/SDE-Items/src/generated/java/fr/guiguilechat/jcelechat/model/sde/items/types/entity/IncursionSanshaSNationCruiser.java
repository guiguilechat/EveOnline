package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class IncursionSanshaSNationCruiser
    extends Entity
{
    public static final IncursionSanshaSNationCruiser.MetaGroup METAGROUP = new IncursionSanshaSNationCruiser.MetaGroup();

    @Override
    public IMetaGroup<IncursionSanshaSNationCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<IncursionSanshaSNationCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/items/entity/IncursionSanshaSNationCruiser.yaml";
        private Map<String, IncursionSanshaSNationCruiser> cache = (null);

        @Override
        public IMetaCategory<? super IncursionSanshaSNationCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1054;
        }

        @Override
        public String getName() {
            return "IncursionSanshaSNationCruiser";
        }

        @Override
        public synchronized Map<String, IncursionSanshaSNationCruiser> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(IncursionSanshaSNationCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, IncursionSanshaSNationCruiser> items;
        }
    }
}
