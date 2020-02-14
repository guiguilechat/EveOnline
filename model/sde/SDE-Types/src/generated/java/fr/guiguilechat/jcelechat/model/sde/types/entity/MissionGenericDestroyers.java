package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionGenericDestroyers
    extends Entity
{
    public static final MissionGenericDestroyers.MetaGroup METAGROUP = new MissionGenericDestroyers.MetaGroup();

    @Override
    public IMetaGroup<MissionGenericDestroyers> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionGenericDestroyers>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionGenericDestroyers.yaml";
        private Map<String, MissionGenericDestroyers> cache = (null);

        @Override
        public IMetaCategory<? super MissionGenericDestroyers> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  829;
        }

        @Override
        public String getName() {
            return "MissionGenericDestroyers";
        }

        @Override
        public synchronized Map<String, MissionGenericDestroyers> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionGenericDestroyers.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionGenericDestroyers> types;
        }
    }
}
