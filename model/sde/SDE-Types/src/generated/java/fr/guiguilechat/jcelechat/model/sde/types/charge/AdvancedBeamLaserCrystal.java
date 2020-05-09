package fr.guiguilechat.jcelechat.model.sde.types.charge;

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
import fr.guiguilechat.jcelechat.model.sde.attributes.BaseArmorDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.BaseShieldDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapNeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ChargeSize;
import fr.guiguilechat.jcelechat.model.sde.attributes.CrystalVolatilityChance;
import fr.guiguilechat.jcelechat.model.sde.attributes.CrystalVolatilityDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.CrystalsGetDamaged;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFlyRangeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosiveDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.Hp;
import fr.guiguilechat.jcelechat.model.sde.attributes.KineticDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.LauncherGroup;
import fr.guiguilechat.jcelechat.model.sde.attributes.MainColor;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MetaLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1Level;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldCapacityMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.SignatureRadiusMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.SpeedMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.TechLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.ThermalDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.TrackingSpeedMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.WeaponRangeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class AdvancedBeamLaserCrystal
    extends Charge
{
    /**
     * Just for the UI to display base damage on armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int basearmordamage;
    /**
     * Just for the UI to display base damage on shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int baseshielddamage;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int capneedbonus;
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int chargesize;
    /**
     * The chance of damage to the crystal each time it is used.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double crystalvolatilitychance;
    /**
     * The amount of damage done if the crystal is damaged in the process of using it.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double crystalvolatilitydamage;
    /**
     * Whether this tool causes damage to crystals with each use of them.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int crystalsgetdamaged;
    /**
     * EM damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double emdamage;
    /**
     * For charges, hidden attribute used by sentry guns to modify target pick range.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double entityflyrangemultiplier;
    /**
     * Explosive damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double explosivedamage;
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
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int launchergroup;
    /**
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int maincolor;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int metalevel;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int requiredskill1;
    /**
     * Required skill level for skill 1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int requiredskill1level;
    /**
     * Multiplier to the capacity of a shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double shieldcapacitymultiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double signatureradiusmultiplier;
    /**
     * Typically scales the firing speed of a weapon.  Reducing speed means faster, strangely..
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double speedmultiplier;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int techlevel;
    /**
     * Thermal damage done.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double thermaldamage;
    /**
     * Scale the tracking speed of a weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double trackingspeedmultiplier;
    /**
     * Multiplier of range the relevant weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double weaponrangemultiplier;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {ChargeSize.INSTANCE, Mass.INSTANCE, Hp.INSTANCE, LauncherGroup.INSTANCE, EntityFlyRangeMultiplier.INSTANCE, SignatureRadiusMultiplier.INSTANCE, SpeedMultiplier.INSTANCE, CrystalVolatilityChance.INSTANCE, CrystalVolatilityDamage.INSTANCE, ShieldCapacityMultiplier.INSTANCE, CrystalsGetDamaged.INSTANCE, RequiredSkill1Level.INSTANCE, Radius.INSTANCE, BaseShieldDamage.INSTANCE, BaseArmorDamage.INSTANCE, TechLevel.INSTANCE, Capacity.INSTANCE, EmDamage.INSTANCE, TrackingSpeedMultiplier.INSTANCE, ExplosiveDamage.INSTANCE, KineticDamage.INSTANCE, RequiredSkill1 .INSTANCE, ThermalDamage.INSTANCE, WeaponRangeMultiplier.INSTANCE, MetaLevel.INSTANCE, MainColor.INSTANCE, CapNeedBonus.INSTANCE })));
    public static final AdvancedBeamLaserCrystal.MetaGroup METAGROUP = new AdvancedBeamLaserCrystal.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  613 :
            {
                return basearmordamage;
            }
            case  612 :
            {
                return baseshielddamage;
            }
            case  317 :
            {
                return capneedbonus;
            }
            case  128 :
            {
                return chargesize;
            }
            case  783 :
            {
                return crystalvolatilitychance;
            }
            case  784 :
            {
                return crystalvolatilitydamage;
            }
            case  786 :
            {
                return crystalsgetdamaged;
            }
            case  114 :
            {
                return emdamage;
            }
            case  779 :
            {
                return entityflyrangemultiplier;
            }
            case  116 :
            {
                return explosivedamage;
            }
            case  9 :
            {
                return hp;
            }
            case  117 :
            {
                return kineticdamage;
            }
            case  137 :
            {
                return launchergroup;
            }
            case  124 :
            {
                return maincolor;
            }
            case  633 :
            {
                return metalevel;
            }
            case  182 :
            {
                return requiredskill1;
            }
            case  277 :
            {
                return requiredskill1level;
            }
            case  146 :
            {
                return shieldcapacitymultiplier;
            }
            case  652 :
            {
                return signatureradiusmultiplier;
            }
            case  204 :
            {
                return speedmultiplier;
            }
            case  422 :
            {
                return techlevel;
            }
            case  118 :
            {
                return thermaldamage;
            }
            case  244 :
            {
                return trackingspeedmultiplier;
            }
            case  120 :
            {
                return weaponrangemultiplier;
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
    public IMetaGroup<AdvancedBeamLaserCrystal> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AdvancedBeamLaserCrystal>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/AdvancedBeamLaserCrystal.yaml";
        private Map<String, AdvancedBeamLaserCrystal> cache = (null);

        @Override
        public IMetaCategory<? super AdvancedBeamLaserCrystal> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  374;
        }

        @Override
        public String getName() {
            return "AdvancedBeamLaserCrystal";
        }

        @Override
        public synchronized Map<String, AdvancedBeamLaserCrystal> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AdvancedBeamLaserCrystal.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AdvancedBeamLaserCrystal> types;
        }
    }
}
