
package fr.guiguilechat.eveonline.model.sde.compiled.items.structuremodule;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureMoonDrillingServiceModule
    extends StructureModule
{

    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CanFitShipGroup01;
    /**
     * CPU need of module
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Cpu;
    /**
     * Security status restriction, preventing ships from entering high sec and modules from being activated.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double DisallowInHighSec;
    /**
     * Determines the maximum security class that a module can be onlined within. Used for structure modules.
     * 
     *  0=Nullsec
     *  1=Lowsec
     *  2=Highsec
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(2.0D)
    public double OnlineMaxSecurityClass;
    /**
     * Fuel consumed by the structure service module
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ServiceModuleFuelConsumptionGroup;
    /**
     * Fuel consumed at the beginning of each hour to keep a service module online.
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ServiceModuleFuelAmount;
    /**
     * current power need
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Power;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double StructureItemVisualFlag;
    /**
     * Fuel consumed to online the service module.
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ServiceModuleFuelOnlineAmount;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MaxTypeFitted;
    public final static String RESOURCE_PATH = "SDE/structuremodule/StructureMoonDrillingServiceModule.yaml";
    private static LinkedHashMap<String, StructureMoonDrillingServiceModule> cache = (null);

    @Override
    public int getGroupId() {
        return  1887;
    }

    @Override
    public Class<?> getGroup() {
        return StructureMoonDrillingServiceModule.class;
    }

    public static LinkedHashMap<String, StructureMoonDrillingServiceModule> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, StructureMoonDrillingServiceModule> items;

    }

}
