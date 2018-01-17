
package fr.guiguilechat.eveonline.model.sde.compiled.items.celestial;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Celestial;
import org.yaml.snakeyaml.Yaml;

public class Satellite
    extends Celestial
{

    /**
     * Attribute to disallow targetting.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Untargetable;
    /**
     * The distance at which to react when relevant objects come within range.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ProximityRange;
    public final static String RESOURCE_PATH = "SDE/items/celestial/Satellite.yaml";
    private static LinkedHashMap<String, Satellite> cache = (null);

    @Override
    public int getGroupId() {
        return  1165;
    }

    @Override
    public Class<?> getGroup() {
        return Satellite.class;
    }

    public static LinkedHashMap<String, Satellite> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Satellite.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, Satellite> items;

    }

}
