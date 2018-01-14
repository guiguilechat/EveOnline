
package fr.guiguilechat.eveonline.model.sde.compiled.items.implant;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.compiled.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.compiled.items.Implant;
import org.yaml.snakeyaml.Yaml;

public class Booster
    extends Implant
{

    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterEffectChance1;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterEffectChance2;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterEffectChance3;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterEffectChance4;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterEffectChance5;
    /**
     * Duration of booster, after this duration the booster is destroyed
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterDuration;
    /**
     * Booster attribute to explosion radius of missiles vs. signature radius.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double AoeCloudSizeBonus;
    /**
     * Autogenerated skill attribute, falloffBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FalloffBonus;
    /**
     * This will make the item non-destructible upon podding.  ONLY FOR IMPLANTS AND BOOSTERS
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Nondestructible;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ShieldBoostMultiplier;
    /**
     * Autogenerated skill attribute, damageMultiplierBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double DamageMultiplierBonus;
    /**
     * Autogenerated skill attribute, rofBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RofBonus;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RangeSkillBonus;
    /**
     * Autogenerated skill attribute, repairBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double RepairBonus;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterShieldBoostAmountPenalty;
    /**
     * Autogenerated skill attribute, signatureRadiusBonus
     * 
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double SignatureRadiusBonus;
    /**
     * Autogenerated skill attribute, max flightTimeBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MaxFlightTimeBonus;
    /**
     * +/- bonus to the charisma of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CharismaBonus;
    /**
     * This attribute deactivates the booster after the character's age reaches a certain amount
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterMaxCharAgeHours;
    /**
     * +/- bonus to the intelligence of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double IntelligenceBonus;
    /**
     * +/- bonus to the memory of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double MemoryBonus;
    /**
     * +/- bonus to the perception of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double PerceptionBonus;
    /**
     * +/- bonus to the willpower of a character.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double WillpowerBonus;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterArmorHPPenalty;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterArmorRepairAmountPenalty;
    /**
     * The last allowed injection date.  After this date the booster can no longer be consumed.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterLastInjectionDatetime;
    /**
     * Bonus for scan resolution
     * 
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultValue(0.0D)
    public double ScanResolutionBonus;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterShieldCapacityPenalty;
    /**
     * Autogenerated skill attribute, CapacitorCapacityBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double CapacitorCapacityBonus;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterTurretOptimalRangePenalty;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterTurretTrackingPenalty;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterTurretFalloffPenalty;
    /**
     * Autogenerated skill attribute, velocityBonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double VelocityBonus;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterAOEVelocityPenalty;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterMissileVelocityPenalty;
    /**
     * Stays with characters across clone changes. ONLY FOR IMPLANTS AND BOOSTERS.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double FollowsJumpClones;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterMissileAOECloudPenalty;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterCapacitorCapacityPenalty;
    /**
     * Whether an item is a booster or not.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double Boosterness;
    /**
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double BoosterMaxVelocityPenalty;
    /**
     * Bonus attribute for armor repair amount.
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double ArmorDamageAmountBonus;
    /**
     * Tracking Speed Bonus
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double TrackingSpeedBonus;
    public final static String RESOURCE_PATH = "SDE/implant/Booster.yaml";
    private static LinkedHashMap<String, Booster> cache = (null);

    @Override
    public int getGroupId() {
        return  303;
    }

    @Override
    public Class<?> getGroup() {
        return Booster.class;
    }

    public static LinkedHashMap<String, Booster> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, Booster> items;

    }

}
