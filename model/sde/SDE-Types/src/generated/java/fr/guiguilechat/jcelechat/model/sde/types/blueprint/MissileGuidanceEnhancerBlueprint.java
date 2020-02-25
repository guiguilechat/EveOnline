package fr.guiguilechat.jcelechat.model.sde.types.blueprint;

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
import fr.guiguilechat.jcelechat.model.sde.types.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class MissileGuidanceEnhancerBlueprint
    extends Blueprint
{
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public static final MissileGuidanceEnhancerBlueprint.MetaGroup METAGROUP = new MissileGuidanceEnhancerBlueprint.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
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
    public IMetaGroup<MissileGuidanceEnhancerBlueprint> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MissileGuidanceEnhancerBlueprint>
    {
        public static final String RESOURCE_PATH = "SDE/types/blueprint/MissileGuidanceEnhancerBlueprint.yaml";
        private Map<String, MissileGuidanceEnhancerBlueprint> cache = (null);

        @Override
        public IMetaCategory<? super MissileGuidanceEnhancerBlueprint> category() {
            return Blueprint.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1397;
        }

        @Override
        public String getName() {
            return "MissileGuidanceEnhancerBlueprint";
        }

        @Override
        public synchronized Map<String, MissileGuidanceEnhancerBlueprint> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MissileGuidanceEnhancerBlueprint.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MissileGuidanceEnhancerBlueprint> types;
        }
    }
}