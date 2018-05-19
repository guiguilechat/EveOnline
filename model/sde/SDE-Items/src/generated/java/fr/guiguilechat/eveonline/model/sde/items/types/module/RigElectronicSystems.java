package fr.guiguilechat.eveonline.model.sde.items.types.module;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.Attribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class RigElectronicSystems
    extends Module
{
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
     * Skill bonus for cloaking targeting delay.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CloakingTargetingDelayBonus;
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
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
    /**
     * Scales the max target range of a ships electronics.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MaxTargetRangeMultiplier;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RangeSkillBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanGravimetricStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanLadarStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanMagnetometricStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanRadarStrengthPercent;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolutionBonus;
    /**
     * Skill attribute for increasing strength of EW modules.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanSkillEwStrengthBonus;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeCost;
    public final static String RESOURCE_PATH = "SDE/items/module/RigElectronicSystems.yaml";
    private static LinkedHashMap<String, RigElectronicSystems> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  169 :
            {
                return AgilityMultiplier;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  619 :
            {
                return CloakingTargetingDelayBonus;
            }
            case  1138 :
            {
                return Drawback;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  237 :
            {
                return MaxTargetRangeMultiplier;
            }
            case  294 :
            {
                return RangeSkillBonus;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  1027 :
            {
                return ScanGravimetricStrengthPercent;
            }
            case  1028 :
            {
                return ScanLadarStrengthPercent;
            }
            case  1029 :
            {
                return ScanMagnetometricStrengthPercent;
            }
            case  1030 :
            {
                return ScanRadarStrengthPercent;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  828 :
            {
                return ScanSkillEwStrengthBonus;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  786;
    }

    @Override
    public Class<?> getGroup() {
        return RigElectronicSystems.class;
    }

    public static synchronized LinkedHashMap<String, RigElectronicSystems> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RigElectronicSystems.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, RigElectronicSystems> items;
    }
}
