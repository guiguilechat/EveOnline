package fr.guiguilechat.jcelechat.model.sde.items.types.accessories;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Accessories;

public class LegacyCurrency
    extends Accessories
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AurumConversionRate;
    /**
     * Number of days that this PLEX adds to your account
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NumDays;
    public final static String RESOURCE_PATH = "SDE/items/accessories/LegacyCurrency.yaml";
    private static LinkedHashMap<String, LegacyCurrency> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1818 :
            {
                return AurumConversionRate;
            }
            case  1551 :
            {
                return NumDays;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  943;
    }

    @Override
    public Class<?> getGroup() {
        return LegacyCurrency.class;
    }

    public static synchronized LinkedHashMap<String, LegacyCurrency> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(LegacyCurrency.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, LegacyCurrency> items;
    }
}