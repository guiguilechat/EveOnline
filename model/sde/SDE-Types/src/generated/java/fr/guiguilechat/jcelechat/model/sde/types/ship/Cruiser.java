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

public class Cruiser
    extends Ship
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(30000)
    public int CovertOpsAndReconOpsCloakModuleDelay;
    /**
     * If this module is in use and this attribute is 1, then offensive modules cannot be used on the ship if they apply modifiers for the duration of their effect. If this is put on a ship or NPC with value of 1, then the ship or NPC are immune to offensive modifiers (target jamming, tracking disruption etc.)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowOffensiveModifiers;
    /**
     * Bonus to drone armor repair amount
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DroneArmorDamageAmountBonus;
    /**
     * Bonus to drone shield transport amount
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DroneShieldBonusBonus;
    /**
     * Length of activation time.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Duration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double EnergyTransferAmountBonus;
    /**
     * Autogenerated skill attribute, falloffBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FalloffBonus;
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
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HullEmDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HullExplosiveDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HullKineticDamageResonance;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HullThermalDamageResonance;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int JumpHarmonics;
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
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxRangeBonus2;
    /**
     * Authoring has been moved to FSD.
     * meta group of type
     * 
     *  3: Story-line (Cosmos)
     *  4: Faction
     *  5: Officer (rare asteroid NPCs)
     *  6: Deadspace
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaGroupID;
    /**
     * Deprecated.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double MinTargetVelDmgMultiplier;
    /**
     * NOS override allows a nosferatu module to drain the target capacitor below the current ships capacitor level.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NosOverride;
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
    public double ShipBonusAC;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusAC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(5)
    public int ShipBonusCC;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusCC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBonusCC3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(5.0)
    public double ShipBonusGC;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusGC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusGC3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusMC;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusMC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusPC1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBonusPC2;
    /**
     * Ship Role Bonus. Not multiplied by skills.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusRole1;
    /**
     * Ship Role Bonus. Not multiplied by skills.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBonusRole2;
    /**
     * Ship Role Bonus. Not multiplied by skills.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipBonusRole3;
    /**
     * Fixed Role Bonus on a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusRole7;
    /**
     * Second Stock Bonus on Pirate Faction Ships.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShipBonusRole8;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShipRoleBonusWarpSpeed;
    /**
     * How many rigs can by fitted to this ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeSlotsLeft;
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
    public int WarpBubbleImmune;
    public static final Cruiser.MetaGroup METAGROUP = new Cruiser.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1034 :
            {
                return CovertOpsAndReconOpsCloakModuleDelay;
            }
            case  872 :
            {
                return DisallowOffensiveModifiers;
            }
            case  1219 :
            {
                return DroneArmorDamageAmountBonus;
            }
            case  1220 :
            {
                return DroneShieldBonusBonus;
            }
            case  73 :
            {
                return Duration;
            }
            case  1840 :
            {
                return EnergyTransferAmountBonus;
            }
            case  349 :
            {
                return FalloffBonus;
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
            case  974 :
            {
                return HullEmDamageResonance;
            }
            case  975 :
            {
                return HullExplosiveDamageResonance;
            }
            case  976 :
            {
                return HullKineticDamageResonance;
            }
            case  977 :
            {
                return HullThermalDamageResonance;
            }
            case  1253 :
            {
                return JumpHarmonics;
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
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  769 :
            {
                return MaxRangeBonus2;
            }
            case  1692 :
            {
                return MetaGroupID;
            }
            case  662 :
            {
                return MinTargetVelDmgMultiplier;
            }
            case  1945 :
            {
                return NosOverride;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
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
            case  478 :
            {
                return ShipBonusAC;
            }
            case  656 :
            {
                return ShipBonusAC2;
            }
            case  487 :
            {
                return ShipBonusCC;
            }
            case  657 :
            {
                return ShipBonusCC2;
            }
            case  1535 :
            {
                return ShipBonusCC3;
            }
            case  486 :
            {
                return ShipBonusGC;
            }
            case  658 :
            {
                return ShipBonusGC2;
            }
            case  2014 :
            {
                return ShipBonusGC3;
            }
            case  489 :
            {
                return ShipBonusMC;
            }
            case  659 :
            {
                return ShipBonusMC2;
            }
            case  2764 :
            {
                return ShipBonusPC1;
            }
            case  2765 :
            {
                return ShipBonusPC2;
            }
            case  2298 :
            {
                return ShipBonusRole1;
            }
            case  2299 :
            {
                return ShipBonusRole2;
            }
            case  2300 :
            {
                return ShipBonusRole3;
            }
            case  793 :
            {
                return ShipBonusRole7;
            }
            case  1688 :
            {
                return ShipBonusRole8;
            }
            case  2789 :
            {
                return ShipRoleBonusWarpSpeed;
            }
            case  1154 :
            {
                return UpgradeSlotsLeft;
            }
            case  1918 :
            {
                return VirusStrengthBonus;
            }
            case  1538 :
            {
                return WarpBubbleImmune;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Cruiser> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Cruiser>
    {
        public static final String RESOURCE_PATH = "SDE/types/ship/Cruiser.yaml";
        private Map<String, Cruiser> cache = (null);

        @Override
        public IMetaCategory<? super Cruiser> category() {
            return Ship.METACAT;
        }

        @Override
        public int getGroupId() {
            return  26;
        }

        @Override
        public String getName() {
            return "Cruiser";
        }

        @Override
        public synchronized Map<String, Cruiser> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(Cruiser.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Cruiser> types;
        }
    }
}
