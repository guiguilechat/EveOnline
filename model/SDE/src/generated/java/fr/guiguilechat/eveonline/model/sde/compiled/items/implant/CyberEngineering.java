
package fr.guiguilechat.eveonline.model.sde.compiled.items.implant;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberEngineering
    extends Implant
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
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double TechLevel;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CpuNeedBonus;
    /**
     * Autogenerated skill attribute, CapacitorCapacityBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapacitorCapacityBonus;
    /**
     * Autogenerated skill attribute, cpu OutputBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CpuOutputBonus2;
    /**
     * Autogenerated skill attribute, PowerOutputBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double PowerEngineeringOutputBonus;
    /**
     * Autogenerated skill attribute, CapRechargeBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapRechargeBonus;
    /**
     * Whether an item is an implant or not
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Implantness;
    /**
     * Autogenerated skill attribute, capNeedBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapNeedBonus;
    public final static String RESOURCE_PATH = "SDE/items/implant/CyberEngineering.yaml";
    private static LinkedHashMap<String, CyberEngineering> cache = (null);

    @Override
    public int getGroupId() {
        return  741;
    }

    @Override
    public Class<?> getGroup() {
        return CyberEngineering.class;
    }

    public static LinkedHashMap<String, CyberEngineering> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(CyberEngineering.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, CyberEngineering> items;

    }

}
