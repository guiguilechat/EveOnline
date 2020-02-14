package fr.guiguilechat.jcelechat.model.sde.types.apparel;

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
import fr.guiguilechat.jcelechat.model.sde.types.Apparel;
import org.yaml.snakeyaml.Yaml;

public class Outer
    extends Apparel
{
    /**
     * This item of clothing covers multiple areas of the body, so the category of clothes specified by this attribute is no longer mandatory
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ClothingAlsoCoversCategory;
    /**
     * This item of clothing covers multiple areas of the body, so the category of clothes specified by this attribute is no longer mandatory
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ClothingAlsoCoversCategory2;
    /**
     * This item of clothing does not allow the category specified to be equipped with this item. It will be removed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ClothingRemovesCategory;
    /**
     * This item of clothing does not allow the category specified to be equipped with this item. It will be removed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ClothingRemovesCategory2;
    /**
     * When evaluating if the character is dressed well enough, this item will be evaluated as it's not equiped
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ClothingRuleException;
    public static final Outer.MetaGroup METAGROUP = new Outer.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1797 :
            {
                return ClothingAlsoCoversCategory;
            }
            case  2058 :
            {
                return ClothingAlsoCoversCategory2;
            }
            case  1956 :
            {
                return ClothingRemovesCategory;
            }
            case  2063 :
            {
                return ClothingRemovesCategory2;
            }
            case  1957 :
            {
                return ClothingRuleException;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Outer> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Outer>
    {
        public static final String RESOURCE_PATH = "SDE/types/apparel/Outer.yaml";
        private Map<String, Outer> cache = (null);

        @Override
        public IMetaCategory<? super Outer> category() {
            return Apparel.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1088;
        }

        @Override
        public String getName() {
            return "Outer";
        }

        @Override
        public synchronized Map<String, Outer> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Outer.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Outer> types;
        }
    }
}
