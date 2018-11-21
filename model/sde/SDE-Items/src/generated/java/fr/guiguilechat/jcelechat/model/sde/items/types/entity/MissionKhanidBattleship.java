package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionKhanidBattleship
    extends Entity
{
    public final static MissionKhanidBattleship.MetaGroup METAGROUP = new MissionKhanidBattleship.MetaGroup();

    @Override
    public IMetaGroup<MissionKhanidBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionKhanidBattleship>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/MissionKhanidBattleship.yaml";
        private Map<String, MissionKhanidBattleship> cache = (null);

        @Override
        public IMetaCategory<? super MissionKhanidBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  691;
        }

        @Override
        public String getName() {
            return "MissionKhanidBattleship";
        }

        @Override
        public synchronized Map<String, MissionKhanidBattleship> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(MissionKhanidBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionKhanidBattleship> items;
        }
    }
}