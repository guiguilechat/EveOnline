package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionGenericFrigates
    extends Entity
{
    public static final MissionGenericFrigates.MetaGroup METAGROUP = new MissionGenericFrigates.MetaGroup();

    @Override
    public IMetaGroup<MissionGenericFrigates> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionGenericFrigates>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionGenericFrigates.yaml";
        private Map<String, MissionGenericFrigates> cache = (null);

        @Override
        public IMetaCategory<? super MissionGenericFrigates> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  818;
        }

        @Override
        public String getName() {
            return "MissionGenericFrigates";
        }

        @Override
        public synchronized Map<String, MissionGenericFrigates> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionGenericFrigates.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionGenericFrigates> types;
        }
    }
}