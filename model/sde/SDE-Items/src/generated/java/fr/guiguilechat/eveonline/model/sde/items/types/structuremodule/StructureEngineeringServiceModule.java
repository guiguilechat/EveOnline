package fr.guiguilechat.eveonline.model.sde.items.types.structuremodule;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureEngineeringServiceModule
    extends StructureModule
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup01;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup02;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup03;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType10;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType4;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType5;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType6;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType7;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType8;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType9;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * If set on a charge or module type, will prevent it from being activated in empire space.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowInEmpireSpace;
    /**
     * Security status restriction, preventing ships from entering high sec and modules from being activated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowInHighSec;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxTypeFitted;
    /**
     * meta group of type
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaGroupID;
    /**
     * Determines the maximum security class that a module can be onlined within. Used for structure modules.
     * 
     *  0=Nullsec
     *  1=Lowsec
     *  2=Highsec
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(2)
    public int OnlineMaxSecurityClass;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiresSovUpgrade1;
    /**
     * Fuel consumed at the beginning of each hour to keep a service module online.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFuelAmount;
    /**
     * Fuel consumed by the structure service module
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFuelConsumptionGroup;
    /**
     * Fuel consumed to online the service module.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFuelOnlineAmount;
    /**
     * This attribute is authored on structure service modules and when the service module is online will be used to overwrite a hitpoint multiplier attribute on the structure.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ServiceModuleFullPowerStateHitpointMultiplier;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int StructureItemVisualFlag;
    public final static String RESOURCE_PATH = "SDE/items/structuremodule/StructureEngineeringServiceModule.yaml";
    private static LinkedHashMap<String, StructureEngineeringServiceModule> cache = (null);

    @Override
    public int getGroupId() {
        return  1415;
    }

    @Override
    public Class<?> getGroup() {
        return StructureEngineeringServiceModule.class;
    }

    public static synchronized LinkedHashMap<String, StructureEngineeringServiceModule> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StructureEngineeringServiceModule.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StructureEngineeringServiceModule> items;
    }
}
