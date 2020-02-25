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

public class FlexShieldHardenerScript
    extends Charge
{
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EmDamageResistanceBonusBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ExplosiveDamageResistanceBonusBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int KineticDamageResistanceBonusBonus;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ThermalDamageResistanceBonusBonus;
    public static final FlexShieldHardenerScript.MetaGroup METAGROUP = new FlexShieldHardenerScript.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  128 :
            {
                return ChargeSize;
            }
            case  2402 :
            {
                return EmDamageResistanceBonusBonus;
            }
            case  2403 :
            {
                return ExplosiveDamageResistanceBonusBonus;
            }
            case  2404 :
            {
                return KineticDamageResistanceBonusBonus;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  2405 :
            {
                return ThermalDamageResistanceBonusBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<FlexShieldHardenerScript> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<FlexShieldHardenerScript>
    {
        public static final String RESOURCE_PATH = "SDE/types/charge/FlexShieldHardenerScript.yaml";
        private Map<String, FlexShieldHardenerScript> cache = (null);

        @Override
        public IMetaCategory<? super FlexShieldHardenerScript> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1702;
        }

        @Override
        public String getName() {
            return "FlexShieldHardenerScript";
        }

        @Override
        public synchronized Map<String, FlexShieldHardenerScript> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(FlexShieldHardenerScript.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, FlexShieldHardenerScript> types;
        }
    }
}