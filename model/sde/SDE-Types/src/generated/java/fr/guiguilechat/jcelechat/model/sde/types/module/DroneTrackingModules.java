package fr.guiguilechat.jcelechat.model.sde.types.module;

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
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultRealValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.AoeCloudSizeBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.AoeVelocityBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapacitorNeed;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ChargeGroup1;
import fr.guiguilechat.jcelechat.model.sde.attributes.ChargeSize;
import fr.guiguilechat.jcelechat.model.sde.attributes.Cpu;
import fr.guiguilechat.jcelechat.model.sde.attributes.Duration;
import fr.guiguilechat.jcelechat.model.sde.attributes.FalloffBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.HeatAbsorbtionRateModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.HeatDamage;
import fr.guiguilechat.jcelechat.model.sde.attributes.Hp;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxRangeBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.MetaGroupID;
import fr.guiguilechat.jcelechat.model.sde.attributes.MetaLevelOld;
import fr.guiguilechat.jcelechat.model.sde.attributes.OverloadTrackingModuleStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Power;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.ReloadTime;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1Level;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredThermoDynamicsSkill;
import fr.guiguilechat.jcelechat.model.sde.attributes.TechLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.TrackingSpeedBonus;
import fr.guiguilechat.jcelechat.model.sde.types.Module;
import org.yaml.snakeyaml.Yaml;

public class DroneTrackingModules
    extends Module
{
    /**
     * Booster attribute to explosion radius of missiles vs. signature radius.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double aoecloudsizebonus;
    /**
     * Increases velocity of missile explosion
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double aoevelocitybonus;
    /**
     * The amount of charge used from the capacitor for a module activation.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double capacitorneed;
    /**
     * One of the groups of charge this launcher can be loaded with.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int chargegroup1;
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int chargesize;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double cpu;
    /**
     * Length of activation time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double duration;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double falloffbonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double heatabsorbtionratemodifier;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double heatdamage;
    /**
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double maxrangebonus;
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
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int metalevelold;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int overloadtrackingmodulestrengthbonus;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int power;
    /**
     * reload time (ms)
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultRealValue(10000.0)
    public double reloadtime;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int requiredthermodynamicsskill;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int techlevel;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double trackingspeedbonus;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {ChargeSize.INSTANCE, ReloadTime.INSTANCE, Mass.INSTANCE, CapacitorNeed.INSTANCE, Duration.INSTANCE, Hp.INSTANCE, OverloadTrackingModuleStrengthBonus.INSTANCE, AoeVelocityBonus.INSTANCE, AoeCloudSizeBonus.INSTANCE, RequiredSkill1Level.INSTANCE, MetaGroupID.INSTANCE, HeatAbsorbtionRateModifier.INSTANCE, ChargeGroup1 .INSTANCE, FalloffBonus.INSTANCE, Power.INSTANCE, MaxRangeBonus.INSTANCE, Radius.INSTANCE, TechLevel.INSTANCE, Capacity.INSTANCE, Cpu.INSTANCE, RequiredSkill1 .INSTANCE, MetaLevelOld.INSTANCE, HeatDamage.INSTANCE, RequiredThermoDynamicsSkill.INSTANCE, TrackingSpeedBonus.INSTANCE })));
    public static final DroneTrackingModules.MetaGroup METAGROUP = new DroneTrackingModules.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  848 :
            {
                return aoecloudsizebonus;
            }
            case  847 :
            {
                return aoevelocitybonus;
            }
            case  6 :
            {
                return capacitorneed;
            }
            case  604 :
            {
                return chargegroup1;
            }
            case  128 :
            {
                return chargesize;
            }
            case  50 :
            {
                return cpu;
            }
            case  73 :
            {
                return duration;
            }
            case  349 :
            {
                return falloffbonus;
            }
            case  1180 :
            {
                return heatabsorbtionratemodifier;
            }
            case  1211 :
            {
                return heatdamage;
            }
            case  351 :
            {
                return maxrangebonus;
            }
            case  1692 :
            {
                return metagroupid;
            }
            case  633 :
            {
                return metalevelold;
            }
            case  1935 :
            {
                return overloadtrackingmodulestrengthbonus;
            }
            case  30 :
            {
                return power;
            }
            case  1795 :
            {
                return reloadtime;
            }
            case  182 :
            {
                return requiredskill1;
            }
            case  277 :
            {
                return requiredskill1level;
            }
            case  1212 :
            {
                return requiredthermodynamicsskill;
            }
            case  422 :
            {
                return techlevel;
            }
            case  767 :
            {
                return trackingspeedbonus;
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
    public IMetaGroup<DroneTrackingModules> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DroneTrackingModules>
    {
        public static final String RESOURCE_PATH = "SDE/types/module/DroneTrackingModules.yaml";
        private Map<String, DroneTrackingModules> cache = (null);

        @Override
        public IMetaCategory<? super DroneTrackingModules> category() {
            return Module.METACAT;
        }

        @Override
        public int getGroupId() {
            return  646;
        }

        @Override
        public String getName() {
            return "DroneTrackingModules";
        }

        @Override
        public synchronized Map<String, DroneTrackingModules> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DroneTrackingModules.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DroneTrackingModules> types;
        }
    }
}
