package fr.guiguilechat.eveonline.model.sde.items.types.material;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Material;
import org.yaml.snakeyaml.Yaml;

public class IntermediateMaterials
    extends Material
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int MoonMiningAmount;
    public final static String RESOURCE_PATH = "SDE/items/material/IntermediateMaterials.yaml";
    private static LinkedHashMap<String, IntermediateMaterials> cache = (null);

    @Override
    public int getGroupId() {
        return  428;
    }

    @Override
    public Class<?> getGroup() {
        return IntermediateMaterials.class;
    }

    public static synchronized LinkedHashMap<String, IntermediateMaterials> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(IntermediateMaterials.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, IntermediateMaterials> items;
    }
}
