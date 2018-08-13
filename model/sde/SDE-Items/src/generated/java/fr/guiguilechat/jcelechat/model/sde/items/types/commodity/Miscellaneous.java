package fr.guiguilechat.jcelechat.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class Miscellaneous
    extends Commodity
{
    /**
     * Export tax multiplier when exporting this commodity off a planet.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(1)
    public int ExportTaxMultiplier;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Cost multiplier per m3 volume of this commodity when importing to a planet
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(1)
    public int ImportTaxMultiplier;
    public final static Miscellaneous.MetaGroup METAGROUP = new Miscellaneous.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/commodity/Miscellaneous.yaml";
    private static Map<String, Miscellaneous> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1641 :
            {
                return ExportTaxMultiplier;
            }
            case  9 :
            {
                return Hp;
            }
            case  1640 :
            {
                return ImportTaxMultiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  314;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Miscellaneous> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, Miscellaneous> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Miscellaneous.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Miscellaneous> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Miscellaneous>
    {

        @Override
        public MetaCategory<? super Miscellaneous> category() {
            return Commodity.METACAT;
        }

        @Override
        public String getName() {
            return "Miscellaneous";
        }

        @Override
        public Collection<Miscellaneous> items() {
            return (load().values());
        }
    }
}
