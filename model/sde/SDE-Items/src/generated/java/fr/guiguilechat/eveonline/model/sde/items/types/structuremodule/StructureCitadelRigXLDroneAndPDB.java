package fr.guiguilechat.eveonline.model.sde.items.types.structuremodule;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.Attribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureCitadelRigXLDroneAndPDB
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
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
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
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
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
     * Authoring has been moved to FSD
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
    public final static String RESOURCE_PATH = "SDE/items/structuremodule/StructureCitadelRigXLDroneAndPDB.yaml";
    private static LinkedHashMap<String, StructureCitadelRigXLDroneAndPDB> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1298 :
            {
                return CanFitShipGroup01;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  591 :
            {
                return DroneMaxVelocityBonus;
            }
            case  9 :
            {
                return Hp;
            }
            case  327 :
            {
                return HullHpBonus;
            }
            case  1544 :
            {
                return MaxGroupFitted;
            }
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  2334 :
            {
                return StructureItemVisualFlag;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  1640;
    }

    @Override
    public Class<?> getGroup() {
        return StructureCitadelRigXLDroneAndPDB.class;
    }

    public static synchronized LinkedHashMap<String, StructureCitadelRigXLDroneAndPDB> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StructureCitadelRigXLDroneAndPDB.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, StructureCitadelRigXLDroneAndPDB> items;
    }
}
