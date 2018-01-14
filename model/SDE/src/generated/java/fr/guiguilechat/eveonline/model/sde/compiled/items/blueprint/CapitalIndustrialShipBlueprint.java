
package fr.guiguilechat.eveonline.model.sde.compiled.items.blueprint;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class CapitalIndustrialShipBlueprint
    extends Blueprint
{

    /**
     * Multiplies the job cost for this blueprint type by the specified value
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(1.0D)
    public double IndustryJobCostMultiplier;
    /**
     * This is a bookkeeping attribute for blueprints, which will hopefully be deprecated by the end of 2014
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double IndustryBlueprintRank;
    public final static String RESOURCE_PATH = "SDE/blueprint/CapitalIndustrialShipBlueprint.yaml";
    private static LinkedHashMap<String, CapitalIndustrialShipBlueprint> cache = (null);

    @Override
    public int getGroupId() {
        return  944;
    }

    @Override
    public Class<?> getGroup() {
        return CapitalIndustrialShipBlueprint.class;
    }

    public static LinkedHashMap<String, CapitalIndustrialShipBlueprint> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, CapitalIndustrialShipBlueprint> items;

    }

}
