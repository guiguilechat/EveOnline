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

public class QAModule
    extends Module
{
    /**
     * Bonus to chance of opening a container.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AccessDifficultyBonus;
    /**
     * Multiplier to the agility of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AgilityMultiplier;
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
     * An amount to modify the armor damage by.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ArmorDamageAmount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorHPBonusAdd;
    /**
     * Multiplier to the HP of a ships armor module.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ArmorHPMultiplier;
    /**
     * Extra batteries to add capacitor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapacitorBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double CapacitorCapacityMultiplier;
    /**
     * The amount of charge used from the capacitor for a module activation.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeed;
    /**
     * Multiplier to the capacitors recharge rate.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double CapacitorRechargeRateMultiplier;
    /**
     * Bonus to capacity (shield at least).
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacityBonus;
    /**
     * Multiplier to the amount of cargo capacity for a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double CargoCapacityMultiplier;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * Factor to adjust module cpu need by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double CpuMultiplier;
    /**
     * Damage multiplier.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double DamageMultiplier;
    /**
     * Multiplys the damage multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double DamageMultiplierMultiplier;
    /**
     * If this module is in use and this attribute is 1, then offensive modules cannot be used on the ship if they apply modifiers for the duration of their effect. If this is put on a ship or NPC with value of 1, then the ship or NPC are immune to offensive modifiers (target jamming, tracking disruption etc.)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowOffensiveModifiers;
    /**
     * This is a devhax attribute that prevents you from e-warping on logon or logoff
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DoesNotEmergencyWarp;
    /**
     * droneDamageBonus
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double DroneDamageBonus;
    /**
     * Autogenerated skill attribute, droneRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DroneRangeBonus;
    /**
     * Length of activation time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Duration;
    /**
     * Range that an ECM burst has an effect within.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EcmBurstRange;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EmDamage;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double EmDamageResistanceBonus;
    /**
     * Multiplier to the EM damage resonance of something.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double EmDamageResonanceMultiplier;
    /**
     * Range of broadcasted EMP field.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EmpFieldRange;
    /**
     * Explosive damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ExplosiveDamage;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ExplosiveDamageResistanceBonus;
    /**
     * Multiplier to the explosive damage resistance of something.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ExplosiveDamageResonanceMultiplier;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantBonusVelocity;
    /**
     * Kinetic damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double KineticDamage;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double KineticDamageResistanceBonus;
    /**
     * Multiplier to the kinetic damage resonance of something.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double KineticDamageResonanceMultiplier;
    /**
     * Attribute for adding mass to a ship via an afterburner or MWD.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MassAddition;
    /**
     * Determines the maximum weight of a ship that, ships that are to heavy get denied of service by this attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MassLimit;
    /**
     * Maximum modules of same group that can be activated at same time, 0 = no limit, 1 = 1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxGroupActive;
    /**
     * Additional amount of locked targets that can be handled.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxLockedTargetsBonus;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int MaxScanDeviationModifierModule;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxVelocityLimited;
    /**
     * Autogenerated skill attribute, miningAmountBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MiningAmountBonus;
    /**
     * Modifies miningAmountBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MiningAmountBonusBonus;
    /**
     * Additional percentage to the characters missile damage multiplier.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MissileDamageMultiplierBonus;
    /**
     * Amount of time that has to be waited after the deactivation of this module until it can be reactivated.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ModuleReactivationDelay;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double OverloadSelfDurationBonus;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * Multipier to power core output.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double PowerOutputMultiplier;
    /**
     * Autogenerated skill attribute, repairBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RepairBonus;
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
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2;
    /**
     * Required skill level for skill 2
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2Level;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill3;
    /**
     * Required skill level for skill 3
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill3Level;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredThermoDynamicsSkill;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanDurationBonus;
    /**
     * +/- modifier to the gravimetric strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanGravimetricStrengthBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanGravimetricStrengthPercent;
    /**
     * +/- modifier to the ladar strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanLadarStrengthBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanLadarStrengthPercent;
    /**
     * +/- modifier to the magnetometric strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanMagnetometricStrengthBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanMagnetometricStrengthPercent;
    /**
     * +/- modifier to the radar strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanRadarStrengthBonus;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanStrengthBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanStrengthBonusModule;
    /**
     * Bonus to shield.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ShieldBonus;
    /**
     * Shield transfer amount multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldBonusMultiplier;
    /**
     * Autogenerated skill attribute, shieldCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldCapacityBonus;
    /**
     * Multiplier to the capacity of a shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ShieldCapacityMultiplier;
    /**
     * Multiplier to a recharge rate time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ShieldRechargeRateMultiplier;
    /**
     * Maximum range for use of a shield transfer.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldTransferRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SignatureRadiusAdd;
    /**
     * Factor by which topspeed increases.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double SpeedFactor;
    /**
     * Multiplier to the ships structural HP.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double StructureHPMultiplier;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ThermalDamage;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ThermalDamageResistanceBonus;
    /**
     * Multipler to adjust the thermal damage resonance of an object.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ThermalDamageResonanceMultiplier;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    /**
     * The coherence of a virus.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int VirusCoherence;
    /**
     * The number of utility element slots a virus has.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int VirusElementSlots;
    /**
     * The strength attribute for a Virus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int VirusStrength;
    public final static String RESOURCE_PATH = "SDE/items/module/QAModule.yaml";
    private static LinkedHashMap<String, QAModule> cache = (null);

    public int attributeInt(IntAttribute attribute) {
        switch (attribute.getId()) {
            case  902 :
            {
                return AccessDifficultyBonus;
            }
            case  84 :
            {
                return ArmorDamageAmount;
            }
            case  1159 :
            {
                return ArmorHPBonusAdd;
            }
            case  67 :
            {
                return CapacitorBonus;
            }
            case  872 :
            {
                return DisallowOffensiveModifiers;
            }
            case  1854 :
            {
                return DoesNotEmergencyWarp;
            }
            case  459 :
            {
                return DroneRangeBonus;
            }
            case  142 :
            {
                return EcmBurstRange;
            }
            case  99 :
            {
                return EmpFieldRange;
            }
            case  796 :
            {
                return MassAddition;
            }
            case  763 :
            {
                return MaxGroupActive;
            }
            case  235 :
            {
                return MaxLockedTargetsBonus;
            }
            case  54 :
            {
                return MaxRange;
            }
            case  1905 :
            {
                return MaxScanDeviationModifierModule;
            }
            case  1333 :
            {
                return MaxVelocityLimited;
            }
            case  434 :
            {
                return MiningAmountBonus;
            }
            case  1938 :
            {
                return MiningAmountBonusBonus;
            }
            case  669 :
            {
                return ModuleReactivationDelay;
            }
            case  30 :
            {
                return Power;
            }
            case  806 :
            {
                return RepairBonus;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  184 :
            {
                return RequiredSkill3;
            }
            case  279 :
            {
                return RequiredSkill3Level;
            }
            case  1212 :
            {
                return RequiredThermoDynamicsSkill;
            }
            case  1906 :
            {
                return ScanDurationBonus;
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
            case  846 :
            {
                return ScanStrengthBonus;
            }
            case  1907 :
            {
                return ScanStrengthBonusModule;
            }
            case  87 :
            {
                return ShieldTransferRange;
            }
            case  983 :
            {
                return SignatureRadiusAdd;
            }
            case  1909 :
            {
                return VirusCoherence;
            }
            case  1911 :
            {
                return VirusElementSlots;
            }
            case  1910 :
            {
                return VirusStrength;
            }
            default:
            {
                return super.attributeInt((attribute));
            }
        }
    }

    public double attributeDouble(DoubleAttribute attribute) {
        switch (attribute.getId()) {
            case  169 :
            {
                return AgilityMultiplier;
            }
            case  848 :
            {
                return AoeCloudSizeBonus;
            }
            case  847 :
            {
                return AoeVelocityBonus;
            }
            case  148 :
            {
                return ArmorHPMultiplier;
            }
            case  147 :
            {
                return CapacitorCapacityMultiplier;
            }
            case  6 :
            {
                return CapacitorNeed;
            }
            case  144 :
            {
                return CapacitorRechargeRateMultiplier;
            }
            case  72 :
            {
                return CapacityBonus;
            }
            case  149 :
            {
                return CargoCapacityMultiplier;
            }
            case  50 :
            {
                return Cpu;
            }
            case  202 :
            {
                return CpuMultiplier;
            }
            case  64 :
            {
                return DamageMultiplier;
            }
            case  1482 :
            {
                return DamageMultiplierMultiplier;
            }
            case  1255 :
            {
                return DroneDamageBonus;
            }
            case  73 :
            {
                return Duration;
            }
            case  114 :
            {
                return EmDamage;
            }
            case  984 :
            {
                return EmDamageResistanceBonus;
            }
            case  133 :
            {
                return EmDamageResonanceMultiplier;
            }
            case  116 :
            {
                return ExplosiveDamage;
            }
            case  985 :
            {
                return ExplosiveDamageResistanceBonus;
            }
            case  132 :
            {
                return ExplosiveDamageResonanceMultiplier;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  1180 :
            {
                return HeatAbsorbtionRateModifier;
            }
            case  1211 :
            {
                return HeatDamage;
            }
            case  1076 :
            {
                return ImplantBonusVelocity;
            }
            case  117 :
            {
                return KineticDamage;
            }
            case  986 :
            {
                return KineticDamageResistanceBonus;
            }
            case  131 :
            {
                return KineticDamageResonanceMultiplier;
            }
            case  622 :
            {
                return MassLimit;
            }
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  237 :
            {
                return MaxTargetRangeMultiplier;
            }
            case  213 :
            {
                return MissileDamageMultiplierBonus;
            }
            case  1206 :
            {
                return OverloadSelfDurationBonus;
            }
            case  145 :
            {
                return PowerOutputMultiplier;
            }
            case  238 :
            {
                return ScanGravimetricStrengthBonus;
            }
            case  239 :
            {
                return ScanLadarStrengthBonus;
            }
            case  240 :
            {
                return ScanMagnetometricStrengthBonus;
            }
            case  241 :
            {
                return ScanRadarStrengthBonus;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  68 :
            {
                return ShieldBonus;
            }
            case  1496 :
            {
                return ShieldBonusMultiplier;
            }
            case  337 :
            {
                return ShieldCapacityBonus;
            }
            case  146 :
            {
                return ShieldCapacityMultiplier;
            }
            case  134 :
            {
                return ShieldRechargeRateMultiplier;
            }
            case  20 :
            {
                return SpeedFactor;
            }
            case  150 :
            {
                return StructureHPMultiplier;
            }
            case  118 :
            {
                return ThermalDamage;
            }
            case  987 :
            {
                return ThermalDamageResistanceBonus;
            }
            case  130 :
            {
                return ThermalDamageResonanceMultiplier;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            default:
            {
                return super.attributeDouble((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  353;
    }

    @Override
    public Class<?> getGroup() {
        return QAModule.class;
    }

    public static synchronized LinkedHashMap<String, QAModule> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(QAModule.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, QAModule> items;
    }
}
