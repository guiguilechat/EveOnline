package fr.guiguilechat.jcelechat.model.sde.items.types.asteroid;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Asteroid;

public class AncientCompressedIce
    extends Asteroid
{
    /**
     * The skill required to reprocess this ore type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ReprocessingSkillType;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1;
    public final static String RESOURCE_PATH = "SDE/items/asteroid/AncientCompressedIce.yaml";
    private static LinkedHashMap<String, AncientCompressedIce> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  790 :
            {
                return ReprocessingSkillType;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  903;
    }

    @Override
    public Class<?> getGroup() {
        return AncientCompressedIce.class;
    }

    public static synchronized LinkedHashMap<String, AncientCompressedIce> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(AncientCompressedIce.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, AncientCompressedIce> items;
    }
}