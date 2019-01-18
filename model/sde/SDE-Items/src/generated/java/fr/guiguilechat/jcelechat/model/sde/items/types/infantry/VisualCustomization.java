package fr.guiguilechat.jcelechat.model.sde.items.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class VisualCustomization
    extends Infantry
{
    public static final VisualCustomization.MetaGroup METAGROUP = new VisualCustomization.MetaGroup();

    @Override
    public IMetaGroup<VisualCustomization> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<VisualCustomization>
    {
        public static final String RESOURCE_PATH = "SDE/items/infantry/VisualCustomization.yaml";
        private Map<String, VisualCustomization> cache = (null);

        @Override
        public IMetaCategory<? super VisualCustomization> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  367594;
        }

        @Override
        public String getName() {
            return "VisualCustomization";
        }

        @Override
        public synchronized Map<String, VisualCustomization> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(VisualCustomization.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, VisualCustomization> items;
        }
    }
}
