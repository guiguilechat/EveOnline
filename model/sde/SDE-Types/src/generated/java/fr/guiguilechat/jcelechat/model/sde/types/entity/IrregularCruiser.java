package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class IrregularCruiser
    extends Entity
{
    /**
     * A percentage chance to not change targets 0.0 - 1.0. 1.0 they will never change targets 0.0 they will always change targets
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AIChanceToNotTargetSwitch;
    /**
     * NPC'S with this attribute wont shoot drones with signature radius less than this value.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AIIgnoreDronesBelowSignatureRadius;
    /**
     * Should the entity watch for effects when choosing targets
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AIShouldUseEffectMultiplier;
    /**
     * The evasive maneuver level of the type. this will control what types of evasive maneuvers a NPC ship will use.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AIShouldUseEvasiveManeuver;
    /**
     * Should use secondary effect on other targets?
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AIShouldUseSecondaryTarget;
    /**
     * Should this type use signature radius
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AIShouldUseSignatureRadius;
    /**
     * This controls how L1 AI target switches
     * When disabled AI_ChanceToNotTargetSwitch, AI_ShouldUseEffectMultiplier, and AI_ShouldUseSignatureRadius are disabled also.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AIShouldUseTargetSwitching;
    /**
     * Tanking modifier applied to drones if their owner is tanking. 1.0 is no modifier
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.699999988079071)
    public double AITankingModifierDrone;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorShieldBoosterAmount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorShieldBoosterDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorShieldBoosterDuration;
    /**
     * The agility of the object.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Agility;
    /**
     * An amount to modify the armor damage by.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ArmorDamageAmount;
    /**
     * Multiplies EM damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ArmorEmDamageResonance;
    /**
     * Multiplies EXPLOSIVE damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ArmorExplosiveDamageResonance;
    /**
     * The number of hit points on the entities armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorHP;
    /**
     * Multiplies KINETIC damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ArmorKineticDamageResonance;
    /**
     * Multiplies THERMAL damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ArmorThermalDamageResonance;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorUniformity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorArmorRepairerAmount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorArmorRepairerDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorArmorRepairerDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorECMDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorECMDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorECMFalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorECMRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorEnergyNeutralizerDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorEnergyNeutralizerDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorEnergyNeutralizerFalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorEnergyNeutralizerRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorRemoteArmorRepairDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorRemoteArmorRepairDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorRemoteArmorRepairFalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorRemoteArmorRepairRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorSensorDampenerDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorSensorDampenerDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorSensorDampenerFalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorSensorDampenerRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorTargetPainterDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorTargetPainterDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorTargetPainterFalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorTargetPainterRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorWarpDisruptDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWarpDisruptDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWarpDisruptRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWarpDisruptStrength;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorWarpScrambleDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWarpScrambleDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorWarpScrambleRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWarpScrambleStrength;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BehaviorWebifierDischarge;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWebifierDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWebifierFalloff;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BehaviorWebifierRange;
    /**
     * Capacitor capacity
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorCapacity;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Capacity;
    /**
     * charge of module
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Charge;
    /**
     * Damage multiplier.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double DamageMultiplier;
    /**
     * If this module is in use and this attribute is 1, then assistance modules cannot be used on the ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowAssistance;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EmDamage;
    /**
     * Electro magnetic damage multiplier for shield and armor. Represented as "% Resistance" in the UI.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double EmDamageResonance;
    /**
     * An amount to modify the power of the target by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EnergyNeutralizerAmount;
    /**
     * Duration of NPC Energy Neutralizer effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(30000)
    public int EnergyNeutralizerDuration;
    /**
     * Chance of NPC effect to be activated each duration
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EnergyNeutralizerEntityChance;
    /**
     * Falloff Range of Energy Neutralizer
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EnergyNeutralizerRangeFalloff;
    /**
     * Optimal Range of Energy Neutralizer
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EnergyNeutralizerRangeOptimal;
    /**
     * Amount of armor repaired per cycle for entities.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityArmorRepairAmount;
    /**
     * Chance that an entity will delay employing armor repair.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityArmorRepairDelayChance;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityArmorRepairDelayChanceMedium;
    /**
     * Duration between armor repair actions for entities.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityArmorRepairDuration;
    /**
     * Maximum attack delay time for entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityAttackDelayMax;
    /**
     * Minimum attack delay time for entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityAttackDelayMin;
    /**
     * The distance from a target an entity starts using its weapons.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(15000)
    public int EntityAttackRange;
    /**
     *  0: white (default)
     *  1: red (hostile NPC)
     *  2: blue (Neutral NPC)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityBracketColour;
    /**
     * The maximum amount of time stalled before entity chase speed kicks in.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(5000)
    public int EntityChaseMaxDelay;
    /**
     * Chance that the max delay is waited before chase is engaged.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double EntityChaseMaxDelayChance;
    /**
     * The distance outside of which the entity activates their MWD equivalent.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(2500)
    public int EntityChaseMaxDistance;
    /**
     * The maximum amount of time chase is ever engaged for.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(5000)
    public int EntityChaseMaxDuration;
    /**
     * The chance of engaging chase for the maximum duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double EntityChaseMaxDurationChance;
    /**
     * The speed that entities fly at when not chasing a target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityCruiseSpeed;
    /**
     * % chance of entity to shoot defender at incoming missile
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityDefenderChance;
    /**
     * The maximum drops of same group (example: entity can only drop 1 of group: energy laser)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int EntityEquipmentGroupMax;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityEquipmentMax;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityEquipmentMin;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityFactionLoss;
    /**
     * The distance at which the entity orbits, follows.. and more.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(500.0)
    public double EntityFlyRange;
    /**
     * The chance an entity will respawn into his group if destroyed.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int EntityGroupRespawnChance;
    /**
     * Reward for destroying this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityKillBounty;
    /**
     * The maximum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityLootCountMax;
    /**
     * Deprecated. The minimum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityLootCountMin;
    /**
     * Used to increase signature radius of entity when it activates Max Velocity. Used to fake MWD sig radius increase.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(6)
    public int EntityMaxVelocitySignatureRadiusMultiplier;
    /**
     * The type of missiles the entity launches.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityMissileTypeID;
    /**
     * This attribute is used on entities to link them to a player ship group. This is then used to determine which overview icon they should get, among other things
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityOverviewShipGroupId;
    /**
     * The chance of an entity attacking the same person as its group members.  Scales delay in joining in on fights too.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double EntityReactionFactor;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntitySecurityMaxGain;
    /**
     * How much security status is modified by for killing this entity.  Depending on the entity, this may be a positive or negative amount.
     * Value is a % movement of the character's current security towards the upper/lower limit.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntitySecurityStatusKillBonus;
    /**
     * How much the shield is boosted each duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityShieldBoostAmount;
    /**
     * The chance an entity will delay repeating use of its shield boosting effect if it has one.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double EntityShieldBoostDelayChance;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityShieldBoostDelayChanceMedium;
    /**
     * How long between repeats.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000)
    public int EntityShieldBoostDuration;
    /**
     * A relative strength that indicates how powerful this NPC entity is in combat.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityStrength;
    /**
     * Chance of entity warp scrambling it's target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntityWarpScrambleChance;
    /**
     * Explosive damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ExplosiveDamage;
    /**
     * damage multiplier vs. explosive damagers.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ExplosiveDamageResonance;
    /**
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double Falloff;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
    /**
     * Graphic ID of the boosters for drone type ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int GfxBoosterID;
    /**
     * Graphic ID of the turrets for drone type ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int GfxTurretID;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Hp;
    /**
     * Kinetic damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double KineticDamage;
    /**
     * damage multiplier vs. kinetic damagers.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double KineticDamageResonance;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Mass;
    /**
     * The maximum number of their targets that the character can attack at a given time.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxAttackTargets;
    /**
     * Deprecated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int MaxDirectionalVelocity;
    /**
     * Maximum number of locked targets that the character or their ships electronics can handle at any given time.  Both have individual limits which apply separately.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxLockedTargets;
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double MaxRange;
    /**
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
    /**
     * Maximum range at which the scanner can lock a target.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRange;
    /**
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
    /**
     * Maximum velocity of ship
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double MaxVelocity;
    /**
     * Deprecated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MinTargetVelDmgMultiplier;
    /**
     * The characters missile use efficiency, scales the damage missiles do.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double MissileDamageMultiplier;
    /**
     * Affects the signature radius of the target in missile impact calculations.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MissileEntityAoeCloudSizeMultiplier;
    /**
     * Affects the velocity of the target in missile impact calculations.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MissileEntityAoeVelocityMultiplier;
    /**
     * Multiplier for the missile's flight time.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MissileEntityFlightTimeMultiplier;
    /**
     * Multiplier for the missile's speed.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MissileEntityVelocityMultiplier;
    /**
     * Cycle time for a missile launch, in milliseconds.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(20000.0)
    public double MissileLaunchDuration;
    /**
     * Chance that  an entity will use a Stasis Web on a target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ModifyTargetSpeedChance;
    /**
     * Duration of entities Stasis Web 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(5000.0)
    public double ModifyTargetSpeedDuration;
    /**
     * Range of entities Stasis Web
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(20000)
    public int ModifyTargetSpeedRange;
    /**
     * Used by Behavior NPCs to work out minimum orbit range. If the npc has an effect with a shorter range, it will use the effects range instead.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NpcBehaviorMaximumCombatOrbitRange;
    /**
     * Chance of NPC effect to be activated each duration
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double NpcTrackingDisruptorActivationChance;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NpcTrackingDisruptorDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NpcTrackingDisruptorRange;
    /**
     * Prefered target signature. The base signature radius at which the turret's tracking speed is rated. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1000)
    public int OptimalSigRadius;
    /**
     * The graphicID of the propulsion system.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PropulsionGraphicID;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Radius;
    /**
     * Amount of time taken to fully recharge the capacitor.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double RechargeRate;
    /**
     * Gravimetric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanGravimetricStrength;
    /**
     * +/- modifier to the gravimetric strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanGravimetricStrengthBonus;
    /**
     * Ladar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanLadarStrength;
    /**
     * +/- modifier to the ladar strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanLadarStrengthBonus;
    /**
     * Magnetometric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanMagnetometricStrength;
    /**
     * +/- modifier to the magnetometric strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanMagnetometricStrengthBonus;
    /**
     * Radar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanRadarStrength;
    /**
     * +/- modifier to the radar strength of an electronic system.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanRadarStrengthBonus;
    /**
     * The resolution that the vessel can target other objects at.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolution;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolutionBonus;
    /**
     * scanning speed in milliseconds
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanSpeed;
    /**
     * Amount of maximum shield HP on the item.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldCapacity;
    /**
     * DO NOT MESS WITH. Helper attribute for entities, stands in for the shield charge.
     * The amount of starting shield capacity of the NPC.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldCharge;
    /**
     * Multiplies EM damage taken by shield
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ShieldEmDamageResonance;
    /**
     * Multiplies EXPLOSIVE damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ShieldExplosiveDamageResonance;
    /**
     * Multiplies KINETIC damage taken by Armor. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ShieldKineticDamageResonance;
    /**
     * Amount of time taken to fully recharge the shield.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldRechargeRate;
    /**
     * Multiplies THERMAL damage taken by Shield. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ShieldThermalDamageResonance;
    /**
     * DO NOT MESS WITH This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldUniformity;
    /**
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(100.0)
    public double SignatureRadius;
    /**
     * Autogenerated skill attribute, signatureRadiusBonus
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SignatureRadiusBonus;
    /**
     * Time in milliseconds between possible activations
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Speed;
    /**
     * Factor by which topspeed increases.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double SpeedFactor;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double StructureUniformity;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ThermalDamage;
    /**
     * damage multiplier vs. thermal.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ThermalDamageResonance;
    /**
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeed;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(8000)
    public int WarpScrambleDuration;
    /**
     * Maximum range objects can be warp scrambled from.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpScrambleRange;
    /**
     * Amount to modify ships warp scramble status by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpScrambleStrength;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(3.0)
    public double WarpSpeedMultiplier;
    public static final IrregularCruiser.MetaGroup METAGROUP = new IrregularCruiser.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1651 :
            {
                return AIChanceToNotTargetSwitch;
            }
            case  1855 :
            {
                return AIIgnoreDronesBelowSignatureRadius;
            }
            case  1652 :
            {
                return AIShouldUseEffectMultiplier;
            }
            case  1414 :
            {
                return AIShouldUseEvasiveManeuver;
            }
            case  1649 :
            {
                return AIShouldUseSecondaryTarget;
            }
            case  1650 :
            {
                return AIShouldUseSignatureRadius;
            }
            case  1648 :
            {
                return AIShouldUseTargetSwitching;
            }
            case  1656 :
            {
                return AITankingModifierDrone;
            }
            case  2723 :
            {
                return BehaviorShieldBoosterAmount;
            }
            case  2724 :
            {
                return BehaviorShieldBoosterDischarge;
            }
            case  2725 :
            {
                return BehaviorShieldBoosterDuration;
            }
            case  70 :
            {
                return Agility;
            }
            case  84 :
            {
                return ArmorDamageAmount;
            }
            case  267 :
            {
                return ArmorEmDamageResonance;
            }
            case  268 :
            {
                return ArmorExplosiveDamageResonance;
            }
            case  265 :
            {
                return ArmorHP;
            }
            case  269 :
            {
                return ArmorKineticDamageResonance;
            }
            case  270 :
            {
                return ArmorThermalDamageResonance;
            }
            case  524 :
            {
                return ArmorUniformity;
            }
            case  2635 :
            {
                return BehaviorArmorRepairerAmount;
            }
            case  2634 :
            {
                return BehaviorArmorRepairerDischarge;
            }
            case  2633 :
            {
                return BehaviorArmorRepairerDuration;
            }
            case  2534 :
            {
                return BehaviorECMDischarge;
            }
            case  2531 :
            {
                return BehaviorECMDuration;
            }
            case  2533 :
            {
                return BehaviorECMFalloff;
            }
            case  2532 :
            {
                return BehaviorECMRange;
            }
            case  2522 :
            {
                return BehaviorEnergyNeutralizerDischarge;
            }
            case  2519 :
            {
                return BehaviorEnergyNeutralizerDuration;
            }
            case  2521 :
            {
                return BehaviorEnergyNeutralizerFalloff;
            }
            case  2520 :
            {
                return BehaviorEnergyNeutralizerRange;
            }
            case  2494 :
            {
                return BehaviorRemoteArmorRepairDischarge;
            }
            case  2491 :
            {
                return BehaviorRemoteArmorRepairDuration;
            }
            case  2493 :
            {
                return BehaviorRemoteArmorRepairFalloff;
            }
            case  2492 :
            {
                return BehaviorRemoteArmorRepairRange;
            }
            case  2530 :
            {
                return BehaviorSensorDampenerDischarge;
            }
            case  2527 :
            {
                return BehaviorSensorDampenerDuration;
            }
            case  2529 :
            {
                return BehaviorSensorDampenerFalloff;
            }
            case  2528 :
            {
                return BehaviorSensorDampenerRange;
            }
            case  2526 :
            {
                return BehaviorTargetPainterDischarge;
            }
            case  2523 :
            {
                return BehaviorTargetPainterDuration;
            }
            case  2525 :
            {
                return BehaviorTargetPainterFalloff;
            }
            case  2524 :
            {
                return BehaviorTargetPainterRange;
            }
            case  2505 :
            {
                return BehaviorWarpDisruptDischarge;
            }
            case  2503 :
            {
                return BehaviorWarpDisruptDuration;
            }
            case  2504 :
            {
                return BehaviorWarpDisruptRange;
            }
            case  2510 :
            {
                return BehaviorWarpDisruptStrength;
            }
            case  2508 :
            {
                return BehaviorWarpScrambleDischarge;
            }
            case  2506 :
            {
                return BehaviorWarpScrambleDuration;
            }
            case  2507 :
            {
                return BehaviorWarpScrambleRange;
            }
            case  2509 :
            {
                return BehaviorWarpScrambleStrength;
            }
            case  2502 :
            {
                return BehaviorWebifierDischarge;
            }
            case  2499 :
            {
                return BehaviorWebifierDuration;
            }
            case  2501 :
            {
                return BehaviorWebifierFalloff;
            }
            case  2500 :
            {
                return BehaviorWebifierRange;
            }
            case  482 :
            {
                return CapacitorCapacity;
            }
            case  38 :
            {
                return Capacity;
            }
            case  18 :
            {
                return Charge;
            }
            case  64 :
            {
                return DamageMultiplier;
            }
            case  854 :
            {
                return DisallowAssistance;
            }
            case  114 :
            {
                return EmDamage;
            }
            case  113 :
            {
                return EmDamageResonance;
            }
            case  97 :
            {
                return EnergyNeutralizerAmount;
            }
            case  942 :
            {
                return EnergyNeutralizerDuration;
            }
            case  931 :
            {
                return EnergyNeutralizerEntityChance;
            }
            case  2452 :
            {
                return EnergyNeutralizerRangeFalloff;
            }
            case  98 :
            {
                return EnergyNeutralizerRangeOptimal;
            }
            case  631 :
            {
                return EntityArmorRepairAmount;
            }
            case  638 :
            {
                return EntityArmorRepairDelayChance;
            }
            case  1010 :
            {
                return EntityArmorRepairDelayChanceMedium;
            }
            case  630 :
            {
                return EntityArmorRepairDuration;
            }
            case  476 :
            {
                return EntityAttackDelayMax;
            }
            case  475 :
            {
                return EntityAttackDelayMin;
            }
            case  247 :
            {
                return EntityAttackRange;
            }
            case  798 :
            {
                return EntityBracketColour;
            }
            case  580 :
            {
                return EntityChaseMaxDelay;
            }
            case  581 :
            {
                return EntityChaseMaxDelayChance;
            }
            case  665 :
            {
                return EntityChaseMaxDistance;
            }
            case  582 :
            {
                return EntityChaseMaxDuration;
            }
            case  583 :
            {
                return EntityChaseMaxDurationChance;
            }
            case  508 :
            {
                return EntityCruiseSpeed;
            }
            case  497 :
            {
                return EntityDefenderChance;
            }
            case  465 :
            {
                return EntityEquipmentGroupMax;
            }
            case  457 :
            {
                return EntityEquipmentMax;
            }
            case  456 :
            {
                return EntityEquipmentMin;
            }
            case  562 :
            {
                return EntityFactionLoss;
            }
            case  416 :
            {
                return EntityFlyRange;
            }
            case  640 :
            {
                return EntityGroupRespawnChance;
            }
            case  481 :
            {
                return EntityKillBounty;
            }
            case  251 :
            {
                return EntityLootCountMax;
            }
            case  250 :
            {
                return EntityLootCountMin;
            }
            case  1133 :
            {
                return EntityMaxVelocitySignatureRadiusMultiplier;
            }
            case  507 :
            {
                return EntityMissileTypeID;
            }
            case  1766 :
            {
                return EntityOverviewShipGroupId;
            }
            case  466 :
            {
                return EntityReactionFactor;
            }
            case  563 :
            {
                return EntitySecurityMaxGain;
            }
            case  252 :
            {
                return EntitySecurityStatusKillBonus;
            }
            case  637 :
            {
                return EntityShieldBoostAmount;
            }
            case  639 :
            {
                return EntityShieldBoostDelayChance;
            }
            case  1007 :
            {
                return EntityShieldBoostDelayChanceMedium;
            }
            case  636 :
            {
                return EntityShieldBoostDuration;
            }
            case  542 :
            {
                return EntityStrength;
            }
            case  504 :
            {
                return EntityWarpScrambleChance;
            }
            case  116 :
            {
                return ExplosiveDamage;
            }
            case  111 :
            {
                return ExplosiveDamageResonance;
            }
            case  158 :
            {
                return Falloff;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  246 :
            {
                return GfxBoosterID;
            }
            case  245 :
            {
                return GfxTurretID;
            }
            case  9 :
            {
                return Hp;
            }
            case  117 :
            {
                return KineticDamage;
            }
            case  109 :
            {
                return KineticDamageResonance;
            }
            case  4 :
            {
                return Mass;
            }
            case  193 :
            {
                return MaxAttackTargets;
            }
            case  661 :
            {
                return MaxDirectionalVelocity;
            }
            case  192 :
            {
                return MaxLockedTargets;
            }
            case  54 :
            {
                return MaxRange;
            }
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  76 :
            {
                return MaxTargetRange;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  37 :
            {
                return MaxVelocity;
            }
            case  662 :
            {
                return MinTargetVelDmgMultiplier;
            }
            case  212 :
            {
                return MissileDamageMultiplier;
            }
            case  858 :
            {
                return MissileEntityAoeCloudSizeMultiplier;
            }
            case  859 :
            {
                return MissileEntityAoeVelocityMultiplier;
            }
            case  646 :
            {
                return MissileEntityFlightTimeMultiplier;
            }
            case  645 :
            {
                return MissileEntityVelocityMultiplier;
            }
            case  506 :
            {
                return MissileLaunchDuration;
            }
            case  512 :
            {
                return ModifyTargetSpeedChance;
            }
            case  513 :
            {
                return ModifyTargetSpeedDuration;
            }
            case  514 :
            {
                return ModifyTargetSpeedRange;
            }
            case  2786 :
            {
                return NpcBehaviorMaximumCombatOrbitRange;
            }
            case  933 :
            {
                return NpcTrackingDisruptorActivationChance;
            }
            case  2515 :
            {
                return NpcTrackingDisruptorDuration;
            }
            case  2516 :
            {
                return NpcTrackingDisruptorRange;
            }
            case  620 :
            {
                return OptimalSigRadius;
            }
            case  217 :
            {
                return PropulsionGraphicID;
            }
            case  162 :
            {
                return Radius;
            }
            case  55 :
            {
                return RechargeRate;
            }
            case  211 :
            {
                return ScanGravimetricStrength;
            }
            case  238 :
            {
                return ScanGravimetricStrengthBonus;
            }
            case  209 :
            {
                return ScanLadarStrength;
            }
            case  239 :
            {
                return ScanLadarStrengthBonus;
            }
            case  210 :
            {
                return ScanMagnetometricStrength;
            }
            case  240 :
            {
                return ScanMagnetometricStrengthBonus;
            }
            case  208 :
            {
                return ScanRadarStrength;
            }
            case  241 :
            {
                return ScanRadarStrengthBonus;
            }
            case  564 :
            {
                return ScanResolution;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  79 :
            {
                return ScanSpeed;
            }
            case  263 :
            {
                return ShieldCapacity;
            }
            case  264 :
            {
                return ShieldCharge;
            }
            case  271 :
            {
                return ShieldEmDamageResonance;
            }
            case  272 :
            {
                return ShieldExplosiveDamageResonance;
            }
            case  273 :
            {
                return ShieldKineticDamageResonance;
            }
            case  479 :
            {
                return ShieldRechargeRate;
            }
            case  274 :
            {
                return ShieldThermalDamageResonance;
            }
            case  484 :
            {
                return ShieldUniformity;
            }
            case  552 :
            {
                return SignatureRadius;
            }
            case  554 :
            {
                return SignatureRadiusBonus;
            }
            case  51 :
            {
                return Speed;
            }
            case  20 :
            {
                return SpeedFactor;
            }
            case  525 :
            {
                return StructureUniformity;
            }
            case  118 :
            {
                return ThermalDamage;
            }
            case  110 :
            {
                return ThermalDamageResonance;
            }
            case  160 :
            {
                return TrackingSpeed;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            case  505 :
            {
                return WarpScrambleDuration;
            }
            case  103 :
            {
                return WarpScrambleRange;
            }
            case  105 :
            {
                return WarpScrambleStrength;
            }
            case  600 :
            {
                return WarpSpeedMultiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<IrregularCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<IrregularCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/IrregularCruiser.yaml";
        private Map<String, IrregularCruiser> cache = (null);

        @Override
        public IMetaCategory<? super IrregularCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1665;
        }

        @Override
        public String getName() {
            return "IrregularCruiser";
        }

        @Override
        public synchronized Map<String, IrregularCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(IrregularCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, IrregularCruiser> types;
        }
    }
}
