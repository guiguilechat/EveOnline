package fr.guiguilechat.jcelechat.model.sde.types.starbase;

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
import fr.guiguilechat.jcelechat.model.sde.types.Starbase;
import org.yaml.snakeyaml.Yaml;

public class MoonMining
    extends Starbase
{
    /**
     * Whether the structure requires the anchorers alliance to hold sovereignty in the system for it to be anchorable.  Only enforced if the security level is 0.4 or less.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AnchoringRequiresSovereignty;
    /**
     * The maximum security level at which the structure can be anchored. Used as a non-functional display attribute on some deployables.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double AnchoringSecurityLevelMax;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityAntiCapitalMissileResistance;
    /**
     * The quality of the material harvested.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int HarvesterQuality;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * DO NOT MESS WITH This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldUniformity;
    /**
     * This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Uniformity;
    public static final MoonMining.MetaGroup METAGROUP = new MoonMining.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1033 :
            {
                return AnchoringRequiresSovereignty;
            }
            case  1032 :
            {
                return AnchoringSecurityLevelMax;
            }
            case  50 :
            {
                return Cpu;
            }
            case  2244 :
            {
                return FighterAbilityAntiCapitalMissileResistance;
            }
            case  710 :
            {
                return HarvesterQuality;
            }
            case  30 :
            {
                return Power;
            }
            case  484 :
            {
                return ShieldUniformity;
            }
            case  136 :
            {
                return Uniformity;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<MoonMining> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MoonMining>
    {
        public static final String RESOURCE_PATH = "SDE/types/starbase/MoonMining.yaml";
        private Map<String, MoonMining> cache = (null);

        @Override
        public IMetaCategory<? super MoonMining> category() {
            return Starbase.METACAT;
        }

        @Override
        public int getGroupId() {
            return  416;
        }

        @Override
        public String getName() {
            return "MoonMining";
        }

        @Override
        public synchronized Map<String, MoonMining> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MoonMining.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MoonMining> types;
        }
    }
}