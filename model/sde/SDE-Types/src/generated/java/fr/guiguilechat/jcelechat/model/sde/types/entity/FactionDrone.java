package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class FactionDrone
    extends Entity
{
    public static final FactionDrone.MetaGroup METAGROUP = new FactionDrone.MetaGroup();

    @Override
    public IMetaGroup<FactionDrone> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<FactionDrone>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/FactionDrone.yaml";
        private Map<String, FactionDrone> cache = (null);

        @Override
        public IMetaCategory<? super FactionDrone> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  288;
        }

        @Override
        public String getName() {
            return "FactionDrone";
        }

        @Override
        public synchronized Map<String, FactionDrone> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(FactionDrone.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, FactionDrone> types;
        }
    }
}
