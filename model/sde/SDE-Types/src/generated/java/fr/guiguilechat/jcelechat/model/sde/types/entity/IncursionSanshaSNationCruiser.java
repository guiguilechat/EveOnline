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
import fr.guiguilechat.jcelechat.model.sde.attributes.AIChanceToNotTargetSwitch;
import fr.guiguilechat.jcelechat.model.sde.attributes.AIPreferredSignatureRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.AIShouldUseEffectMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.AIShouldUseSecondaryTarget;
import fr.guiguilechat.jcelechat.model.sde.attributes.AIShouldUseSignatureRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.AIShouldUseTargetSwitching;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorEmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorHP;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorKineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorThermalDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ArmorUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapacitorCapacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Charge;
import fr.guiguilechat.jcelechat.model.sde.attributes.DamageMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.DisallowAssistance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMEntityChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMRangeFalloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.ECMRangeOptimal;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamage;
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
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentMax;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityEquipmentMin;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFactionLoss;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFlyRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupArmorResistanceActivationChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupArmorResistanceBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupArmorResistanceDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupPropJamActivationChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupPropJamBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupPropJamDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupRespawnChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupShieldResistanceActivationChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupShieldResistanceBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupShieldResistanceDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupSpeedActivationChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupSpeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityGroupSpeedDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityLootCountMin;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityMissileTypeID;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityOverviewShipGroupId;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityReactionFactor;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntitySecurityMaxGain;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntitySecurityStatusKillBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityShieldBoostAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityShieldBoostDelayChanceMedium;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityShieldBoostDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityTargetJam;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityWarpScrambleChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.Falloff;
import fr.guiguilechat.jcelechat.model.sde.attributes.GfxBoosterID;
import fr.guiguilechat.jcelechat.model.sde.attributes.GfxTurretID;
import fr.guiguilechat.jcelechat.model.sde.attributes.Hp;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxAttackTargets;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxLockedTargets;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxVelocity;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileDamageMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileEntityAoeCloudSizeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileEntityAoeVelocityMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileEntityFlightTimeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileEntityVelocityMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.MissileLaunchDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.ModifyTargetSpeedChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ModifyTargetSpeedDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.ModifyTargetSpeedRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcAssistanceRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcRemoteShieldBoostAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcRemoteShieldBoostChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcRemoteShieldBoostDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcRemoteShieldBoostMaxTargets;
import fr.guiguilechat.jcelechat.model.sde.attributes.NpcRemoteShieldBoostThreshold;
import fr.guiguilechat.jcelechat.model.sde.attributes.OptimalSigRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.PropulsionGraphicID;
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
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldCapacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldCharge;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldEmDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldExplosiveDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldKineticDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldRechargeRate;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldThermalDamageResonance;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.SignatureRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.SignatureRadiusBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Speed;
import fr.guiguilechat.jcelechat.model.sde.attributes.SpeedFactor;
import fr.guiguilechat.jcelechat.model.sde.attributes.StructureUniformity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ThermalDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.TrackingSpeed;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleDuration;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleRange;
import fr.guiguilechat.jcelechat.model.sde.attributes.WarpScrambleStrength;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class IncursionSanshaSNationCruiser
    extends Entity
{
    /**
     * A percentage chance to not change targets 0.0 - 1.0. 1.0 they will never change targets 0.0 they will always change targets
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double aichancetonottargetswitch;
    /**
     * The Preferred signature radius for attack. If it is 0 or below it uses the ships signature radius instead.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(-1)
    public int aipreferredsignatureradius;
    /**
     * Should the entity watch for effects when choosing targets
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int aishoulduseeffectmultiplier;
    /**
     * Should use secondary effect on other targets?
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int aishouldusesecondarytarget;
    /**
     * Should this type use signature radius
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int aishouldusesignatureradius;
    /**
     * This controls how L1 AI target switches
     * When disabled AI_ChanceToNotTargetSwitch, AI_ShouldUseEffectMultiplier, and AI_ShouldUseSignatureRadius are disabled also.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int aishouldusetargetswitching;
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
     * Capacitor capacity
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacitorcapacity;
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
     * If this module is in use and this attribute is 1, then assistance modules cannot be used on the ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int disallowassistance;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double emdamage;
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
     * Activation chance for NPCGroupArmorAssist effect.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entitygrouparmorresistanceactivationchance;
    /**
     * Amount of armor resistance bonus. Used by NPCGroupArmorAssist. Negative values is a bonus so e.g. -20 is a 20% bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitygrouparmorresistancebonus;
    /**
     * Duration of NPCGroupArmorAssist effect.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000)
    public int entitygrouparmorresistanceduration;
    /**
     * Activation chance of NPCGroupPropJamAssist effect.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entitygrouppropjamactivationchance;
    /**
     * Amount of propulsion jamming assist. Used by NPCGroupPropJamAssist. Negative values is a bonus so e.g. -20 is a 20% bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitygrouppropjambonus;
    /**
     * Duration of NPCGroupPropJamAssist effect.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000)
    public int entitygrouppropjamduration;
    /**
     * The chance an entity will respawn into his group if destroyed.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entitygrouprespawnchance;
    /**
     * Activation chance of the NPCGroupShieldAssist effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entitygroupshieldresistanceactivationchance;
    /**
     * Bonus applied to all NPCs in the same group. Used by the NPCGroupShieldAssist effect. Negative values is a bonus so e.g. -20 is a 20% bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitygroupshieldresistancebonus;
    /**
     * Duration for the NPCGroupShieldAssist effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000)
    public int entitygroupshieldresistanceduration;
    /**
     * Activation chance for NPCGroupSpeedAssist effect.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int entitygroupspeedactivationchance;
    /**
     * amount of speed increase by NPCGroupSpeedAssist effect. Negative values is a bonus so e.g. -20 is a 20% bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitygroupspeedbonus;
    /**
     * Duration of NPCGroupArmorAssist effect.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000)
    public int entitygroupspeedduration;
    /**
     * Deprecated. The minimum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitylootcountmin;
    /**
     * The type of missiles the entity launches.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entitymissiletypeid;
    /**
     * This attribute is used on entities to link them to a player ship group. This is then used to determine which overview icon they should get, among other things
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int entityoverviewshipgroupid;
    /**
     * The chance of an entity attacking the same person as its group members.  Scales delay in joining in on fights too.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double entityreactionfactor;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entitysecuritymaxgain;
    /**
     * How much security status is modified by for killing this entity.  Depending on the entity, this may be a positive or negative amount.
     * Value is a % movement of the character's current security towards the upper/lower limit.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entitysecuritystatuskillbonus;
    /**
     * How much the shield is boosted each duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entityshieldboostamount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double entityshieldboostdelaychancemedium;
    /**
     * How long between repeats.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000)
    public int entityshieldboostduration;
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
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double falloff;
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
    @DefaultDoubleValue(0.0)
    public double hp;
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
     * Maximum velocity of ship
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double maxvelocity;
    /**
     * The characters missile use efficiency, scales the damage missiles do.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double missiledamagemultiplier;
    /**
     * Affects the signature radius of the target in missile impact calculations.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double missileentityaoecloudsizemultiplier;
    /**
     * Affects the velocity of the target in missile impact calculations.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double missileentityaoevelocitymultiplier;
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
     * Cycle time for a missile launch, in milliseconds.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(20000.0)
    public double missilelaunchduration;
    /**
     * Chance that  an entity will use a Stasis Web on a target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double modifytargetspeedchance;
    /**
     * Duration of entities Stasis Web 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(5000.0)
    public double modifytargetspeedduration;
    /**
     * Range of entities Stasis Web
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(20000)
    public int modifytargetspeedrange;
    /**
     * Maximum distance to a friendly NPC so that remote repairs may be performed on it.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(5000)
    public int npcassistancerange;
    /**
     * How many shields points does the activation of the effect bestow upon the target
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(50)
    public int npcremoteshieldboostamount;
    /**
     * Chance of the remote shield boosting effect being used
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int npcremoteshieldboostchance;
    /**
     * Duration of shield boost effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(20000)
    public int npcremoteshieldboostduration;
    /**
     * The maximum number of targets that can be shield boosted at once
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int npcremoteshieldboostmaxtargets;
    /**
     * How damaged does a teammates shield need to be before it'll be repaired.
     *  0.1 means: Must be below 90% shields to get repairs
     *  0.9 means: Must be below 10% shields to get repairs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.75)
    public double npcremoteshieldboostthreshold;
    /**
     * Prefered target signature. The base signature radius at which the turret's tracking speed is rated. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1000)
    public int optimalsigradius;
    /**
     * The graphicID of the propulsion system.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int propulsiongraphicid;
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
     * Autogenerated skill attribute, signatureRadiusBonus
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double signatureradiusbonus;
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
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double trackingspeed;
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
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {ModifyTargetSpeedChance.INSTANCE, ModifyTargetSpeedDuration.INSTANCE, ModifyTargetSpeedRange.INSTANCE, Mass.INSTANCE, ShieldCapacity.INSTANCE, ShieldCharge.INSTANCE, Hp.INSTANCE, ArmorHP.INSTANCE, ArmorEmDamageResonance.INSTANCE, ArmorExplosiveDamageResonance.INSTANCE, ArmorUniformity.INSTANCE, ArmorKineticDamageResonance.INSTANCE, StructureUniformity.INSTANCE, ArmorThermalDamageResonance.INSTANCE, ShieldEmDamageResonance.INSTANCE, ShieldExplosiveDamageResonance.INSTANCE, ShieldKineticDamageResonance.INSTANCE, ShieldThermalDamageResonance.INSTANCE, Charge.INSTANCE, SpeedFactor.INSTANCE, EntityBracketColour.INSTANCE, MaxVelocity.INSTANCE, Capacity.INSTANCE, SignatureRadius.INSTANCE, SignatureRadiusBonus.INSTANCE, EntityFactionLoss.INSTANCE, Speed.INSTANCE, EntitySecurityMaxGain.INSTANCE, ScanResolution.INSTANCE, MaxRange.INSTANCE, RechargeRate.INSTANCE, DamageMultiplier.INSTANCE, EntityChaseMaxDelay.INSTANCE, EntityChaseMaxDelayChance.INSTANCE, EntityChaseMaxDuration.INSTANCE, EntityChaseMaxDurationChance.INSTANCE, DisallowAssistance.INSTANCE, MissileEntityAoeCloudSizeMultiplier.INSTANCE, MissileEntityAoeVelocityMultiplier.INSTANCE, WarpScrambleRange.INSTANCE, WarpScrambleStrength.INSTANCE, OptimalSigRadius.INSTANCE, AIShouldUseTargetSwitching.INSTANCE, AIShouldUseSecondaryTarget.INSTANCE, AIShouldUseSignatureRadius.INSTANCE, EmDamage.INSTANCE, AIChanceToNotTargetSwitch.INSTANCE, AIShouldUseEffectMultiplier.INSTANCE, ThermalDamage.INSTANCE, AIPreferredSignatureRadius.INSTANCE, EntityShieldBoostDuration.INSTANCE, EntityShieldBoostAmount.INSTANCE, EntityGroupRespawnChance.INSTANCE, MissileEntityVelocityMultiplier.INSTANCE, MissileEntityFlightTimeMultiplier.INSTANCE, EntityGroupShieldResistanceBonus.INSTANCE, EntityGroupShieldResistanceDuration.INSTANCE, EntityGroupShieldResistanceActivationChance.INSTANCE, EntityGroupSpeedBonus.INSTANCE, EntityGroupPropJamBonus.INSTANCE, EntityGroupArmorResistanceBonus.INSTANCE, EntityGroupSpeedDuration.INSTANCE, EntityGroupSpeedActivationChance.INSTANCE, EntityGroupPropJamDuration.INSTANCE, EntityGroupPropJamActivationChance.INSTANCE, EntityGroupArmorResistanceDuration.INSTANCE, EntityGroupArmorResistanceActivationChance.INSTANCE, EntityChaseMaxDistance.INSTANCE, Falloff.INSTANCE, TrackingSpeed.INSTANCE, EntityFlyRange.INSTANCE, EntityTargetJam.INSTANCE, ECMDuration.INSTANCE, Radius.INSTANCE, ECMEntityChance.INSTANCE, ECMRangeOptimal.INSTANCE, NpcRemoteShieldBoostDuration.INSTANCE, NpcRemoteShieldBoostChance.INSTANCE, NpcRemoteShieldBoostAmount.INSTANCE, NpcRemoteShieldBoostThreshold.INSTANCE, NpcAssistanceRange.INSTANCE, ECMRangeFalloff.INSTANCE, MaxLockedTargets.INSTANCE, MaxAttackTargets.INSTANCE, EntityEquipmentMin.INSTANCE, EntityEquipmentMax.INSTANCE, ScanRadarStrength.INSTANCE, ScanLadarStrength.INSTANCE, EntityReactionFactor.INSTANCE, ScanMagnetometricStrength.INSTANCE, ScanGravimetricStrength.INSTANCE, MissileDamageMultiplier.INSTANCE, PropulsionGraphicID.INSTANCE, EntityAttackDelayMin.INSTANCE, EntityAttackDelayMax.INSTANCE, NpcRemoteShieldBoostMaxTargets.INSTANCE, ShieldRechargeRate.INSTANCE, CapacitorCapacity.INSTANCE, ShieldUniformity.INSTANCE, EntityOverviewShipGroupId.INSTANCE, ScanGravimetricStrengthBonus.INSTANCE, EntityShieldBoostDelayChanceMedium.INSTANCE, ScanLadarStrengthBonus.INSTANCE, ScanMagnetometricStrengthBonus.INSTANCE, ScanRadarStrengthBonus.INSTANCE, GfxTurretID.INSTANCE, GfxBoosterID.INSTANCE, EntityAttackRange.INSTANCE, EntityWarpScrambleChance.INSTANCE, WarpScrambleDuration.INSTANCE, MissileLaunchDuration.INSTANCE, EntityLootCountMin.INSTANCE, EntityMissileTypeID.INSTANCE, EntityCruiseSpeed.INSTANCE, EntitySecurityStatusKillBonus.INSTANCE })));
    public static final IncursionSanshaSNationCruiser.MetaGroup METAGROUP = new IncursionSanshaSNationCruiser.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  1651 :
            {
                return aichancetonottargetswitch;
            }
            case  1655 :
            {
                return aipreferredsignatureradius;
            }
            case  1652 :
            {
                return aishoulduseeffectmultiplier;
            }
            case  1649 :
            {
                return aishouldusesecondarytarget;
            }
            case  1650 :
            {
                return aishouldusesignatureradius;
            }
            case  1648 :
            {
                return aishouldusetargetswitching;
            }
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
            case  854 :
            {
                return disallowassistance;
            }
            case  114 :
            {
                return emdamage;
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
            case  1682 :
            {
                return entitygrouparmorresistanceactivationchance;
            }
            case  1676 :
            {
                return entitygrouparmorresistancebonus;
            }
            case  1681 :
            {
                return entitygrouparmorresistanceduration;
            }
            case  1680 :
            {
                return entitygrouppropjamactivationchance;
            }
            case  1675 :
            {
                return entitygrouppropjambonus;
            }
            case  1679 :
            {
                return entitygrouppropjamduration;
            }
            case  640 :
            {
                return entitygrouprespawnchance;
            }
            case  1673 :
            {
                return entitygroupshieldresistanceactivationchance;
            }
            case  1671 :
            {
                return entitygroupshieldresistancebonus;
            }
            case  1672 :
            {
                return entitygroupshieldresistanceduration;
            }
            case  1678 :
            {
                return entitygroupspeedactivationchance;
            }
            case  1674 :
            {
                return entitygroupspeedbonus;
            }
            case  1677 :
            {
                return entitygroupspeedduration;
            }
            case  250 :
            {
                return entitylootcountmin;
            }
            case  507 :
            {
                return entitymissiletypeid;
            }
            case  1766 :
            {
                return entityoverviewshipgroupid;
            }
            case  466 :
            {
                return entityreactionfactor;
            }
            case  563 :
            {
                return entitysecuritymaxgain;
            }
            case  252 :
            {
                return entitysecuritystatuskillbonus;
            }
            case  637 :
            {
                return entityshieldboostamount;
            }
            case  1007 :
            {
                return entityshieldboostdelaychancemedium;
            }
            case  636 :
            {
                return entityshieldboostduration;
            }
            case  928 :
            {
                return entitytargetjam;
            }
            case  504 :
            {
                return entitywarpscramblechance;
            }
            case  158 :
            {
                return falloff;
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
            case  37 :
            {
                return maxvelocity;
            }
            case  212 :
            {
                return missiledamagemultiplier;
            }
            case  858 :
            {
                return missileentityaoecloudsizemultiplier;
            }
            case  859 :
            {
                return missileentityaoevelocitymultiplier;
            }
            case  646 :
            {
                return missileentityflighttimemultiplier;
            }
            case  645 :
            {
                return missileentityvelocitymultiplier;
            }
            case  506 :
            {
                return missilelaunchduration;
            }
            case  512 :
            {
                return modifytargetspeedchance;
            }
            case  513 :
            {
                return modifytargetspeedduration;
            }
            case  514 :
            {
                return modifytargetspeedrange;
            }
            case  1464 :
            {
                return npcassistancerange;
            }
            case  1460 :
            {
                return npcremoteshieldboostamount;
            }
            case  1459 :
            {
                return npcremoteshieldboostchance;
            }
            case  1458 :
            {
                return npcremoteshieldboostduration;
            }
            case  1502 :
            {
                return npcremoteshieldboostmaxtargets;
            }
            case  1462 :
            {
                return npcremoteshieldboostthreshold;
            }
            case  620 :
            {
                return optimalsigradius;
            }
            case  217 :
            {
                return propulsiongraphicid;
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
            case  554 :
            {
                return signatureradiusbonus;
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
            case  160 :
            {
                return trackingspeed;
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
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<IncursionSanshaSNationCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<IncursionSanshaSNationCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/IncursionSanshaSNationCruiser.yaml";
        private Map<String, IncursionSanshaSNationCruiser> cache = (null);

        @Override
        public IMetaCategory<? super IncursionSanshaSNationCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1054;
        }

        @Override
        public String getName() {
            return "IncursionSanshaSNationCruiser";
        }

        @Override
        public synchronized Map<String, IncursionSanshaSNationCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(IncursionSanshaSNationCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, IncursionSanshaSNationCruiser> types;
        }
    }
}
