package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DrifterReinforcements
    extends Entity
{
    public static final DrifterReinforcements.MetaGroup METAGROUP = new DrifterReinforcements.MetaGroup();

    @Override
    public IMetaGroup<DrifterReinforcements> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DrifterReinforcements>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/DrifterReinforcements.yaml";
        private Map<String, DrifterReinforcements> cache = (null);

        @Override
        public IMetaCategory<? super DrifterReinforcements> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1956;
        }

        @Override
        public String getName() {
            return "DrifterReinforcements";
        }

        @Override
        public synchronized Map<String, DrifterReinforcements> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DrifterReinforcements.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DrifterReinforcements> types;
        }
    }
}