package fr.guiguilechat.jcelechat.model.sde.types.subsystem;

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
import fr.guiguilechat.jcelechat.model.sde.types.Subsystem;
import org.yaml.snakeyaml.Yaml;

public class OffensiveSubsystem
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
     * CPU output of ship
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuOutput;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DroneBandwidth;
    /**
     * This defines the total capacity of drones allowed in the drone bay of the ship
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DroneCapacity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherHardPointModifier;
    /**
     * Additional amount of locked targets that can be handled.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxLockedTargetsBonus;
    /**
     * power output of power core
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PowerOutput;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RemoteArmorRepairerFalloffBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RemoteArmorRepairerOptimalBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RemoteShieldBoosterFalloffBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RoleBonusCommandBurstAoERange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrOffensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrOffensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrOffensive3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusCaldariOffensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariOffensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariOffensive3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteOffensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteOffensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallenteOffensive3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarOffensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusMinmatarOffensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusMinmatarOffensive3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemCommandBurstFittingReduction;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemMETFittingReduction;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemMHTFittingReduction;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemMMissileFittingReduction;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemMPTFittingReduction;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemMRARFittingReduction;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemMRSBFittingReduction;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int TurretHardPointModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareLinkCPUPenalty;
    public static final OffensiveSubsystem.MetaGroup METAGROUP = new OffensiveSubsystem.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  482 :
            {
                return CapacitorCapacity;
            }
            case  48 :
            {
                return CpuOutput;
            }
            case  1271 :
            {
                return DroneBandwidth;
            }
            case  283 :
            {
                return DroneCapacity;
            }
            case  1369 :
            {
                return LauncherHardPointModifier;
            }
            case  235 :
            {
                return MaxLockedTargetsBonus;
            }
            case  11 :
            {
                return PowerOutput;
            }
            case  2694 :
            {
                return RemoteArmorRepairerFalloffBonus;
            }
            case  2695 :
            {
                return RemoteArmorRepairerOptimalBonus;
            }
            case  2693 :
            {
                return RemoteShieldBoosterFalloffBonus;
            }
            case  2574 :
            {
                return RoleBonusCommandBurstAoERange;
            }
            case  1434 :
            {
                return SubsystemBonusAmarrOffensive;
            }
            case  1511 :
            {
                return SubsystemBonusAmarrOffensive2;
            }
            case  1531 :
            {
                return SubsystemBonusAmarrOffensive3;
            }
            case  1444 :
            {
                return SubsystemBonusCaldariOffensive;
            }
            case  1510 :
            {
                return SubsystemBonusCaldariOffensive2;
            }
            case  1533 :
            {
                return SubsystemBonusCaldariOffensive3;
            }
            case  1439 :
            {
                return SubsystemBonusGallenteOffensive;
            }
            case  1521 :
            {
                return SubsystemBonusGallenteOffensive2;
            }
            case  1532 :
            {
                return SubsystemBonusGallenteOffensive3;
            }
            case  1449 :
            {
                return SubsystemBonusMinmatarOffensive;
            }
            case  1522 :
            {
                return SubsystemBonusMinmatarOffensive2;
            }
            case  1534 :
            {
                return SubsystemBonusMinmatarOffensive3;
            }
            case  2692 :
            {
                return SubsystemCommandBurstFittingReduction;
            }
            case  2668 :
            {
                return SubsystemMETFittingReduction;
            }
            case  2666 :
            {
                return SubsystemMHTFittingReduction;
            }
            case  2669 :
            {
                return SubsystemMMissileFittingReduction;
            }
            case  2667 :
            {
                return SubsystemMPTFittingReduction;
            }
            case  2671 :
            {
                return SubsystemMRARFittingReduction;
            }
            case  2670 :
            {
                return SubsystemMRSBFittingReduction;
            }
            case  1368 :
            {
                return TurretHardPointModifier;
            }
            case  1883 :
            {
                return WarfareLinkCPUPenalty;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<OffensiveSubsystem> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<OffensiveSubsystem>
    {
        public static final String RESOURCE_PATH = "SDE/types/subsystem/OffensiveSubsystem.yaml";
        private Map<String, OffensiveSubsystem> cache = (null);

        @Override
        public IMetaCategory<? super OffensiveSubsystem> category() {
            return Subsystem.METACAT;
        }

        @Override
        public int getGroupId() {
            return  956;
        }

        @Override
        public String getName() {
            return "OffensiveSubsystem";
        }

        @Override
        public synchronized Map<String, OffensiveSubsystem> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(OffensiveSubsystem.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, OffensiveSubsystem> types;
        }
    }
}