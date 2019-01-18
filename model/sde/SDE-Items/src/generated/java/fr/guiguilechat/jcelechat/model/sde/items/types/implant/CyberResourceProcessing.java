package fr.guiguilechat.jcelechat.model.sde.items.types.implant;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberResourceProcessing
    extends Implant
{
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
    public double IceHarvestCycleBonus;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, miningAmountBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MiningAmountBonus;
    /**
     * CPU Penalty Reduction
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MiningUpgradeCPUReductionBonus;
    /**
     * Autogenerated skill attribute, refiningYieldMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RefiningYieldMutator;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public static final CyberResourceProcessing.MetaGroup METAGROUP = new CyberResourceProcessing.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  66 :
            {
                return DurationBonus;
            }
            case  780 :
            {
                return IceHarvestCycleBonus;
            }
            case  331 :
            {
                return Implantness;
            }
            case  434 :
            {
                return MiningAmountBonus;
            }
            case  927 :
            {
                return MiningUpgradeCPUReductionBonus;
            }
            case  379 :
            {
                return RefiningYieldMutator;
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
    public IMetaGroup<CyberResourceProcessing> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CyberResourceProcessing>
    {
        public static final String RESOURCE_PATH = "SDE/items/implant/CyberResourceProcessing.yaml";
        private Map<String, CyberResourceProcessing> cache = (null);

        @Override
        public IMetaCategory<? super CyberResourceProcessing> category() {
            return Implant.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1229;
        }

        @Override
        public String getName() {
            return "CyberResourceProcessing";
        }

        @Override
        public synchronized Map<String, CyberResourceProcessing> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(CyberResourceProcessing.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CyberResourceProcessing> items;
        }
    }
}
