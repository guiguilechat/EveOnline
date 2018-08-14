package fr.guiguilechat.jcelechat.model.sde.items.types.module;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class RigAnchor
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
     * used on rigs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10)
    public int Drawback;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MassBonusPercentage;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxGroupFitted;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpBubbleImmuneModifier;
    public final static RigAnchor.MetaGroup METAGROUP = new RigAnchor.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  151 :
            {
                return AgilityBonus;
            }
            case  1138 :
            {
                return Drawback;
            }
            case  1131 :
            {
                return MassBonusPercentage;
            }
            case  1544 :
            {
                return MaxGroupFitted;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            case  315 :
            {
                return VelocityBonus;
            }
            case  1539 :
            {
                return WarpBubbleImmuneModifier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<RigAnchor> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RigAnchor>
    {
        public final static String RESOURCE_PATH = "SDE/items/module/RigAnchor.yaml";
        private Map<String, RigAnchor> cache = (null);

        @Override
        public IMetaCategory<? super RigAnchor> category() {
            return Module.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1308;
        }

        @Override
        public String getName() {
            return "RigAnchor";
        }

        @Override
        public synchronized Map<String, RigAnchor> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(RigAnchor.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RigAnchor> items;
        }
    }
}
