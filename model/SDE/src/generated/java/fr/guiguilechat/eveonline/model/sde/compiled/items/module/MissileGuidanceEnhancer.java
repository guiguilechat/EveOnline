
package fr.guiguilechat.eveonline.model.sde.compiled.items.module;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Module;
import org.yaml.snakeyaml.Yaml;

public class MissileGuidanceEnhancer
    extends Module
{

    /**
     * Booster attribute to explosion radius of missiles vs. signature radius.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double AoeCloudSizeBonus;
    /**
     * CPU need of module
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Cpu;
    /**
     * Autogenerated skill attribute, missileVelocityBonus 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MissileVelocityBonus;
    /**
     * Autogenerated skill attribute, explosionDelayBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ExplosionDelayBonus;
    /**
     * Required skill level for skill 1
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1Level;
    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1;
    /**
     * current power need
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Power;
    /**
     * Increases velocity of missile explosion
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double AoeVelocityBonus;
    public final static String RESOURCE_PATH = "SDE/items/module/MissileGuidanceEnhancer.yaml";
    private static LinkedHashMap<String, MissileGuidanceEnhancer> cache = (null);

    @Override
    public int getGroupId() {
        return  1395;
    }

    @Override
    public Class<?> getGroup() {
        return MissileGuidanceEnhancer.class;
    }

    public static LinkedHashMap<String, MissileGuidanceEnhancer> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(MissileGuidanceEnhancer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, MissileGuidanceEnhancer> items;

    }

}
