package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidAngelCartelCommanderCruiser
    extends Entity
{
    public static final AsteroidAngelCartelCommanderCruiser.MetaGroup METAGROUP = new AsteroidAngelCartelCommanderCruiser.MetaGroup();

    @Override
    public IMetaGroup<AsteroidAngelCartelCommanderCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidAngelCartelCommanderCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidAngelCartelCommanderCruiser.yaml";
        private Map<String, AsteroidAngelCartelCommanderCruiser> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidAngelCartelCommanderCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  790;
        }

        @Override
        public String getName() {
            return "AsteroidAngelCartelCommanderCruiser";
        }

        @Override
        public synchronized Map<String, AsteroidAngelCartelCommanderCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidAngelCartelCommanderCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidAngelCartelCommanderCruiser> types;
        }
    }
}