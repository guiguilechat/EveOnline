
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidGuristasDestroyer
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidGuristasDestroyer.yaml";
    private static LinkedHashMap<String, AsteroidGuristasDestroyer> cache = (null);

    @Override
    public int getGroupId() {
        return  579;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidGuristasDestroyer.class;
    }

    public static LinkedHashMap<String, AsteroidGuristasDestroyer> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidGuristasDestroyer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, AsteroidGuristasDestroyer> items;

    }

}
