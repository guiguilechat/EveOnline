package fr.guiguilechat.jcelechat.model.sde.types.blueprint;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Blueprint;
import org.yaml.snakeyaml.Yaml;

public class SurveyProbeBlueprints
    extends Blueprint
{
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Capacity;
    /**
     * This is a bookkeeping attribute for blueprints, which will hopefully be deprecated by the end of 2014
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IndustryBlueprintRank;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Mass;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Radius;
    public static final SurveyProbeBlueprints.MetaGroup METAGROUP = new SurveyProbeBlueprints.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  38 :
            {
                return Capacity;
            }
            case  1955 :
            {
                return IndustryBlueprintRank;
            }
            case  4 :
            {
                return Mass;
            }
            case  162 :
            {
                return Radius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<SurveyProbeBlueprints> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SurveyProbeBlueprints>
    {
        public static final String RESOURCE_PATH = "SDE/types/blueprint/SurveyProbeBlueprints.yaml";
        private Map<String, SurveyProbeBlueprints> cache = (null);

        @Override
        public IMetaCategory<? super SurveyProbeBlueprints> category() {
            return Blueprint.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1160;
        }

        @Override
        public String getName() {
            return "SurveyProbeBlueprints";
        }

        @Override
        public synchronized Map<String, SurveyProbeBlueprints> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SurveyProbeBlueprints.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SurveyProbeBlueprints> types;
        }
    }
}
