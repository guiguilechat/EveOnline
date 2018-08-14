package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;
import org.yaml.snakeyaml.Yaml;

public class EffectBeacon
    extends Celestial
{
    /**
     * Multiplier to the agility of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AgilityMultiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AoeCloudSizeMultiplier;
    /**
     * Multiplier to missiles ability to hit fast targets
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AoeVelocityMultiplier;
    /**
     * Armor repair amount multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorDamageAmountMultiplier;
    /**
     * Repair amount multiplier for remote repairers
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorDamageAmountMultiplierRemote;
    /**
     * EM damage resistance bonus for armor
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorEmDamageResistanceBonus;
    /**
     * Explosive damage resistance bonus for armor
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorExplosiveDamageResistanceBonus;
    /**
     * Multiplier to the HP of a ships armor module.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ArmorHPMultiplier;
    /**
     * Kinetic damage resistance bonus for armor
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorKineticDamageResistanceBonus;
    /**
     * Thermal damage resistance bonus for armor
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorThermalDamageResistanceBonus;
    /**
     * Capacitor capacity multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorCapacityMultiplierSystem;
    /**
     * Multiplys the damage multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double DamageMultiplierMultiplier;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * Smart bomb range multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EmpFieldRangeMultiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EnergyTransferAmountBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EnergyWarfareStrengthMultiplier;
    /**
     * Damage multiplier for heat
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HeatDamageMultiplier;
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
     * Autogenerated skill attribute, mMaxVelocityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MaxVelocityModifier;
    /**
     * Maximum velocity multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxVelocityMultiplier;
    /**
     * Velocity multiplier for missiles
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MissileVelocityMultiplier;
    /**
     * Multiplier to all overload bonuses
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double OverloadBonusMultiplier;
    /**
     * Capacitor recharge rate multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double RechargeRateMultiplier;
    /**
     * Shield transfer amount multiplier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldBonusMultiplier;
    /**
     * Shield repair multiplier for remote repair
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldBonusMultiplierRemote;
    /**
     * Multiplier to the capacity of a shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ShieldCapacityMultiplier;
    /**
     * EM resistance bonus for shields
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldEmDamageResistanceBonus;
    /**
     * Explosive resistance bonus for shields
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldExplosiveDamageResistanceBonus;
    /**
     * Kinetic resistance bonus for shields
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldKineticDamageResistanceBonus;
    /**
     * Thermal resistance bonus for shields
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldThermalDamageResistanceBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SignatureRadiusMultiplier;
    /**
     * Damage multiplier for small weapons
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SmallWeaponDamageMultiplier;
    /**
     * Damage multiplier for smart bombs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SmartbombDamageMultiplier;
    /**
     * Factor by which topspeed increases.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double SpeedFactor;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double StasisWebStrengthMultiplier;
    /**
     * Damage reduction for system effects
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SystemEffectDamageReduction;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TargetPainterStrengthMultiplier;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    /**
     * Scale the tracking speed of a weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double TrackingSpeedMultiplier;
    public final static EffectBeacon.MetaGroup METAGROUP = new EffectBeacon.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  169 :
            {
                return AgilityMultiplier;
            }
            case  1967 :
            {
                return AoeCloudSizeMultiplier;
            }
            case  1483 :
            {
                return AoeVelocityMultiplier;
            }
            case  1495 :
            {
                return ArmorDamageAmountMultiplier;
            }
            case  1498 :
            {
                return ArmorDamageAmountMultiplierRemote;
            }
            case  1465 :
            {
                return ArmorEmDamageResistanceBonus;
            }
            case  1468 :
            {
                return ArmorExplosiveDamageResistanceBonus;
            }
            case  148 :
            {
                return ArmorHPMultiplier;
            }
            case  1466 :
            {
                return ArmorKineticDamageResistanceBonus;
            }
            case  1467 :
            {
                return ArmorThermalDamageResistanceBonus;
            }
            case  1499 :
            {
                return CapacitorCapacityMultiplierSystem;
            }
            case  1482 :
            {
                return DamageMultiplierMultiplier;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  1487 :
            {
                return EmpFieldRangeMultiplier;
            }
            case  1840 :
            {
                return EnergyTransferAmountBonus;
            }
            case  1966 :
            {
                return EnergyWarfareStrengthMultiplier;
            }
            case  1485 :
            {
                return HeatDamageMultiplier;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  237 :
            {
                return MaxTargetRangeMultiplier;
            }
            case  306 :
            {
                return MaxVelocityModifier;
            }
            case  1470 :
            {
                return MaxVelocityMultiplier;
            }
            case  1469 :
            {
                return MissileVelocityMultiplier;
            }
            case  1486 :
            {
                return OverloadBonusMultiplier;
            }
            case  1500 :
            {
                return RechargeRateMultiplier;
            }
            case  1496 :
            {
                return ShieldBonusMultiplier;
            }
            case  1497 :
            {
                return ShieldBonusMultiplierRemote;
            }
            case  146 :
            {
                return ShieldCapacityMultiplier;
            }
            case  1489 :
            {
                return ShieldEmDamageResistanceBonus;
            }
            case  1490 :
            {
                return ShieldExplosiveDamageResistanceBonus;
            }
            case  1491 :
            {
                return ShieldKineticDamageResistanceBonus;
            }
            case  1492 :
            {
                return ShieldThermalDamageResistanceBonus;
            }
            case  652 :
            {
                return SignatureRadiusMultiplier;
            }
            case  1493 :
            {
                return SmallWeaponDamageMultiplier;
            }
            case  1488 :
            {
                return SmartbombDamageMultiplier;
            }
            case  20 :
            {
                return SpeedFactor;
            }
            case  1969 :
            {
                return StasisWebStrengthMultiplier;
            }
            case  1686 :
            {
                return SystemEffectDamageReduction;
            }
            case  1968 :
            {
                return TargetPainterStrengthMultiplier;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            case  244 :
            {
                return TrackingSpeedMultiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<EffectBeacon> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<EffectBeacon>
    {
        public final static String RESOURCE_PATH = "SDE/items/celestial/EffectBeacon.yaml";
        private Map<String, EffectBeacon> cache = (null);

        @Override
        public IMetaCategory<? super EffectBeacon> category() {
            return Celestial.METACAT;
        }

        @Override
        public int getGroupId() {
            return  920;
        }

        @Override
        public String getName() {
            return "EffectBeacon";
        }

        @Override
        public synchronized Map<String, EffectBeacon> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(EffectBeacon.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, EffectBeacon> items;
        }
    }
}
