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

public class CyberNavigation
    extends Implant
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
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
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
     * Autogenerated skill attribute, warpCapacitorNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpCapacitorNeedBonus;
    public final static CyberNavigation.MetaGroup METAGROUP = new CyberNavigation.MetaGroup();

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
            case  66 :
            {
                return DurationBonus;
            }
            case  1076 :
            {
                return ImplantBonusVelocity;
            }
            case  331 :
            {
                return Implantness;
            }
            case  318 :
            {
                return SpeedFBonus;
            }
            case  422 :
            {
                return TechLevel;
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
    public IMetaGroup<CyberNavigation> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CyberNavigation>
    {
        public final static String RESOURCE_PATH = "SDE/items/implant/CyberNavigation.yaml";
        private Map<String, CyberNavigation> cache = (null);

        @Override
        public IMetaCategory<? super CyberNavigation> category() {
            return Implant.METACAT;
        }

        @Override
        public int getGroupId() {
            return  747;
        }

        @Override
        public String getName() {
            return "CyberNavigation";
        }

        @Override
        public synchronized Map<String, CyberNavigation> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(CyberNavigation.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CyberNavigation> items;
        }
    }
}
