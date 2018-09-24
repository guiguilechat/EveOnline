package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class DeadspaceAngelCartelFrigate
    extends Entity
{
    public final static DeadspaceAngelCartelFrigate.MetaGroup METAGROUP = new DeadspaceAngelCartelFrigate.MetaGroup();

    @Override
    public IMetaGroup<DeadspaceAngelCartelFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<DeadspaceAngelCartelFrigate>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/DeadspaceAngelCartelFrigate.yaml";
        private Map<String, DeadspaceAngelCartelFrigate> cache = (null);

        @Override
        public IMetaCategory<? super DeadspaceAngelCartelFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  597;
        }

        @Override
        public String getName() {
            return "DeadspaceAngelCartelFrigate";
        }

        @Override
        public synchronized Map<String, DeadspaceAngelCartelFrigate> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(DeadspaceAngelCartelFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, DeadspaceAngelCartelFrigate> items;
        }
    }
}
