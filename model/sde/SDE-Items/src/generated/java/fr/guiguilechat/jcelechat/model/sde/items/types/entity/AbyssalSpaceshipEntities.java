package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AbyssalSpaceshipEntities
    extends Entity
{
    public final static AbyssalSpaceshipEntities.MetaGroup METAGROUP = new AbyssalSpaceshipEntities.MetaGroup();

    @Override
    public IMetaGroup<AbyssalSpaceshipEntities> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AbyssalSpaceshipEntities>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/AbyssalSpaceshipEntities.yaml";
        private Map<String, AbyssalSpaceshipEntities> cache = (null);

        @Override
        public IMetaCategory<? super AbyssalSpaceshipEntities> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1982;
        }

        @Override
        public String getName() {
            return "AbyssalSpaceshipEntities";
        }

        @Override
        public synchronized Map<String, AbyssalSpaceshipEntities> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(AbyssalSpaceshipEntities.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AbyssalSpaceshipEntities> items;
        }
    }
}