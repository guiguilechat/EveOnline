package fr.guiguilechat.eveonline.model.sde.items.types.structuremodule;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.Attribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureDisruptionBattery
    extends StructureModule
{
    /**
     * Booster attribute to explosion radius of missiles vs. signature radius.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AoeCloudSizeBonus;
    /**
     * Increases velocity of missile explosion
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AoeVelocityBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup01;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup02;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup03;
    /**
     * The amount of charge used from the capacitor for a module activation.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeed;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * Length of activation time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Duration;
    /**
     * Autogenerated skill attribute, explosionDelayBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ExplosionDelayBonus;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
    /**
     * distance from maximum range at which effectiveness has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FalloffEffectiveness;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int MaxRange;
    /**
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
    /**
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
    /**
     * Autogenerated skill attribute, missileVelocityBonus 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MissileVelocityBonus;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * Attribute ID of the resistance type v's this Ewar module.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RemoteResistanceID;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolutionBonus;
    /**
     * Autogenerated skill attribute, signatureRadiusBonus
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SignatureRadiusBonus;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int StructureItemVisualFlag;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    public final static String RESOURCE_PATH = "SDE/items/structuremodule/StructureDisruptionBattery.yaml";
    private static LinkedHashMap<String, StructureDisruptionBattery> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  848 :
            {
                return AoeCloudSizeBonus;
            }
            case  847 :
            {
                return AoeVelocityBonus;
            }
            case  1298 :
            {
                return CanFitShipGroup01;
            }
            case  1299 :
            {
                return CanFitShipGroup02;
            }
            case  1300 :
            {
                return CanFitShipGroup03;
            }
            case  6 :
            {
                return CapacitorNeed;
            }
            case  50 :
            {
                return Cpu;
            }
            case  73 :
            {
                return Duration;
            }
            case  596 :
            {
                return ExplosionDelayBonus;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  2044 :
            {
                return FalloffEffectiveness;
            }
            case  9 :
            {
                return Hp;
            }
            case  54 :
            {
                return MaxRange;
            }
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  547 :
            {
                return MissileVelocityBonus;
            }
            case  30 :
            {
                return Power;
            }
            case  2138 :
            {
                return RemoteResistanceID;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  554 :
            {
                return SignatureRadiusBonus;
            }
            case  2334 :
            {
                return StructureItemVisualFlag;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1719;
    }

    @Override
    public Class<?> getGroup() {
        return StructureDisruptionBattery.class;
    }

    public static synchronized LinkedHashMap<String, StructureDisruptionBattery> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StructureDisruptionBattery.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StructureDisruptionBattery> items;
    }
}
