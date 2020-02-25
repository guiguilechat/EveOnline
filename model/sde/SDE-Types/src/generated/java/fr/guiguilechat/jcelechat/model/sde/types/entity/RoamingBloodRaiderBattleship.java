package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RoamingBloodRaiderBattleship
    extends Entity
{
    public static final RoamingBloodRaiderBattleship.MetaGroup METAGROUP = new RoamingBloodRaiderBattleship.MetaGroup();

    @Override
    public IMetaGroup<RoamingBloodRaiderBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RoamingBloodRaiderBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/RoamingBloodRaiderBattleship.yaml";
        private Map<String, RoamingBloodRaiderBattleship> cache = (null);

        @Override
        public IMetaCategory<? super RoamingBloodRaiderBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1737;
        }

        @Override
        public String getName() {
            return "RoamingBloodRaiderBattleship";
        }

        @Override
        public synchronized Map<String, RoamingBloodRaiderBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RoamingBloodRaiderBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RoamingBloodRaiderBattleship> types;
        }
    }
}