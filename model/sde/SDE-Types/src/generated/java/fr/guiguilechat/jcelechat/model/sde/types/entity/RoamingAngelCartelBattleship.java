package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class RoamingAngelCartelBattleship
    extends Entity
{
    public static final RoamingAngelCartelBattleship.MetaGroup METAGROUP = new RoamingAngelCartelBattleship.MetaGroup();

    @Override
    public IMetaGroup<RoamingAngelCartelBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<RoamingAngelCartelBattleship>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/RoamingAngelCartelBattleship.yaml";
        private Map<String, RoamingAngelCartelBattleship> cache = (null);

        @Override
        public IMetaCategory<? super RoamingAngelCartelBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1727;
        }

        @Override
        public String getName() {
            return "RoamingAngelCartelBattleship";
        }

        @Override
        public synchronized Map<String, RoamingAngelCartelBattleship> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(RoamingAngelCartelBattleship.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, RoamingAngelCartelBattleship> types;
        }
    }
}