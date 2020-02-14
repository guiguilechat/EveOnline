package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidRogueDroneCommanderFrigate
    extends Entity
{
    public static final AsteroidRogueDroneCommanderFrigate.MetaGroup METAGROUP = new AsteroidRogueDroneCommanderFrigate.MetaGroup();

    @Override
    public IMetaGroup<AsteroidRogueDroneCommanderFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidRogueDroneCommanderFrigate>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidRogueDroneCommanderFrigate.yaml";
        private Map<String, AsteroidRogueDroneCommanderFrigate> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidRogueDroneCommanderFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  847;
        }

        @Override
        public String getName() {
            return "AsteroidRogueDroneCommanderFrigate";
        }

        @Override
        public synchronized Map<String, AsteroidRogueDroneCommanderFrigate> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidRogueDroneCommanderFrigate.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidRogueDroneCommanderFrigate> types;
        }
    }
}
