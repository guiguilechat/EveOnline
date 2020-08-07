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
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ChargeSize;
import fr.guiguilechat.jcelechat.model.sde.attributes.EmDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.EntityFlyRangeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.ExplosiveDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.KineticDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.LauncherGroup;
import fr.guiguilechat.jcelechat.model.sde.attributes.MainColor;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MetaGroupID;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.TechLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.ThermalDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.TrackingSpeedMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.WeaponRangeMultiplier;
import fr.guiguilechat.jcelechat.model.sde.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class ProjectileAmmo
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
    public int metagroupid;
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
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {ChargeSize.INSTANCE, Radius.INSTANCE, BaseShieldDamage.INSTANCE, Mass.INSTANCE, BaseArmorDamage.INSTANCE, TechLevel.INSTANCE, Capacity.INSTANCE, LauncherGroup.INSTANCE, EntityFlyRangeMultiplier.INSTANCE, EmDamage.INSTANCE, ExplosiveDamage.INSTANCE, TrackingSpeedMultiplier.INSTANCE, KineticDamage.INSTANCE, ThermalDamage.INSTANCE, WeaponRangeMultiplier.INSTANCE, MainColor.INSTANCE, MetaGroupID.INSTANCE })));
    public static final ProjectileAmmo.MetaGroup METAGROUP = new ProjectileAmmo.MetaGroup();

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
            case  1692 :
            {
                return metagroupid;
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
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<ProjectileAmmo> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<ProjectileAmmo>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/ProjectileAmmo.yaml";
        private Map<String, ProjectileAmmo> cache = (null);

        @Override
        public IMetaCategory<? super ProjectileAmmo> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  83;
        }

        @Override
        public String getName() {
            return "ProjectileAmmo";
        }

        @Override
        public synchronized Map<String, ProjectileAmmo> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(ProjectileAmmo.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, ProjectileAmmo> types;
        }
    }
}
