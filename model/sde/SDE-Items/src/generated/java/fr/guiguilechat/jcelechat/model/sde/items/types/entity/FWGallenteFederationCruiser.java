package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class FWGallenteFederationCruiser
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/FWGallenteFederationCruiser.yaml";
    private static LinkedHashMap<String, FWGallenteFederationCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  1181;
    }

    @Override
    public Class<?> getGroup() {
        return FWGallenteFederationCruiser.class;
    }

    public static synchronized LinkedHashMap<String, FWGallenteFederationCruiser> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FWGallenteFederationCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, FWGallenteFederationCruiser> items;
    }
}