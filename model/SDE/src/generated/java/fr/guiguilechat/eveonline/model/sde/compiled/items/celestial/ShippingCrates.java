
package fr.guiguilechat.eveonline.model.sde.compiled.items.celestial;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Celestial;
import org.yaml.snakeyaml.Yaml;

public class ShippingCrates
    extends Celestial
{

    /**
     * The cargo group that can be loaded into this container
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CargoGroup;
    /**
     * The maximum hitpoints of an object.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Hp;
    /**
     * DO NOT MESS WITH
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double StructureUniformity;
    public final static String RESOURCE_PATH = "SDE/celestial/ShippingCrates.yaml";
    private static LinkedHashMap<String, ShippingCrates> cache = (null);

    @Override
    public int getGroupId() {
        return  382;
    }

    @Override
    public Class<?> getGroup() {
        return ShippingCrates.class;
    }

    public static LinkedHashMap<String, ShippingCrates> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, ShippingCrates> items;

    }

}