package fr.guiguilechat.jcelechat.model.sde.types.material;

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
import fr.guiguilechat.jcelechat.model.sde.types.Material;
import org.yaml.snakeyaml.Yaml;

public class SalvagedMaterials
    extends Material
{
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    public static final SalvagedMaterials.MetaGroup METAGROUP = new SalvagedMaterials.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  9 :
            {
                return Hp;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<SalvagedMaterials> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SalvagedMaterials>
    {
        public static final String RESOURCE_PATH = "SDE/types/material/SalvagedMaterials.yaml";
        private Map<String, SalvagedMaterials> cache = (null);

        @Override
        public IMetaCategory<? super SalvagedMaterials> category() {
            return Material.METACAT;
        }

        @Override
        public int getGroupId() {
            return  754;
        }

        @Override
        public String getName() {
            return "SalvagedMaterials";
        }

        @Override
        public synchronized Map<String, SalvagedMaterials> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SalvagedMaterials.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SalvagedMaterials> types;
        }
    }
}