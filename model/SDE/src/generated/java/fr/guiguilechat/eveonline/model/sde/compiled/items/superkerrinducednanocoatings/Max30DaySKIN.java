
package fr.guiguilechat.eveonline.model.sde.compiled.items.superkerrinducednanocoatings;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.SuperKerrInducedNanocoatings;
import org.yaml.snakeyaml.Yaml;

public class Max30DaySKIN
    extends SuperKerrInducedNanocoatings
{

    public final static String RESOURCE_PATH = "SDE/items/superkerrinducednanocoatings/Max30DaySKIN.yaml";
    private static LinkedHashMap<String, Max30DaySKIN> cache = (null);

    @Override
    public int getGroupId() {
        return  1953;
    }

    @Override
    public Class<?> getGroup() {
        return Max30DaySKIN.class;
    }

    public static LinkedHashMap<String, Max30DaySKIN> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Max30DaySKIN.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, Max30DaySKIN> items;

    }

}
