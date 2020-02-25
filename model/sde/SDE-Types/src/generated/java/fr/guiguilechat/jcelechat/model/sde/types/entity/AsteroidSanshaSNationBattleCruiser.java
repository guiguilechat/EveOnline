package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSanshaSNationBattleCruiser
    extends Entity
{
    public static final AsteroidSanshaSNationBattleCruiser.MetaGroup METAGROUP = new AsteroidSanshaSNationBattleCruiser.MetaGroup();

    @Override
    public IMetaGroup<AsteroidSanshaSNationBattleCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AsteroidSanshaSNationBattleCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/AsteroidSanshaSNationBattleCruiser.yaml";
        private Map<String, AsteroidSanshaSNationBattleCruiser> cache = (null);

        @Override
        public IMetaCategory<? super AsteroidSanshaSNationBattleCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  582;
        }

        @Override
        public String getName() {
            return "AsteroidSanshaSNationBattleCruiser";
        }

        @Override
        public synchronized Map<String, AsteroidSanshaSNationBattleCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AsteroidSanshaSNationBattleCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AsteroidSanshaSNationBattleCruiser> types;
        }
    }
}