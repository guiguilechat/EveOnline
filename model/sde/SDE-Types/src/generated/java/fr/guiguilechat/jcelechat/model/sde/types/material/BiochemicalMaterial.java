package fr.guiguilechat.jcelechat.model.sde.types.material;

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
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MoonMiningAmount;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.types.Material;
import org.yaml.snakeyaml.Yaml;

public class BiochemicalMaterial
    extends Material
{
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacity;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double mass;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int moonminingamount;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double radius;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {Radius.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE, MoonMiningAmount.INSTANCE })));
    public static final BiochemicalMaterial.MetaGroup METAGROUP = new BiochemicalMaterial.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  38 :
            {
                return capacity;
            }
            case  4 :
            {
                return mass;
            }
            case  726 :
            {
                return moonminingamount;
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
    public IMetaGroup<BiochemicalMaterial> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<BiochemicalMaterial>
    {
        public static final String RESOURCE_PATH = "SDE/types/material/BiochemicalMaterial.yaml";
        private Map<String, BiochemicalMaterial> cache = (null);

        @Override
        public IMetaCategory<? super BiochemicalMaterial> category() {
            return Material.METACAT;
        }

        @Override
        public int getGroupId() {
            return  712;
        }

        @Override
        public String getName() {
            return "BiochemicalMaterial";
        }

        @Override
        public synchronized Map<String, BiochemicalMaterial> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(BiochemicalMaterial.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, BiochemicalMaterial> types;
        }
    }
}
