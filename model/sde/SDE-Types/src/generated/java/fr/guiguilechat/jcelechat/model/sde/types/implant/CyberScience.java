package fr.guiguilechat.jcelechat.model.sde.types.implant;

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
import fr.guiguilechat.jcelechat.model.sde.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberScience
    extends Implant
{
    /**
     * Autogenerated skill attribute, blueprintmanufactureTimeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BlueprintmanufactureTimeBonus;
    /**
     * Autogenerated skill attribute, CopySpeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CopySpeedBonus;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, mineralNeedResearchBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MineralNeedResearchBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public static final CyberScience.MetaGroup METAGROUP = new CyberScience.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  453 :
            {
                return BlueprintmanufactureTimeBonus;
            }
            case  452 :
            {
                return CopySpeedBonus;
            }
            case  331 :
            {
                return Implantness;
            }
            case  468 :
            {
                return MineralNeedResearchBonus;
            }
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
    public IMetaGroup<CyberScience> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CyberScience>
    {
        public static final String RESOURCE_PATH = "SDE/types/implant/CyberScience.yaml";
        private Map<String, CyberScience> cache = (null);

        @Override
        public IMetaCategory<? super CyberScience> category() {
            return Implant.METACAT;
        }

        @Override
        public int getGroupId() {
            return  748;
        }

        @Override
        public String getName() {
            return "CyberScience";
        }

        @Override
        public synchronized Map<String, CyberScience> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(CyberScience.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CyberScience> types;
        }
    }
}