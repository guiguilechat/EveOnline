package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSanshaSNationCommanderFrigate
    extends Entity
{
    public final static AsteroidSanshaSNationCommanderFrigate.MetaGroup METAGROUP = new AsteroidSanshaSNationCommanderFrigate.MetaGroup();

    @Override
    public IMetaGroup<AsteroidSanshaSNationCommanderFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidSanshaSNationCommanderFrigate>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSanshaSNationCommanderFrigate.yaml";
        private Map<String, AsteroidSanshaSNationCommanderFrigate> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidSanshaSNationCommanderFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  810;
        }

        @Override
        public String getName() {
            return "AsteroidSanshaSNationCommanderFrigate";
        }

        @Override
        public synchronized Map<String, AsteroidSanshaSNationCommanderFrigate> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AsteroidSanshaSNationCommanderFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidSanshaSNationCommanderFrigate> items;
        }
    }
}