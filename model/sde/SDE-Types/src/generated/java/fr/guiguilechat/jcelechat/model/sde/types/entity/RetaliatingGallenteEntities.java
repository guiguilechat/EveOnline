package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RetaliatingGallenteEntities
    extends Entity
{
    public static final RetaliatingGallenteEntities.MetaGroup METAGROUP = new RetaliatingGallenteEntities.MetaGroup();

    @Override
    public IMetaGroup<RetaliatingGallenteEntities> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RetaliatingGallenteEntities>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/RetaliatingGallenteEntities.yaml";
        private Map<String, RetaliatingGallenteEntities> cache = (null);

        @Override
        public IMetaCategory<? super RetaliatingGallenteEntities> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  4036;
        }

        @Override
        public String getName() {
            return "RetaliatingGallenteEntities";
        }

        @Override
        public synchronized Map<String, RetaliatingGallenteEntities> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RetaliatingGallenteEntities.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RetaliatingGallenteEntities> types;
        }
    }
}
