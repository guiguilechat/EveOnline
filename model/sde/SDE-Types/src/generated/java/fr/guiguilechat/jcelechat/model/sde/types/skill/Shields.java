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

public class Shields
    extends Skill
{
    /**
     * If set to 1 then this skill can not be trained on accounts that are marked as Alpha Clone. Any other value (although you should probably use 0) will result in all accounts being able to train this skill.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int CanNotBeTrainedOnTrial;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * Autogenerated skill attribute, hardeningBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HardeningBonus;
    /**
     * Autogenerated skill attribute, PowerNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PowerNeedBonus;
    /**
     * Autogenerated skill attribute, rechargeratebonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Rechargeratebonus;
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
     * Autogenerated skill attribute, resistanceBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ResistanceBonus;
    /**
     * Bonus to capacitor need for shield boosters.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldBoostCapacitorBonus;
    /**
     * Autogenerated skill attribute, shieldCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldCapacityBonus;
    /**
     * Autogenerated skill attribute, uniformityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double UniformityBonus;
    public static final Shields.MetaGroup METAGROUP = new Shields.MetaGroup();

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
            case  66 :
            {
                return DurationBonus;
            }
            case  958 :
            {
                return HardeningBonus;
            }
            case  323 :
            {
                return PowerNeedBonus;
            }
            case  338 :
            {
                return Rechargeratebonus;
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
            case  550 :
            {
                return ResistanceBonus;
            }
            case  851 :
            {
                return ShieldBoostCapacitorBonus;
            }
            case  337 :
            {
                return ShieldCapacityBonus;
            }
            case  336 :
            {
                return UniformityBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Shields> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Shields>
    {
        public static final String RESOURCE_PATH = "SDE/types/skill/Shields.yaml";
        private Map<String, Shields> cache = (null);

        @Override
        public IMetaCategory<? super Shields> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1209;
        }

        @Override
        public String getName() {
            return "Shields";
        }

        @Override
        public synchronized Map<String, Shields> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Shields.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Shields> types;
        }
    }
}
