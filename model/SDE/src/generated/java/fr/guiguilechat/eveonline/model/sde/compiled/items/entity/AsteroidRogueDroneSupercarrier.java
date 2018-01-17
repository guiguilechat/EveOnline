
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidRogueDroneSupercarrier
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidRogueDroneSupercarrier.yaml";
    private static LinkedHashMap<String, AsteroidRogueDroneSupercarrier> cache = (null);

    @Override
    public int getGroupId() {
        return  1692;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidRogueDroneSupercarrier.class;
    }

    public static LinkedHashMap<String, AsteroidRogueDroneSupercarrier> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidRogueDroneSupercarrier.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, AsteroidRogueDroneSupercarrier> items;

    }

}
