package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidRogueDroneHauler
    extends Entity
{
    public final static AsteroidRogueDroneHauler.MetaGroup METAGROUP = new AsteroidRogueDroneHauler.MetaGroup();

    @Override
    public IMetaGroup<AsteroidRogueDroneHauler> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidRogueDroneHauler>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidRogueDroneHauler.yaml";
        private Map<String, AsteroidRogueDroneHauler> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidRogueDroneHauler> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  760;
        }

        @Override
        public String getName() {
            return "AsteroidRogueDroneHauler";
        }

        @Override
        public synchronized Map<String, AsteroidRogueDroneHauler> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AsteroidRogueDroneHauler.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidRogueDroneHauler> items;
        }
    }
}
