package fr.guiguilechat.jcelechat.model.sde.items.types.structure;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Structure;

public class Stargate
    extends Structure
{
    public final static String RESOURCE_PATH = "SDE/items/structure/Stargate.yaml";
    private static LinkedHashMap<String, Stargate> cache = (null);

    @Override
    public int getGroupId() {
        return  1408;
    }

    @Override
    public Class<?> getGroup() {
        return Stargate.class;
    }

    public static synchronized LinkedHashMap<String, Stargate> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Stargate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, Stargate> items;
    }
}