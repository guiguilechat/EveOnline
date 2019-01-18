package fr.guiguilechat.jcelechat.model.sde.items.types.asteroid;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Asteroid;
import org.yaml.snakeyaml.Yaml;

public class Mercoxit
    extends Asteroid
{
    /**
     * Number of items needed to be able to compress it
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CompressionQuantityNeeded;
    /**
     * What type this type can be compressed into
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CompressionTypeID;
    /**
     * %chance of new asteroid releasing damage cloud each mining turn.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double DamageCloudChance;
    /**
     * The type of damage cloud generated by the asteroid.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DamageCloudType;
    public static final Mercoxit.MetaGroup METAGROUP = new Mercoxit.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1941 :
            {
                return CompressionQuantityNeeded;
            }
            case  1940 :
            {
                return CompressionTypeID;
            }
            case  522 :
            {
                return DamageCloudChance;
            }
            case  546 :
            {
                return DamageCloudType;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Mercoxit> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Mercoxit>
    {
        public static final String RESOURCE_PATH = "SDE/items/asteroid/Mercoxit.yaml";
        private Map<String, Mercoxit> cache = (null);

        @Override
        public IMetaCategory<? super Mercoxit> category() {
            return Asteroid.METACAT;
        }

        @Override
        public int getGroupId() {
            return  468;
        }

        @Override
        public String getName() {
            return "Mercoxit";
        }

        @Override
        public synchronized Map<String, Mercoxit> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Mercoxit.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Mercoxit> items;
        }
    }
}
