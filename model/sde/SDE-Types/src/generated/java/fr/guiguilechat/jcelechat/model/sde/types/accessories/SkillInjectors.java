package fr.guiguilechat.jcelechat.model.sde.types.accessories;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.ContainedSkillPoints;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxCharacterSkillPointLimit;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.types.Accessories;
import org.yaml.snakeyaml.Yaml;

public class SkillInjectors
    extends Accessories
{
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double capacity;
    /**
     * The amount of skill points contained in this item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int containedskillpoints;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double mass;
    /**
     * The maximum amount of skill points that the character can have before the item is unusable
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int maxcharacterskillpointlimit;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double radius;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {Radius.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE, MaxCharacterSkillPointLimit.INSTANCE, ContainedSkillPoints.INSTANCE })));
    public static final SkillInjectors.MetaGroup METAGROUP = new SkillInjectors.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  38 :
            {
                return capacity;
            }
            case  2461 :
            {
                return containedskillpoints;
            }
            case  4 :
            {
                return mass;
            }
            case  2459 :
            {
                return maxcharacterskillpointlimit;
            }
            case  162 :
            {
                return radius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<SkillInjectors> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SkillInjectors>
    {
        public static final String RESOURCE_PATH = "SDE/types/accessories/SkillInjectors.yaml";
        private Map<String, SkillInjectors> cache = (null);

        @Override
        public IMetaCategory<? super SkillInjectors> category() {
            return Accessories.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1739;
        }

        @Override
        public String getName() {
            return "SkillInjectors";
        }

        @Override
        public synchronized Map<String, SkillInjectors> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SkillInjectors.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SkillInjectors> types;
        }
    }
}
