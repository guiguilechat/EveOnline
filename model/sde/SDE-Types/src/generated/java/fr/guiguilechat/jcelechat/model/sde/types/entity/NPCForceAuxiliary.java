package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class NPCForceAuxiliary
    extends Entity
{
    public static final NPCForceAuxiliary.MetaGroup METAGROUP = new NPCForceAuxiliary.MetaGroup();

    @Override
    public IMetaGroup<NPCForceAuxiliary> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<NPCForceAuxiliary>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/NPCForceAuxiliary.yaml";
        private Map<String, NPCForceAuxiliary> cache = (null);

        @Override
        public IMetaCategory<? super NPCForceAuxiliary> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1879;
        }

        @Override
        public String getName() {
            return "NPCForceAuxiliary";
        }

        @Override
        public synchronized Map<String, NPCForceAuxiliary> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(NPCForceAuxiliary.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, NPCForceAuxiliary> types;
        }
    }
}