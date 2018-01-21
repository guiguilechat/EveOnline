
package fr.guiguilechat.eveonline.model.sde.items.types.blueprint;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Blueprint;
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
    public final static String RESOURCE_PATH = "SDE/items/blueprint/CapitalIndustrialShipBlueprint.yaml";
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
                cache = new Yaml().loadAs(new InputStreamReader(CapitalIndustrialShipBlueprint.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, CapitalIndustrialShipBlueprint> items;

    }

}