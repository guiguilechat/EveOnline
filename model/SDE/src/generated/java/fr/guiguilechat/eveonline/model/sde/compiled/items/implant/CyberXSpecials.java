
package fr.guiguilechat.eveonline.model.sde.compiled.items.implant;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberXSpecials
    extends Implant
{

    /**
     * +/- bonus to the intelligence of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double IntelligenceBonus;
    /**
     * +/- bonus to the memory of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MemoryBonus;
    /**
     * +/- bonus to the perception of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double PerceptionBonus;
    /**
     * +/- bonus to the willpower of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double WillpowerBonus;
    /**
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double TechLevel;
    /**
     * Whether an item is an implant or not
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Implantness;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ArmorHpBonus2;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double VelocityBonus2;
    public final static String RESOURCE_PATH = "SDE/implant/CyberXSpecials.yaml";
    private static LinkedHashMap<String, CyberXSpecials> cache = (null);

    @Override
    public int getGroupId() {
        return  783;
    }

    @Override
    public Class<?> getGroup() {
        return CyberXSpecials.class;
    }

    public static LinkedHashMap<String, CyberXSpecials> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, CyberXSpecials> items;

    }

}
