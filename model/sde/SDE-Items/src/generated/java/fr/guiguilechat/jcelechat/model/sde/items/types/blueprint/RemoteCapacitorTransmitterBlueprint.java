package fr.guiguilechat.jcelechat.model.sde.items.types.blueprint;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class RemoteCapacitorTransmitterBlueprint
    extends Blueprint
{
    /**
     * This is a bookkeeping attribute for blueprints, which will hopefully be deprecated by the end of 2014
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IndustryBlueprintRank;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public final static RemoteCapacitorTransmitterBlueprint.MetaGroup METAGROUP = new RemoteCapacitorTransmitterBlueprint.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/blueprint/RemoteCapacitorTransmitterBlueprint.yaml";
    private static Map<String, RemoteCapacitorTransmitterBlueprint> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1955 :
            {
                return IndustryBlueprintRank;
            }
            case  422 :
            {
                return TechLevel;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  147;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<RemoteCapacitorTransmitterBlueprint> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, RemoteCapacitorTransmitterBlueprint> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RemoteCapacitorTransmitterBlueprint.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, RemoteCapacitorTransmitterBlueprint> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<RemoteCapacitorTransmitterBlueprint>
    {

        @Override
        public MetaCategory<? super RemoteCapacitorTransmitterBlueprint> category() {
            return Blueprint.METACAT;
        }

        @Override
        public String getName() {
            return "RemoteCapacitorTransmitterBlueprint";
        }

        @Override
        public Collection<RemoteCapacitorTransmitterBlueprint> items() {
            return (load().values());
        }
    }
}
