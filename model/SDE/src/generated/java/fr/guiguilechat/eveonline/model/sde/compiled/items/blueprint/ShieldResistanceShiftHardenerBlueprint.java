
package fr.guiguilechat.eveonline.model.sde.compiled.items.blueprint;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class ShieldResistanceShiftHardenerBlueprint
    extends Blueprint
{

    public final static String RESOURCE_PATH = "SDE/items/blueprint/ShieldResistanceShiftHardenerBlueprint.yaml";
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
                cache = new Yaml().loadAs(new InputStreamReader(ShieldResistanceShiftHardenerBlueprint.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, ShieldResistanceShiftHardenerBlueprint> items;

    }

}
