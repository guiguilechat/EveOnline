package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class IncursionSanshaSNationCapital
    extends Entity
{
    public static final IncursionSanshaSNationCapital.MetaGroup METAGROUP = new IncursionSanshaSNationCapital.MetaGroup();

    @Override
    public IMetaGroup<IncursionSanshaSNationCapital> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<IncursionSanshaSNationCapital>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/IncursionSanshaSNationCapital.yaml";
        private Map<String, IncursionSanshaSNationCapital> cache = (null);

        @Override
        public IMetaCategory<? super IncursionSanshaSNationCapital> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1052;
        }

        @Override
        public String getName() {
            return "IncursionSanshaSNationCapital";
        }

        @Override
        public synchronized Map<String, IncursionSanshaSNationCapital> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(IncursionSanshaSNationCapital.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, IncursionSanshaSNationCapital> types;
        }
    }
}
