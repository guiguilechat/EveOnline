package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;

public class MoonMiningBeacon
    extends Celestial
{
    /**
     * Attribute to disallow targetting.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Untargetable;
    public final static String RESOURCE_PATH = "SDE/items/celestial/MoonMiningBeacon.yaml";
    private static LinkedHashMap<String, MoonMiningBeacon> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1158 :
            {
                return Untargetable;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1915;
    }

    @Override
    public Class<?> getGroup() {
        return MoonMiningBeacon.class;
    }

    public static synchronized LinkedHashMap<String, MoonMiningBeacon> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MoonMiningBeacon.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MoonMiningBeacon> items;
    }
}