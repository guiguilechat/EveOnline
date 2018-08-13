package fr.guiguilechat.jcelechat.model.sde.items.types.reaction;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.types.Reaction;
import org.yaml.snakeyaml.Yaml;

public class FreedomPrograms
    extends Reaction
{
    public final static FreedomPrograms.MetaGroup METAGROUP = new FreedomPrograms.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/reaction/FreedomPrograms.yaml";
    private static Map<String, FreedomPrograms> cache = (null);

    @Override
    public int getGroupId() {
        return  881;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<FreedomPrograms> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, FreedomPrograms> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(FreedomPrograms.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, FreedomPrograms> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<FreedomPrograms>
    {

        @Override
        public MetaCategory<? super FreedomPrograms> category() {
            return Reaction.METACAT;
        }

        @Override
        public String getName() {
            return "FreedomPrograms";
        }

        @Override
        public Collection<FreedomPrograms> items() {
            return (load().values());
        }
    }
}
