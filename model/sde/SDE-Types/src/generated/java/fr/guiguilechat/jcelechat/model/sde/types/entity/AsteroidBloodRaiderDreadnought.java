package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidBloodRaiderDreadnought
    extends Entity
{
    public static final AsteroidBloodRaiderDreadnought.MetaGroup METAGROUP = new AsteroidBloodRaiderDreadnought.MetaGroup();

    @Override
    public IMetaGroup<AsteroidBloodRaiderDreadnought> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidBloodRaiderDreadnought>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidBloodRaiderDreadnought.yaml";
        private Map<String, AsteroidBloodRaiderDreadnought> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidBloodRaiderDreadnought> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1683;
        }

        @Override
        public String getName() {
            return "AsteroidBloodRaiderDreadnought";
        }

        @Override
        public synchronized Map<String, AsteroidBloodRaiderDreadnought> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidBloodRaiderDreadnought.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidBloodRaiderDreadnought> types;
        }
    }
}