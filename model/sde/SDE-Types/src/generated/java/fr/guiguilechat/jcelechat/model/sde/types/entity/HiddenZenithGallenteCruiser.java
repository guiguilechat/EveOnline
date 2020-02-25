package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class HiddenZenithGallenteCruiser
    extends Entity
{
    public static final HiddenZenithGallenteCruiser.MetaGroup METAGROUP = new HiddenZenithGallenteCruiser.MetaGroup();

    @Override
    public IMetaGroup<HiddenZenithGallenteCruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<HiddenZenithGallenteCruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/HiddenZenithGallenteCruiser.yaml";
        private Map<String, HiddenZenithGallenteCruiser> cache = (null);

        @Override
        public IMetaCategory<? super HiddenZenithGallenteCruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1796;
        }

        @Override
        public String getName() {
            return "HiddenZenithGallenteCruiser";
        }

        @Override
        public synchronized Map<String, HiddenZenithGallenteCruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(HiddenZenithGallenteCruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, HiddenZenithGallenteCruiser> types;
        }
    }
}