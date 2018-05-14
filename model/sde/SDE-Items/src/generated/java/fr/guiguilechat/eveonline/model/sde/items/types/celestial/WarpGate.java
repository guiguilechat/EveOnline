package fr.guiguilechat.eveonline.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;
import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Celestial;
import org.yaml.snakeyaml.Yaml;

public class WarpGate
    extends Celestial
{
    /**
     * The number of hit points on the entities armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorHP;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Determines the maximum weight of a ship that, ships that are to heavy get denied of service by this attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MassLimit;
    /**
     * The distance at which to react when relevant objects come within range.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ProximityRange;
    public final static String RESOURCE_PATH = "SDE/items/celestial/WarpGate.yaml";
    private static LinkedHashMap<String, WarpGate> cache = (null);

    public int attributeInt(IntAttribute attribute) {
        switch (attribute.getId()) {
            case  265 :
            {
                return ArmorHP;
            }
            case  9 :
            {
                return Hp;
            }
            case  154 :
            {
                return ProximityRange;
            }
            default:
            {
                return super.attributeInt((attribute));
            }
        }
    }

    public double attributeDouble(DoubleAttribute attribute) {
        switch (attribute.getId()) {
            case  622 :
            {
                return MassLimit;
            }
            default:
            {
                return super.attributeDouble((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  366;
    }

    @Override
    public Class<?> getGroup() {
        return WarpGate.class;
    }

    public static synchronized LinkedHashMap<String, WarpGate> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(WarpGate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, WarpGate> items;
    }
}
