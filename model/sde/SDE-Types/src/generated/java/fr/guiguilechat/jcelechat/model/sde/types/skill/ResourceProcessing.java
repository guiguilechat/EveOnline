package fr.guiguilechat.jcelechat.model.sde.types.skill;

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
import fr.guiguilechat.jcelechat.model.sde.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class ResourceProcessing
    extends Skill
{
    /**
     * Bonus to chance of opening a container (for skills).
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AccessDifficultyBonusAbsolutePercent;
    /**
     * If set to 1 on a skill then this skill can not be trained on accounts that are marked as Trial.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanNotBeTrainedOnTrial;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ConsumptionQuantityBonus;
    /**
     * Autogenerated skill attribute, damageCloudChanceReduction
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DamageCloudChanceReduction;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IceHarvestCycleBonus;
    /**
     * Autogenerated skill attribute, miningAmountBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MiningAmountBonus;
    /**
     * CPU Penalty Reduction
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MiningUpgradeCPUReductionBonus;
    /**
     * Increase number of available/simultaneous reaction slots
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ReactionSlotBonus;
    /**
     * Skill attribute that reduces time for reactions
     *  jobs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ReactionTimeBonus;
    /**
     * Autogenerated skill attribute, refiningYieldMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RefiningYieldMutator;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2;
    /**
     * Required skill level for skill 2
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2Level;
    public static final ResourceProcessing.MetaGroup METAGROUP = new ResourceProcessing.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1772 :
            {
                return AccessDifficultyBonusAbsolutePercent;
            }
            case  1047 :
            {
                return CanNotBeTrainedOnTrial;
            }
            case  885 :
            {
                return ConsumptionQuantityBonus;
            }
            case  543 :
            {
                return DamageCloudChanceReduction;
            }
            case  780 :
            {
                return IceHarvestCycleBonus;
            }
            case  434 :
            {
                return MiningAmountBonus;
            }
            case  927 :
            {
                return MiningUpgradeCPUReductionBonus;
            }
            case  2661 :
            {
                return ReactionSlotBonus;
            }
            case  2660 :
            {
                return ReactionTimeBonus;
            }
            case  379 :
            {
                return RefiningYieldMutator;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<ResourceProcessing> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<ResourceProcessing>
    {
        public static final String RESOURCE_PATH = "SDE/types/skill/ResourceProcessing.yaml";
        private Map<String, ResourceProcessing> cache = (null);

        @Override
        public IMetaCategory<? super ResourceProcessing> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1218;
        }

        @Override
        public String getName() {
            return "ResourceProcessing";
        }

        @Override
        public synchronized Map<String, ResourceProcessing> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(ResourceProcessing.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, ResourceProcessing> types;
        }
    }
}
