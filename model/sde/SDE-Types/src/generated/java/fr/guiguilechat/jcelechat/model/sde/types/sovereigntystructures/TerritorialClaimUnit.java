package fr.guiguilechat.jcelechat.model.sde.types.sovereigntystructures;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.SovereigntyStructures;
import org.yaml.snakeyaml.Yaml;

public class TerritorialClaimUnit
    extends SovereigntyStructures
{
    public static final TerritorialClaimUnit.MetaGroup METAGROUP = new TerritorialClaimUnit.MetaGroup();

    @Override
    public IMetaGroup<TerritorialClaimUnit> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<TerritorialClaimUnit>
    {
        public static final String RESOURCE_PATH = "SDE/types/sovereigntystructures/TerritorialClaimUnit.yaml";
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
                try(final InputStreamReader reader = new InputStreamReader(TerritorialClaimUnit.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, TerritorialClaimUnit> types;
        }
    }
}