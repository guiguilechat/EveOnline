package fr.guiguilechat.eveonline.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Skill;
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
     * Only refers to another dogma attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PrimaryAttribute;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1;
    /**
     * Required skill level for skill 1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1Level;
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
    /**
     * Only refers to another dogma attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SecondaryAttribute;
    /**
     * When set True, skill can no longer be injected or trained. Characters will be reimbursed with free SP for any obsolete skills in the skill queue upon logon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SkillIsObsolete;
    /**
     * Time constant for skill training
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SkillTimeConstant;
    public final static String RESOURCE_PATH = "SDE/items/skill/Science.yaml";
    private static LinkedHashMap<String, Science> cache = (null);

    @Override
    public int getGroupId() {
        return  270;
    }

    @Override
    public Class<?> getGroup() {
        return Science.class;
    }

    public static synchronized LinkedHashMap<String, Science> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Science.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, Science> items;
    }
}
