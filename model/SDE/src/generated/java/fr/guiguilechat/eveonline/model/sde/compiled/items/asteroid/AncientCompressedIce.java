
package fr.guiguilechat.eveonline.model.sde.compiled.items.asteroid;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Asteroid;
import org.yaml.snakeyaml.Yaml;

public class AncientCompressedIce
    extends Asteroid
{

    /**
     * The type ID of the skill that is required.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RequiredSkill1;
    /**
     * The skill required to reprocess this ore type.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ReprocessingSkillType;
    public final static String RESOURCE_PATH = "SDE/asteroid/AncientCompressedIce.yaml";
    private static LinkedHashMap<String, AncientCompressedIce> cache = (null);

    @Override
    public int getGroupId() {
        return  903;
    }

    @Override
    public Class<?> getGroup() {
        return AncientCompressedIce.class;
    }

    public static LinkedHashMap<String, AncientCompressedIce> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, AncientCompressedIce> items;

    }

}
