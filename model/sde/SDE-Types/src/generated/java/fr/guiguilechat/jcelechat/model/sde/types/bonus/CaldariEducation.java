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

public class CaldariEducation
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
    public static final CaldariEducation.MetaGroup METAGROUP = new CaldariEducation.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  216 :
            {
                return CapacitorNeedMultiplier;
            }
            case  228 :
            {
                return CharismaSkillTrainingTimeMultiplierBonus;
            }
            case  202 :
            {
                return CpuMultiplier;
            }
            case  230 :
            {
                return MemorySkillTrainingTimeMultiplierBonus;
            }
            case  231 :
            {
                return PerceptionSkillTrainingTimeMultiplierBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<CaldariEducation> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CaldariEducation>
    {
        public static final String RESOURCE_PATH = "SDE/types/bonus/CaldariEducation.yaml";
        private Map<String, CaldariEducation> cache = (null);

        @Override
        public IMetaCategory<? super CaldariEducation> category() {
            return Bonus.METACAT;
        }

        @Override
        public int getGroupId() {
            return  196;
        }

        @Override
        public String getName() {
            return "CaldariEducation";
        }

        @Override
        public synchronized Map<String, CaldariEducation> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(CaldariEducation.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CaldariEducation> types;
        }
    }
}