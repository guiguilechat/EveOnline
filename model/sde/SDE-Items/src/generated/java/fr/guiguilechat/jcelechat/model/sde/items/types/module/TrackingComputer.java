package fr.guiguilechat.jcelechat.model.sde.items.types.module;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class TrackingComputer
    extends Module
{
    /**
     * The amount of charge used from the capacitor for a module activation.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeed;
    /**
     * One of the groups of charge this launcher can be loaded with.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeGroup1;
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * Length of activation time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Duration;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HeatAbsorbtionRateModifier;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HeatDamage;
    /**
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int OverloadTrackingModuleStrengthBonus;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * reload time (ms)
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(10000.0)
    public double ReloadTime;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredThermoDynamicsSkill;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    public final static TrackingComputer.MetaGroup METAGROUP = new TrackingComputer.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/module/TrackingComputer.yaml";
    private static Map<String, TrackingComputer> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  6 :
            {
                return CapacitorNeed;
            }
            case  604 :
            {
                return ChargeGroup1;
            }
            case  128 :
            {
                return ChargeSize;
            }
            case  50 :
            {
                return Cpu;
            }
            case  73 :
            {
                return Duration;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  1180 :
            {
                return HeatAbsorbtionRateModifier;
            }
            case  1211 :
            {
                return HeatDamage;
            }
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  1692 :
            {
                return MetaGroupID;
            }
            case  1935 :
            {
                return OverloadTrackingModuleStrengthBonus;
            }
            case  30 :
            {
                return Power;
            }
            case  1795 :
            {
                return ReloadTime;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  1212 :
            {
                return RequiredThermoDynamicsSkill;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  213;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<TrackingComputer> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, TrackingComputer> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(TrackingComputer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, TrackingComputer> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<TrackingComputer>
    {

        @Override
        public MetaCategory<? super TrackingComputer> category() {
            return Module.METACAT;
        }

        @Override
        public String getName() {
            return "TrackingComputer";
        }

        @Override
        public Collection<TrackingComputer> items() {
            return (load().values());
        }
    }
}
