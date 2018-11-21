package fr.guiguilechat.jcelechat.model.sde.items.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class InfantryDropsuits
    extends Infantry
{
    public final static InfantryDropsuits.MetaGroup METAGROUP = new InfantryDropsuits.MetaGroup();

    @Override
    public IMetaGroup<InfantryDropsuits> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<InfantryDropsuits>
    {
        public final static String RESOURCE_PATH = "SDE/items/infantry/InfantryDropsuits.yaml";
        private Map<String, InfantryDropsuits> cache = (null);

        @Override
        public IMetaCategory<? super InfantryDropsuits> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  351064;
        }

        @Override
        public String getName() {
            return "InfantryDropsuits";
        }

        @Override
        public synchronized Map<String, InfantryDropsuits> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(InfantryDropsuits.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, InfantryDropsuits> items;
        }
    }
}