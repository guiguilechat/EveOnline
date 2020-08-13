package fr.guiguilechat.jcelechat.model.sde.types.module;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapNeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapRechargeBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.CapacitorCapacityBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.CpuNeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.CpuOutputBonus2;
import fr.guiguilechat.jcelechat.model.sde.attributes.DurationBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Hp;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxGangModules;
import fr.guiguilechat.jcelechat.model.sde.attributes.MetaLevelOld;
import fr.guiguilechat.jcelechat.model.sde.attributes.MiningAmountBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.PowerEngineeringOutputBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.PowerNeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.PropulsionSkillPropulsionStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.RangeSkillBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Rechargeratebonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.RepairBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.RigSize;
import fr.guiguilechat.jcelechat.model.sde.attributes.ShieldRechargeRateMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.TechLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.UpgradeCost;
import fr.guiguilechat.jcelechat.model.sde.types.Module;
import org.yaml.snakeyaml.Yaml;

public class RigCore
    extends Module
{
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int capneedbonus;
    /**
     * Autogenerated skill attribute, CapRechargeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double caprechargebonus;
    /**
     * Autogenerated skill attribute, CapacitorCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacitorcapacitybonus;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int cpuneedbonus;
    /**
     * Autogenerated skill attribute, cpu OutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double cpuoutputbonus2;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int durationbonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(3)
    public int maxgangmodules;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int metalevelold;
    /**
     * Autogenerated skill attribute, miningAmountBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int miningamountbonus;
    /**
     * Autogenerated skill attribute, PowerOutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double powerengineeringoutputbonus;
    /**
     * Autogenerated skill attribute, PowerNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int powerneedbonus;
    /**
     * Skill attribute for increasing strength of Propulsion modules.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int propulsionskillpropulsionstrengthbonus;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int rangeskillbonus;
    /**
     * Autogenerated skill attribute, rechargeratebonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int rechargeratebonus;
    /**
     * Autogenerated skill attribute, repairBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int repairbonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int rigsize;
    /**
     * Multiplier to a recharge rate time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double shieldrechargeratemultiplier;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int techlevel;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int upgradecost;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {UpgradeCost.INSTANCE, DurationBonus.INSTANCE, Radius.INSTANCE, PowerNeedBonus.INSTANCE, Mass.INSTANCE, TechLevel.INSTANCE, RangeSkillBonus.INSTANCE, RepairBonus.INSTANCE, ShieldRechargeRateMultiplier.INSTANCE, Capacity.INSTANCE, CpuOutputBonus2 .INSTANCE, Hp.INSTANCE, RigSize.INSTANCE, MiningAmountBonus.INSTANCE, Rechargeratebonus.INSTANCE, MaxGangModules.INSTANCE, CpuNeedBonus.INSTANCE, CapacitorCapacityBonus.INSTANCE, MetaLevelOld.INSTANCE, PowerEngineeringOutputBonus.INSTANCE, CapRechargeBonus.INSTANCE, CapNeedBonus.INSTANCE, PropulsionSkillPropulsionStrengthBonus.INSTANCE })));
    public static final RigCore.MetaGroup METAGROUP = new RigCore.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  317 :
            {
                return capneedbonus;
            }
            case  314 :
            {
                return caprechargebonus;
            }
            case  1079 :
            {
                return capacitorcapacitybonus;
            }
            case  310 :
            {
                return cpuneedbonus;
            }
            case  424 :
            {
                return cpuoutputbonus2;
            }
            case  66 :
            {
                return durationbonus;
            }
            case  435 :
            {
                return maxgangmodules;
            }
            case  633 :
            {
                return metalevelold;
            }
            case  434 :
            {
                return miningamountbonus;
            }
            case  313 :
            {
                return powerengineeringoutputbonus;
            }
            case  323 :
            {
                return powerneedbonus;
            }
            case  829 :
            {
                return propulsionskillpropulsionstrengthbonus;
            }
            case  294 :
            {
                return rangeskillbonus;
            }
            case  338 :
            {
                return rechargeratebonus;
            }
            case  806 :
            {
                return repairbonus;
            }
            case  1547 :
            {
                return rigsize;
            }
            case  134 :
            {
                return shieldrechargeratemultiplier;
            }
            case  422 :
            {
                return techlevel;
            }
            case  1153 :
            {
                return upgradecost;
            }
            default:
            {
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<RigCore> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RigCore>
    {
        public static final String RESOURCE_PATH = "SDE/types/module/RigCore.yaml";
        private Map<String, RigCore> cache = (null);

        @Override
        public IMetaCategory<? super RigCore> category() {
            return Module.METACAT;
        }

        @Override
        public int getGroupId() {
            return  781;
        }

        @Override
        public String getName() {
            return "RigCore";
        }

        @Override
        public synchronized Map<String, RigCore> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RigCore.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RigCore> types;
        }
    }
}
