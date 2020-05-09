package fr.guiguilechat.jcelechat.model.sde.types.commodity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class Radioactive
    extends Commodity
{
    public static final Set<Attribute> ATTRIBUTES = Collections.emptySet();
    public static final Radioactive.MetaGroup METAGROUP = new Radioactive.MetaGroup();

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<Radioactive> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Radioactive>
    {
        public static final String RESOURCE_PATH = "SDE/types/commodity/Radioactive.yaml";
        private Map<String, Radioactive> cache = (null);

        @Override
        public IMetaCategory<? super Radioactive> category() {
            return Commodity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  282;
        }

        @Override
        public String getName() {
            return "Radioactive";
        }

        @Override
        public synchronized Map<String, Radioactive> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Radioactive.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Radioactive> types;
        }
    }
}
