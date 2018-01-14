
package fr.guiguilechat.eveonline.model.sde.compiled.items.blueprint;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class ShieldResistanceShiftHardenerBlueprint
    extends Blueprint
{

    public final static String RESOURCE_PATH = "SDE/blueprint/ShieldResistanceShiftHardenerBlueprint.yaml";
    private static LinkedHashMap<String, ShieldResistanceShiftHardenerBlueprint> cache = (null);

    @Override
    public int getGroupId() {
        return  1723;
    }

    @Override
    public Class<?> getGroup() {
        return ShieldResistanceShiftHardenerBlueprint.class;
    }

    public static LinkedHashMap<String, ShieldResistanceShiftHardenerBlueprint> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, ShieldResistanceShiftHardenerBlueprint> items;

    }

}
