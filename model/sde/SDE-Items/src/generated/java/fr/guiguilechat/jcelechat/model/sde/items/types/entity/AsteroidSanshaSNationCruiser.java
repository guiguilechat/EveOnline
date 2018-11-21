package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSanshaSNationCruiser
    extends Entity
{
    public final static AsteroidSanshaSNationCruiser.MetaGroup METAGROUP = new AsteroidSanshaSNationCruiser.MetaGroup();

    @Override
    public IMetaGroup<AsteroidSanshaSNationCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidSanshaSNationCruiser>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSanshaSNationCruiser.yaml";
        private Map<String, AsteroidSanshaSNationCruiser> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidSanshaSNationCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  566;
        }

        @Override
        public String getName() {
            return "AsteroidSanshaSNationCruiser";
        }

        @Override
        public synchronized Map<String, AsteroidSanshaSNationCruiser> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AsteroidSanshaSNationCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidSanshaSNationCruiser> items;
        }
    }
}