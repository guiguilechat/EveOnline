package fr.guiguilechat.jcelechat.model.sde.types.starbase;

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
import fr.guiguilechat.jcelechat.model.sde.types.Starbase;
import org.yaml.snakeyaml.Yaml;

public class TrackingArray
    extends Starbase
{
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
     * The hull damage proportion at which an entity becomes incapacitated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IncapacitationRatio;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxRangeBonus2;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * DO NOT MESS WITH This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldUniformity;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    /**
     * This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Uniformity;
    public static final TrackingArray.MetaGroup METAGROUP = new TrackingArray.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  50 :
            {
                return Cpu;
            }
            case  73 :
            {
                return Duration;
            }
            case  156 :
            {
                return IncapacitationRatio;
            }
            case  769 :
            {
                return MaxRangeBonus2;
            }
            case  30 :
            {
                return Power;
            }
            case  484 :
            {
                return ShieldUniformity;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            case  136 :
            {
                return Uniformity;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<TrackingArray> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<TrackingArray>
    {
        public static final String RESOURCE_PATH = "SDE/types/starbase/TrackingArray.yaml";
        private Map<String, TrackingArray> cache = (null);

        @Override
        public IMetaCategory<? super TrackingArray> category() {
            return Starbase.METACAT;
        }

        @Override
        public int getGroupId() {
            return  473;
        }

        @Override
        public String getName() {
            return "TrackingArray";
        }

        @Override
        public synchronized Map<String, TrackingArray> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(TrackingArray.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, TrackingArray> types;
        }
    }
}