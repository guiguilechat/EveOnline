
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceSanshaSNationBattleCruiser
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/entity/DeadspaceSanshaSNationBattleCruiser.yaml";
    private static LinkedHashMap<String, DeadspaceSanshaSNationBattleCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  620;
    }

    @Override
    public Class<?> getGroup() {
        return DeadspaceSanshaSNationBattleCruiser.class;
    }

    public static LinkedHashMap<String, DeadspaceSanshaSNationBattleCruiser> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, DeadspaceSanshaSNationBattleCruiser> items;

    }

}
