package fr.guiguilechat.jcelechat.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class TechnicalDataChips
    extends Commodity
{
    public final static TechnicalDataChips.MetaGroup METAGROUP = new TechnicalDataChips.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/commodity/TechnicalDataChips.yaml";
    private static Map<String, TechnicalDataChips> cache = (null);

    @Override
    public int getGroupId() {
        return  1886;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<TechnicalDataChips> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, TechnicalDataChips> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(TechnicalDataChips.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, TechnicalDataChips> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<TechnicalDataChips>
    {

        @Override
        public MetaCategory<? super TechnicalDataChips> category() {
            return Commodity.METACAT;
        }

        @Override
        public String getName() {
            return "TechnicalDataChips";
        }

        @Override
        public Collection<TechnicalDataChips> items() {
            return (load().values());
        }
    }
}
