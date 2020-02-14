package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionCONCORDCruiser
    extends Entity
{
    public static final MissionCONCORDCruiser.MetaGroup METAGROUP = new MissionCONCORDCruiser.MetaGroup();

    @Override
    public IMetaGroup<MissionCONCORDCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionCONCORDCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionCONCORDCruiser.yaml";
        private Map<String, MissionCONCORDCruiser> cache = (null);

        @Override
        public IMetaCategory<? super MissionCONCORDCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  695;
        }

        @Override
        public String getName() {
            return "MissionCONCORDCruiser";
        }

        @Override
        public synchronized Map<String, MissionCONCORDCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionCONCORDCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionCONCORDCruiser> types;
        }
    }
}
