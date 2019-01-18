package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class SentryGun
    extends Entity
{
    public static final SentryGun.MetaGroup METAGROUP = new SentryGun.MetaGroup();

    @Override
    public IMetaGroup<SentryGun> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SentryGun>
    {
        public static final String RESOURCE_PATH = "SDE/items/entity/SentryGun.yaml";
        private Map<String, SentryGun> cache = (null);

        @Override
        public IMetaCategory<? super SentryGun> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  99;
        }

        @Override
        public String getName() {
            return "SentryGun";
        }

        @Override
        public synchronized Map<String, SentryGun> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(SentryGun.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SentryGun> items;
        }
    }
}
