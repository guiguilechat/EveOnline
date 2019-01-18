package fr.guiguilechat.jcelechat.model.sde.items.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class InfantryEquipment
    extends Infantry
{
    public static final InfantryEquipment.MetaGroup METAGROUP = new InfantryEquipment.MetaGroup();

    @Override
    public IMetaGroup<InfantryEquipment> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<InfantryEquipment>
    {
        public static final String RESOURCE_PATH = "SDE/items/infantry/InfantryEquipment.yaml";
        private Map<String, InfantryEquipment> cache = (null);

        @Override
        public IMetaCategory<? super InfantryEquipment> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  351844;
        }

        @Override
        public String getName() {
            return "InfantryEquipment";
        }

        @Override
        public synchronized Map<String, InfantryEquipment> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(InfantryEquipment.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, InfantryEquipment> items;
        }
    }
}
