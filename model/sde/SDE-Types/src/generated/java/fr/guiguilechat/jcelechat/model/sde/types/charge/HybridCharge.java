package fr.guiguilechat.jcelechat.model.sde.types.charge;

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
import fr.guiguilechat.jcelechat.model.sde.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class HybridCharge
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
    public static final HybridCharge.MetaGroup METAGROUP = new HybridCharge.MetaGroup();

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
    public IMetaGroup<HybridCharge> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<HybridCharge>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/HybridCharge.yaml";
        private Map<String, HybridCharge> cache = (null);

        @Override
        public IMetaCategory<? super HybridCharge> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  85;
        }

        @Override
        public String getName() {
            return "HybridCharge";
        }

        @Override
        public synchronized Map<String, HybridCharge> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(HybridCharge.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, HybridCharge> types;
        }
    }
}