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

public class MissileGuidanceComputer
    extends Module
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
     * The amount of charge used from the capacitor for a module activation.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeed;
    /**
     * One of the groups of charge this launcher can be loaded with.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeGroup1;
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HeatAbsorbtionRateModifier;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HeatDamage;
    /**
     * Autogenerated skill attribute, missileVelocityBonus 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MissileVelocityBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int OverloadTrackingModuleStrengthBonus;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * reload time (ms)
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(10000.0)
    public double ReloadTime;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1;
    /**
     * Required skill level for skill 1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1Level;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredThermoDynamicsSkill;
    public final static String RESOURCE_PATH = "SDE/items/module/MissileGuidanceComputer.yaml";
    private static LinkedHashMap<String, MissileGuidanceComputer> cache = (null);

    public double attributeDouble(DoubleAttribute attribute) {
        switch (attribute.getId()) {
            case  848 :
            {
                return AoeCloudSizeBonus;
            }
            case  847 :
            {
                return AoeVelocityBonus;
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
            case  1180 :
            {
                return HeatAbsorbtionRateModifier;
            }
            case  1211 :
            {
                return HeatDamage;
            }
            case  547 :
            {
                return MissileVelocityBonus;
            }
            case  1795 :
            {
                return ReloadTime;
            }
            default:
            {
                return super.attributeDouble((attribute));
            }
        }
    }

    public int attributeInt(IntAttribute attribute) {
        switch (attribute.getId()) {
            case  604 :
            {
                return ChargeGroup1;
            }
            case  128 :
            {
                return ChargeSize;
            }
            case  1935 :
            {
                return OverloadTrackingModuleStrengthBonus;
            }
            case  30 :
            {
                return Power;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  1212 :
            {
                return RequiredThermoDynamicsSkill;
            }
            default:
            {
                return super.attributeInt((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1396;
    }

    @Override
    public Class<?> getGroup() {
        return MissileGuidanceComputer.class;
    }

    public static synchronized LinkedHashMap<String, MissileGuidanceComputer> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MissileGuidanceComputer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MissileGuidanceComputer> items;
    }
}
