package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;

public class StationConversionMonuments
    extends Celestial
{
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * This is used to connect the alliance logos to the monuments that were placed as part of the outpost and conquerable station phaseout process in 2018
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MonumentAllianceID;
    public final static String RESOURCE_PATH = "SDE/items/celestial/StationConversionMonuments.yaml";
    private static LinkedHashMap<String, StationConversionMonuments> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  9 :
            {
                return Hp;
            }
            case  2787 :
            {
                return MonumentAllianceID;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1998;
    }

    @Override
    public Class<?> getGroup() {
        return StationConversionMonuments.class;
    }

    public static synchronized LinkedHashMap<String, StationConversionMonuments> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StationConversionMonuments.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StationConversionMonuments> items;
    }
}