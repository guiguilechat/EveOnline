package fr.guiguilechat.eveonline.model.sde.items.types.starbase;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;
import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Starbase;
import org.yaml.snakeyaml.Yaml;

public class MobileShieldGenerator
    extends Starbase
{
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * The hull damage proportion at which an entity becomes incapacitated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IncapacitationRatio;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    public final static String RESOURCE_PATH = "SDE/items/starbase/MobileShieldGenerator.yaml";
    private static LinkedHashMap<String, MobileShieldGenerator> cache = (null);

    public double attributeDouble(DoubleAttribute attribute) {
        switch (attribute.getId()) {
            case  50 :
            {
                return Cpu;
            }
            case  156 :
            {
                return IncapacitationRatio;
            }
            default:
            {
                return super.attributeDouble((attribute));
            }
        }
    }

    public int attributeInt(IntAttribute attribute) {
        switch (attribute.getId()) {
            case  30 :
            {
                return Power;
            }
            default:
            {
                return super.attributeInt((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  418;
    }

    @Override
    public Class<?> getGroup() {
        return MobileShieldGenerator.class;
    }

    public static synchronized LinkedHashMap<String, MobileShieldGenerator> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MobileShieldGenerator.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, MobileShieldGenerator> items;
    }
}
