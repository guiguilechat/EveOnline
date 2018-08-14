package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;
import org.yaml.snakeyaml.Yaml;

public class IrregularBattleship
    extends Entity
{
    public final static IrregularBattleship.MetaGroup METAGROUP = new IrregularBattleship.MetaGroup();

    @Override
    public IMetaGroup<IrregularBattleship> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<IrregularBattleship>
    {
        public final static String RESOURCE_PATH = "SDE/items/entity/IrregularBattleship.yaml";
        private Map<String, IrregularBattleship> cache = (null);

        @Override
        public IMetaCategory<? super IrregularBattleship> category() {
            return Entity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1667;
        }

        @Override
        public String getName() {
            return "IrregularBattleship";
        }

        @Override
        public synchronized Map<String, IrregularBattleship> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(IrregularBattleship.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, IrregularBattleship> items;
        }
    }
}
