package fr.guiguilechat.jcelechat.model.sde.types.ship;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Ship;
import org.yaml.snakeyaml.Yaml;

public class AttackBattlecruiser
    extends Ship
{
    /**
     * Used by Battlecruisers for large turret CPU reduction
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double BcLargeTurretCPU;
    /**
     * Used by Battlecruisers for large turret capacitor reduction
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double BcLargeTurretCap;
    /**
     * Used by Battlecruisers for large turret powergrid reduction
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double BcLargeTurretPower;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FwLpKill;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HeatAttenuationHi;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HeatAttenuationLow;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HeatAttenuationMed;
    /**
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MainColor;
    /**
     * Deprecated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int MaxDirectionalVelocity;
    /**
     * Specifies the maximum numbers of passengers that the ship can have
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxPassengers;
    /**
     * Deprecated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MinTargetVelDmgMultiplier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSize;
    /**
     * The number of rig slots on the ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RigSlots;
    /**
     * The resolution that the vessel can target other objects at.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanResolution;
    /**
     * scanning speed in milliseconds
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanSpeed;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusABC1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBonusABC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusCBC1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBonusCBC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusGBC1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusGBC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusMBC1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusMBC2;
    /**
     * How many rigs can by fitted to this ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeSlotsLeft;
    public static final AttackBattlecruiser.MetaGroup METAGROUP = new AttackBattlecruiser.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1787 :
            {
                return BcLargeTurretCPU;
            }
            case  1788 :
            {
                return BcLargeTurretCap;
            }
            case  1786 :
            {
                return BcLargeTurretPower;
            }
            case  1555 :
            {
                return FwLpKill;
            }
            case  1259 :
            {
                return HeatAttenuationHi;
            }
            case  1262 :
            {
                return HeatAttenuationLow;
            }
            case  1261 :
            {
                return HeatAttenuationMed;
            }
            case  124 :
            {
                return MainColor;
            }
            case  661 :
            {
                return MaxDirectionalVelocity;
            }
            case  129 :
            {
                return MaxPassengers;
            }
            case  662 :
            {
                return MinTargetVelDmgMultiplier;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  1137 :
            {
                return RigSlots;
            }
            case  564 :
            {
                return ScanResolution;
            }
            case  79 :
            {
                return ScanSpeed;
            }
            case  795 :
            {
                return ShipBonusABC1;
            }
            case  1889 :
            {
                return ShipBonusABC2;
            }
            case  743 :
            {
                return ShipBonusCBC1;
            }
            case  745 :
            {
                return ShipBonusCBC2;
            }
            case  747 :
            {
                return ShipBonusGBC1;
            }
            case  746 :
            {
                return ShipBonusGBC2;
            }
            case  748 :
            {
                return ShipBonusMBC1;
            }
            case  749 :
            {
                return ShipBonusMBC2;
            }
            case  1154 :
            {
                return UpgradeSlotsLeft;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<AttackBattlecruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<AttackBattlecruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/ship/AttackBattlecruiser.yaml";
        private Map<String, AttackBattlecruiser> cache = (null);

        @Override
        public IMetaCategory<? super AttackBattlecruiser> category() {
            return Ship.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1201;
        }

        @Override
        public String getName() {
            return "AttackBattlecruiser";
        }

        @Override
        public synchronized Map<String, AttackBattlecruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(AttackBattlecruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, AttackBattlecruiser> types;
        }
    }
}
