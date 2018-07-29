package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;

public class MassiveEnvironments
    extends Celestial
{
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int MaxRange;
    /**
     * Attribute to disallow targetting.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Untargetable;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff1ID;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double WarfareBuff1Value;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff2ID;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double WarfareBuff2Value;
    public final static String RESOURCE_PATH = "SDE/items/celestial/MassiveEnvironments.yaml";
    private static LinkedHashMap<String, MassiveEnvironments> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  54 :
            {
                return MaxRange;
            }
            case  1158 :
            {
                return Untargetable;
            }
            case  2468 :
            {
                return WarfareBuff1ID;
            }
            case  2469 :
            {
                return WarfareBuff1Value;
            }
            case  2470 :
            {
                return WarfareBuff2ID;
            }
            case  2471 :
            {
                return WarfareBuff2Value;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1882;
    }

    @Override
    public Class<?> getGroup() {
        return MassiveEnvironments.class;
    }

    public static synchronized LinkedHashMap<String, MassiveEnvironments> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MassiveEnvironments.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MassiveEnvironments> items;
    }
}