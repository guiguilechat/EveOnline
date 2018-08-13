package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Targeting
    extends Skill
{
    /**
     * Autogenerated skill attribute, maxTarget Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxTargetBonus;
    /**
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolutionBonus;
    /**
     * Bonus for Sensor Strength
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int SensorStrengthBonus;
    public final static Targeting.MetaGroup METAGROUP = new Targeting.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/skill/Targeting.yaml";
    private static Map<String, Targeting> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  311 :
            {
                return MaxTargetBonus;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  1851 :
            {
                return SensorStrengthBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1213;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Targeting> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, Targeting> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Targeting.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Targeting> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Targeting>
    {

        @Override
        public MetaCategory<? super Targeting> category() {
            return Skill.METACAT;
        }

        @Override
        public String getName() {
            return "Targeting";
        }

        @Override
        public Collection<Targeting> items() {
            return (load().values());
        }
    }
}
