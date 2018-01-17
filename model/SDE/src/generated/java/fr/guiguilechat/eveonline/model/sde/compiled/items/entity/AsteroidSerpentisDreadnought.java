
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSerpentisDreadnought
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSerpentisDreadnought.yaml";
    private static LinkedHashMap<String, AsteroidSerpentisDreadnought> cache = (null);

    @Override
    public int getGroupId() {
        return  1689;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidSerpentisDreadnought.class;
    }

    public static LinkedHashMap<String, AsteroidSerpentisDreadnought> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidSerpentisDreadnought.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, AsteroidSerpentisDreadnought> items;

    }

}
