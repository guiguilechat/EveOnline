package fr.guiguilechat.eveonline.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Social
    extends Skill
{
    /**
     * Autogenerated skill attribute, bountySkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BountySkillBonus;
    /**
     * Autogenerated skill attribute, connectionBonusMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ConnectionBonusMutator;
    /**
     * Autogenerated skill attribute, criminalConnectionsMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CriminalConnectionsMutator;
    /**
     * Autogenerated skill attribute, diplomacyMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double DiplomacyMutator;
    /**
     * Autogenerated skill attribute, fastTalkMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FastTalkMutator;
    /**
     * Autogenerated skill attribute, NegotiationBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NegotiationBonus;
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
     * Only refers to another dogma attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SecondaryAttribute;
    /**
     * Time constant for skill training
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SkillTimeConstant;
    /**
     * Autogenerated skill attribute, socialMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SocialMutator;
    public final static String RESOURCE_PATH = "SDE/items/skill/Social.yaml";
    private static LinkedHashMap<String, Social> cache = (null);

    @Override
    public int getGroupId() {
        return  278;
    }

    @Override
    public Class<?> getGroup() {
        return Social.class;
    }

    public static synchronized LinkedHashMap<String, Social> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Social.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, Social> items;
    }
}
