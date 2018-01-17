
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidRogueDroneDestroyer
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidRogueDroneDestroyer.yaml";
    private static LinkedHashMap<String, AsteroidRogueDroneDestroyer> cache = (null);

    @Override
    public int getGroupId() {
        return  758;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidRogueDroneDestroyer.class;
    }

    public static LinkedHashMap<String, AsteroidRogueDroneDestroyer> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidRogueDroneDestroyer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, AsteroidRogueDroneDestroyer> items;

    }

}
