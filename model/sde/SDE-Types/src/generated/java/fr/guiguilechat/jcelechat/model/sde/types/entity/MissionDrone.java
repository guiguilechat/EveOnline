package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionDrone
    extends Entity
{
    public static final MissionDrone.MetaGroup METAGROUP = new MissionDrone.MetaGroup();

    @Override
    public IMetaGroup<MissionDrone> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionDrone>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionDrone.yaml";
        private Map<String, MissionDrone> cache = (null);

        @Override
        public IMetaCategory<? super MissionDrone> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  337;
        }

        @Override
        public String getName() {
            return "MissionDrone";
        }

        @Override
        public synchronized Map<String, MissionDrone> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionDrone.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionDrone> types;
        }
    }
}