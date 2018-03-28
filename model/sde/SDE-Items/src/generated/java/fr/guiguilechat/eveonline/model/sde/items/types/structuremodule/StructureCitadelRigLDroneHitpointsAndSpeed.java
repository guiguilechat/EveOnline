package fr.guiguilechat.eveonline.model.sde.items.types.structuremodule;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureCitadelRigLDroneHitpointsAndSpeed
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
     * Increases max velocity of all drone types.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DroneMaxVelocityBonus;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Autogenerated skill attribute, hullHpBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double HullHpBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxGroupFitted;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int StructureItemVisualFlag;
    /**
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeCost;
    public final static String RESOURCE_PATH = "SDE/items/structuremodule/StructureCitadelRigLDroneHitpointsAndSpeed.yaml";
    private static LinkedHashMap<String, StructureCitadelRigLDroneHitpointsAndSpeed> cache = (null);

    @Override
    public int getGroupId() {
        return  1631;
    }

    @Override
    public Class<?> getGroup() {
        return StructureCitadelRigLDroneHitpointsAndSpeed.class;
    }

    public static synchronized LinkedHashMap<String, StructureCitadelRigLDroneHitpointsAndSpeed> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StructureCitadelRigLDroneHitpointsAndSpeed.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StructureCitadelRigLDroneHitpointsAndSpeed> items;
    }
}
