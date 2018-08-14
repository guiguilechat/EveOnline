package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Science
    extends Skill
{
    /**
     * Autogenerated skill attribute, blueprintmanufactureTimeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BlueprintmanufactureTimeBonus;
    /**
     * If set to 1 on a skill then this skill can not be trained on accounts that are marked as Trial.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanNotBeTrainedOnTrial;
    /**
     * Autogenerated skill attribute, CopySpeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CopySpeedBonus;
    /**
     * Autogenerated skill attribute, inventionBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int InventionBonus;
    /**
     * Autogenerated skill attribute, laboratorySlotsBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LaboratorySlotsBonus;
    /**
     * Skill bonus per level to manufacturing time efficiency. Only applies to skills required to manufacture the blueprint.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ManufactureTimePerLevel;
    /**
     * The maximum number of their targets that the character can attack at a given time.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxAttackTargets;
    /**
     * Autogenerated skill attribute, mineralNeedResearchBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MineralNeedResearchBonus;
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
    /**
     * Max research gang size bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ResearchGangSizeBonus;
    public final static Science.MetaGroup METAGROUP = new Science.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  453 :
            {
                return BlueprintmanufactureTimeBonus;
            }
            case  1047 :
            {
                return CanNotBeTrainedOnTrial;
            }
            case  452 :
            {
                return CopySpeedBonus;
            }
            case  474 :
            {
                return InventionBonus;
            }
            case  471 :
            {
                return LaboratorySlotsBonus;
            }
            case  1982 :
            {
                return ManufactureTimePerLevel;
            }
            case  193 :
            {
                return MaxAttackTargets;
            }
            case  468 :
            {
                return MineralNeedResearchBonus;
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
            case  407 :
            {
                return ResearchGangSizeBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Science> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Science>
    {
        public final static String RESOURCE_PATH = "SDE/items/skill/Science.yaml";
        private Map<String, Science> cache = (null);

        @Override
        public IMetaCategory<? super Science> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  270;
        }

        @Override
        public String getName() {
            return "Science";
        }

        @Override
        public synchronized Map<String, Science> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Science.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Science> items;
        }
    }
}
