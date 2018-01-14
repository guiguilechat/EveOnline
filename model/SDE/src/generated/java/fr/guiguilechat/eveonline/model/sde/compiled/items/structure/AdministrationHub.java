
package fr.guiguilechat.eveonline.model.sde.compiled.items.structure;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Structure;
import org.yaml.snakeyaml.Yaml;

public class AdministrationHub
    extends Structure
{

    public final static String RESOURCE_PATH = "SDE/structure/AdministrationHub.yaml";
    private static LinkedHashMap<String, AdministrationHub> cache = (null);

    @Override
    public int getGroupId() {
        return  1409;
    }

    @Override
    public Class<?> getGroup() {
        return AdministrationHub.class;
    }

    public static LinkedHashMap<String, AdministrationHub> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, AdministrationHub> items;

    }

}
