package fr.guiguilechat.jcelechat.model.sde.types.accessories;

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
import fr.guiguilechat.jcelechat.model.sde.types.Accessories;
import org.yaml.snakeyaml.Yaml;

public class LegacyCurrency
    extends Accessories
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AurumConversionRate;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Capacity;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Mass;
    /**
     * Number of days that this PLEX adds to your account
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NumDays;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Radius;
    public static final LegacyCurrency.MetaGroup METAGROUP = new LegacyCurrency.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1818 :
            {
                return AurumConversionRate;
            }
            case  38 :
            {
                return Capacity;
            }
            case  4 :
            {
                return Mass;
            }
            case  1551 :
            {
                return NumDays;
            }
            case  162 :
            {
                return Radius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<LegacyCurrency> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<LegacyCurrency>
    {
        public static final String RESOURCE_PATH = "SDE/types/accessories/LegacyCurrency.yaml";
        private Map<String, LegacyCurrency> cache = (null);

        @Override
        public IMetaCategory<? super LegacyCurrency> category() {
            return Accessories.METACAT;
        }

        @Override
        public int getGroupId() {
            return  943;
        }

        @Override
        public String getName() {
            return "LegacyCurrency";
        }

        @Override
        public synchronized Map<String, LegacyCurrency> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(LegacyCurrency.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, LegacyCurrency> types;
        }
    }
}
