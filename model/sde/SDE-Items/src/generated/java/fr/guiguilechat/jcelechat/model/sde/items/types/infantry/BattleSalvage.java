package fr.guiguilechat.jcelechat.model.sde.items.types.infantry;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.types.Infantry;
import org.yaml.snakeyaml.Yaml;

public class BattleSalvage
    extends Infantry
{
    public final static BattleSalvage.MetaGroup METAGROUP = new BattleSalvage.MetaGroup();

    @Override
    public IMetaGroup<BattleSalvage> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<BattleSalvage>
    {
        public final static String RESOURCE_PATH = "SDE/items/infantry/BattleSalvage.yaml";
        private Map<String, BattleSalvage> cache = (null);

        @Override
        public IMetaCategory<? super BattleSalvage> category() {
            return Infantry.METACAT;
        }

        @Override
        public int getGroupId() {
            return  368656;
        }

        @Override
        public String getName() {
            return "BattleSalvage";
        }

        @Override
        public synchronized Map<String, BattleSalvage> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(BattleSalvage.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, BattleSalvage> items;
        }
    }
}