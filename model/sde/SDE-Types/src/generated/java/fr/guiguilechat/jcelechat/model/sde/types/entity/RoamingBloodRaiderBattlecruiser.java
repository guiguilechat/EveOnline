package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RoamingBloodRaiderBattlecruiser
    extends Entity
{
    public static final RoamingBloodRaiderBattlecruiser.MetaGroup METAGROUP = new RoamingBloodRaiderBattlecruiser.MetaGroup();

    @Override
    public IMetaGroup<RoamingBloodRaiderBattlecruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RoamingBloodRaiderBattlecruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/RoamingBloodRaiderBattlecruiser.yaml";
        private Map<String, RoamingBloodRaiderBattlecruiser> cache = (null);

        @Override
        public IMetaCategory<? super RoamingBloodRaiderBattlecruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1736;
        }

        @Override
        public String getName() {
            return "RoamingBloodRaiderBattlecruiser";
        }

        @Override
        public synchronized Map<String, RoamingBloodRaiderBattlecruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RoamingBloodRaiderBattlecruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RoamingBloodRaiderBattlecruiser> types;
        }
    }
}
