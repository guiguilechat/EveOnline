package fr.guiguilechat.jcelechat.model.sde.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class CapturePoint
    extends Entity
{
    public static final CapturePoint.MetaGroup METAGROUP = new CapturePoint.MetaGroup();

    @Override
    public IMetaGroup<CapturePoint> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CapturePoint>
    {
        public static final String RESOURCE_PATH = "SDE/types/entity/CapturePoint.yaml";
        private Map<String, CapturePoint> cache = (null);

        @Override
        public IMetaCategory<? super CapturePoint> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  922;
        }

        @Override
        public String getName() {
            return "CapturePoint";
        }

        @Override
        public synchronized Map<String, CapturePoint> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(CapturePoint.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CapturePoint> types;
        }
    }
}