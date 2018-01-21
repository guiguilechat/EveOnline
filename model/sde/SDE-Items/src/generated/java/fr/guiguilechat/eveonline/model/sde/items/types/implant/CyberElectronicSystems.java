
package fr.guiguilechat.eveonline.model.sde.items.types.implant;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberElectronicSystems
    extends Implant
{

    /**
     * Tech level of an item
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Whether an item is an implant or not
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, capNeedBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    public final static String RESOURCE_PATH = "SDE/items/implant/CyberElectronicSystems.yaml";
    private static LinkedHashMap<String, CyberElectronicSystems> cache = (null);

    @Override
    public int getGroupId() {
        return  740;
    }

    @Override
    public Class<?> getGroup() {
        return CyberElectronicSystems.class;
    }

    public static LinkedHashMap<String, CyberElectronicSystems> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(CyberElectronicSystems.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, CyberElectronicSystems> items;

    }

}
