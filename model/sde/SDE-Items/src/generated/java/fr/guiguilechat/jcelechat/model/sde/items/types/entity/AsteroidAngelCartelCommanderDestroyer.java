package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidAngelCartelCommanderDestroyer
    extends Entity
{
    public final static AsteroidAngelCartelCommanderDestroyer.MetaGroup METAGROUP = new AsteroidAngelCartelCommanderDestroyer.MetaGroup();

    @Override
    public IMetaGroup<AsteroidAngelCartelCommanderDestroyer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidAngelCartelCommanderDestroyer>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidAngelCartelCommanderDestroyer.yaml";
        private Map<String, AsteroidAngelCartelCommanderDestroyer> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidAngelCartelCommanderDestroyer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  794;
        }

        @Override
        public String getName() {
            return "AsteroidAngelCartelCommanderDestroyer";
        }

        @Override
        public synchronized Map<String, AsteroidAngelCartelCommanderDestroyer> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AsteroidAngelCartelCommanderDestroyer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidAngelCartelCommanderDestroyer> items;
        }
    }
}