package fr.guiguilechat.jcelechat.model.sde.items.types.bonus;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Bonus;
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
    public double AccuracyMultiplier;
    /**
     * Factor to scale mining laser durations by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MiningDurationMultiplier;
    /**
     * Multiplier to adjust the cost of repairs.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double RepairCostMultiplier;
    /**
     * Typically scales the firing speed of a weapon.  Reducing speed means faster, strangely..
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double SpeedMultiplier;
    public final static BloodlineBonus.MetaGroup METAGROUP = new BloodlineBonus.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  205 :
            {
                return AccuracyMultiplier;
            }
            case  203 :
            {
                return MiningDurationMultiplier;
            }
            case  187 :
            {
                return RepairCostMultiplier;
            }
            case  204 :
            {
                return SpeedMultiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<BloodlineBonus> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<BloodlineBonus>
    {
        public final static String RESOURCE_PATH = "SDE/items/bonus/BloodlineBonus.yaml";
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
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(BloodlineBonus.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, BloodlineBonus> items;
        }
    }
}
