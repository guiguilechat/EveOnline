package fr.guiguilechat.jcelechat.model.sde.items.types.decryptors;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.types.Decryptors;
import org.yaml.snakeyaml.Yaml;

public class DecryptorsMinmatar
    extends Decryptors
{
    public final static DecryptorsMinmatar.MetaGroup METAGROUP = new DecryptorsMinmatar.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/decryptors/DecryptorsMinmatar.yaml";
    private static Map<String, DecryptorsMinmatar> cache = (null);

    @Override
    public int getGroupId() {
        return  729;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<DecryptorsMinmatar> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, DecryptorsMinmatar> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DecryptorsMinmatar.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, DecryptorsMinmatar> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<DecryptorsMinmatar>
    {

        @Override
        public MetaCategory<? super DecryptorsMinmatar> category() {
            return Decryptors.METACAT;
        }

        @Override
        public String getName() {
            return "DecryptorsMinmatar";
        }

        @Override
        public Collection<DecryptorsMinmatar> items() {
            return (load().values());
        }
    }
}
