package fr.guiguilechat.jcelechat.model.sde.types.accessories;

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
import fr.guiguilechat.jcelechat.model.sde.types.Accessories;
import org.yaml.snakeyaml.Yaml;

public class SkillInjectors
    extends Accessories
{
    /**
     * The amount of skill points contained in this item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ContainedSkillPoints;
    /**
     * The maximum amount of skill points that the character can have before the item is unusable
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxCharacterSkillPointLimit;
    public static final SkillInjectors.MetaGroup METAGROUP = new SkillInjectors.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2461 :
            {
                return ContainedSkillPoints;
            }
            case  2459 :
            {
                return MaxCharacterSkillPointLimit;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<SkillInjectors> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SkillInjectors>
    {
        public static final String RESOURCE_PATH = "SDE/types/accessories/SkillInjectors.yaml";
        private Map<String, SkillInjectors> cache = (null);

        @Override
        public IMetaCategory<? super SkillInjectors> category() {
            return Accessories.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1739;
        }

        @Override
        public String getName() {
            return "SkillInjectors";
        }

        @Override
        public synchronized Map<String, SkillInjectors> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SkillInjectors.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SkillInjectors> types;
        }
    }
}