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

public class EncounterSurveillanceSystemBlueprint
    extends Blueprint
{
    /**
     * This is a bookkeeping attribute for blueprints, which will hopefully be deprecated by the end of 2014
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double IndustryBlueprintRank;
    public static final EncounterSurveillanceSystemBlueprint.MetaGroup METAGROUP = new EncounterSurveillanceSystemBlueprint.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1955 :
            {
                return IndustryBlueprintRank;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<EncounterSurveillanceSystemBlueprint> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<EncounterSurveillanceSystemBlueprint>
    {
        public static final String RESOURCE_PATH = "SDE/types/blueprint/EncounterSurveillanceSystemBlueprint.yaml";
        private Map<String, EncounterSurveillanceSystemBlueprint> cache = (null);

        @Override
        public IMetaCategory<? super EncounterSurveillanceSystemBlueprint> category() {
            return Blueprint.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1277;
        }

        @Override
        public String getName() {
            return "EncounterSurveillanceSystemBlueprint";
        }

        @Override
        public synchronized Map<String, EncounterSurveillanceSystemBlueprint> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(EncounterSurveillanceSystemBlueprint.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, EncounterSurveillanceSystemBlueprint> types;
        }
    }
}