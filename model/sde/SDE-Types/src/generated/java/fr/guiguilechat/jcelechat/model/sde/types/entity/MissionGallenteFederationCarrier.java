package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionGallenteFederationCarrier
    extends Entity
{
    public static final MissionGallenteFederationCarrier.MetaGroup METAGROUP = new MissionGallenteFederationCarrier.MetaGroup();

    @Override
    public IMetaGroup<MissionGallenteFederationCarrier> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionGallenteFederationCarrier>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionGallenteFederationCarrier.yaml";
        private Map<String, MissionGallenteFederationCarrier> cache = (null);

        @Override
        public IMetaCategory<? super MissionGallenteFederationCarrier> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  867;
        }

        @Override
        public String getName() {
            return "MissionGallenteFederationCarrier";
        }

        @Override
        public synchronized Map<String, MissionGallenteFederationCarrier> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionGallenteFederationCarrier.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionGallenteFederationCarrier> types;
        }
    }
}