package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class HiddenZenithGallenteBattleship
    extends Entity
{
    public static final HiddenZenithGallenteBattleship.MetaGroup METAGROUP = new HiddenZenithGallenteBattleship.MetaGroup();

    @Override
    public IMetaGroup<HiddenZenithGallenteBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<HiddenZenithGallenteBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/HiddenZenithGallenteBattleship.yaml";
        private Map<String, HiddenZenithGallenteBattleship> cache = (null);

        @Override
        public IMetaCategory<? super HiddenZenithGallenteBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1795;
        }

        @Override
        public String getName() {
            return "HiddenZenithGallenteBattleship";
        }

        @Override
        public synchronized Map<String, HiddenZenithGallenteBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(HiddenZenithGallenteBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, HiddenZenithGallenteBattleship> types;
        }
    }
}