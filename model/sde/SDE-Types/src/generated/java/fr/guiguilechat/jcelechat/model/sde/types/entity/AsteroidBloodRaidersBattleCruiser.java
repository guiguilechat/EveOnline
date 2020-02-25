package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidBloodRaidersBattleCruiser
    extends Entity
{
    public static final AsteroidBloodRaidersBattleCruiser.MetaGroup METAGROUP = new AsteroidBloodRaidersBattleCruiser.MetaGroup();

    @Override
    public IMetaGroup<AsteroidBloodRaidersBattleCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidBloodRaidersBattleCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidBloodRaidersBattleCruiser.yaml";
        private Map<String, AsteroidBloodRaidersBattleCruiser> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidBloodRaidersBattleCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  578;
        }

        @Override
        public String getName() {
            return "AsteroidBloodRaidersBattleCruiser";
        }

        @Override
        public synchronized Map<String, AsteroidBloodRaidersBattleCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidBloodRaidersBattleCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidBloodRaidersBattleCruiser> types;
        }
    }
}