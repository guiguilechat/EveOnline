package fr.guiguilechat.jcelechat.model.sde.items.types.apparel;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.types.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Eyewear
    extends Apparel
{
    public final static Eyewear.MetaGroup METAGROUP = new Eyewear.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/apparel/Eyewear.yaml";
    private static Map<String, Eyewear> cache = (null);

    @Override
    public int getGroupId() {
        return  1083;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Eyewear> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, Eyewear> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Eyewear.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Eyewear> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Eyewear>
    {

        @Override
        public MetaCategory<? super Eyewear> category() {
            return Apparel.METACAT;
        }

        @Override
        public String getName() {
            return "Eyewear";
        }

        @Override
        public Collection<Eyewear> items() {
            return (load().values());
        }
    }
}
