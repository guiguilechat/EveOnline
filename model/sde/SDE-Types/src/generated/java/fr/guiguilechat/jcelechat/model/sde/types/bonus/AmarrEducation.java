package fr.guiguilechat.jcelechat.model.sde.types.bonus;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Bonus;
import org.yaml.snakeyaml.Yaml;

public class AmarrEducation
    extends Bonus
{
    /**
     * Scales the capacitor need for fitted modules.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeedMultiplier;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Capacity;
    /**
     * Bonus or penalty to the percentage time it takes to train skills with Charisma as the primary attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CharismaSkillTrainingTimeMultiplierBonus;
    /**
     * Factor to adjust module cpu need by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double CpuMultiplier;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Mass;
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
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Radius;
    public static final AmarrEducation.MetaGroup METAGROUP = new AmarrEducation.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  216 :
            {
                return CapacitorNeedMultiplier;
            }
            case  38 :
            {
                return Capacity;
            }
            case  228 :
            {
                return CharismaSkillTrainingTimeMultiplierBonus;
            }
            case  202 :
            {
                return CpuMultiplier;
            }
            case  4 :
            {
                return Mass;
            }
            case  230 :
            {
                return MemorySkillTrainingTimeMultiplierBonus;
            }
            case  231 :
            {
                return PerceptionSkillTrainingTimeMultiplierBonus;
            }
            case  162 :
            {
                return Radius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<AmarrEducation> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AmarrEducation>
    {
        public static final String RESOURCE_PATH = "SDE/types/bonus/AmarrEducation.yaml";
        private Map<String, AmarrEducation> cache = (null);

        @Override
        public IMetaCategory<? super AmarrEducation> category() {
            return Bonus.METACAT;
        }

        @Override
        public int getGroupId() {
            return  195;
        }

        @Override
        public String getName() {
            return "AmarrEducation";
        }

        @Override
        public synchronized Map<String, AmarrEducation> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AmarrEducation.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AmarrEducation> types;
        }
    }
}
