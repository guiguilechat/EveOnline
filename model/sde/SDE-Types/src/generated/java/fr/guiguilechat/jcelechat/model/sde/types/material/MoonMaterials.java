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

public class MoonMaterials
    extends Material
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int MoonMiningAmount;
    public static final MoonMaterials.MetaGroup METAGROUP = new MoonMaterials.MetaGroup();

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
    public IMetaGroup<MoonMaterials> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MoonMaterials>
    {
        public static final String RESOURCE_PATH = "SDE/types/material/MoonMaterials.yaml";
        private Map<String, MoonMaterials> cache = (null);

        @Override
        public IMetaCategory<? super MoonMaterials> category() {
            return Material.METACAT;
        }

        @Override
        public int getGroupId() {
            return  427;
        }

        @Override
        public String getName() {
            return "MoonMaterials";
        }

        @Override
        public synchronized Map<String, MoonMaterials> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MoonMaterials.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MoonMaterials> types;
        }
    }
}
