package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultRealValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.Agility;
import fr.guiguilechat.jcelechat.model.sde.attributes.AoeCloudSizeBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.AoeVelocityBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorDamageAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorEmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorHP;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorKineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorThermalDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorArmorRepairerAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorArmorRepairerDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorArmorRepairerDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorRemoteArmorRepairDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorRemoteArmorRepairDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorRemoteArmorRepairFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorRemoteArmorRepairRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeDisallowTetheringModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeECMResistanceModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeLocalLogisticsAmountModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeLocalLogisticsDurationModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeMassModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeMaxVelocityModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeMissileDamageModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeRemoteAssistanceImpedanceModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeRemoteRepairImpedanceModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeSensorDampenerResistanceModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeTurretDamageModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeWarpScrambleStatusModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSiegeWeaponDisruptionResistanceModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWarpScrambleDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWarpScrambleDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWarpScrambleRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWarpScrambleStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapacitorCapacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Charge;
import fr.guiguilechat.jcelechat.model.sde.attributes.DamageMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EnergyNeutralizerAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityBracketColour;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDelay;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDelayChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDistance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDurationChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityCruiseSpeed;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentMax;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentMin;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFactionLoss;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityKillBounty;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityMaxVelocitySignatureRadiusMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosionDelayBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.Falloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.FalloffBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.GfxBoosterID;
import fr.guiguilechat.jcelechat.model.sde.attributes.GfxTurretID;
import fr.guiguilechat.jcelechat.model.sde.attributes.Hp;
import fr.guiguilechat.jcelechat.model.sde.attributes.KineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxLockedTargets;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxRangeBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxTargetRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxVelocity;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileDamageMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileVelocityBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcBehaviorMaximumCombatOrbitRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcGuidanceDisruptorDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcGuidanceDisruptorDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcGuidanceDisruptorFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcGuidanceDisruptorRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcTrackingDisruptorDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcTrackingDisruptorDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcTrackingDisruptorFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcTrackingDisruptorRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.OptimalSigRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.RechargeRate;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanGravimetricStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanLadarStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanMagnetometricStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanRadarStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanResolution;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldCapacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldCharge;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldEmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldKineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldRechargeRate;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldThermalDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.SignatureRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.Speed;
import fr.guiguilechat.jcelechat.model.sde.attributes.SpeedFactor;
import fr.guiguilechat.jcelechat.model.sde.attributes.StructureUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ThermalDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.ThermalDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.TrackingSpeed;
import fr.guiguilechat.jcelechat.model.sde.attributes.TrackingSpeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Uniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleStatus;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RetaliatingAmarrEntities
    extends Entity
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegedisallowtetheringmodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorsiegeecmresistancemodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegelocallogisticsamountmodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegelocallogisticsdurationmodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegemassmodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegemaxvelocitymodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegemissiledamagemodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegeremoteassistanceimpedancemodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorsiegeremoterepairimpedancemodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegesensordampenerresistancemodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegeturretdamagemodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegewarpscramblestatusmodifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsiegeweapondisruptionresistancemodifier;
    /**
     * The agility of the object.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double agility;
    /**
     * Booster attribute to explosion radius of missiles vs. signature radius.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double aoecloudsizebonus;
    /**
     * Increases velocity of missile explosion
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double aoevelocitybonus;
    /**
     * An amount to modify the armor damage by.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double armordamageamount;
    /**
     * Multiplies EM damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double armoremdamageresonance;
    /**
     * Multiplies EXPLOSIVE damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double armorexplosivedamageresonance;
    /**
     * The number of hit points on the entities armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double armorhp;
    /**
     * Multiplies KINETIC damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double armorkineticdamageresonance;
    /**
     * Multiplies THERMAL damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double armorthermaldamageresonance;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double armoruniformity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorarmorrepaireramount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorarmorrepairerdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorarmorrepairerduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorenergyneutralizerdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorenergyneutralizerduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorenergyneutralizerfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorenergyneutralizerrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorremotearmorrepairdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorremotearmorrepairduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorremotearmorrepairfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorremotearmorrepairrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorwarpscrambledischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorwarpscrambleduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorwarpscramblerange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorwarpscramblestrength;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double behaviorwebifierdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorwebifierduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorwebifierfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorwebifierrange;
    /**
     * Capacitor capacity
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double capacitorcapacity;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double capacity;
    /**
     * charge of module
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int charge;
    /**
     * Damage multiplier.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double damagemultiplier;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double emdamage;
    /**
     * Electro magnetic damage multiplier for shield and armor. Represented as "% Resistance" in the UI.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double emdamageresonance;
    /**
     * An amount to modify the power of the target by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double energyneutralizeramount;
    /**
     *  0: white (default)
     *  1: red (hostile NPC)
     *  2: blue (Neutral NPC)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitybracketcolour;
    /**
     * The maximum amount of time stalled before entity chase speed kicks in.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(5000)
    public int entitychasemaxdelay;
    /**
     * Chance that the max delay is waited before chase is engaged.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(1.0)
    public double entitychasemaxdelaychance;
    /**
     * The distance outside of which the entity activates their MWD equivalent.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(2500)
    public int entitychasemaxdistance;
    /**
     * The maximum amount of time chase is ever engaged for.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(5000)
    public int entitychasemaxduration;
    /**
     * The chance of engaging chase for the maximum duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(1.0)
    public double entitychasemaxdurationchance;
    /**
     * The speed that entities fly at when not chasing a target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double entitycruisespeed;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entityequipmentmax;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entityequipmentmin;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double entityfactionloss;
    /**
     * Reward for destroying this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitykillbounty;
    /**
     * Used to increase signature radius of entity when it activates Max Velocity. Used to fake MWD sig radius increase.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(6)
    public int entitymaxvelocitysignatureradiusmultiplier;
    /**
     * Autogenerated skill attribute, explosionDelayBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double explosiondelaybonus;
    /**
     * damage multiplier vs. explosive damagers.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double explosivedamageresonance;
    /**
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double falloff;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double falloffbonus;
    /**
     * Graphic ID of the boosters for drone type ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int gfxboosterid;
    /**
     * Graphic ID of the turrets for drone type ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int gfxturretid;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double hp;
    /**
     * damage multiplier vs. kinetic damagers.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double kineticdamageresonance;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double mass;
    /**
     * Maximum number of locked targets that the character or their ships electronics can handle at any given time.  Both have individual limits which apply separately.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int maxlockedtargets;
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double maxrange;
    /**
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double maxrangebonus;
    /**
     * Maximum range at which the scanner can lock a target.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double maxtargetrange;
    /**
     * Maximum velocity of ship
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double maxvelocity;
    /**
     * The characters missile use efficiency, scales the damage missiles do.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double missiledamagemultiplier;
    /**
     * Autogenerated skill attribute, missileVelocityBonus 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double missilevelocitybonus;
    /**
     * Used by Behavior NPCs to work out minimum orbit range. If the npc has an effect with a shorter range, it will use the effects range instead.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npcbehaviormaximumcombatorbitrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double npcguidancedisruptordischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npcguidancedisruptorduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npcguidancedisruptorfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npcguidancedisruptorrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double npctrackingdisruptordischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npctrackingdisruptorduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npctrackingdisruptorfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int npctrackingdisruptorrange;
    /**
     * Prefered target signature. The base signature radius at which the turret's tracking speed is rated. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1000)
    public int optimalsigradius;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double radius;
    /**
     * Amount of time taken to fully recharge the capacitor.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double rechargerate;
    /**
     * Gravimetric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double scangravimetricstrength;
    /**
     * Ladar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double scanladarstrength;
    /**
     * Magnetometric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double scanmagnetometricstrength;
    /**
     * Radar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double scanradarstrength;
    /**
     * The resolution that the vessel can target other objects at.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double scanresolution;
    /**
     * Amount of maximum shield HP on the item.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double shieldcapacity;
    /**
     * DO NOT MESS WITH. Helper attribute for entities, stands in for the shield charge.
     * The amount of starting shield capacity of the NPC.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double shieldcharge;
    /**
     * Multiplies EM damage taken by shield
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double shieldemdamageresonance;
    /**
     * Multiplies EXPLOSIVE damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double shieldexplosivedamageresonance;
    /**
     * Multiplies KINETIC damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double shieldkineticdamageresonance;
    /**
     * Amount of time taken to fully recharge the shield.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double shieldrechargerate;
    /**
     * Multiplies THERMAL damage taken by Shield. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double shieldthermaldamageresonance;
    /**
     * DO NOT MESS WITH This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double shielduniformity;
    /**
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(100.0)
    public double signatureradius;
    /**
     * Time in milliseconds between possible activations
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double speed;
    /**
     * Factor by which topspeed increases.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double speedfactor;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(1.0)
    public double structureuniformity;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double thermaldamage;
    /**
     * damage multiplier vs. thermal.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultRealValue(1.0)
    public double thermaldamageresonance;
    /**
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double trackingspeed;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double trackingspeedbonus;
    /**
     * This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double uniformity;
    /**
     * Warp ability of a ship.  If greater than zero than the ship cannot warp.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int warpscramblestatus;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {Mass.INSTANCE, ShieldCapacity.INSTANCE, ShieldCharge.INSTANCE, Hp.INSTANCE, ArmorHP.INSTANCE, ArmorEmDamageResonance.INSTANCE, ArmorExplosiveDamageResonance.INSTANCE, ArmorUniformity.INSTANCE, ArmorKineticDamageResonance.INSTANCE, StructureUniformity.INSTANCE, ArmorThermalDamageResonance.INSTANCE, ShieldEmDamageResonance.INSTANCE, ShieldExplosiveDamageResonance.INSTANCE, ShieldKineticDamageResonance.INSTANCE, ShieldThermalDamageResonance.INSTANCE, Charge.INSTANCE, SpeedFactor.INSTANCE, EntityBracketColour.INSTANCE, MissileVelocityBonus.INSTANCE, MaxVelocity.INSTANCE, Capacity.INSTANCE, SignatureRadius.INSTANCE, EntityFactionLoss.INSTANCE, Speed.INSTANCE, ScanResolution.INSTANCE, MaxRange.INSTANCE, RechargeRate.INSTANCE, DamageMultiplier.INSTANCE, EntityChaseMaxDelay.INSTANCE, EntityChaseMaxDelayChance.INSTANCE, Agility.INSTANCE, EntityChaseMaxDuration.INSTANCE, EntityChaseMaxDurationChance.INSTANCE, BehaviorArmorRepairerDuration.INSTANCE, BehaviorArmorRepairerDischarge.INSTANCE, BehaviorArmorRepairerAmount.INSTANCE, MaxTargetRange.INSTANCE, BehaviorSiegeRemoteRepairImpedanceModifier.INSTANCE, AoeVelocityBonus.INSTANCE, BehaviorSiegeRemoteAssistanceImpedanceModifier.INSTANCE, AoeCloudSizeBonus.INSTANCE, BehaviorSiegeSensorDampenerResistanceModifier.INSTANCE, BehaviorSiegeWeaponDisruptionResistanceModifier.INSTANCE, BehaviorSiegeECMResistanceModifier.INSTANCE, BehaviorSiegeMaxVelocityModifier.INSTANCE, ExplosionDelayBonus.INSTANCE, ArmorDamageAmount.INSTANCE, BehaviorSiegeWarpScrambleStatusModifier.INSTANCE, BehaviorSiegeDisallowTetheringModifier.INSTANCE, BehaviorSiegeMassModifier.INSTANCE, BehaviorSiegeLocalLogisticsAmountModifier.INSTANCE, BehaviorSiegeLocalLogisticsDurationModifier.INSTANCE, BehaviorSiegeTurretDamageModifier.INSTANCE, FalloffBonus.INSTANCE, MaxRangeBonus.INSTANCE, EnergyNeutralizerAmount.INSTANCE, WarpScrambleStatus.INSTANCE, OptimalSigRadius.INSTANCE, EntityMaxVelocitySignatureRadiusMultiplier.INSTANCE, KineticDamageResonance.INSTANCE, ThermalDamageResonance.INSTANCE, ExplosiveDamageResonance.INSTANCE, EmDamageResonance.INSTANCE, EmDamage.INSTANCE, ThermalDamage.INSTANCE, Uniformity.INSTANCE, EntityChaseMaxDistance.INSTANCE, Falloff.INSTANCE, TrackingSpeed.INSTANCE, Radius.INSTANCE, BehaviorSiegeMissileDamageModifier.INSTANCE, BehaviorRemoteArmorRepairDuration.INSTANCE, BehaviorRemoteArmorRepairRange.INSTANCE, BehaviorRemoteArmorRepairFalloff.INSTANCE, BehaviorRemoteArmorRepairDischarge.INSTANCE, MaxLockedTargets.INSTANCE, BehaviorWebifierDuration.INSTANCE, BehaviorWebifierRange.INSTANCE, BehaviorWebifierFalloff.INSTANCE, BehaviorWebifierDischarge.INSTANCE, EntityEquipmentMin.INSTANCE, EntityEquipmentMax.INSTANCE, BehaviorWarpScrambleDuration.INSTANCE, BehaviorWarpScrambleRange.INSTANCE, BehaviorWarpScrambleDischarge.INSTANCE, BehaviorWarpScrambleStrength.INSTANCE, NpcGuidanceDisruptorDuration.INSTANCE, NpcGuidanceDisruptorRange.INSTANCE, ScanRadarStrength.INSTANCE, ScanLadarStrength.INSTANCE, NpcGuidanceDisruptorFalloff.INSTANCE, ScanMagnetometricStrength.INSTANCE, NpcGuidanceDisruptorDischarge.INSTANCE, ScanGravimetricStrength.INSTANCE, NpcTrackingDisruptorDuration.INSTANCE, NpcTrackingDisruptorRange.INSTANCE, MissileDamageMultiplier.INSTANCE, NpcTrackingDisruptorFalloff.INSTANCE, NpcTrackingDisruptorDischarge.INSTANCE, BehaviorEnergyNeutralizerDuration.INSTANCE, BehaviorEnergyNeutralizerRange.INSTANCE, BehaviorEnergyNeutralizerFalloff.INSTANCE, BehaviorEnergyNeutralizerDischarge.INSTANCE, ShieldRechargeRate.INSTANCE, EntityKillBounty.INSTANCE, NpcBehaviorMaximumCombatOrbitRange.INSTANCE, CapacitorCapacity.INSTANCE, ShieldUniformity.INSTANCE, GfxTurretID.INSTANCE, GfxBoosterID.INSTANCE, EntityCruiseSpeed.INSTANCE, TrackingSpeedBonus.INSTANCE })));
    public static final RetaliatingAmarrEntities.MetaGroup METAGROUP = new RetaliatingAmarrEntities.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  2645 :
            {
                return behaviorsiegedisallowtetheringmodifier;
            }
            case  2642 :
            {
                return behaviorsiegeecmresistancemodifier;
            }
            case  2647 :
            {
                return behaviorsiegelocallogisticsamountmodifier;
            }
            case  2648 :
            {
                return behaviorsiegelocallogisticsdurationmodifier;
            }
            case  2646 :
            {
                return behaviorsiegemassmodifier;
            }
            case  2643 :
            {
                return behaviorsiegemaxvelocitymodifier;
            }
            case  2730 :
            {
                return behaviorsiegemissiledamagemodifier;
            }
            case  2639 :
            {
                return behaviorsiegeremoteassistanceimpedancemodifier;
            }
            case  2638 :
            {
                return behaviorsiegeremoterepairimpedancemodifier;
            }
            case  2640 :
            {
                return behaviorsiegesensordampenerresistancemodifier;
            }
            case  2649 :
            {
                return behaviorsiegeturretdamagemodifier;
            }
            case  2644 :
            {
                return behaviorsiegewarpscramblestatusmodifier;
            }
            case  2641 :
            {
                return behaviorsiegeweapondisruptionresistancemodifier;
            }
            case  70 :
            {
                return agility;
            }
            case  848 :
            {
                return aoecloudsizebonus;
            }
            case  847 :
            {
                return aoevelocitybonus;
            }
            case  84 :
            {
                return armordamageamount;
            }
            case  267 :
            {
                return armoremdamageresonance;
            }
            case  268 :
            {
                return armorexplosivedamageresonance;
            }
            case  265 :
            {
                return armorhp;
            }
            case  269 :
            {
                return armorkineticdamageresonance;
            }
            case  270 :
            {
                return armorthermaldamageresonance;
            }
            case  524 :
            {
                return armoruniformity;
            }
            case  2635 :
            {
                return behaviorarmorrepaireramount;
            }
            case  2634 :
            {
                return behaviorarmorrepairerdischarge;
            }
            case  2633 :
            {
                return behaviorarmorrepairerduration;
            }
            case  2522 :
            {
                return behaviorenergyneutralizerdischarge;
            }
            case  2519 :
            {
                return behaviorenergyneutralizerduration;
            }
            case  2521 :
            {
                return behaviorenergyneutralizerfalloff;
            }
            case  2520 :
            {
                return behaviorenergyneutralizerrange;
            }
            case  2494 :
            {
                return behaviorremotearmorrepairdischarge;
            }
            case  2491 :
            {
                return behaviorremotearmorrepairduration;
            }
            case  2493 :
            {
                return behaviorremotearmorrepairfalloff;
            }
            case  2492 :
            {
                return behaviorremotearmorrepairrange;
            }
            case  2508 :
            {
                return behaviorwarpscrambledischarge;
            }
            case  2506 :
            {
                return behaviorwarpscrambleduration;
            }
            case  2507 :
            {
                return behaviorwarpscramblerange;
            }
            case  2509 :
            {
                return behaviorwarpscramblestrength;
            }
            case  2502 :
            {
                return behaviorwebifierdischarge;
            }
            case  2499 :
            {
                return behaviorwebifierduration;
            }
            case  2501 :
            {
                return behaviorwebifierfalloff;
            }
            case  2500 :
            {
                return behaviorwebifierrange;
            }
            case  482 :
            {
                return capacitorcapacity;
            }
            case  38 :
            {
                return capacity;
            }
            case  18 :
            {
                return charge;
            }
            case  64 :
            {
                return damagemultiplier;
            }
            case  114 :
            {
                return emdamage;
            }
            case  113 :
            {
                return emdamageresonance;
            }
            case  97 :
            {
                return energyneutralizeramount;
            }
            case  798 :
            {
                return entitybracketcolour;
            }
            case  580 :
            {
                return entitychasemaxdelay;
            }
            case  581 :
            {
                return entitychasemaxdelaychance;
            }
            case  665 :
            {
                return entitychasemaxdistance;
            }
            case  582 :
            {
                return entitychasemaxduration;
            }
            case  583 :
            {
                return entitychasemaxdurationchance;
            }
            case  508 :
            {
                return entitycruisespeed;
            }
            case  457 :
            {
                return entityequipmentmax;
            }
            case  456 :
            {
                return entityequipmentmin;
            }
            case  562 :
            {
                return entityfactionloss;
            }
            case  481 :
            {
                return entitykillbounty;
            }
            case  1133 :
            {
                return entitymaxvelocitysignatureradiusmultiplier;
            }
            case  596 :
            {
                return explosiondelaybonus;
            }
            case  111 :
            {
                return explosivedamageresonance;
            }
            case  158 :
            {
                return falloff;
            }
            case  349 :
            {
                return falloffbonus;
            }
            case  246 :
            {
                return gfxboosterid;
            }
            case  245 :
            {
                return gfxturretid;
            }
            case  9 :
            {
                return hp;
            }
            case  109 :
            {
                return kineticdamageresonance;
            }
            case  4 :
            {
                return mass;
            }
            case  192 :
            {
                return maxlockedtargets;
            }
            case  54 :
            {
                return maxrange;
            }
            case  351 :
            {
                return maxrangebonus;
            }
            case  76 :
            {
                return maxtargetrange;
            }
            case  37 :
            {
                return maxvelocity;
            }
            case  212 :
            {
                return missiledamagemultiplier;
            }
            case  547 :
            {
                return missilevelocitybonus;
            }
            case  2786 :
            {
                return npcbehaviormaximumcombatorbitrange;
            }
            case  2514 :
            {
                return npcguidancedisruptordischarge;
            }
            case  2511 :
            {
                return npcguidancedisruptorduration;
            }
            case  2513 :
            {
                return npcguidancedisruptorfalloff;
            }
            case  2512 :
            {
                return npcguidancedisruptorrange;
            }
            case  2518 :
            {
                return npctrackingdisruptordischarge;
            }
            case  2515 :
            {
                return npctrackingdisruptorduration;
            }
            case  2517 :
            {
                return npctrackingdisruptorfalloff;
            }
            case  2516 :
            {
                return npctrackingdisruptorrange;
            }
            case  620 :
            {
                return optimalsigradius;
            }
            case  162 :
            {
                return radius;
            }
            case  55 :
            {
                return rechargerate;
            }
            case  211 :
            {
                return scangravimetricstrength;
            }
            case  209 :
            {
                return scanladarstrength;
            }
            case  210 :
            {
                return scanmagnetometricstrength;
            }
            case  208 :
            {
                return scanradarstrength;
            }
            case  564 :
            {
                return scanresolution;
            }
            case  263 :
            {
                return shieldcapacity;
            }
            case  264 :
            {
                return shieldcharge;
            }
            case  271 :
            {
                return shieldemdamageresonance;
            }
            case  272 :
            {
                return shieldexplosivedamageresonance;
            }
            case  273 :
            {
                return shieldkineticdamageresonance;
            }
            case  479 :
            {
                return shieldrechargerate;
            }
            case  274 :
            {
                return shieldthermaldamageresonance;
            }
            case  484 :
            {
                return shielduniformity;
            }
            case  552 :
            {
                return signatureradius;
            }
            case  51 :
            {
                return speed;
            }
            case  20 :
            {
                return speedfactor;
            }
            case  525 :
            {
                return structureuniformity;
            }
            case  118 :
            {
                return thermaldamage;
            }
            case  110 :
            {
                return thermaldamageresonance;
            }
            case  160 :
            {
                return trackingspeed;
            }
            case  767 :
            {
                return trackingspeedbonus;
            }
            case  136 :
            {
                return uniformity;
            }
            case  104 :
            {
                return warpscramblestatus;
            }
            default:
            {
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<RetaliatingAmarrEntities> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RetaliatingAmarrEntities>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/RetaliatingAmarrEntities.yaml";
        private Map<String, RetaliatingAmarrEntities> cache = (null);

        @Override
        public IMetaCategory<? super RetaliatingAmarrEntities> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  4034;
        }

        @Override
        public String getName() {
            return "RetaliatingAmarrEntities";
        }

        @Override
        public synchronized Map<String, RetaliatingAmarrEntities> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RetaliatingAmarrEntities.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RetaliatingAmarrEntities> types;
        }
    }
}
