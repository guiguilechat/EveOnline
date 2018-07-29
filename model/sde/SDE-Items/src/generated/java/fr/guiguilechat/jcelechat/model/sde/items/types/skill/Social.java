package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;

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
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  627 :
            {
                return BountySkillBonus;
            }
            case  412 :
            {
                return ConnectionBonusMutator;
            }
            case  413 :
            {
                return CriminalConnectionsMutator;
            }
            case  414 :
            {
                return DiplomacyMutator;
            }
            case  415 :
            {
                return FastTalkMutator;
            }
            case  437 :
            {
                return NegotiationBonus;
            }
            case  180 :
            {
                return PrimaryAttribute;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  181 :
            {
                return SecondaryAttribute;
            }
            case  275 :
            {
                return SkillTimeConstant;
            }
            case  438 :
            {
                return SocialMutator;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

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