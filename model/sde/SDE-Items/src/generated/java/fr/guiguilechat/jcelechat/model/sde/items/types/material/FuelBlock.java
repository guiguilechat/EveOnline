package fr.guiguilechat.jcelechat.model.sde.items.types.material;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.types.Material;
import org.yaml.snakeyaml.Yaml;

public class FuelBlock
    extends Material
{
    public final static String RESOURCE_PATH = "SDE/items/material/FuelBlock.yaml";
    private static Map<String, FuelBlock> cache = (null);

    @Override
    public int getGroupId() {
        return  1136;
    }

    @Override
    public Class<?> getGroup() {
        return FuelBlock.class;
    }

    public static synchronized Map<String, FuelBlock> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FuelBlock.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, FuelBlock> items;
    }
}
