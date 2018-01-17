
package fr.guiguilechat.eveonline.model.sde.compiled.items.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Entity;
import org.yaml.snakeyaml.Yaml;

public class RoamingAngelCartelBattleship
    extends Entity
{

    public final static String RESOURCE_PATH = "SDE/items/entity/RoamingAngelCartelBattleship.yaml";
    private static LinkedHashMap<String, RoamingAngelCartelBattleship> cache = (null);

    @Override
    public int getGroupId() {
        return  1727;
    }

    @Override
    public Class<?> getGroup() {
        return RoamingAngelCartelBattleship.class;
    }

    public static LinkedHashMap<String, RoamingAngelCartelBattleship> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RoamingAngelCartelBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, RoamingAngelCartelBattleship> items;

    }

}
