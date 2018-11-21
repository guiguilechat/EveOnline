package fr.guiguilechat.jcelechat.model.sde.items.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class SalvageDecryptors
    extends Infantry
{
    public final static SalvageDecryptors.MetaGroup METAGROUP = new SalvageDecryptors.MetaGroup();

    @Override
    public IMetaGroup<SalvageDecryptors> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SalvageDecryptors>
    {
        public final static String RESOURCE_PATH = "SDE/items/infantry/SalvageDecryptors.yaml";
        private Map<String, SalvageDecryptors> cache = (null);

        @Override
        public IMetaCategory<? super SalvageDecryptors> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  367776;
        }

        @Override
        public String getName() {
            return "SalvageDecryptors";
        }

        @Override
        public synchronized Map<String, SalvageDecryptors> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(SalvageDecryptors.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SalvageDecryptors> items;
        }
    }
}