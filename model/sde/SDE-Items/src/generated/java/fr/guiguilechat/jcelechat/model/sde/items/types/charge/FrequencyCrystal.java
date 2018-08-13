package fr.guiguilechat.jcelechat.model.sde.items.types.charge;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class FrequencyCrystal
    extends Charge
{
    /**
     * Just for the UI to display base damage on armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BaseArmorDamage;
    /**
     * Just for the UI to display base damage on shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BaseShieldDamage;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
    /**
     * The chance of damage to the crystal each time it is used.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CrystalVolatilityChance;
    /**
     * The amount of damage done if the crystal is damaged in the process of using it.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CrystalVolatilityDamage;
    /**
     * Whether this tool causes damage to crystals with each use of them.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CrystalsGetDamaged;
    /**
     * current structure damage dealt to module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Damage;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EmDamage;
    /**
     * For charges, hidden attribute used by sentry guns to modify target pick range.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double EntityFlyRangeMultiplier;
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
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MainColor;
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
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ThermalDamage;
    /**
     * Multiplier of range the relevant weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double WeaponRangeMultiplier;
    public final static String RESOURCE_PATH = "SDE/items/charge/FrequencyCrystal.yaml";
    private static Map<String, FrequencyCrystal> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  613 :
            {
                return BaseArmorDamage;
            }
            case  612 :
            {
                return BaseShieldDamage;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  128 :
            {
                return ChargeSize;
            }
            case  783 :
            {
                return CrystalVolatilityChance;
            }
            case  784 :
            {
                return CrystalVolatilityDamage;
            }
            case  786 :
            {
                return CrystalsGetDamaged;
            }
            case  3 :
            {
                return Damage;
            }
            case  114 :
            {
                return EmDamage;
            }
            case  779 :
            {
                return EntityFlyRangeMultiplier;
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
            case  124 :
            {
                return MainColor;
            }
            case  1692 :
            {
                return MetaGroupID;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  118 :
            {
                return ThermalDamage;
            }
            case  120 :
            {
                return WeaponRangeMultiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  86;
    }

    @Override
    public Class<?> getGroup() {
        return FrequencyCrystal.class;
    }

    public static synchronized Map<String, FrequencyCrystal> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FrequencyCrystal.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, FrequencyCrystal> items;
    }
}
