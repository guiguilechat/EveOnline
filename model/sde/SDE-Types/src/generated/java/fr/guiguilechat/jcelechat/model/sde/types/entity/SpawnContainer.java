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

public class SpawnContainer
    extends Entity
{
    /**
     * The difficulty in opening this object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AccessDifficulty;
    /**
     * When set to 1 this attribute allows Spawn Containers to refill and relock. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AllowRefills;
    /**
     * The number of hit points on the entities armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorHP;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorUniformity;
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
     * If this module is in use and this attribute is 1, then assistance modules cannot be used on the ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowAssistance;
    /**
     * The distance from a target an entity starts using its weapons.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(15000)
    public int EntityAttackRange;
    /**
     * The distance outside of which the entity activates their MWD equivalent.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(2500)
    public int EntityChaseMaxDistance;
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
     * The distance at which the entity orbits, follows.. and more.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(500.0)
    public double EntityFlyRange;
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
     * How much security status is modified by for killing this entity.  Depending on the entity, this may be a positive or negative amount.
     * Value is a % movement of the character's current security towards the upper/lower limit.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EntitySecurityStatusKillBonus;
    /**
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(1.0)
    public double Falloff;
    /**
     * Defines whether an entity can be hacked or not.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hackable;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Hp;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int IsArcheology;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int IsHacking;
    /**
     * The number of milliseconds before the container replenishes the loot inside itself.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(600000.0)
    public double LootRespawnTime;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Mass;
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double MaxRange;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Radius;
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
     * Amount of time taken to fully recharge the shield.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldRechargeRate;
    /**
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(100.0)
    public double SignatureRadius;
    /**
     * Whether a spawn container should refill itself when there are no guards assigned to it.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SpawnWithoutGuardsToo;
    /**
     * The number of milliseconds before the container replenishes the loot inside itself. This special tutorial attribute will allow re-spawning of items in distribution dungeons bypassing restrictions present. 10 second minimum (10000 ms).
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(30000)
    public int SpecialTutorialLootRespawnTime;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double StructureUniformity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int TierDifficulty;
    /**
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeed;
    public static final SpawnContainer.MetaGroup METAGROUP = new SpawnContainer.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  901 :
            {
                return AccessDifficulty;
            }
            case  2019 :
            {
                return AllowRefills;
            }
            case  265 :
            {
                return ArmorHP;
            }
            case  524 :
            {
                return ArmorUniformity;
            }
            case  482 :
            {
                return CapacitorCapacity;
            }
            case  38 :
            {
                return Capacity;
            }
            case  854 :
            {
                return DisallowAssistance;
            }
            case  247 :
            {
                return EntityAttackRange;
            }
            case  665 :
            {
                return EntityChaseMaxDistance;
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
            case  416 :
            {
                return EntityFlyRange;
            }
            case  251 :
            {
                return EntityLootCountMax;
            }
            case  250 :
            {
                return EntityLootCountMin;
            }
            case  252 :
            {
                return EntitySecurityStatusKillBonus;
            }
            case  158 :
            {
                return Falloff;
            }
            case  1927 :
            {
                return Hackable;
            }
            case  9 :
            {
                return Hp;
            }
            case  1331 :
            {
                return IsArcheology;
            }
            case  1330 :
            {
                return IsHacking;
            }
            case  470 :
            {
                return LootRespawnTime;
            }
            case  4 :
            {
                return Mass;
            }
            case  54 :
            {
                return MaxRange;
            }
            case  162 :
            {
                return Radius;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  263 :
            {
                return ShieldCapacity;
            }
            case  264 :
            {
                return ShieldCharge;
            }
            case  479 :
            {
                return ShieldRechargeRate;
            }
            case  552 :
            {
                return SignatureRadius;
            }
            case  903 :
            {
                return SpawnWithoutGuardsToo;
            }
            case  1582 :
            {
                return SpecialTutorialLootRespawnTime;
            }
            case  525 :
            {
                return StructureUniformity;
            }
            case  1919 :
            {
                return TierDifficulty;
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
    public IMetaGroup<SpawnContainer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SpawnContainer>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/SpawnContainer.yaml";
        private Map<String, SpawnContainer> cache = (null);

        @Override
        public IMetaCategory<? super SpawnContainer> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  306;
        }

        @Override
        public String getName() {
            return "SpawnContainer";
        }

        @Override
        public synchronized Map<String, SpawnContainer> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SpawnContainer.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SpawnContainer> types;
        }
    }
}
