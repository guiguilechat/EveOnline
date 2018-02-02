package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class AsteroidSanshaSNationCommanderDestroyer
    extends Entity
{
    public final static String RESOURCE_PATH = "SDE/items/entity/AsteroidSanshaSNationCommanderDestroyer.yaml";
    private static LinkedHashMap<String, AsteroidSanshaSNationCommanderDestroyer> cache = (null);

    @Override
    public int getGroupId() {
        return  809;
    }

    @Override
    public Class<?> getGroup() {
        return AsteroidSanshaSNationCommanderDestroyer.class;
    }

    public static synchronized LinkedHashMap<String, AsteroidSanshaSNationCommanderDestroyer> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AsteroidSanshaSNationCommanderDestroyer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AsteroidSanshaSNationCommanderDestroyer> items;
    }
}
