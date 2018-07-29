package fr.guiguilechat.jcelechat.model.sde.items.types.charge;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Charge;

public class StructureAntiSubcapitalMissile
    extends Charge
{
    /**
     * The agility of the object.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Agility;
    /**
     * Determines wether a missile launches aligned with the ship (0) or directly at the target (1).
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AimedLaunch;
    /**
     * Size of the damage cloud caused by impact.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int AoeCloudSize;
    /**
     * Missile Damage Modifier. Smaller is better (Don't use less than 0.5)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double AoeDamageReductionFactor;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AoeFalloff;
    /**
     * Velocity of the damage cloud created on impact.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double AoeVelocity;
    /**
     * the range in meters for an object to trigger detonation of missile. (own ship excluded)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DetonationRange;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EmDamage;
    /**
     * The amount of milliseconds before the object explodes.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ExplosionDelay;
    /**
     * Explosive damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ExplosiveDamage;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Kinetic damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double KineticDamage;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * Maximum velocity of ship
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double MaxVelocity;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int StructureItemVisualFlag;
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
    public final static String RESOURCE_PATH = "SDE/items/charge/StructureAntiSubcapitalMissile.yaml";
    private static LinkedHashMap<String, StructureAntiSubcapitalMissile> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  70 :
            {
                return Agility;
            }
            case  644 :
            {
                return AimedLaunch;
            }
            case  654 :
            {
                return AoeCloudSize;
            }
            case  1353 :
            {
                return AoeDamageReductionFactor;
            }
            case  655 :
            {
                return AoeFalloff;
            }
            case  653 :
            {
                return AoeVelocity;
            }
            case  108 :
            {
                return DetonationRange;
            }
            case  114 :
            {
                return EmDamage;
            }
            case  281 :
            {
                return ExplosionDelay;
            }
            case  116 :
            {
                return ExplosiveDamage;
            }
            case  9 :
            {
                return Hp;
            }
            case  117 :
            {
                return KineticDamage;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  37 :
            {
                return MaxVelocity;
            }
            case  2334 :
            {
                return StructureItemVisualFlag;
            }
            case  525 :
            {
                return StructureUniformity;
            }
            case  118 :
            {
                return ThermalDamage;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1547;
    }

    @Override
    public Class<?> getGroup() {
        return StructureAntiSubcapitalMissile.class;
    }

    public static synchronized LinkedHashMap<String, StructureAntiSubcapitalMissile> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StructureAntiSubcapitalMissile.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StructureAntiSubcapitalMissile> items;
    }
}