package fr.guiguilechat.jcelechat.model.sde.items.types.planetaryinteraction;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.PlanetaryInteraction;
import org.yaml.snakeyaml.Yaml;

public class StorageFacilities
    extends PlanetaryInteraction
{
    /**
     * CPU load of ship
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuLoad;
    /**
     * This type can only be found/used/created on a planet matching this type ID.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PlanetRestriction;
    /**
     * Current load of power core
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PowerLoad;
    public final static StorageFacilities.MetaGroup METAGROUP = new StorageFacilities.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/planetaryinteraction/StorageFacilities.yaml";
    private static Map<String, StorageFacilities> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  49 :
            {
                return CpuLoad;
            }
            case  1632 :
            {
                return PlanetRestriction;
            }
            case  15 :
            {
                return PowerLoad;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1029;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<StorageFacilities> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, StorageFacilities> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StorageFacilities.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, StorageFacilities> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<StorageFacilities>
    {

        @Override
        public MetaCategory<? super StorageFacilities> category() {
            return PlanetaryInteraction.METACAT;
        }

        @Override
        public String getName() {
            return "StorageFacilities";
        }

        @Override
        public Collection<StorageFacilities> items() {
            return (load().values());
        }
    }
}
