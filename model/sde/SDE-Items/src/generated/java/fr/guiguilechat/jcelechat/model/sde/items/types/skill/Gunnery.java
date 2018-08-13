package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Gunnery
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ConsumptionQuantityBonus;
    /**
     * Autogenerated skill attribute, damageMultiplierBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DamageMultiplierBonus;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
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
     * Autogenerated skill attribute, rofBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RofBonus;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    /**
     * Autogenerated skill attribute, TurretSpeeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int TurretSpeeBonus;
    public final static String RESOURCE_PATH = "SDE/items/skill/Gunnery.yaml";
    private static Map<String, Gunnery> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1047 :
            {
                return CanNotBeTrainedOnTrial;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  885 :
            {
                return ConsumptionQuantityBonus;
            }
            case  292 :
            {
                return DamageMultiplierBonus;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  294 :
            {
                return RangeSkillBonus;
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
            case  293 :
            {
                return RofBonus;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            case  441 :
            {
                return TurretSpeeBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  255;
    }

    @Override
    public Class<?> getGroup() {
        return Gunnery.class;
    }

    public static synchronized Map<String, Gunnery> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Gunnery.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Gunnery> items;
    }
}
