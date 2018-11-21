package fr.guiguilechat.jcelechat.model.sde.items.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class InfantrySkillEnhancers
    extends Infantry
{
    public final static InfantrySkillEnhancers.MetaGroup METAGROUP = new InfantrySkillEnhancers.MetaGroup();

    @Override
    public IMetaGroup<InfantrySkillEnhancers> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<InfantrySkillEnhancers>
    {
        public final static String RESOURCE_PATH = "SDE/items/infantry/InfantrySkillEnhancers.yaml";
        private Map<String, InfantrySkillEnhancers> cache = (null);

        @Override
        public IMetaCategory<? super InfantrySkillEnhancers> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  354641;
        }

        @Override
        public String getName() {
            return "InfantrySkillEnhancers";
        }

        @Override
        public synchronized Map<String, InfantrySkillEnhancers> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(InfantrySkillEnhancers.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, InfantrySkillEnhancers> items;
        }
    }
}