package fr.guiguilechat.jcelechat.model.sde.items.types.charge;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class SensorBoosterScript
    extends Charge
{
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup2;
    /**
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MainColor;
    /**
     * Bonus to maxTargetRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxTargetRangeBonusBonus;
    /**
     * Bonus to scanResolutionBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanResolutionBonusBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SensorStrengthBonusBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public static final SensorBoosterScript.MetaGroup METAGROUP = new SensorBoosterScript.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  128 :
            {
                return ChargeSize;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  602 :
            {
                return LauncherGroup2;
            }
            case  124 :
            {
                return MainColor;
            }
            case  1313 :
            {
                return MaxTargetRangeBonusBonus;
            }
            case  1314 :
            {
                return ScanResolutionBonusBonus;
            }
            case  2282 :
            {
                return SensorStrengthBonusBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<SensorBoosterScript> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SensorBoosterScript>
    {
        public static final String RESOURCE_PATH = "SDE/items/charge/SensorBoosterScript.yaml";
        private Map<String, SensorBoosterScript> cache = (null);

        @Override
        public IMetaCategory<? super SensorBoosterScript> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  910;
        }

        @Override
        public String getName() {
            return "SensorBoosterScript";
        }

        @Override
        public synchronized Map<String, SensorBoosterScript> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(SensorBoosterScript.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SensorBoosterScript> items;
        }
    }
}
