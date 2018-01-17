
package fr.guiguilechat.eveonline.model.sde.compiled.items.material;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Material;
import org.yaml.snakeyaml.Yaml;

public class RogueDroneComponents
    extends Material
{

    public final static String RESOURCE_PATH = "SDE/items/material/RogueDroneComponents.yaml";
    private static LinkedHashMap<String, RogueDroneComponents> cache = (null);

    @Override
    public int getGroupId() {
        return  886;
    }

    @Override
    public Class<?> getGroup() {
        return RogueDroneComponents.class;
    }

    public static LinkedHashMap<String, RogueDroneComponents> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RogueDroneComponents.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, RogueDroneComponents> items;

    }

}
