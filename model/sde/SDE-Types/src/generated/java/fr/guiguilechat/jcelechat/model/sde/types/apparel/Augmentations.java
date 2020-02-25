package fr.guiguilechat.jcelechat.model.sde.types.apparel;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Augmentations
    extends Apparel
{
    public static final Augmentations.MetaGroup METAGROUP = new Augmentations.MetaGroup();

    @Override
    public IMetaGroup<Augmentations> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Augmentations>
    {
        public static final String RESOURCE_PATH = "SDE/types/apparel/Augmentations.yaml";
        private Map<String, Augmentations> cache = (null);

        @Override
        public IMetaCategory<? super Augmentations> category() {
            return Apparel.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1670;
        }

        @Override
        public String getName() {
            return "Augmentations";
        }

        @Override
        public synchronized Map<String, Augmentations> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Augmentations.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Augmentations> types;
        }
    }
}