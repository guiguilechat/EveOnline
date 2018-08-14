package fr.guiguilechat.jcelechat.model.sde.items.types.sovereigntystructures;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.SovereigntyStructures;
import org.yaml.snakeyaml.Yaml;

public class TerritorialClaimUnit
    extends SovereigntyStructures
{
    public final static TerritorialClaimUnit.MetaGroup METAGROUP = new TerritorialClaimUnit.MetaGroup();

    @Override
    public IMetaGroup<TerritorialClaimUnit> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<TerritorialClaimUnit>
    {
        public final static String RESOURCE_PATH = "SDE/items/sovereigntystructures/TerritorialClaimUnit.yaml";
        private Map<String, TerritorialClaimUnit> cache = (null);

        @Override
        public IMetaCategory<? super TerritorialClaimUnit> category() {
            return SovereigntyStructures.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1003;
        }

        @Override
        public String getName() {
            return "TerritorialClaimUnit";
        }

        @Override
        public synchronized Map<String, TerritorialClaimUnit> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(TerritorialClaimUnit.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, TerritorialClaimUnit> items;
        }
    }
}
