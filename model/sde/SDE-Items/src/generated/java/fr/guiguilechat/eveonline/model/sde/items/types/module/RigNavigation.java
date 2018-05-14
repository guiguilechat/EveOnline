package fr.guiguilechat.eveonline.model.sde.items.types.module;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;
import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class RigNavigation
    extends Module
{
    /**
     * Autogenerated skill attribute, WarpSBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpSBonus;
    /**
     * Bonus to the agility for a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AgilityBonus;
    /**
     * Multiplier to the agility of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AgilityMultiplier;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * Scales the capacitor need for fitted modules.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeedMultiplier;
    /**
     * Autogenerated skill attribute, cargoCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CargoCapacityBonus;
    /**
     * used on rigs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10)
    public int Drawback;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantBonusVelocity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MassBonusPercentage;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
    /**
     * Autogenerated skill attribute, speedFBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SpeedFBonus;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeCost;
    /**
     * Autogenerated skill attribute, velocityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double VelocityBonus;
    /**
     * Autogenerated skill attribute, warpCapacitorNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpCapacitorNeedBonus;
    public final static String RESOURCE_PATH = "SDE/items/module/RigNavigation.yaml";
    private static LinkedHashMap<String, RigNavigation> cache = (null);

    public int attributeInt(IntAttribute attribute) {
        switch (attribute.getId()) {
            case  624 :
            {
                return WarpSBonus;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  614 :
            {
                return CargoCapacityBonus;
            }
            case  1138 :
            {
                return Drawback;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  1131 :
            {
                return MassBonusPercentage;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  318 :
            {
                return SpeedFBonus;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            case  319 :
            {
                return WarpCapacitorNeedBonus;
            }
            default:
            {
                return super.attributeInt((attribute));
            }
        }
    }

    public double attributeDouble(DoubleAttribute attribute) {
        switch (attribute.getId()) {
            case  151 :
            {
                return AgilityBonus;
            }
            case  169 :
            {
                return AgilityMultiplier;
            }
            case  216 :
            {
                return CapacitorNeedMultiplier;
            }
            case  1076 :
            {
                return ImplantBonusVelocity;
            }
            case  315 :
            {
                return VelocityBonus;
            }
            default:
            {
                return super.attributeDouble((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  782;
    }

    @Override
    public Class<?> getGroup() {
        return RigNavigation.class;
    }

    public static synchronized LinkedHashMap<String, RigNavigation> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RigNavigation.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, RigNavigation> items;
    }
}
