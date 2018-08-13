package fr.guiguilechat.jcelechat.model.sde.items.types.sovereigntystructures;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.types.SovereigntyStructures;
import org.yaml.snakeyaml.Yaml;

public class TerritorialClaimUnit
    extends SovereigntyStructures
{
    public final static String RESOURCE_PATH = "SDE/items/sovereigntystructures/TerritorialClaimUnit.yaml";
    private static Map<String, TerritorialClaimUnit> cache = (null);

    @Override
    public int getGroupId() {
        return  1003;
    }

    @Override
    public Class<?> getGroup() {
        return TerritorialClaimUnit.class;
    }

    public static synchronized Map<String, TerritorialClaimUnit> load() {
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
