package fr.guiguilechat.jcelechat.model.sde.types.commodity;

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
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.InventionMEModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.InventionMaxRunModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.InventionPropabilityMultiplier;
import fr.guiguilechat.jcelechat.model.sde.attributes.InventionTEModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class DecryptorsSleepers
    extends Commodity
{
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacity;
    /**
     * Modifies the mineral efficiency of invented BPCs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double inventionmemodifier;
    /**
     * Modifies the max runs in a blueprint created through invention
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double inventionmaxrunmodifier;
    /**
     * Modifies base chance of successful invention
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double inventionpropabilitymultiplier;
    /**
     * Modifies the time efficiency of invented BPCs
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double inventiontemodifier;
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
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {Radius.INSTANCE, InventionMaxRunModifier.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE, InventionPropabilityMultiplier.INSTANCE, InventionMEModifier.INSTANCE, InventionTEModifier.INSTANCE })));
    public static final DecryptorsSleepers.MetaGroup METAGROUP = new DecryptorsSleepers.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  38 :
            {
                return capacity;
            }
            case  1113 :
            {
                return inventionmemodifier;
            }
            case  1124 :
            {
                return inventionmaxrunmodifier;
            }
            case  1112 :
            {
                return inventionpropabilitymultiplier;
            }
            case  1114 :
            {
                return inventiontemodifier;
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
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<DecryptorsSleepers> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DecryptorsSleepers>
    {
        public static final String RESOURCE_PATH = "SDE/types/commodity/DecryptorsSleepers.yaml";
        private Map<String, DecryptorsSleepers> cache = (null);

        @Override
        public IMetaCategory<? super DecryptorsSleepers> category() {
            return Commodity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  732;
        }

        @Override
        public String getName() {
            return "DecryptorsSleepers";
        }

        @Override
        public synchronized Map<String, DecryptorsSleepers> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(DecryptorsSleepers.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DecryptorsSleepers> types;
        }
    }
}
