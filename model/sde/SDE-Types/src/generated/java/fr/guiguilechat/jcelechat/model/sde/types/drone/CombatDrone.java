package fr.guiguilechat.jcelechat.model.sde.types.drone;

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
import fr.guiguilechat.jcelechat.model.sde.types.Drone;
import org.yaml.snakeyaml.Yaml;

public class CombatDrone
    extends Drone
{
    /**
     * Max Range for NPC Target Jam
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ECMRangeOptimal;
    /**
     * The agility of the object.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Agility;
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
     * Damage multiplier.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double DamageMultiplier;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EmDamage;
    /**
     * The distance from a target an entity starts using its weapons.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(15000)
    public int EntityAttackRange;
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
    @DefaultIntValue(1)
    public int EntityChaseMaxDelayChance;
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
    @DefaultIntValue(1)
    public int EntityChaseMaxDurationChance;
    /**
     * The speed that entities fly at when not chasing a target.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityCruiseSpeed;
    /**
     * The distance at which the entity orbits, follows.. and more.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(500.0)
    public double EntityFlyRange;
    /**
     * The type of missiles the entity launches.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityMissileTypeID;
    /**
     * How much security status is modified by for killing this entity.  Depending on the entity, this may be a positive or negative amount.
     * Value is a % movement of the character's current security towards the upper/lower limit.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntitySecurityStatusKillBonus;
    /**
     * Duration of NPC effect
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(30000)
    public int EntityTargetPaintDuration;
    /**
     * Chance of NPC effect to be activated each duration
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityTargetPaintDurationChance;
    /**
     * Fall Off for NPC Target Paint
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityTargetPaintFallOff;
    /**
     * Explosive damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ExplosiveDamage;
    /**
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(1)
    public int Falloff;
    /**
     * Graphic ID of the turrets for drone type ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int GfxTurretID;
    /**
     * Kinetic damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double KineticDamage;
    /**
     * The maximum number of their targets that the character can attack at a given time.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxAttackTargets;
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int MaxRange;
    /**
     * Authoring has been moved to FSD.
     * meta group of type
     * 
     *  3: Story-line (Cosmos)
     *  4: Faction
     *  5: Officer (rare asteroid NPCs)
     *  6: Deadspace
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaGroupID;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
    /**
     * The characters missile use efficiency, scales the damage missiles do.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double MissileDamageMultiplier;
    /**
     * Cycle time for a missile launch, in milliseconds.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(20000)
    public int MissileLaunchDuration;
    /**
     * Prefered target signature. The base signature radius at which the turret's tracking speed is rated. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1000)
    public int OptimalSigRadius;
    /**
     * scanning speed in milliseconds
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanSpeed;
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
     * Multiplies THERMAL damage taken by Shield. 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double ShieldThermalDamageResonance;
    /**
     * Time in milliseconds between possible activations
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int Speed;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ThermalDamage;
    /**
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeed;
    public static final CombatDrone.MetaGroup METAGROUP = new CombatDrone.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  936 :
            {
                return ECMRangeOptimal;
            }
            case  70 :
            {
                return Agility;
            }
            case  267 :
            {
                return ArmorEmDamageResonance;
            }
            case  268 :
            {
                return ArmorExplosiveDamageResonance;
            }
            case  269 :
            {
                return ArmorKineticDamageResonance;
            }
            case  270 :
            {
                return ArmorThermalDamageResonance;
            }
            case  64 :
            {
                return DamageMultiplier;
            }
            case  114 :
            {
                return EmDamage;
            }
            case  247 :
            {
                return EntityAttackRange;
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
            case  416 :
            {
                return EntityFlyRange;
            }
            case  507 :
            {
                return EntityMissileTypeID;
            }
            case  252 :
            {
                return EntitySecurityStatusKillBonus;
            }
            case  945 :
            {
                return EntityTargetPaintDuration;
            }
            case  935 :
            {
                return EntityTargetPaintDurationChance;
            }
            case  954 :
            {
                return EntityTargetPaintFallOff;
            }
            case  116 :
            {
                return ExplosiveDamage;
            }
            case  158 :
            {
                return Falloff;
            }
            case  245 :
            {
                return GfxTurretID;
            }
            case  117 :
            {
                return KineticDamage;
            }
            case  193 :
            {
                return MaxAttackTargets;
            }
            case  54 :
            {
                return MaxRange;
            }
            case  1692 :
            {
                return MetaGroupID;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  212 :
            {
                return MissileDamageMultiplier;
            }
            case  506 :
            {
                return MissileLaunchDuration;
            }
            case  620 :
            {
                return OptimalSigRadius;
            }
            case  79 :
            {
                return ScanSpeed;
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
            case  274 :
            {
                return ShieldThermalDamageResonance;
            }
            case  51 :
            {
                return Speed;
            }
            case  118 :
            {
                return ThermalDamage;
            }
            case  160 :
            {
                return TrackingSpeed;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<CombatDrone> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CombatDrone>
    {
        public static final String RESOURCE_PATH = "SDE/types/drone/CombatDrone.yaml";
        private Map<String, CombatDrone> cache = (null);

        @Override
        public IMetaCategory<? super CombatDrone> category() {
            return Drone.METACAT;
        }

        @Override
        public int getGroupId() {
            return  100;
        }

        @Override
        public String getName() {
            return "CombatDrone";
        }

        @Override
        public synchronized Map<String, CombatDrone> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(CombatDrone.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CombatDrone> types;
        }
    }
}
