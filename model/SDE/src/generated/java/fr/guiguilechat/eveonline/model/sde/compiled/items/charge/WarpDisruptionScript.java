
package fr.guiguilechat.eveonline.model.sde.compiled.items.charge;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Charge;
import org.yaml.snakeyaml.Yaml;

public class WarpDisruptionScript
    extends Charge
{

    /**
     * Bonus to duration.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double DurationBonus;
    /**
     * If set on a charge or module type, will prevent it from being activated in empire space.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double DisallowInEmpireSpace;
    /**
     * maxRangeHidden
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MaxRangeHidden;
    /**
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double TechLevel;
    /**
     * capacitorNeedHidden
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapacitorNeedHidden;
    /**
     * One of the groups of launcher this charge can be loaded into.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double LauncherGroup;
    /**
     * Bonus to signatureRadiusBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double SignatureRadiusBonusBonus;
    /**
     * Bonus to massBonusPercentage
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MassBonusPercentageBonus;
    /**
     * Autogenerated skill attribute, capNeedBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapNeedBonus;
    /**
     * Modification of Afterburner and Microwarpdrive Thrust Bonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double SpeedBoostFactorBonusBonus;
    /**
     * Modification of Afterburner and Microwarpdrive Max Velocity Bonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double SpeedFactorBonusBonus;
    /**
     * Warp Scramble Range Bonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double WarpScrambleRangeBonus;
    public final static String RESOURCE_PATH = "SDE/charge/WarpDisruptionScript.yaml";
    private static LinkedHashMap<String, WarpDisruptionScript> cache = (null);

    @Override
    public int getGroupId() {
        return  908;
    }

    @Override
    public Class<?> getGroup() {
        return WarpDisruptionScript.class;
    }

    public static LinkedHashMap<String, WarpDisruptionScript> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, WarpDisruptionScript> items;

    }

}
