package fr.guiguilechat.jcelechat.model.sde.types.skill;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Production
    extends Skill
{
    /**
     * A bonus to all industry job times for the advanced industry skill
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AdvancedIndustrySkillIndustryJobTimeBonus;
    /**
     * If set to 1 on a skill then this skill can not be trained on accounts that are marked as Trial.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanNotBeTrainedOnTrial;
    /**
     * Autogenerated skill attribute, DurationBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationSkillBonus;
    /**
     * Skill bonus per level to manufacturing time efficiency. Only applies to skills required to manufacture the blueprint.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ManufactureTimePerLevel;
    /**
     * Autogenerated skill attribute, manufacturingSlotBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ManufacturingSlotBonus;
    /**
     * Autogenerated skill attribute, manufacturingTimeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ManufacturingTimeBonus;
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
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill3;
    /**
     * Required skill level for skill 3
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill3Level;
    public static final Production.MetaGroup METAGROUP = new Production.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1961 :
            {
                return AdvancedIndustrySkillIndustryJobTimeBonus;
            }
            case  1047 :
            {
                return CanNotBeTrainedOnTrial;
            }
            case  312 :
            {
                return DurationSkillBonus;
            }
            case  1982 :
            {
                return ManufactureTimePerLevel;
            }
            case  450 :
            {
                return ManufacturingSlotBonus;
            }
            case  440 :
            {
                return ManufacturingTimeBonus;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  184 :
            {
                return RequiredSkill3;
            }
            case  279 :
            {
                return RequiredSkill3Level;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Production> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Production>
    {
        public static final String RESOURCE_PATH = "SDE/types/skill/Production.yaml";
        private Map<String, Production> cache = (null);

        @Override
        public IMetaCategory<? super Production> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  268;
        }

        @Override
        public String getName() {
            return "Production";
        }

        @Override
        public synchronized Map<String, Production> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Production.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Production> types;
        }
    }
}