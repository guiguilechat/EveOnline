
package fr.guiguilechat.eveonline.model.sde.compiled.items.blueprint;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class UnpublishedStructureModuleAndRigBlueprints
    extends Blueprint
{

    /**
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double TechLevel;
    /**
     * Dogma attribute that specifies if the item should have the structure icon or not.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double StructureItemVisualFlag;
    public final static String RESOURCE_PATH = "SDE/blueprint/UnpublishedStructureModuleAndRigBlueprints.yaml";
    private static LinkedHashMap<String, UnpublishedStructureModuleAndRigBlueprints> cache = (null);

    @Override
    public int getGroupId() {
        return  1709;
    }

    @Override
    public Class<?> getGroup() {
        return UnpublishedStructureModuleAndRigBlueprints.class;
    }

    public static LinkedHashMap<String, UnpublishedStructureModuleAndRigBlueprints> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, UnpublishedStructureModuleAndRigBlueprints> items;

    }

}
