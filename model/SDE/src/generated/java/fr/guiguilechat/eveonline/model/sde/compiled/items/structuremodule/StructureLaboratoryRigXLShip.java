
package fr.guiguilechat.eveonline.model.sde.compiled.items.structuremodule;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureLaboratoryRigXLShip
    extends StructureModule
{

    /**
     * High-sec bonus on structure rigs.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double StructureRigBonus2;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double UpgradeCost;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CanFitShipGroup01;
    /**
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double TechLevel;
    /**
     * The maximum hitpoints of an object.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Hp;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RigSize;
    /**
     * High-sec bonus on structure rigs.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double StructureRigBonus1;
    public final static String RESOURCE_PATH = "SDE/structuremodule/StructureLaboratoryRigXLShip.yaml";
    private static LinkedHashMap<String, StructureLaboratoryRigXLShip> cache = (null);

    @Override
    public int getGroupId() {
        return  1611;
    }

    @Override
    public Class<?> getGroup() {
        return StructureLaboratoryRigXLShip.class;
    }

    public static LinkedHashMap<String, StructureLaboratoryRigXLShip> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, StructureLaboratoryRigXLShip> items;

    }

}
