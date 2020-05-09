package fr.guiguilechat.jcelechat.model.sde.types.bonus;

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
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.AccuracyMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MiningDurationMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.RepairCostMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.SpeedMultiplier;
import fr.guiguilechat.jcelechat.model.sde.types.Bonus;
import org.yaml.snakeyaml.Yaml;

public class BloodlineBonus
    extends Bonus
{
    /**
     * Scales the accuracy of some targeted weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double accuracymultiplier;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacity;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double mass;
    /**
     * Factor to scale mining laser durations by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double miningdurationmultiplier;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double radius;
    /**
     * Multiplier to adjust the cost of repairs.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double repaircostmultiplier;
    /**
     * Typically scales the firing speed of a weapon.  Reducing speed means faster, strangely..
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double speedmultiplier;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {Radius.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE, MiningDurationMultiplier.INSTANCE, RepairCostMultiplier.INSTANCE, SpeedMultiplier.INSTANCE, AccuracyMultiplier.INSTANCE })));
    public static final BloodlineBonus.MetaGroup METAGROUP = new BloodlineBonus.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  205 :
            {
                return accuracymultiplier;
            }
            case  38 :
            {
                return capacity;
            }
            case  4 :
            {
                return mass;
            }
            case  203 :
            {
                return miningdurationmultiplier;
            }
            case  162 :
            {
                return radius;
            }
            case  187 :
            {
                return repaircostmultiplier;
            }
            case  204 :
            {
                return speedmultiplier;
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
    public IMetaGroup<BloodlineBonus> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<BloodlineBonus>
    {
        public static final String RESOURCE_PATH = "SDE/types/bonus/BloodlineBonus.yaml";
        private Map<String, BloodlineBonus> cache = (null);

        @Override
        public IMetaCategory<? super BloodlineBonus> category() {
            return Bonus.METACAT;
        }

        @Override
        public int getGroupId() {
            return  190;
        }

        @Override
        public String getName() {
            return "BloodlineBonus";
        }

        @Override
        public synchronized Map<String, BloodlineBonus> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(BloodlineBonus.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, BloodlineBonus> types;
        }
    }
}
