package fr.guiguilechat.jcelechat.model.sde.items.types.decryptors;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.Decryptors;

public class GenericDecryptor
    extends Decryptors
{
    public final static String RESOURCE_PATH = "SDE/items/decryptors/GenericDecryptor.yaml";
    private static LinkedHashMap<String, GenericDecryptor> cache = (null);

    @Override
    public int getGroupId() {
        return  1304;
    }

    @Override
    public Class<?> getGroup() {
        return GenericDecryptor.class;
    }

    public static synchronized LinkedHashMap<String, GenericDecryptor> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(GenericDecryptor.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, GenericDecryptor> items;
    }
}