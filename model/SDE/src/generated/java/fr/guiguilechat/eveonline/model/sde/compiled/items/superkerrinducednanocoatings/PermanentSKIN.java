
package fr.guiguilechat.eveonline.model.sde.compiled.items.superkerrinducednanocoatings;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.SuperKerrInducedNanocoatings;
import org.yaml.snakeyaml.Yaml;

public class PermanentSKIN
    extends SuperKerrInducedNanocoatings
{

    public final static String RESOURCE_PATH = "SDE/items/superkerrinducednanocoatings/PermanentSKIN.yaml";
    private static LinkedHashMap<String, PermanentSKIN> cache = (null);

    @Override
    public int getGroupId() {
        return  1950;
    }

    @Override
    public Class<?> getGroup() {
        return PermanentSKIN.class;
    }

    public static LinkedHashMap<String, PermanentSKIN> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(PermanentSKIN.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, PermanentSKIN> items;

    }

}
