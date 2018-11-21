package fr.guiguilechat.jcelechat.model.sde.items.types.station;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import org.yaml.snakeyaml.Yaml;

public class Station
    extends fr.guiguilechat.jcelechat.model.sde.items.types.Station
{
    public final static Station.MetaGroup METAGROUP = new Station.MetaGroup();

    @Override
    public IMetaGroup<Station> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Station>
    {
        public final static String RESOURCE_PATH = "SDE/items/station/Station.yaml";
        private Map<String, Station> cache = (null);

        @Override
        public IMetaCategory<? super Station> category() {
            return fr.guiguilechat.jcelechat.model.sde.items.types.Station.METACAT;
        }

        @Override
        public int getGroupId() {
            return  15;
        }

        @Override
        public String getName() {
            return "Station";
        }

        @Override
        public synchronized Map<String, Station> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Station.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Station> items;
        }
    }
}