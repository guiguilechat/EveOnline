
package fr.guiguilechat.eveonline.model.sde.compiled.items.module;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Module;
import org.yaml.snakeyaml.Yaml;

public class RigArmor
    extends Module
{

    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double UpgradeCost;
    /**
     * Autogenerated skill attribute, repairBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RepairBonus;
    /**
     * Autogenerated skill attribute, hullHpBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double HullHpBonus;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RigSize;
    /**
     * Autogenerated skill attribute, armorHpBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ArmorHpBonus;
    /**
     * used on rigs
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(10.0D)
    public double Drawback;
    /**
     * Autogenerated skill attribute, DurationBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double DurationSkillBonus;
    /**
     * 
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double EmDamageResistanceBonus;
    /**
     * 
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double ExplosiveDamageResistanceBonus;
    /**
     * 
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double KineticDamageResistanceBonus;
    /**
     * 
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double ThermalDamageResistanceBonus;
    /**
     * Autogenerated skill attribute, capNeedBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapNeedBonus;
    public final static String RESOURCE_PATH = "SDE/items/module/RigArmor.yaml";
    private static LinkedHashMap<String, RigArmor> cache = (null);

    @Override
    public int getGroupId() {
        return  773;
    }

    @Override
    public Class<?> getGroup() {
        return RigArmor.class;
    }

    public static LinkedHashMap<String, RigArmor> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(RigArmor.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, RigArmor> items;

    }

}
