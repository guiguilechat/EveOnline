package fr.guiguilechat.jcelechat.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class OverseerPersonalEffects
    extends Commodity
{
    public static final OverseerPersonalEffects.MetaGroup METAGROUP = new OverseerPersonalEffects.MetaGroup();

    @Override
    public IMetaGroup<OverseerPersonalEffects> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<OverseerPersonalEffects>
    {
        public static final String RESOURCE_PATH = "SDE/items/commodity/OverseerPersonalEffects.yaml";
        private Map<String, OverseerPersonalEffects> cache = (null);

        @Override
        public IMetaCategory<? super OverseerPersonalEffects> category() {
            return Commodity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  493;
        }

        @Override
        public String getName() {
            return "OverseerPersonalEffects";
        }

        @Override
        public synchronized Map<String, OverseerPersonalEffects> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(OverseerPersonalEffects.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, OverseerPersonalEffects> items;
        }
    }
}
