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
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.AgentID;
import fr.guiguilechat.jcelechat.model.sde.attributes.Agility;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorEmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorHP;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorKineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorThermalDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorECMDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorECMDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorECMFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorECMRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorEnergyNeutralizerRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMicroJumpAttackDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMicroJumpAttackDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMicroJumpAttackJumpDistance;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMicroJumpAttackRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMiningAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMiningDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMiningDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorMiningMaxRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSensorDampenerDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSensorDampenerDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSensorDampenerFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSensorDampenerRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSmartBombDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSmartBombDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorSmartBombEntityDamageMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierDischarge;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.BehaviorWebifierRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapacitorCapacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapacitorNeed;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Charge;
import fr.guiguilechat.jcelechat.model.sde.attributes.DamageMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.DamageMultiplierBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.DisallowAssistance;
import fr.guiguilechat.jcelechat.model.sde.attributes.DisallowOffensiveModifiers;
import fr.guiguilechat.jcelechat.model.sde.attributes.Duration;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMEntityChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMRangeFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMRangeOptimal;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmpFieldRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.EnergyNeutralizerAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityAttackDelayMax;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityAttackDelayMin;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityAttackRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityBracketColour;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDelay;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDelayChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDistance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityChaseMaxDurationChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityCruiseSpeed;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityDefenderChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentGroupMax;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentMax;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentMin;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFactionLoss;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFlyRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityKillBounty;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityLootCountMax;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityLootCountMin;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityReactionFactor;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntitySecurityStatusKillBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityTargetJam;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityWarpScrambleChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosiveDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.Falloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.GfxTurretID;
import fr.guiguilechat.jcelechat.model.sde.attributes.HasLongAnimationWhenAddedToSpaceScene;
import fr.guiguilechat.jcelechat.model.sde.attributes.Hp;
import fr.guiguilechat.jcelechat.model.sde.attributes.KineticDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.KineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxAttackTargets;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxLockedTargets;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxTargetRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxTargetRangeBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxVelocity;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileEntityFlightTimeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileEntityVelocityMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.OptimalSigRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.ProximityRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.RechargeRate;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanGravimetricStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanGravimetricStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanLadarStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanLadarStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanMagnetometricStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanMagnetometricStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanRadarStrength;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanRadarStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanResolution;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanResolutionBonus;
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
import fr.guiguilechat.jcelechat.model.sde.attributes.Uniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleStrength;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class LargeCollidableStructure
    extends Entity
{
    /**
     * Duration of NPC effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(30000)
    public int ecmduration;
    /**
     * Chance of NPC effect to be activated each duration
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ecmentitychance;
    /**
     * Fall Off for NPC Target Jam
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ecmrangefalloff;
    /**
     * Max Range for NPC Target Jam
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ecmrangeoptimal;
    /**
     * agentID to use when initiating NPC communications with this type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int agentid;
    /**
     * The agility of the object.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double agility;
    /**
     * Multiplies EM damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double armoremdamageresonance;
    /**
     * Multiplies EXPLOSIVE damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double armorexplosivedamageresonance;
    /**
     * The number of hit points on the entities armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double armorhp;
    /**
     * Multiplies KINETIC damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double armorkineticdamageresonance;
    /**
     * Multiplies THERMAL damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double armorthermaldamageresonance;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double armoruniformity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double behaviorecmdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorecmduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double behaviorecmfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorecmrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
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
    @DefaultIntValue(0)
    public int behaviorenergyneutralizerfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorenergyneutralizerrange;
    /**
     * The capacitor discharge amount for the npcBehaviorMicroJumpAttackDischarge effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviormicrojumpattackdischarge;
    /**
     * The duration of the npcBehaviorMicroJumpAttack effect from the time the effect is activated on a ship, until the ship jumps
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviormicrojumpattackduration;
    /**
     * The length of the jump induced by the npcBehaviorMicroJumpAttack effect in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviormicrojumpattackjumpdistance;
    /**
     * The range in meters for the npcBehaviorMicroJumpAttackRange effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviormicrojumpattackrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double behaviorminingamount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorminingdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorminingduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorminingmaxrange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double behaviorsensordampenerdischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsensordampenerduration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double behaviorsensordampenerfalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double behaviorsensordampenerrange;
    /**
     * The capacitor discharge for the npcBehaviorSmartBomb effect
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsmartbombdischarge;
    /**
     * Duration of npcBehaviorSmartBombDuration effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int behaviorsmartbombduration;
    /**
     * Controls how much of the NpcBehaviorSmartBomb effect's damage gets applied to entities
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double behaviorsmartbombentitydamagemultiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
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
    @DefaultDoubleValue(0.0)
    public double capacitorcapacity;
    /**
     * The amount of charge used from the capacitor for a module activation.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacitorneed;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
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
    @DefaultDoubleValue(1.0)
    public double damagemultiplier;
    /**
     * Autogenerated skill attribute, damageMultiplierBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int damagemultiplierbonus;
    /**
     * If this module is in use and this attribute is 1, then assistance modules cannot be used on the ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int disallowassistance;
    /**
     * If this module is in use and this attribute is 1, then offensive modules cannot be used on the ship if they apply modifiers for the duration of their effect. If this is put on a ship or NPC with value of 1, then the ship or NPC are immune to offensive modifiers (target jamming, tracking disruption etc.)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int disallowoffensivemodifiers;
    /**
     * Length of activation time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double duration;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double emdamage;
    /**
     * Electro magnetic damage multiplier for shield and armor. Represented as "% Resistance" in the UI.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double emdamageresonance;
    /**
     * Range of broadcasted EMP field.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int empfieldrange;
    /**
     * An amount to modify the power of the target by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double energyneutralizeramount;
    /**
     * Maximum attack delay time for entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entityattackdelaymax;
    /**
     * Minimum attack delay time for entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entityattackdelaymin;
    /**
     * The distance from a target an entity starts using its weapons.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(15000)
    public int entityattackrange;
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
    @DefaultDoubleValue(1.0)
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
    @DefaultDoubleValue(1.0)
    public double entitychasemaxdurationchance;
    /**
     * The speed that entities fly at when not chasing a target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entitycruisespeed;
    /**
     * % chance of entity to shoot defender at incoming missile
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entitydefenderchance;
    /**
     * The maximum drops of same group (example: entity can only drop 1 of group: energy laser)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entityequipmentgroupmax;
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
    @DefaultDoubleValue(0.0)
    public double entityfactionloss;
    /**
     * The distance at which the entity orbits, follows.. and more.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(500.0)
    public double entityflyrange;
    /**
     * Reward for destroying this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitykillbounty;
    /**
     * The maximum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitylootcountmax;
    /**
     * Deprecated. The minimum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitylootcountmin;
    /**
     * The chance of an entity attacking the same person as its group members.  Scales delay in joining in on fights too.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double entityreactionfactor;
    /**
     * How much security status is modified by for killing this entity.  Depending on the entity, this may be a positive or negative amount.
     * Value is a % movement of the character's current security towards the upper/lower limit.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entitysecuritystatuskillbonus;
    /**
     * Target Jam multiplier on max locked targets for NPCs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entitytargetjam;
    /**
     * Chance of entity warp scrambling it's target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entitywarpscramblechance;
    /**
     * Explosive damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double explosivedamage;
    /**
     * damage multiplier vs. explosive damagers.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double explosivedamageresonance;
    /**
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double falloff;
    /**
     * Graphic ID of the turrets for drone type ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int gfxturretid;
    /**
     * The item with this attribute set to 1 keeps track of when added to space, and puts that on the slim item, but if it was before downtime the slim item value gets set to -1. Created for supporting long animations upon adding to space.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int haslonganimationwhenaddedtospacescene;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double hp;
    /**
     * Kinetic damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double kineticdamage;
    /**
     * damage multiplier vs. kinetic damagers.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double kineticdamageresonance;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double mass;
    /**
     * The maximum number of their targets that the character can attack at a given time.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int maxattacktargets;
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
    @DefaultDoubleValue(0.0)
    public double maxrange;
    /**
     * Maximum range at which the scanner can lock a target.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double maxtargetrange;
    /**
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double maxtargetrangebonus;
    /**
     * Maximum velocity of ship
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double maxvelocity;
    /**
     * Multiplier for the missile's flight time.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double missileentityflighttimemultiplier;
    /**
     * Multiplier for the missile's speed.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double missileentityvelocitymultiplier;
    /**
     * Prefered target signature. The base signature radius at which the turret's tracking speed is rated. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1000)
    public int optimalsigradius;
    /**
     * The distance at which to react when relevant objects come within range.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int proximityrange;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double radius;
    /**
     * Amount of time taken to fully recharge the capacitor.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double rechargerate;
    /**
     * Gravimetric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scangravimetricstrength;
    /**
     * +/- modifier to the gravimetric strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scangravimetricstrengthbonus;
    /**
     * Ladar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanladarstrength;
    /**
     * +/- modifier to the ladar strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanladarstrengthbonus;
    /**
     * Magnetometric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanmagnetometricstrength;
    /**
     * +/- modifier to the magnetometric strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanmagnetometricstrengthbonus;
    /**
     * Radar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanradarstrength;
    /**
     * +/- modifier to the radar strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanradarstrengthbonus;
    /**
     * The resolution that the vessel can target other objects at.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanresolution;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double scanresolutionbonus;
    /**
     * Amount of maximum shield HP on the item.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double shieldcapacity;
    /**
     * DO NOT MESS WITH. Helper attribute for entities, stands in for the shield charge.
     * The amount of starting shield capacity of the NPC.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double shieldcharge;
    /**
     * Multiplies EM damage taken by shield
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double shieldemdamageresonance;
    /**
     * Multiplies EXPLOSIVE damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double shieldexplosivedamageresonance;
    /**
     * Multiplies KINETIC damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double shieldkineticdamageresonance;
    /**
     * Amount of time taken to fully recharge the shield.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double shieldrechargerate;
    /**
     * Multiplies THERMAL damage taken by Shield. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double shieldthermaldamageresonance;
    /**
     * DO NOT MESS WITH This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double shielduniformity;
    /**
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(100.0)
    public double signatureradius;
    /**
     * Time in milliseconds between possible activations
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double speed;
    /**
     * Factor by which topspeed increases.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double speedfactor;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double structureuniformity;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double thermaldamage;
    /**
     * damage multiplier vs. thermal.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double thermaldamageresonance;
    /**
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double trackingspeed;
    /**
     * This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double uniformity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(8000)
    public int warpscrambleduration;
    /**
     * Maximum range objects can be warp scrambled from.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int warpscramblerange;
    /**
     * Amount to modify ships warp scramble status by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int warpscramblestrength;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {BehaviorMicroJumpAttackRange.INSTANCE, BehaviorMicroJumpAttackJumpDistance.INSTANCE, BehaviorMicroJumpAttackDuration.INSTANCE, Mass.INSTANCE, CapacitorNeed.INSTANCE, ShieldCapacity.INSTANCE, ShieldCharge.INSTANCE, Hp.INSTANCE, ArmorHP.INSTANCE, ArmorEmDamageResonance.INSTANCE, HasLongAnimationWhenAddedToSpaceScene.INSTANCE, ArmorExplosiveDamageResonance.INSTANCE, ArmorUniformity.INSTANCE, ArmorKineticDamageResonance.INSTANCE, StructureUniformity.INSTANCE, ArmorThermalDamageResonance.INSTANCE, ShieldEmDamageResonance.INSTANCE, ShieldExplosiveDamageResonance.INSTANCE, ShieldKineticDamageResonance.INSTANCE, ShieldThermalDamageResonance.INSTANCE, Charge.INSTANCE, SpeedFactor.INSTANCE, EntityBracketColour.INSTANCE, DamageMultiplierBonus.INSTANCE, MaxVelocity.INSTANCE, Capacity.INSTANCE, SignatureRadius.INSTANCE, EntityFactionLoss.INSTANCE, Speed.INSTANCE, ScanResolution.INSTANCE, MaxTargetRangeBonus.INSTANCE, ScanResolutionBonus.INSTANCE, MaxRange.INSTANCE, RechargeRate.INSTANCE, DamageMultiplier.INSTANCE, EntityChaseMaxDelay.INSTANCE, EntityChaseMaxDelayChance.INSTANCE, Agility.INSTANCE, EntityChaseMaxDuration.INSTANCE, EntityChaseMaxDurationChance.INSTANCE, AgentID.INSTANCE, Duration.INSTANCE, MaxTargetRange.INSTANCE, DisallowAssistance.INSTANCE, EnergyNeutralizerAmount.INSTANCE, EmpFieldRange.INSTANCE, WarpScrambleRange.INSTANCE, DisallowOffensiveModifiers.INSTANCE, WarpScrambleStrength.INSTANCE, OptimalSigRadius.INSTANCE, KineticDamageResonance.INSTANCE, ThermalDamageResonance.INSTANCE, ExplosiveDamageResonance.INSTANCE, EmDamageResonance.INSTANCE, BehaviorMiningMaxRange.INSTANCE, EmDamage.INSTANCE, BehaviorMiningDischarge.INSTANCE, ExplosiveDamage.INSTANCE, KineticDamage.INSTANCE, ThermalDamage.INSTANCE, MissileEntityVelocityMultiplier.INSTANCE, MissileEntityFlightTimeMultiplier.INSTANCE, Uniformity.INSTANCE, EntityChaseMaxDistance.INSTANCE, ProximityRange.INSTANCE, Falloff.INSTANCE, EntityFlyRange.INSTANCE, EntityTargetJam.INSTANCE, TrackingSpeed.INSTANCE, ECMDuration.INSTANCE, Radius.INSTANCE, ECMEntityChance.INSTANCE, ECMRangeOptimal.INSTANCE, ECMRangeFalloff.INSTANCE, BehaviorMiningAmount.INSTANCE, BehaviorMiningDuration.INSTANCE, MaxLockedTargets.INSTANCE, MaxAttackTargets.INSTANCE, BehaviorWebifierDuration.INSTANCE, BehaviorWebifierRange.INSTANCE, BehaviorWebifierFalloff.INSTANCE, BehaviorWebifierDischarge.INSTANCE, EntityEquipmentMin.INSTANCE, EntityEquipmentMax.INSTANCE, ScanRadarStrength.INSTANCE, ScanLadarStrength.INSTANCE, EntityEquipmentGroupMax.INSTANCE, ScanMagnetometricStrength.INSTANCE, EntityReactionFactor.INSTANCE, ScanGravimetricStrength.INSTANCE, BehaviorEnergyNeutralizerDuration.INSTANCE, BehaviorEnergyNeutralizerRange.INSTANCE, BehaviorEnergyNeutralizerFalloff.INSTANCE, BehaviorEnergyNeutralizerDischarge.INSTANCE, EntityAttackDelayMin.INSTANCE, EntityAttackDelayMax.INSTANCE, ShieldRechargeRate.INSTANCE, BehaviorSensorDampenerDuration.INSTANCE, BehaviorSmartBombEntityDamageMultiplier.INSTANCE, BehaviorSensorDampenerRange.INSTANCE, EntityKillBounty.INSTANCE, BehaviorSensorDampenerFalloff.INSTANCE, CapacitorCapacity.INSTANCE, BehaviorSensorDampenerDischarge.INSTANCE, BehaviorECMDuration.INSTANCE, BehaviorECMRange.INSTANCE, ShieldUniformity.INSTANCE, BehaviorECMFalloff.INSTANCE, BehaviorECMDischarge.INSTANCE, ScanGravimetricStrengthBonus.INSTANCE, ScanLadarStrengthBonus.INSTANCE, ScanMagnetometricStrengthBonus.INSTANCE, ScanRadarStrengthBonus.INSTANCE, EntityDefenderChance.INSTANCE, GfxTurretID.INSTANCE, EntityAttackRange.INSTANCE, EntityWarpScrambleChance.INSTANCE, WarpScrambleDuration.INSTANCE, EntityLootCountMin.INSTANCE, EntityLootCountMax.INSTANCE, EntityCruiseSpeed.INSTANCE, EntitySecurityStatusKillBonus.INSTANCE, BehaviorSmartBombDuration.INSTANCE, BehaviorSmartBombDischarge.INSTANCE, BehaviorMicroJumpAttackDischarge.INSTANCE })));
    public static final LargeCollidableStructure.MetaGroup METAGROUP = new LargeCollidableStructure.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  929 :
            {
                return ecmduration;
            }
            case  930 :
            {
                return ecmentitychance;
            }
            case  953 :
            {
                return ecmrangefalloff;
            }
            case  936 :
            {
                return ecmrangeoptimal;
            }
            case  840 :
            {
                return agentid;
            }
            case  70 :
            {
                return agility;
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
            case  2534 :
            {
                return behaviorecmdischarge;
            }
            case  2531 :
            {
                return behaviorecmduration;
            }
            case  2533 :
            {
                return behaviorecmfalloff;
            }
            case  2532 :
            {
                return behaviorecmrange;
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
            case  2815 :
            {
                return behaviormicrojumpattackdischarge;
            }
            case  2819 :
            {
                return behaviormicrojumpattackduration;
            }
            case  2818 :
            {
                return behaviormicrojumpattackjumpdistance;
            }
            case  2816 :
            {
                return behaviormicrojumpattackrange;
            }
            case  2489 :
            {
                return behaviorminingamount;
            }
            case  2674 :
            {
                return behaviorminingdischarge;
            }
            case  2490 :
            {
                return behaviorminingduration;
            }
            case  2673 :
            {
                return behaviorminingmaxrange;
            }
            case  2530 :
            {
                return behaviorsensordampenerdischarge;
            }
            case  2527 :
            {
                return behaviorsensordampenerduration;
            }
            case  2529 :
            {
                return behaviorsensordampenerfalloff;
            }
            case  2528 :
            {
                return behaviorsensordampenerrange;
            }
            case  2814 :
            {
                return behaviorsmartbombdischarge;
            }
            case  2812 :
            {
                return behaviorsmartbombduration;
            }
            case  3039 :
            {
                return behaviorsmartbombentitydamagemultiplier;
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
            case  6 :
            {
                return capacitorneed;
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
            case  292 :
            {
                return damagemultiplierbonus;
            }
            case  854 :
            {
                return disallowassistance;
            }
            case  872 :
            {
                return disallowoffensivemodifiers;
            }
            case  73 :
            {
                return duration;
            }
            case  114 :
            {
                return emdamage;
            }
            case  113 :
            {
                return emdamageresonance;
            }
            case  99 :
            {
                return empfieldrange;
            }
            case  97 :
            {
                return energyneutralizeramount;
            }
            case  476 :
            {
                return entityattackdelaymax;
            }
            case  475 :
            {
                return entityattackdelaymin;
            }
            case  247 :
            {
                return entityattackrange;
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
            case  497 :
            {
                return entitydefenderchance;
            }
            case  465 :
            {
                return entityequipmentgroupmax;
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
            case  416 :
            {
                return entityflyrange;
            }
            case  481 :
            {
                return entitykillbounty;
            }
            case  251 :
            {
                return entitylootcountmax;
            }
            case  250 :
            {
                return entitylootcountmin;
            }
            case  466 :
            {
                return entityreactionfactor;
            }
            case  252 :
            {
                return entitysecuritystatuskillbonus;
            }
            case  928 :
            {
                return entitytargetjam;
            }
            case  504 :
            {
                return entitywarpscramblechance;
            }
            case  116 :
            {
                return explosivedamage;
            }
            case  111 :
            {
                return explosivedamageresonance;
            }
            case  158 :
            {
                return falloff;
            }
            case  245 :
            {
                return gfxturretid;
            }
            case  2827 :
            {
                return haslonganimationwhenaddedtospacescene;
            }
            case  9 :
            {
                return hp;
            }
            case  117 :
            {
                return kineticdamage;
            }
            case  109 :
            {
                return kineticdamageresonance;
            }
            case  4 :
            {
                return mass;
            }
            case  193 :
            {
                return maxattacktargets;
            }
            case  192 :
            {
                return maxlockedtargets;
            }
            case  54 :
            {
                return maxrange;
            }
            case  76 :
            {
                return maxtargetrange;
            }
            case  309 :
            {
                return maxtargetrangebonus;
            }
            case  37 :
            {
                return maxvelocity;
            }
            case  646 :
            {
                return missileentityflighttimemultiplier;
            }
            case  645 :
            {
                return missileentityvelocitymultiplier;
            }
            case  620 :
            {
                return optimalsigradius;
            }
            case  154 :
            {
                return proximityrange;
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
            case  238 :
            {
                return scangravimetricstrengthbonus;
            }
            case  209 :
            {
                return scanladarstrength;
            }
            case  239 :
            {
                return scanladarstrengthbonus;
            }
            case  210 :
            {
                return scanmagnetometricstrength;
            }
            case  240 :
            {
                return scanmagnetometricstrengthbonus;
            }
            case  208 :
            {
                return scanradarstrength;
            }
            case  241 :
            {
                return scanradarstrengthbonus;
            }
            case  564 :
            {
                return scanresolution;
            }
            case  566 :
            {
                return scanresolutionbonus;
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
            case  136 :
            {
                return uniformity;
            }
            case  505 :
            {
                return warpscrambleduration;
            }
            case  103 :
            {
                return warpscramblerange;
            }
            case  105 :
            {
                return warpscramblestrength;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<LargeCollidableStructure> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<LargeCollidableStructure>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/LargeCollidableStructure.yaml";
        private Map<String, LargeCollidableStructure> cache = (null);

        @Override
        public IMetaCategory<? super LargeCollidableStructure> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  319;
        }

        @Override
        public String getName() {
            return "LargeCollidableStructure";
        }

        @Override
        public synchronized Map<String, LargeCollidableStructure> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(LargeCollidableStructure.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, LargeCollidableStructure> types;
        }
    }
}
