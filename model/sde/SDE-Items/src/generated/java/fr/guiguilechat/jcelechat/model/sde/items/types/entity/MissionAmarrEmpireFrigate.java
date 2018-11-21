package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionAmarrEmpireFrigate
    extends Entity
{
    public final static MissionAmarrEmpireFrigate.MetaGroup METAGROUP = new MissionAmarrEmpireFrigate.MetaGroup();

    @Override
    public IMetaGroup<MissionAmarrEmpireFrigate> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionAmarrEmpireFrigate>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/MissionAmarrEmpireFrigate.yaml";
        private Map<String, MissionAmarrEmpireFrigate> cache = (null);

        @Override
        public IMetaCategory<? super MissionAmarrEmpireFrigate> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  665;
        }

        @Override
        public String getName() {
            return "MissionAmarrEmpireFrigate";
        }

        @Override
        public synchronized Map<String, MissionAmarrEmpireFrigate> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(MissionAmarrEmpireFrigate.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionAmarrEmpireFrigate> items;
        }
    }
}