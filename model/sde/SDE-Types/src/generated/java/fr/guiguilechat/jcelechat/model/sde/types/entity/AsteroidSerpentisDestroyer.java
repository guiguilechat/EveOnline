package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSerpentisDestroyer
    extends Entity
{
    public static final AsteroidSerpentisDestroyer.MetaGroup METAGROUP = new AsteroidSerpentisDestroyer.MetaGroup();

    @Override
    public IMetaGroup<AsteroidSerpentisDestroyer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidSerpentisDestroyer>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidSerpentisDestroyer.yaml";
        private Map<String, AsteroidSerpentisDestroyer> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidSerpentisDestroyer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  583;
        }

        @Override
        public String getName() {
            return "AsteroidSerpentisDestroyer";
        }

        @Override
        public synchronized Map<String, AsteroidSerpentisDestroyer> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidSerpentisDestroyer.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidSerpentisDestroyer> types;
        }
    }
}
