
package fr.guiguilechat.eveonline.model.sde.compiled.items.module;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Module;
import org.yaml.snakeyaml.Yaml;

public class MissileLauncherLight
    extends Module
{

    /**
     * One of the groups of charge this launcher can be loaded with.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ChargeGroup4;
    /**
     * reload time (ms)
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(10000.0D)
    public double ReloadTime;
    /**
     * The value of this attribute is a graphicsID which controls the color scheme of this type. It is used to apply said color scheme to items of other types whose gfx representation is tied in with the attribute holder. Example: Turrets on ships.
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double TypeColorScheme;
    /**
     * The number of slots this module requires.  Only used for launchers, bays and turrets.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double Slots;
    /**
     * CPU need of module
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Cpu;
    /**
     * Time in milliseconds between possible activations
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double Speed;
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
    @DefaultValue(0.0D)
    public double OverloadRofBonus;
    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1;
    /**
     * Required skill level for skill 2
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill2Level;
    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill2;
    /**
     * Number of charges consumed per activation
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double ChargeRate;
    /**
     * 
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double HeatDamage;
    /**
     * One of the groups of charge this launcher can be loaded with.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ChargeGroup1;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double HeatAbsorbtionRateModifier;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredThermoDynamicsSkill;
    /**
     * meta group of type
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MetaGroupID;
    /**
     * One of the groups of charge this launcher can be loaded with.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ChargeGroup2;
    /**
     * current power need
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Power;
    public final static String RESOURCE_PATH = "SDE/module/MissileLauncherLight.yaml";
    private static LinkedHashMap<String, MissileLauncherLight> cache = (null);

    @Override
    public int getGroupId() {
        return  509;
    }

    @Override
    public Class<?> getGroup() {
        return MissileLauncherLight.class;
    }

    public static LinkedHashMap<String, MissileLauncherLight> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, MissileLauncherLight> items;

    }

}
