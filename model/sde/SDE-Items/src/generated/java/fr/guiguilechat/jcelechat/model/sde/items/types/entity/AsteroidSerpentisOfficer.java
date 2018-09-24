package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSerpentisOfficer
    extends Entity
{
    public final static AsteroidSerpentisOfficer.MetaGroup METAGROUP = new AsteroidSerpentisOfficer.MetaGroup();

    @Override
    public IMetaGroup<AsteroidSerpentisOfficer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidSerpentisOfficer>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSerpentisOfficer.yaml";
        private Map<String, AsteroidSerpentisOfficer> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidSerpentisOfficer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  574;
        }

        @Override
        public String getName() {
            return "AsteroidSerpentisOfficer";
        }

        @Override
        public synchronized Map<String, AsteroidSerpentisOfficer> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AsteroidSerpentisOfficer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidSerpentisOfficer> items;
        }
    }
}
