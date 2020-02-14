package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class MissionGallenteFederationBattlecruiser
    extends Entity
{
    public static final MissionGallenteFederationBattlecruiser.MetaGroup METAGROUP = new MissionGallenteFederationBattlecruiser.MetaGroup();

    @Override
    public IMetaGroup<MissionGallenteFederationBattlecruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissionGallenteFederationBattlecruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/MissionGallenteFederationBattlecruiser.yaml";
        private Map<String, MissionGallenteFederationBattlecruiser> cache = (null);

        @Override
        public IMetaCategory<? super MissionGallenteFederationBattlecruiser> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  681;
        }

        @Override
        public String getName() {
            return "MissionGallenteFederationBattlecruiser";
        }

        @Override
        public synchronized Map<String, MissionGallenteFederationBattlecruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissionGallenteFederationBattlecruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissionGallenteFederationBattlecruiser> types;
        }
    }
}
