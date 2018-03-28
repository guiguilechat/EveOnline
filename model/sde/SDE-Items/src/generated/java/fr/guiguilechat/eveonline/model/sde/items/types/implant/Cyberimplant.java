package fr.guiguilechat.eveonline.model.sde.items.types.implant;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class Cyberimplant
    extends Implant
{
    /**
     * Autogenerated skill attribute, WarpSBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WarpSBonus;
    /**
     * Bonus to the agility for a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AgilityBonus;
    /**
     * Autogenerated skill attribute, armorHpBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorHpBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorRepairBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterAttributeModifier;
    /**
     * +/- bonus to the charisma of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CharismaBonus;
    /**
     * Autogenerated skill attribute, cpu OutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CpuOutputBonus2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowOffensiveModifierBonus;
    /**
     * This is a devhax attribute that prevents you from e-warping on logon or logoff
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DoesNotEmergencyWarp;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * Stays with characters across clone changes. ONLY FOR IMPLANTS AND BOOSTERS.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FollowsJumpClones;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetAngel;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(2.0)
    public double ImplantSetBloodraider;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetCaldariNavy;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetFederationNavy;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetGuristas;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetImperialNavy;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetLGCaldariNavy;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetLGFederationNavy;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetLGImperialNavy;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetLGRepublicFleet;
    /**
     * Centurion set bonus attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetMordus;
    /**
     * Harvest set bonus attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetORE;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetRepublicFleet;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantSetSansha;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantSetSerpentis;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantSetSerpentis2;
    /**
     * Virtue set bonus attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetSisters;
    /**
     * Edge set bonus attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetSyndicate;
    /**
     * Nomad set bonus attribute
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetThukker;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double ImplantSetWarpSpeed;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * +/- bonus to the intelligence of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int IntelligenceBonus;
    /**
     * Jump range bonus for jump drive operation.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int JumpDriveRangeBonus;
    /**
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
    /**
     * Bonus to Max Targeting Range
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxTargetRangeBonus;
    /**
     * +/- bonus to the memory of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MemoryBonus;
    /**
     * This will make the item non-destructible upon podding.  ONLY FOR IMPLANTS AND BOOSTERS
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Nondestructible;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int PassiveEmDamageResistanceBonus;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int PassiveExplosiveDamageResistanceBonus;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int PassiveKineticDamageResistanceBonus;
    /**
     * 
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int PassiveThermicDamageResistanceBonus;
    /**
     * +/- bonus to the perception of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PerceptionBonus;
    /**
     * Autogenerated skill attribute, PowerOutputBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double PowerEngineeringOutputBonus;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RangeSkillBonus;
    /**
     * Autogenerated skill attribute, repairBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RepairBonus;
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
     * + / - modifier to a ship gravimetric strength
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanGravimetricStrengthModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanGravimetricStrengthPercent;
    /**
     * + / - modifier to a ship ladar strength
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanLadarStrengthModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanLadarStrengthPercent;
    /**
     * + / - modifier to a ship magnetometric strength
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanMagnetometricStrengthModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanMagnetometricStrengthPercent;
    /**
     * + / - modifier to a ship radar strength
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanRadarStrengthModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanRadarStrengthPercent;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanStrengthBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldBoostMultiplier;
    /**
     * Autogenerated skill attribute, shieldCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldCapacityBonus;
    /**
     * Autogenerated skill attribute, signatureRadiusBonus
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SignatureRadiusBonus;
    /**
     * Autogenerated skill attribute, smugglingChanceBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SmugglingChanceBonus;
    /**
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Scale the tracking speed of a weapon.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double TrackingSpeedMultiplier;
    /**
     * Autogenerated skill attribute, velocityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double VelocityBonus;
    /**
     * +/- bonus to the willpower of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int WillpowerBonus;
    public final static String RESOURCE_PATH = "SDE/items/implant/Cyberimplant.yaml";
    private static LinkedHashMap<String, Cyberimplant> cache = (null);

    @Override
    public int getGroupId() {
        return  300;
    }

    @Override
    public Class<?> getGroup() {
        return Cyberimplant.class;
    }

    public static synchronized LinkedHashMap<String, Cyberimplant> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(Cyberimplant.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, Cyberimplant> items;
    }
}
