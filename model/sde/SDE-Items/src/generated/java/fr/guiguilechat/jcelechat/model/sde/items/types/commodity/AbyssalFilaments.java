package fr.guiguilechat.jcelechat.model.sde.items.types.commodity;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class AbyssalFilaments
    extends Commodity
{
    /**
     * sets the difficulty tier for abyssal deadspace keys
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int DifficultyTier;
    /**
     * sets the weather effect type for abyssal deadspace keys
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WeatherID;
    public final static AbyssalFilaments.MetaGroup METAGROUP = new AbyssalFilaments.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/commodity/AbyssalFilaments.yaml";
    private static Map<String, AbyssalFilaments> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2761 :
            {
                return DifficultyTier;
            }
            case  2760 :
            {
                return WeatherID;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1979;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<AbyssalFilaments> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, AbyssalFilaments> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AbyssalFilaments.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, AbyssalFilaments> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<AbyssalFilaments>
    {

        @Override
        public MetaCategory<? super AbyssalFilaments> category() {
            return Commodity.METACAT;
        }

        @Override
        public String getName() {
            return "AbyssalFilaments";
        }

        @Override
        public Collection<AbyssalFilaments> items() {
            return (load().values());
        }
    }
}
