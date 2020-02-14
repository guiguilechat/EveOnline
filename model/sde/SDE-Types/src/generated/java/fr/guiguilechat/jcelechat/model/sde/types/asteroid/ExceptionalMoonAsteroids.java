package fr.guiguilechat.jcelechat.model.sde.types.asteroid;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Asteroid;
import org.yaml.snakeyaml.Yaml;

public class ExceptionalMoonAsteroids
    extends Asteroid
{
    /**
     * max visual size for asteroids to fit moon chunk
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(16255)
    public int AsteroidMaxRadius;
    public static final ExceptionalMoonAsteroids.MetaGroup METAGROUP = new ExceptionalMoonAsteroids.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2727 :
            {
                return AsteroidMaxRadius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<ExceptionalMoonAsteroids> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<ExceptionalMoonAsteroids>
    {
        public static final String RESOURCE_PATH = "SDE/types/asteroid/ExceptionalMoonAsteroids.yaml";
        private Map<String, ExceptionalMoonAsteroids> cache = (null);

        @Override
        public IMetaCategory<? super ExceptionalMoonAsteroids> category() {
            return Asteroid.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1923;
        }

        @Override
        public String getName() {
            return "ExceptionalMoonAsteroids";
        }

        @Override
        public synchronized Map<String, ExceptionalMoonAsteroids> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(ExceptionalMoonAsteroids.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, ExceptionalMoonAsteroids> types;
        }
    }
}
