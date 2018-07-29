package fr.guiguilechat.jcelechat.model.sde.items.types.blueprint;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Blueprint;

public class ExoticPlasmaChargeBlueprint
    extends Blueprint
{
    public final static String RESOURCE_PATH = "SDE/items/blueprint/ExoticPlasmaChargeBlueprint.yaml";
    private static LinkedHashMap<String, ExoticPlasmaChargeBlueprint> cache = (null);

    @Override
    public int getGroupId() {
        return  1993;
    }

    @Override
    public Class<?> getGroup() {
        return ExoticPlasmaChargeBlueprint.class;
    }

    public static synchronized LinkedHashMap<String, ExoticPlasmaChargeBlueprint> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(ExoticPlasmaChargeBlueprint.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, ExoticPlasmaChargeBlueprint> items;
    }
}