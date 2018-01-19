
package fr.guiguilechat.eveonline.model.sde.compiled.items.structuremodule;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureEngineeringRigMTEResearchCostOptimization
    extends StructureModule
{

    /**
     * Bonus on Time decrease for engineering rigs
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double AttributeEngRigTimeBonus;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double UpgradeCost;
    /**
     * Bonus on Material decrease for engineering rigs
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double AttributeEngRigMatBonus;
    /**
     * Bonus on Cost decrease for engineering rigs
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double AttributeEngRigCostBonus;
    /**
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double TechLevel;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MaxGroupFitted;
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
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CanFitShipGroup01;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double HiSecModifier;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CanFitShipGroup02;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CanFitShipGroup03;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double LowSecModifier;
    /**
     * Required skill level for skill 1
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1Level;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double NullSecModifier;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double SecurityModifier;
    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double StructureItemVisualFlag;
    public final static String RESOURCE_PATH = "SDE/items/structuremodule/StructureEngineeringRigMTEResearchCostOptimization.yaml";
    private static LinkedHashMap<String, StructureEngineeringRigMTEResearchCostOptimization> cache = (null);

    @Override
    public int getGroupId() {
        return  1846;
    }

    @Override
    public Class<?> getGroup() {
        return StructureEngineeringRigMTEResearchCostOptimization.class;
    }

    public static LinkedHashMap<String, StructureEngineeringRigMTEResearchCostOptimization> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StructureEngineeringRigMTEResearchCostOptimization.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, StructureEngineeringRigMTEResearchCostOptimization> items;

    }

}