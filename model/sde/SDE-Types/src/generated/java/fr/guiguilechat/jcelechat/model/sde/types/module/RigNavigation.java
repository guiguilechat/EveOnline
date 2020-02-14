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

public class RigNavigation
    extends Module
{
    /**
     * Autogenerated skill attribute, WarpSBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpSBonus;
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
     * Scales the capacitor need for fitted modules.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorNeedMultiplier;
    /**
     * Autogenerated skill attribute, cargoCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CargoCapacityBonus;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantBonusVelocity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MassBonusPercentage;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
    /**
     * Autogenerated skill attribute, speedFBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SpeedFBonus;
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
    /**
     * Autogenerated skill attribute, velocityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double VelocityBonus;
    /**
     * Autogenerated skill attribute, warpCapacitorNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpCapacitorNeedBonus;
    public static final RigNavigation.MetaGroup METAGROUP = new RigNavigation.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  624 :
            {
                return WarpSBonus;
            }
            case  151 :
            {
                return AgilityBonus;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  216 :
            {
                return CapacitorNeedMultiplier;
            }
            case  614 :
            {
                return CargoCapacityBonus;
            }
            case  1138 :
            {
                return Drawback;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  1076 :
            {
                return ImplantBonusVelocity;
            }
            case  1131 :
            {
                return MassBonusPercentage;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  318 :
            {
                return SpeedFBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            case  315 :
            {
                return VelocityBonus;
            }
            case  319 :
            {
                return WarpCapacitorNeedBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<RigNavigation> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RigNavigation>
    {
        public static final String RESOURCE_PATH = "SDE/types/module/RigNavigation.yaml";
        private Map<String, RigNavigation> cache = (null);

        @Override
        public IMetaCategory<? super RigNavigation> category() {
            return Module.METACAT;
        }

        @Override
        public int getGroupId() {
            return  782;
        }

        @Override
        public String getName() {
            return "RigNavigation";
        }

        @Override
        public synchronized Map<String, RigNavigation> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RigNavigation.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RigNavigation> types;
        }
    }
}
