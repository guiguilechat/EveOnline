package fr.guiguilechat.jcelechat.model.sde.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class Services
    extends Infantry
{
    public static final Services.MetaGroup METAGROUP = new Services.MetaGroup();

    @Override
    public IMetaGroup<Services> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Services>
    {
        public static final String RESOURCE_PATH = "SDE/types/infantry/Services.yaml";
        private Map<String, Services> cache = (null);

        @Override
        public IMetaCategory<? super Services> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  367487;
        }

        @Override
        public String getName() {
            return "Services";
        }

        @Override
        public synchronized Map<String, Services> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Services.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Services> types;
        }
    }
}
