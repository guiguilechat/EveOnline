package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class FWInfrastructureHub
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/FWInfrastructureHub.yaml";
    private static LinkedHashMap<String, FWInfrastructureHub> cache = (null);

    @Override
    public int getGroupId() {
        return  925;
    }

    @Override
    public Class<?> getGroup() {
        return FWInfrastructureHub.class;
    }

    public static synchronized LinkedHashMap<String, FWInfrastructureHub> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FWInfrastructureHub.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, FWInfrastructureHub> items;
    }
}