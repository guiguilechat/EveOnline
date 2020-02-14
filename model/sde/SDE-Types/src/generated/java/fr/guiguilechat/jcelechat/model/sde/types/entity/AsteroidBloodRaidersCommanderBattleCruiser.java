package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidBloodRaidersCommanderBattleCruiser
    extends Entity
{
    public static final AsteroidBloodRaidersCommanderBattleCruiser.MetaGroup METAGROUP = new AsteroidBloodRaidersCommanderBattleCruiser.MetaGroup();

    @Override
    public IMetaGroup<AsteroidBloodRaidersCommanderBattleCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidBloodRaidersCommanderBattleCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidBloodRaidersCommanderBattleCruiser.yaml";
        private Map<String, AsteroidBloodRaidersCommanderBattleCruiser> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidBloodRaidersCommanderBattleCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  795;
        }

        @Override
        public String getName() {
            return "AsteroidBloodRaidersCommanderBattleCruiser";
        }

        @Override
        public synchronized Map<String, AsteroidBloodRaidersCommanderBattleCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidBloodRaidersCommanderBattleCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidBloodRaidersCommanderBattleCruiser> types;
        }
    }
}
