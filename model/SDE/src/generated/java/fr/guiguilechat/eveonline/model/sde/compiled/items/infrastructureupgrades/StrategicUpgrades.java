
package fr.guiguilechat.eveonline.model.sde.compiled.items.infrastructureupgrades;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.InfrastructureUpgrades;
import org.yaml.snakeyaml.Yaml;

public class StrategicUpgrades
    extends InfrastructureUpgrades
{

    /**
     * The sum of this attribute on the claim markers, Infrastructure hub, and each upgrade is the systems base cost. 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double SovBillSystemCost;
    /**
     * The minimum required sovereignty index level
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double DevIndexSovereignty;
    public final static String RESOURCE_PATH = "SDE/items/infrastructureupgrades/StrategicUpgrades.yaml";
    private static LinkedHashMap<String, StrategicUpgrades> cache = (null);

    @Override
    public int getGroupId() {
        return  1016;
    }

    @Override
    public Class<?> getGroup() {
        return StrategicUpgrades.class;
    }

    public static LinkedHashMap<String, StrategicUpgrades> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(StrategicUpgrades.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, StrategicUpgrades> items;

    }

}
