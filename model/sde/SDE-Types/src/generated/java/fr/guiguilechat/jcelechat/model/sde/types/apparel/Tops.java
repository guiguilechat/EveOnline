package fr.guiguilechat.jcelechat.model.sde.types.apparel;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Tops
    extends Apparel
{
    public static final Tops.MetaGroup METAGROUP = new Tops.MetaGroup();

    @Override
    public IMetaGroup<Tops> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Tops>
    {
        public static final String RESOURCE_PATH = "SDE/types/apparel/Tops.yaml";
        private Map<String, Tops> cache = (null);

        @Override
        public IMetaCategory<? super Tops> category() {
            return Apparel.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1089;
        }

        @Override
        public String getName() {
            return "Tops";
        }

        @Override
        public synchronized Map<String, Tops> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Tops.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Tops> types;
        }
    }
}