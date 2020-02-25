package fr.guiguilechat.jcelechat.model.sde.types.planetaryresources;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.PlanetaryResources;
import org.yaml.snakeyaml.Yaml;

public class PlanetOrganicRawResource
    extends PlanetaryResources
{
    public static final PlanetOrganicRawResource.MetaGroup METAGROUP = new PlanetOrganicRawResource.MetaGroup();

    @Override
    public IMetaGroup<PlanetOrganicRawResource> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<PlanetOrganicRawResource>
    {
        public static final String RESOURCE_PATH = "SDE/types/planetaryresources/PlanetOrganicRawResource.yaml";
        private Map<String, PlanetOrganicRawResource> cache = (null);

        @Override
        public IMetaCategory<? super PlanetOrganicRawResource> category() {
            return PlanetaryResources.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1035;
        }

        @Override
        public String getName() {
            return "PlanetOrganicRawResource";
        }

        @Override
        public synchronized Map<String, PlanetOrganicRawResource> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(PlanetOrganicRawResource.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, PlanetOrganicRawResource> types;
        }
    }
}