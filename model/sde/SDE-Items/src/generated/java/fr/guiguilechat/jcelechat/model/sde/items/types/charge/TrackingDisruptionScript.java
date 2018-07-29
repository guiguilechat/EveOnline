package fr.guiguilechat.jcelechat.model.sde.items.types.charge;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Charge;

public class TrackingDisruptionScript
    extends Charge
{
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1399)
    public int FalloffBonusBonus;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MainColor;
    /**
     * Bonus to maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxRangeBonusBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Bonus to trackingSpeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int TrackingSpeedBonusBonus;
    public final static String RESOURCE_PATH = "SDE/items/charge/TrackingDisruptionScript.yaml";
    private static LinkedHashMap<String, TrackingDisruptionScript> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  128 :
            {
                return ChargeSize;
            }
            case  1332 :
            {
                return FalloffBonusBonus;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  124 :
            {
                return MainColor;
            }
            case  1315 :
            {
                return MaxRangeBonusBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1316 :
            {
                return TrackingSpeedBonusBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  909;
    }

    @Override
    public Class<?> getGroup() {
        return TrackingDisruptionScript.class;
    }

    public static synchronized LinkedHashMap<String, TrackingDisruptionScript> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(TrackingDisruptionScript.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, TrackingDisruptionScript> items;
    }
}