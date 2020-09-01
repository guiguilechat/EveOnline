package fr.guiguilechat.jcelechat.model.sde.types.commodity;

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
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultRealValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.ActiveSystemJump;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.FilamentDescriptionMessageID;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MjdShipJumpCap;
import fr.guiguilechat.jcelechat.model.sde.attributes.MjfgRadius;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class JumpFilaments
    extends Commodity
{
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int activesystemjump;
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(561098)
    public int filamentdescriptionmessageid;
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double capacity;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultRealValue(0.0)
    public double mass;
    /**
     * The maximum number of ships that can be jumped per activation
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int mjdshipjumpcap;
    /**
     * range effected by mjfg scoop
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int mjfgradius;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultRealValue(0.0)
    public double radius;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {MjdShipJumpCap.INSTANCE, ActiveSystemJump.INSTANCE, Radius.INSTANCE, FilamentDescriptionMessageID.INSTANCE, MjfgRadius.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE })));
    public static final JumpFilaments.MetaGroup METAGROUP = new JumpFilaments.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  3025 :
            {
                return activesystemjump;
            }
            case  3026 :
            {
                return filamentdescriptionmessageid;
            }
            case  38 :
            {
                return capacity;
            }
            case  4 :
            {
                return mass;
            }
            case  2832 :
            {
                return mjdshipjumpcap;
            }
            case  2067 :
            {
                return mjfgradius;
            }
            case  162 :
            {
                return radius;
            }
            default:
            {
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<JumpFilaments> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<JumpFilaments>
    {
        public static final String RESOURCE_PATH = "SDE/types/commodity/JumpFilaments.yaml";
        private Map<String, JumpFilaments> cache = (null);

        @Override
        public IMetaCategory<? super JumpFilaments> category() {
            return Commodity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  4041;
        }

        @Override
        public String getName() {
            return "JumpFilaments";
        }

        @Override
        public synchronized Map<String, JumpFilaments> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(JumpFilaments.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, JumpFilaments> types;
        }
    }
}
