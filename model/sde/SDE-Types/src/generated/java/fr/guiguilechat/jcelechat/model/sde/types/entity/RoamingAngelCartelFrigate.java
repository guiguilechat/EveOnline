package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RoamingAngelCartelFrigate
    extends Entity
{
    public static final RoamingAngelCartelFrigate.MetaGroup METAGROUP = new RoamingAngelCartelFrigate.MetaGroup();

    @Override
    public IMetaGroup<RoamingAngelCartelFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RoamingAngelCartelFrigate>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/RoamingAngelCartelFrigate.yaml";
        private Map<String, RoamingAngelCartelFrigate> cache = (null);

        @Override
        public IMetaCategory<? super RoamingAngelCartelFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1729;
        }

        @Override
        public String getName() {
            return "RoamingAngelCartelFrigate";
        }

        @Override
        public synchronized Map<String, RoamingAngelCartelFrigate> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RoamingAngelCartelFrigate.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RoamingAngelCartelFrigate> types;
        }
    }
}