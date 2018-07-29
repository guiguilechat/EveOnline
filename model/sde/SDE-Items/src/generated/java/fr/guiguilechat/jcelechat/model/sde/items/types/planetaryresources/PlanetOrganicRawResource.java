package fr.guiguilechat.jcelechat.model.sde.items.types.planetaryresources;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.PlanetaryResources;

public class PlanetOrganicRawResource
    extends PlanetaryResources
{
    public final static String RESOURCE_PATH = "SDE/items/planetaryresources/PlanetOrganicRawResource.yaml";
    private static LinkedHashMap<String, PlanetOrganicRawResource> cache = (null);

    @Override
    public int getGroupId() {
        return  1035;
    }

    @Override
    public Class<?> getGroup() {
        return PlanetOrganicRawResource.class;
    }

    public static synchronized LinkedHashMap<String, PlanetOrganicRawResource> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(PlanetOrganicRawResource.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, PlanetOrganicRawResource> items;
    }
}