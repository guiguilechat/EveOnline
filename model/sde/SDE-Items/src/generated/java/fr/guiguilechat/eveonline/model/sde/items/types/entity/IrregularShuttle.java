package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class IrregularShuttle
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/IrregularShuttle.yaml";
    private static LinkedHashMap<String, IrregularShuttle> cache = (null);

    @Override
    public int getGroupId() {
        return  1566;
    }

    @Override
    public Class<?> getGroup() {
        return IrregularShuttle.class;
    }

    public static synchronized LinkedHashMap<String, IrregularShuttle> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(IrregularShuttle.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, IrregularShuttle> items;
    }
}
