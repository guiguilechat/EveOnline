package fr.guiguilechat.jcelechat.model.sde.items.types.module;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class RigTargeting
    extends Module
{
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
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
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
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeCost;
    public final static RigTargeting.MetaGroup METAGROUP = new RigTargeting.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/module/RigTargeting.yaml";
    private static Map<String, RigTargeting> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  619 :
            {
                return CloakingTargetingDelayBonus;
            }
            case  1138 :
            {
                return Drawback;
            }
            case  309 :
            {
                return MaxTargetRangeBonus;
            }
            case  294 :
            {
                return RangeSkillBonus;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  828 :
            {
                return ScanSkillEwStrengthBonus;
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
    public int getGroupId() {
        return  1234;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<RigTargeting> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, RigTargeting> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RigTargeting.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, RigTargeting> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<RigTargeting>
    {

        @Override
        public MetaCategory<? super RigTargeting> category() {
            return Module.METACAT;
        }

        @Override
        public String getName() {
            return "RigTargeting";
        }

        @Override
        public Collection<RigTargeting> items() {
            return (load().values());
        }
    }
}
