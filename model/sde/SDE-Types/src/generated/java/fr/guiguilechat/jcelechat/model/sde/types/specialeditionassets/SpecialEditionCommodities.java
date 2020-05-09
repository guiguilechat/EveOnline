package fr.guiguilechat.jcelechat.model.sde.types.specialeditionassets;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.BoosterLastInjectionDatetime;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.CpuMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.types.SpecialEditionAssets;
import org.yaml.snakeyaml.Yaml;

public class SpecialEditionCommodities
    extends SpecialEditionAssets
{
    /**
     * The last allowed injection date.  After this date the booster can no longer be consumed. Formatted YYYY.MM.DD HH:MM:SS
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double boosterlastinjectiondatetime;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacity;
    /**
     * Factor to adjust module cpu need by.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double cpumultiplier;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double mass;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double radius;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {Radius.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE, BoosterLastInjectionDatetime.INSTANCE, CpuMultiplier.INSTANCE })));
    public static final SpecialEditionCommodities.MetaGroup METAGROUP = new SpecialEditionCommodities.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2422 :
            {
                return boosterlastinjectiondatetime;
            }
            case  38 :
            {
                return capacity;
            }
            case  202 :
            {
                return cpumultiplier;
            }
            case  4 :
            {
                return mass;
            }
            case  162 :
            {
                return radius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<SpecialEditionCommodities> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SpecialEditionCommodities>
    {
        public static final String RESOURCE_PATH = "SDE/types/specialeditionassets/SpecialEditionCommodities.yaml";
        private Map<String, SpecialEditionCommodities> cache = (null);

        @Override
        public IMetaCategory<? super SpecialEditionCommodities> category() {
            return SpecialEditionAssets.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1194;
        }

        @Override
        public String getName() {
            return "SpecialEditionCommodities";
        }

        @Override
        public synchronized Map<String, SpecialEditionCommodities> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SpecialEditionCommodities.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SpecialEditionCommodities> types;
        }
    }
}
