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

public class WarpDisruptionScript
    extends Charge
{
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * capacitorNeedHidden
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapacitorNeedHidden;
    /**
     * If set on a charge or module type, will prevent it from being activated in empire space.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowInEmpireSpace;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * Bonus to massBonusPercentage
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MassBonusPercentageBonus;
    /**
     * maxRangeHidden
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxRangeHidden;
    /**
     * Bonus to signatureRadiusBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SignatureRadiusBonusBonus;
    /**
     * Modification of Afterburner and Microwarpdrive Thrust Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SpeedBoostFactorBonusBonus;
    /**
     * Modification of Afterburner and Microwarpdrive Max Velocity Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SpeedFactorBonusBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Warp Scramble Range Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpScrambleRangeBonus;
    public final static WarpDisruptionScript.MetaGroup METAGROUP = new WarpDisruptionScript.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  317 :
            {
                return CapNeedBonus;
            }
            case  1319 :
            {
                return CapacitorNeedHidden;
            }
            case  1074 :
            {
                return DisallowInEmpireSpace;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  1324 :
            {
                return MassBonusPercentageBonus;
            }
            case  1317 :
            {
                return MaxRangeHidden;
            }
            case  1227 :
            {
                return SignatureRadiusBonusBonus;
            }
            case  1325 :
            {
                return SpeedBoostFactorBonusBonus;
            }
            case  1326 :
            {
                return SpeedFactorBonusBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1327 :
            {
                return WarpScrambleRangeBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<WarpDisruptionScript> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<WarpDisruptionScript>
    {
        public final static String RESOURCE_PATH = "SDE/items/charge/WarpDisruptionScript.yaml";
        private Map<String, WarpDisruptionScript> cache = (null);

        @Override
        public IMetaCategory<? super WarpDisruptionScript> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  908;
        }

        @Override
        public String getName() {
            return "WarpDisruptionScript";
        }

        @Override
        public synchronized Map<String, WarpDisruptionScript> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(WarpDisruptionScript.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, WarpDisruptionScript> items;
        }
    }
}
