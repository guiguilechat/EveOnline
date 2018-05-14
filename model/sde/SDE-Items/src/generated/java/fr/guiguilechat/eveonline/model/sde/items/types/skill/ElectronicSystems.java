package fr.guiguilechat.eveonline.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;
import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class ElectronicSystems
    extends Skill
{
    /**
     * If set to 1 on a skill then this skill can not be trained on accounts that are marked as Trial.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanNotBeTrainedOnTrial;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * Autogenerated skill attribute, cloakVelocityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CloakVelocityBonus;
    /**
     * Skill bonus for cloaking targeting delay.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CloakingTargetingDelayBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ConsumptionQuantityBonus;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuNeedBonus;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
    /**
     * Autogenerated skill attribute, maxTarget Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxTargetBonus;
    /**
     * Only refers to another dogma attribute.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PrimaryAttribute;
    /**
     * Bonus to duration of modules requiring projected ECM.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ProjECMDurationBonus;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RangeSkillBonus;
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
     * Skill attribute for increasing strength of EW modules.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanSkillEwStrengthBonus;
    /**
     * Skill attribute for increasing effectiveness on Target Painters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanSkillTargetPaintStrengthBonus;
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
    public final static String RESOURCE_PATH = "SDE/items/skill/ElectronicSystems.yaml";
    private static LinkedHashMap<String, ElectronicSystems> cache = (null);

    public int attributeInt(IntAttribute attribute) {
        switch (attribute.getId()) {
            case  1047 :
            {
                return CanNotBeTrainedOnTrial;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  555 :
            {
                return CloakVelocityBonus;
            }
            case  619 :
            {
                return CloakingTargetingDelayBonus;
            }
            case  885 :
            {
                return ConsumptionQuantityBonus;
            }
            case  310 :
            {
                return CpuNeedBonus;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  311 :
            {
                return MaxTargetBonus;
            }
            case  180 :
            {
                return PrimaryAttribute;
            }
            case  1193 :
            {
                return ProjECMDurationBonus;
            }
            case  294 :
            {
                return RangeSkillBonus;
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
            case  832 :
            {
                return ScanSkillTargetPaintStrengthBonus;
            }
            case  181 :
            {
                return SecondaryAttribute;
            }
            default:
            {
                return super.attributeInt((attribute));
            }
        }
    }

    public double attributeDouble(DoubleAttribute attribute) {
        switch (attribute.getId()) {
            case  349 :
            {
                return FalloffBonus;
            }
            case  828 :
            {
                return ScanSkillEwStrengthBonus;
            }
            case  275 :
            {
                return SkillTimeConstant;
            }
            default:
            {
                return super.attributeDouble((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  272;
    }

    @Override
    public Class<?> getGroup() {
        return ElectronicSystems.class;
    }

    public static synchronized LinkedHashMap<String, ElectronicSystems> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(ElectronicSystems.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, ElectronicSystems> items;
    }
}
