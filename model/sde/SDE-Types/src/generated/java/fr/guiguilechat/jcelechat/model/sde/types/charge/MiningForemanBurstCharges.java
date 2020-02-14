package fr.guiguilechat.jcelechat.model.sde.types.charge;

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
import fr.guiguilechat.jcelechat.model.sde.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class MiningForemanBurstCharges
    extends Charge
{
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1;
    /**
     * Required skill level for skill 1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1Level;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2;
    /**
     * Required skill level for skill 2
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2Level;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff1ID;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff1Multiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff2ID;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff2Multiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff3ID;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff3Multiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff4ID;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareBuff4Multiplier;
    public static final MiningForemanBurstCharges.MetaGroup METAGROUP = new MiningForemanBurstCharges.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  137 :
            {
                return LauncherGroup;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  2468 :
            {
                return WarfareBuff1ID;
            }
            case  2596 :
            {
                return WarfareBuff1Multiplier;
            }
            case  2470 :
            {
                return WarfareBuff2ID;
            }
            case  2597 :
            {
                return WarfareBuff2Multiplier;
            }
            case  2472 :
            {
                return WarfareBuff3ID;
            }
            case  2598 :
            {
                return WarfareBuff3Multiplier;
            }
            case  2536 :
            {
                return WarfareBuff4ID;
            }
            case  2599 :
            {
                return WarfareBuff4Multiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<MiningForemanBurstCharges> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MiningForemanBurstCharges>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/MiningForemanBurstCharges.yaml";
        private Map<String, MiningForemanBurstCharges> cache = (null);

        @Override
        public IMetaCategory<? super MiningForemanBurstCharges> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1771;
        }

        @Override
        public String getName() {
            return "MiningForemanBurstCharges";
        }

        @Override
        public synchronized Map<String, MiningForemanBurstCharges> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MiningForemanBurstCharges.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MiningForemanBurstCharges> types;
        }
    }
}
