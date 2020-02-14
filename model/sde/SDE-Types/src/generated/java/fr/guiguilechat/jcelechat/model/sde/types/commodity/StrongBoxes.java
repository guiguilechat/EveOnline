package fr.guiguilechat.jcelechat.model.sde.types.commodity;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class StrongBoxes
    extends Commodity
{
    /**
     * Authoring has been moved to FSD.
     * meta group of type
     * 
     *  3: Story-line (Cosmos)
     *  4: Faction
     *  5: Officer (rare asteroid NPCs)
     *  6: Deadspace
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaGroupID;
    public static final StrongBoxes.MetaGroup METAGROUP = new StrongBoxes.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1692 :
            {
                return MetaGroupID;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<StrongBoxes> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<StrongBoxes>
    {
        public static final String RESOURCE_PATH = "SDE/types/commodity/StrongBoxes.yaml";
        private Map<String, StrongBoxes> cache = (null);

        @Override
        public IMetaCategory<? super StrongBoxes> category() {
            return Commodity.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1818;
        }

        @Override
        public String getName() {
            return "StrongBoxes";
        }

        @Override
        public synchronized Map<String, StrongBoxes> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(StrongBoxes.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, StrongBoxes> types;
        }
    }
}
