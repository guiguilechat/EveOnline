
package fr.guiguilechat.eveonline.model.sde.compiled.items.structure;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Structure;
import org.yaml.snakeyaml.Yaml;

public class EngineeringComplex
    extends Structure
{

    /**
     * How many upgrades can by fitted to this ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double UpgradeSlotsLeft;
    /**
     * This defines the total capacity of fighters allowed in the fighter bay of the ship
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FighterCapacity;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ServiceSlots;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RigSize;
    /**
     * The maximum possible target range.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(300000.0D)
    public double MaximumRangeCap;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double StructureServiceRoleBonus;
    /**
     * This defines the total number of fighter launch tubes on the ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FighterTubes;
    /**
     * Material bonus for Engineering Complexes Structures
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double StrEngMatBonus;
    /**
     * Number of Light Fighters the ship can launch.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FighterLightSlots;
    /**
     * Cost bonus for Engineering Complexes Structures
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double StrEngCostBonus;
    /**
     * Number of Support Fighters the ship can launch.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FighterSupportSlots;
    /**
     * Time bonus for Engineering Complexes Structures
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double StrEngTimeBonus;
    /**
     * Number of Heavy Fighters the ship can launch.Heavy 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FighterHeavySlots;
    /**
     * Number of hours of vulnerability each week required. Applies only to categoryStructure.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double VulnerabilityRequired;
    /**
     * Distance which tethering will engage / disengage piloted ships.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double TetheringRange;
    /**
     * The number of remaining unused launcher slots.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double LauncherSlotsLeft;
    /**
     * Attribute on ships used for ship upgrades
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double UpgradeCapacity;
    /**
     * The number of rig slots on the ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RigSlots;
    public final static String RESOURCE_PATH = "SDE/structure/EngineeringComplex.yaml";
    private static LinkedHashMap<String, EngineeringComplex> cache = (null);

    @Override
    public int getGroupId() {
        return  1404;
    }

    @Override
    public Class<?> getGroup() {
        return EngineeringComplex.class;
    }

    public static LinkedHashMap<String, EngineeringComplex> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, EngineeringComplex> items;

    }

}
