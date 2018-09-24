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

public class CareerBonus
    extends Bonus
{
    /**
     * Bonus or penalty to the percentage time it takes to train skills with Charisma as the primary attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CharismaSkillTrainingTimeMultiplierBonus;
    /**
     * Bonus or penalty to the percentage time it takes to train skills with Intelligence as the primary attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IntelligenceSkillTrainingTimeMultiplierBonus;
    /**
     * Bonus or penalty to the percentage time it takes to train skills with Memory as the primary attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MemorySkillTrainingTimeMultiplierBonus;
    /**
     * Bonus or penalty to the percentage time it takes to train skills with Perception as the primary attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PerceptionSkillTrainingTimeMultiplierBonus;
    /**
     * Bonus or penalty to the percentage time it takes to train skills with Willpower as the primary attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double WillpowerSkillTrainingTimeMultiplierBonus;
    public final static CareerBonus.MetaGroup METAGROUP = new CareerBonus.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  228 :
            {
                return CharismaSkillTrainingTimeMultiplierBonus;
            }
            case  229 :
            {
                return IntelligenceSkillTrainingTimeMultiplierBonus;
            }
            case  230 :
            {
                return MemorySkillTrainingTimeMultiplierBonus;
            }
            case  231 :
            {
                return PerceptionSkillTrainingTimeMultiplierBonus;
            }
            case  232 :
            {
                return WillpowerSkillTrainingTimeMultiplierBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<CareerBonus> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CareerBonus>
    {
        public final static String RESOURCE_PATH = "SDE/items/bonus/CareerBonus.yaml";
        private Map<String, CareerBonus> cache = (null);

        @Override
        public IMetaCategory<? super CareerBonus> category() {
            return Bonus.METACAT;
        }

        @Override
        public int getGroupId() {
            return  199;
        }

        @Override
        public String getName() {
            return "CareerBonus";
        }

        @Override
        public synchronized Map<String, CareerBonus> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(CareerBonus.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CareerBonus> items;
        }
    }
}
