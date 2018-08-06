package fr.guiguilechat.jcelechat.model.sde.items.types.subsystem;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Subsystem;
import org.yaml.snakeyaml.Yaml;

public class CoreSystems
    extends Subsystem
{
    /**
     * Capacitor capacity
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorCapacity;
    /**
     * Autogenerated skill attribute, cpu OutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CpuOutputBonus2;
    /**
     * Additional amount of locked targets that can be handled.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxLockedTargetsBonus;
    /**
     * Autogenerated skill attribute, PowerOutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PowerEngineeringOutputBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrCore;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrCore2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrCore3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariCore;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariCore2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariCore3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteCore;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallenteCore2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteCore3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarCore;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarCore2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarCore3;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemEnergyNeutFittingReduction;
    public final static String RESOURCE_PATH = "SDE/items/subsystem/CoreSystems.yaml";
    private static LinkedHashMap<String, CoreSystems> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  482 :
            {
                return CapacitorCapacity;
            }
            case  424 :
            {
                return CpuOutputBonus2;
            }
            case  235 :
            {
                return MaxLockedTargetsBonus;
            }
            case  313 :
            {
                return PowerEngineeringOutputBonus;
            }
            case  1431 :
            {
                return SubsystemBonusAmarrCore;
            }
            case  1509 :
            {
                return SubsystemBonusAmarrCore2;
            }
            case  2681 :
            {
                return SubsystemBonusAmarrCore3;
            }
            case  1441 :
            {
                return SubsystemBonusCaldariCore;
            }
            case  1515 :
            {
                return SubsystemBonusCaldariCore2;
            }
            case  2683 :
            {
                return SubsystemBonusCaldariCore3;
            }
            case  1436 :
            {
                return SubsystemBonusGallenteCore;
            }
            case  1519 :
            {
                return SubsystemBonusGallenteCore2;
            }
            case  2685 :
            {
                return SubsystemBonusGallenteCore3;
            }
            case  1446 :
            {
                return SubsystemBonusMinmatarCore;
            }
            case  1525 :
            {
                return SubsystemBonusMinmatarCore2;
            }
            case  2687 :
            {
                return SubsystemBonusMinmatarCore3;
            }
            case  2665 :
            {
                return SubsystemEnergyNeutFittingReduction;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  958;
    }

    @Override
    public Class<?> getGroup() {
        return CoreSystems.class;
    }

    public static synchronized LinkedHashMap<String, CoreSystems> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(CoreSystems.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, CoreSystems> items;
    }
}
