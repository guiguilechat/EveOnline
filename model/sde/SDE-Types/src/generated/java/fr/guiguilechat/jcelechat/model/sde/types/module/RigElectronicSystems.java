package fr.guiguilechat.jcelechat.model.sde.types.module;

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
import fr.guiguilechat.jcelechat.model.sde.types.Module;
import org.yaml.snakeyaml.Yaml;

public class RigElectronicSystems
    extends Module
{
    /**
     * Bonus to the agility for a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AgilityBonus;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * Skill bonus for cloaking targeting delay.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CloakingTargetingDelayBonus;
    /**
     * used on rigs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10)
    public int Drawback;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
    /**
     * Scales the max target range of a ships electronics.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MaxTargetRangeMultiplier;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RangeSkillBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanGravimetricStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanLadarStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanMagnetometricStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanRadarStrengthPercent;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolutionBonus;
    /**
     * Skill attribute for increasing strength of EW modules.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanSkillEwStrengthBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeCost;
    public static final RigElectronicSystems.MetaGroup METAGROUP = new RigElectronicSystems.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  151 :
            {
                return AgilityBonus;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  619 :
            {
                return CloakingTargetingDelayBonus;
            }
            case  1138 :
            {
                return Drawback;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  237 :
            {
                return MaxTargetRangeMultiplier;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  294 :
            {
                return RangeSkillBonus;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  1027 :
            {
                return ScanGravimetricStrengthPercent;
            }
            case  1028 :
            {
                return ScanLadarStrengthPercent;
            }
            case  1029 :
            {
                return ScanMagnetometricStrengthPercent;
            }
            case  1030 :
            {
                return ScanRadarStrengthPercent;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  828 :
            {
                return ScanSkillEwStrengthBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<RigElectronicSystems> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RigElectronicSystems>
    {
        public static final String RESOURCE_PATH = "SDE/types/module/RigElectronicSystems.yaml";
        private Map<String, RigElectronicSystems> cache = (null);

        @Override
        public IMetaCategory<? super RigElectronicSystems> category() {
            return Module.METACAT;
        }

        @Override
        public int getGroupId() {
            return  786;
        }

        @Override
        public String getName() {
            return "RigElectronicSystems";
        }

        @Override
        public synchronized Map<String, RigElectronicSystems> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RigElectronicSystems.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RigElectronicSystems> types;
        }
    }
}
