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

public class IntermediateMaterials
    extends Material
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int MoonMiningAmount;
    public static final IntermediateMaterials.MetaGroup METAGROUP = new IntermediateMaterials.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  726 :
            {
                return MoonMiningAmount;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<IntermediateMaterials> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<IntermediateMaterials>
    {
        public static final String RESOURCE_PATH = "SDE/types/material/IntermediateMaterials.yaml";
        private Map<String, IntermediateMaterials> cache = (null);

        @Override
        public IMetaCategory<? super IntermediateMaterials> category() {
            return Material.METACAT;
        }

        @Override
        public int getGroupId() {
            return  428;
        }

        @Override
        public String getName() {
            return "IntermediateMaterials";
        }

        @Override
        public synchronized Map<String, IntermediateMaterials> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(IntermediateMaterials.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, IntermediateMaterials> types;
        }
    }
}
