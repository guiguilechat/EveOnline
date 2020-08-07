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
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFlyRangeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosiveDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.KineticDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.LauncherGroup;
import fr.guiguilechat.jcelechat.model.sde.attributes.MainColor;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.TechLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.ThermalDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.WeaponRangeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class CondenserPack
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
     * Multiplier of range the relevant weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double weaponrangemultiplier;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {ChargeSize.INSTANCE, Radius.INSTANCE, BaseShieldDamage.INSTANCE, Mass.INSTANCE, BaseArmorDamage.INSTANCE, TechLevel.INSTANCE, Capacity.INSTANCE, LauncherGroup.INSTANCE, EntityFlyRangeMultiplier.INSTANCE, EmDamage.INSTANCE, ExplosiveDamage.INSTANCE, KineticDamage.INSTANCE, ThermalDamage.INSTANCE, WeaponRangeMultiplier.INSTANCE, MainColor.INSTANCE, CapNeedBonus.INSTANCE })));
    public static final CondenserPack.MetaGroup METAGROUP = new CondenserPack.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
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
            case  422 :
            {
                return techlevel;
            }
            case  118 :
            {
                return thermaldamage;
            }
            case  120 :
            {
                return weaponrangemultiplier;
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
    public IMetaGroup<CondenserPack> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CondenserPack>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/CondenserPack.yaml";
        private Map<String, CondenserPack> cache = (null);

        @Override
        public IMetaCategory<? super CondenserPack> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  4062;
        }

        @Override
        public String getName() {
            return "CondenserPack";
        }

        @Override
        public synchronized Map<String, CondenserPack> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(CondenserPack.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CondenserPack> types;
        }
    }
}
