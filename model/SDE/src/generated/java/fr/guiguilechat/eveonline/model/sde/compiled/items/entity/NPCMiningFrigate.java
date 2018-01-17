
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class NPCMiningFrigate
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/NPCMiningFrigate.yaml";
    private static LinkedHashMap<String, NPCMiningFrigate> cache = (null);

    @Override
    public int getGroupId() {
        return  1764;
    }

    @Override
    public Class<?> getGroup() {
        return NPCMiningFrigate.class;
    }

    public static LinkedHashMap<String, NPCMiningFrigate> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(NPCMiningFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, NPCMiningFrigate> items;

    }

}
