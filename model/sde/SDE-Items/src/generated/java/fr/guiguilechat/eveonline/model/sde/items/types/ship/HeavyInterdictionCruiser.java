
package fr.guiguilechat.eveonline.model.sde.items.types.ship;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Ship;
import org.yaml.snakeyaml.Yaml;

public class HeavyInterdictionCruiser
    extends Ship
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
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RigSize;
    /**
     * The number of low power slots on the ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double LowSlots;
    /**
     * tbd
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MedSlots;
    /**
     * tbd
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double HiSlots;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusAC2;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusCC2;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusGC2;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FwLpKill;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusMC2;
    /**
     * Required skill level for skill 1
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1Level;
    /**
     * Deprecated.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double MaxDirectionalVelocity;
    /**
     * Required skill level for skill 2
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill2Level;
    /**
     * Deprecated.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double MinTargetVelDmgMultiplier;
    /**
     * Fixed Role Bonus on a ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusRole7;
    /**
     * meta group of type
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MetaGroupID;
    /**
     * Bonus to armor resistances
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RookieArmorResistanceBonus;
    /**
     * Shield resistance bonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RookieShieldResistBonus;
    /**
     * The resolution that the vessel can target other objects at.
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double ScanResolution;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CpuNeedBonus;
    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1;
    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill2;
    /**
     * scanning speed in milliseconds
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double ScanSpeed;
    /**
     * eliteBonusHeavyInterdictors1
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double EliteBonusHeavyInterdictors1;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusAC;
    /**
     * eliteBonusHeavyInterdictors2
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double EliteBonusHeavyInterdictors2;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusAT;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(5.0D)
    public double ShipBonusGC;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(5.0D)
    public double ShipBonusCC;
    /**
     * The value of this attribute is a graphicsID which controls the color scheme of this type. It is used to apply said color scheme to items of other types whose gfx representation is tied in with the attribute holder. Example: Turrets on ships.
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double TypeColorScheme;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShipBonusMC;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double HeatAttenuationHi;
    /**
     * Attribute on ships used for ship upgrades
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double UpgradeCapacity;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double HeatAttenuationMed;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double HeatAttenuationLow;
    /**
     * The number of rig slots on the ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RigSlots;
    /**
     * The main color of a ship type.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MainColor;
    public final static String RESOURCE_PATH = "SDE/items/ship/HeavyInterdictionCruiser.yaml";
    private static LinkedHashMap<String, HeavyInterdictionCruiser> cache = (null);

    @Override
    public int getGroupId() {
        return  894;
    }

    @Override
    public Class<?> getGroup() {
        return HeavyInterdictionCruiser.class;
    }

    public static LinkedHashMap<String, HeavyInterdictionCruiser> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(HeavyInterdictionCruiser.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, HeavyInterdictionCruiser> items;

    }

}