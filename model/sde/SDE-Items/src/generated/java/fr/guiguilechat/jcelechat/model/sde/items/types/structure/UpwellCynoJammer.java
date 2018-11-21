package fr.guiguilechat.jcelechat.model.sde.items.types.structure;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Structure;
import org.yaml.snakeyaml.Yaml;

public class UpwellCynoJammer
    extends Structure
{
    /**
     * Module type ID to pre-fit into service slot 0
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PreFitServiceSlot0;
    /**
     * scanning speed in milliseconds
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanSpeed;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double StructureUniformity;
    public final static UpwellCynoJammer.MetaGroup METAGROUP = new UpwellCynoJammer.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2792 :
            {
                return PreFitServiceSlot0;
            }
            case  79 :
            {
                return ScanSpeed;
            }
            case  525 :
            {
                return StructureUniformity;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<UpwellCynoJammer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<UpwellCynoJammer>
    {
        public final static String RESOURCE_PATH = "SDE/items/structure/UpwellCynoJammer.yaml";
        private Map<String, UpwellCynoJammer> cache = (null);

        @Override
        public IMetaCategory<? super UpwellCynoJammer> category() {
            return Structure.METACAT;
        }

        @Override
        public int getGroupId() {
            return  2016;
        }

        @Override
        public String getName() {
            return "UpwellCynoJammer";
        }

        @Override
        public synchronized Map<String, UpwellCynoJammer> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(UpwellCynoJammer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, UpwellCynoJammer> items;
        }
    }
}