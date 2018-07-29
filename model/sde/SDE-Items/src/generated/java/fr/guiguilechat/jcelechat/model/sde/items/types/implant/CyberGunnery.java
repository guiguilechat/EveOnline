package fr.guiguilechat.jcelechat.model.sde.items.types.implant;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Implant;

public class CyberGunnery
    extends Implant
{
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuNeedBonus;
    /**
     * Autogenerated skill attribute, damageMultiplierBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DamageMultiplierBonus;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RangeSkillBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
    /**
     * Autogenerated skill attribute, TurretSpeeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int TurretSpeeBonus;
    public final static String RESOURCE_PATH = "SDE/items/implant/CyberGunnery.yaml";
    private static LinkedHashMap<String, CyberGunnery> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  317 :
            {
                return CapNeedBonus;
            }
            case  310 :
            {
                return CpuNeedBonus;
            }
            case  292 :
            {
                return DamageMultiplierBonus;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  331 :
            {
                return Implantness;
            }
            case  294 :
            {
                return RangeSkillBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            case  441 :
            {
                return TurretSpeeBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  742;
    }

    @Override
    public Class<?> getGroup() {
        return CyberGunnery.class;
    }

    public static synchronized LinkedHashMap<String, CyberGunnery> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(CyberGunnery.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, CyberGunnery> items;
    }
}