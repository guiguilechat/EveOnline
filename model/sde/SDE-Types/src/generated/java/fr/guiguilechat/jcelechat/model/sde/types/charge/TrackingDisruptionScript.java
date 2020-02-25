package fr.guiguilechat.jcelechat.model.sde.types.charge;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class TrackingDisruptionScript
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1399)
    public int FalloffBonusBonus;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MainColor;
    /**
     * Bonus to maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxRangeBonusBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Bonus to trackingSpeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int TrackingSpeedBonusBonus;
    public static final TrackingDisruptionScript.MetaGroup METAGROUP = new TrackingDisruptionScript.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  128 :
            {
                return ChargeSize;
            }
            case  1332 :
            {
                return FalloffBonusBonus;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  124 :
            {
                return MainColor;
            }
            case  1315 :
            {
                return MaxRangeBonusBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1316 :
            {
                return TrackingSpeedBonusBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<TrackingDisruptionScript> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<TrackingDisruptionScript>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/TrackingDisruptionScript.yaml";
        private Map<String, TrackingDisruptionScript> cache = (null);

        @Override
        public IMetaCategory<? super TrackingDisruptionScript> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  909;
        }

        @Override
        public String getName() {
            return "TrackingDisruptionScript";
        }

        @Override
        public synchronized Map<String, TrackingDisruptionScript> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(TrackingDisruptionScript.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, TrackingDisruptionScript> types;
        }
    }
}