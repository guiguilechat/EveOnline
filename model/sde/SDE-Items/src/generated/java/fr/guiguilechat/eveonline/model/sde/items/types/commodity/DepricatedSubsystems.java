package fr.guiguilechat.eveonline.model.sde.items.types.commodity;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.Attribute;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Commodity;
import org.yaml.snakeyaml.Yaml;

public class DepricatedSubsystems
    extends Commodity
{
    /**
     * The agility of the object.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Agility;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorHPBonusAdd;
    /**
     * Capacitor capacity
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorCapacity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CloakingCpuNeedBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CovertCloakCPUPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(30000)
    public int CovertOpsAndReconOpsCloakModuleDelay;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuNeedBonus;
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
    public int FitsToShipType;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int HiSlotModifier;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int JumpHarmonicsModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherHardPointModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LightColor;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LowSlotModifier;
    /**
     * Maximum range at which the scanner can lock a target.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int MaxTargetRange;
    /**
     * Maximum velocity of ship
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double MaxVelocity;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MedSlotModifier;
    /**
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
    /**
     * Indicates that a module or subsystem has been phased out. Primarily used by saved fittings.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ModuleIsObsolete;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveArmorEmDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveArmorExplosiveDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveArmorKineticDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveArmorThermalDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveShieldEmDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveShieldExplosiveDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveShieldKineticDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PassiveShieldThermalDamageResonance;
    /**
     * power output of power core
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PowerOutput;
    /**
     * Amount of time taken to fully recharge the capacitor.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double RechargeRate;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RoleBonusCommandBurstAoERange;
    /**
     * Gravimetric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanGravimetricStrength;
    /**
     * Ladar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanLadarStrength;
    /**
     * Magnetometric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanMagnetometricStrength;
    /**
     * Radar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanRadarStrength;
    /**
     * The resolution that the vessel can target other objects at.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int ScanResolution;
    /**
     * Amount of maximum shield HP on the item.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldCapacity;
    /**
     * Amount of time taken to fully recharge the shield.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldRechargeRate;
    /**
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(100)
    public int SignatureRadius;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubSystemSlot;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusAmarrDefensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrDefensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrElectronic;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrElectronic2;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusAmarrOffensive3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusAmarrPropulsion;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusCaldariDefensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariDefensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusCaldariElectronic;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusCaldariElectronic2;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusCaldariPropulsion;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusCaldariPropulsion2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallenteCore;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallenteDefensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteDefensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteElectronic;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusGallenteElectronic2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallenteOffensive;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallentePropulsion;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusGallentePropulsion2;
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
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusMinmatarDefensive;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarDefensive2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarElectronic;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SubsystemBonusMinmatarElectronic2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SubsystemBonusMinmatarOffensive;
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
    public int SubsystemBonusMinmatarPropulsion;
    /**
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
    public int TurretHardPointModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int VirusStrengthBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarfareLinkCPUPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpBubbleImmuneModifier;
    public final static String RESOURCE_PATH = "SDE/items/commodity/DepricatedSubsystems.yaml";
    private static LinkedHashMap<String, DepricatedSubsystems> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  70 :
            {
                return Agility;
            }
            case  1159 :
            {
                return ArmorHPBonusAdd;
            }
            case  482 :
            {
                return CapacitorCapacity;
            }
            case  649 :
            {
                return CloakingCpuNeedBonus;
            }
            case  1871 :
            {
                return CovertCloakCPUPenalty;
            }
            case  1034 :
            {
                return CovertOpsAndReconOpsCloakModuleDelay;
            }
            case  310 :
            {
                return CpuNeedBonus;
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
            case  1380 :
            {
                return FitsToShipType;
            }
            case  1374 :
            {
                return HiSlotModifier;
            }
            case  9 :
            {
                return Hp;
            }
            case  1541 :
            {
                return JumpHarmonicsModifier;
            }
            case  1369 :
            {
                return LauncherHardPointModifier;
            }
            case  1430 :
            {
                return LightColor;
            }
            case  1376 :
            {
                return LowSlotModifier;
            }
            case  76 :
            {
                return MaxTargetRange;
            }
            case  37 :
            {
                return MaxVelocity;
            }
            case  1375 :
            {
                return MedSlotModifier;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  2696 :
            {
                return ModuleIsObsolete;
            }
            case  1418 :
            {
                return PassiveArmorEmDamageResonance;
            }
            case  1421 :
            {
                return PassiveArmorExplosiveDamageResonance;
            }
            case  1420 :
            {
                return PassiveArmorKineticDamageResonance;
            }
            case  1419 :
            {
                return PassiveArmorThermalDamageResonance;
            }
            case  1423 :
            {
                return PassiveShieldEmDamageResonance;
            }
            case  1422 :
            {
                return PassiveShieldExplosiveDamageResonance;
            }
            case  1424 :
            {
                return PassiveShieldKineticDamageResonance;
            }
            case  1425 :
            {
                return PassiveShieldThermalDamageResonance;
            }
            case  11 :
            {
                return PowerOutput;
            }
            case  55 :
            {
                return RechargeRate;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  2574 :
            {
                return RoleBonusCommandBurstAoERange;
            }
            case  211 :
            {
                return ScanGravimetricStrength;
            }
            case  209 :
            {
                return ScanLadarStrength;
            }
            case  210 :
            {
                return ScanMagnetometricStrength;
            }
            case  208 :
            {
                return ScanRadarStrength;
            }
            case  564 :
            {
                return ScanResolution;
            }
            case  263 :
            {
                return ShieldCapacity;
            }
            case  479 :
            {
                return ShieldRechargeRate;
            }
            case  552 :
            {
                return SignatureRadius;
            }
            case  1366 :
            {
                return SubSystemSlot;
            }
            case  1431 :
            {
                return SubsystemBonusAmarrCore;
            }
            case  1433 :
            {
                return SubsystemBonusAmarrDefensive;
            }
            case  1507 :
            {
                return SubsystemBonusAmarrDefensive2;
            }
            case  1432 :
            {
                return SubsystemBonusAmarrElectronic;
            }
            case  1508 :
            {
                return SubsystemBonusAmarrElectronic2;
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
            case  1435 :
            {
                return SubsystemBonusAmarrPropulsion;
            }
            case  1441 :
            {
                return SubsystemBonusCaldariCore;
            }
            case  1443 :
            {
                return SubsystemBonusCaldariDefensive;
            }
            case  1516 :
            {
                return SubsystemBonusCaldariDefensive2;
            }
            case  1442 :
            {
                return SubsystemBonusCaldariElectronic;
            }
            case  1514 :
            {
                return SubsystemBonusCaldariElectronic2;
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
            case  1445 :
            {
                return SubsystemBonusCaldariPropulsion;
            }
            case  1513 :
            {
                return SubsystemBonusCaldariPropulsion2;
            }
            case  1436 :
            {
                return SubsystemBonusGallenteCore;
            }
            case  1519 :
            {
                return SubsystemBonusGallenteCore2;
            }
            case  1438 :
            {
                return SubsystemBonusGallenteDefensive;
            }
            case  1517 :
            {
                return SubsystemBonusGallenteDefensive2;
            }
            case  1437 :
            {
                return SubsystemBonusGallenteElectronic;
            }
            case  1518 :
            {
                return SubsystemBonusGallenteElectronic2;
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
            case  1440 :
            {
                return SubsystemBonusGallentePropulsion;
            }
            case  1520 :
            {
                return SubsystemBonusGallentePropulsion2;
            }
            case  1446 :
            {
                return SubsystemBonusMinmatarCore;
            }
            case  1448 :
            {
                return SubsystemBonusMinmatarDefensive;
            }
            case  1526 :
            {
                return SubsystemBonusMinmatarDefensive2;
            }
            case  1447 :
            {
                return SubsystemBonusMinmatarElectronic;
            }
            case  1524 :
            {
                return SubsystemBonusMinmatarElectronic2;
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
            case  1450 :
            {
                return SubsystemBonusMinmatarPropulsion;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1368 :
            {
                return TurretHardPointModifier;
            }
            case  1918 :
            {
                return VirusStrengthBonus;
            }
            case  1883 :
            {
                return WarfareLinkCPUPenalty;
            }
            case  1539 :
            {
                return WarpBubbleImmuneModifier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  955;
    }

    @Override
    public Class<?> getGroup() {
        return DepricatedSubsystems.class;
    }

    public static synchronized LinkedHashMap<String, DepricatedSubsystems> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(DepricatedSubsystems.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, DepricatedSubsystems> items;
    }
}
