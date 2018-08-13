package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Rigging
    extends Skill
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10)
    public int RigDrawbackBonus;
    public final static Rigging.MetaGroup METAGROUP = new Rigging.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/skill/Rigging.yaml";
    private static Map<String, Rigging> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1139 :
            {
                return RigDrawbackBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  269;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Rigging> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, Rigging> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Rigging.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, Rigging> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<Rigging>
    {

        @Override
        public MetaCategory<? super Rigging> category() {
            return Skill.METACAT;
        }

        @Override
        public String getName() {
            return "Rigging";
        }

        @Override
        public Collection<Rigging> items() {
            return (load().values());
        }
    }
}
