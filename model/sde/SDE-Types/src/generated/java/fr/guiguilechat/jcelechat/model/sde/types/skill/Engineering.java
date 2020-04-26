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

public class Engineering
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
     * Autogenerated skill attribute, CapRechargeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapRechargeBonus;
    /**
     * Autogenerated skill attribute, CapacitorCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorCapacityBonus;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuNeedBonus;
    /**
     * Autogenerated skill attribute, cpu OutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CpuOutputBonus2;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ModuleRepairRateBonus;
    /**
     * Autogenerated skill attribute, PowerOutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PowerEngineeringOutputBonus;
    /**
     * Autogenerated skill attribute, PowerNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PowerNeedBonus;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBrokenRepairCostMultiplierBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ThermodynamicsHeatDamage;
    public static final Engineering.MetaGroup METAGROUP = new Engineering.MetaGroup();

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
            case  314 :
            {
                return CapRechargeBonus;
            }
            case  1079 :
            {
                return CapacitorCapacityBonus;
            }
            case  310 :
            {
                return CpuNeedBonus;
            }
            case  424 :
            {
                return CpuOutputBonus2;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  1295 :
            {
                return ModuleRepairRateBonus;
            }
            case  313 :
            {
                return PowerEngineeringOutputBonus;
            }
            case  323 :
            {
                return PowerNeedBonus;
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
            case  1294 :
            {
                return ShipBrokenRepairCostMultiplierBonus;
            }
            case  1229 :
            {
                return ThermodynamicsHeatDamage;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Engineering> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Engineering>
    {
        public static final String RESOURCE_PATH = "SDE/types/skill/Engineering.yaml";
        private Map<String, Engineering> cache = (null);

        @Override
        public IMetaCategory<? super Engineering> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1216;
        }

        @Override
        public String getName() {
            return "Engineering";
        }

        @Override
        public synchronized Map<String, Engineering> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Engineering.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Engineering> types;
        }
    }
}
