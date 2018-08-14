package fr.guiguilechat.jcelechat.model.sde.items.types.ship;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Ship;
import org.yaml.snakeyaml.Yaml;

public class JumpFreighter
    extends Ship
{
    /**
     * Attribute on ship to make advanced command affect only ships that we want.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int AdvancedAgility;
    /**
     *  1 = ship can use jump drive
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanJump;
    /**
     * Can use cargo in space or not, 0 = no, 1 = yes
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int CanUseCargoInSpace;
    /**
     * Autogenerated skill attribute, cpuNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CpuNeedBonus;
    /**
     * eliteBonusJumpFreighter1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EliteBonusJumpFreighter1;
    /**
     * eliteBonusJumpFreighter2
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EliteBonusJumpFreighter2;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityAntiCapitalMissileResistance;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusA1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusA2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusC1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusC2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusG1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusG2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusM1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FreighterBonusM2;
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
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int IsCapitalSize;
    /**
     * Minimum capacitor need for jump drive operation from full capacitor in modifier%.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double JumpDriveCapacitorNeed;
    /**
     * Number of units it consumes per light year.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int JumpDriveConsumptionAmount;
    /**
     * Type that is used for consumption from cargo hold when activating jump drive operation.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int JumpDriveConsumptionType;
    /**
     * The amount of time before the ship actually jumps.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(300000)
    public int JumpDriveDuration;
    /**
     * Range in light years the ship can maximum jump to.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double JumpDriveRange;
    /**
     * Multiplier for jump fatigue distance
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double JumpFatigueMultiplier;
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
     * Specifies the maximum numbers of passengers that the ship can have
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxPassengers;
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
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill3;
    /**
     * Required skill level for skill 3
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill3Level;
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
     * special fuel bay capacity
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int SpecialFuelBayCapacity;
    /**
     * How many upgrades can by fitted to this ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeSlotsLeft;
    public final static JumpFreighter.MetaGroup METAGROUP = new JumpFreighter.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  853 :
            {
                return AdvancedAgility;
            }
            case  861 :
            {
                return CanJump;
            }
            case  849 :
            {
                return CanUseCargoInSpace;
            }
            case  310 :
            {
                return CpuNeedBonus;
            }
            case  1311 :
            {
                return EliteBonusJumpFreighter1;
            }
            case  1312 :
            {
                return EliteBonusJumpFreighter2;
            }
            case  2244 :
            {
                return FighterAbilityAntiCapitalMissileResistance;
            }
            case  886 :
            {
                return FreighterBonusA1;
            }
            case  887 :
            {
                return FreighterBonusA2;
            }
            case  888 :
            {
                return FreighterBonusC1;
            }
            case  889 :
            {
                return FreighterBonusC2;
            }
            case  891 :
            {
                return FreighterBonusG1;
            }
            case  890 :
            {
                return FreighterBonusG2;
            }
            case  892 :
            {
                return FreighterBonusM1;
            }
            case  893 :
            {
                return FreighterBonusM2;
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
            case  1785 :
            {
                return IsCapitalSize;
            }
            case  898 :
            {
                return JumpDriveCapacitorNeed;
            }
            case  868 :
            {
                return JumpDriveConsumptionAmount;
            }
            case  866 :
            {
                return JumpDriveConsumptionType;
            }
            case  869 :
            {
                return JumpDriveDuration;
            }
            case  867 :
            {
                return JumpDriveRange;
            }
            case  1971 :
            {
                return JumpFatigueMultiplier;
            }
            case  1253 :
            {
                return JumpHarmonics;
            }
            case  124 :
            {
                return MainColor;
            }
            case  129 :
            {
                return MaxPassengers;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  184 :
            {
                return RequiredSkill3;
            }
            case  279 :
            {
                return RequiredSkill3Level;
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
            case  1549 :
            {
                return SpecialFuelBayCapacity;
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
    public IMetaGroup<JumpFreighter> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<JumpFreighter>
    {
        public final static String RESOURCE_PATH = "SDE/items/ship/JumpFreighter.yaml";
        private Map<String, JumpFreighter> cache = (null);

        @Override
        public IMetaCategory<? super JumpFreighter> category() {
            return Ship.METACAT;
        }

        @Override
        public int getGroupId() {
            return  902;
        }

        @Override
        public String getName() {
            return "JumpFreighter";
        }

        @Override
        public synchronized Map<String, JumpFreighter> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(JumpFreighter.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, JumpFreighter> items;
        }
    }
}
