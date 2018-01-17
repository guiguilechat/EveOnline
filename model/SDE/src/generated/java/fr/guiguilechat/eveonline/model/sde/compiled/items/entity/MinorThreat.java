
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class MinorThreat
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/MinorThreat.yaml";
    private static LinkedHashMap<String, MinorThreat> cache = (null);

    @Override
    public int getGroupId() {
        return  286;
    }

    @Override
    public Class<?> getGroup() {
        return MinorThreat.class;
    }

    public static LinkedHashMap<String, MinorThreat> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MinorThreat.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, MinorThreat> items;

    }

}
