package fr.guiguilechat.jcelechat.model.sde.items.types.implant;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberScience
    extends Implant
{
    /**
     * Autogenerated skill attribute, blueprintmanufactureTimeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BlueprintmanufactureTimeBonus;
    /**
     * Autogenerated skill attribute, CopySpeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CopySpeedBonus;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, mineralNeedResearchBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MineralNeedResearchBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public final static String RESOURCE_PATH = "SDE/items/implant/CyberScience.yaml";
    private static Map<String, CyberScience> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  453 :
            {
                return BlueprintmanufactureTimeBonus;
            }
            case  452 :
            {
                return CopySpeedBonus;
            }
            case  331 :
            {
                return Implantness;
            }
            case  468 :
            {
                return MineralNeedResearchBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  748;
    }

    @Override
    public Class<?> getGroup() {
        return CyberScience.class;
    }

    public static synchronized Map<String, CyberScience> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(CyberScience.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, CyberScience> items;
    }
}
