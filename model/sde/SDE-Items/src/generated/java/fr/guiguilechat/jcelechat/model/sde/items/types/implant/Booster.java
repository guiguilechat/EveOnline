package fr.guiguilechat.jcelechat.model.sde.items.types.implant;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class Booster
    extends Implant
{
    /**
     * Attribute defining usage count for penaltyless skill injections
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int NonDiminishingSkillInjectorUses;
    /**
     * Booster attribute to explosion radius of missiles vs. signature radius.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AoeCloudSizeBonus;
    /**
     * Bonus attribute for armor repair amount.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorDamageAmountBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterAOEVelocityPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterArmorHPPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterArmorRepairAmountPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterCapacitorCapacityPenalty;
    /**
     * Duration of booster, after this duration the booster is destroyed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterDuration;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BoosterEffectChance1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BoosterEffectChance2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BoosterEffectChance3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BoosterEffectChance4;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BoosterEffectChance5;
    /**
     * The last allowed injection date.  After this date the booster can no longer be consumed. Formatted YYYY.MM.DD HH:MM:SS
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double BoosterLastInjectionDatetime;
    /**
     * This attribute deactivates the booster after the character's age reaches a certain amount
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterMaxCharAgeHours;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterMaxVelocityPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterMissileAOECloudPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterMissileVelocityPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterShieldBoostAmountPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterShieldCapacityPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterTurretFalloffPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterTurretOptimalRangePenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int BoosterTurretTrackingPenalty;
    /**
     * Whether an item is a booster or not.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Boosterness;
    /**
     * Autogenerated skill attribute, CapacitorCapacityBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CapacitorCapacityBonus;
    /**
     * +/- bonus to the charisma of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CharismaBonus;
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
     * Stays with characters across clone changes. ONLY FOR IMPLANTS AND BOOSTERS.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FollowsJumpClones;
    /**
     * +/- bonus to the intelligence of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int IntelligenceBonus;
    /**
     * Autogenerated skill attribute, max flightTimeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxFlightTimeBonus;
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
     * +/- bonus to the perception of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int PerceptionBonus;
    /**
     * Autogenerated skill attribute, rangeSkillBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RangeSkillBonus;
    /**
     * Autogenerated skill attribute, rofBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RofBonus;
    /**
     * Bonus for scan resolution
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanResolutionBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldBoostMultiplier;
    /**
     * Autogenerated skill attribute, signatureRadiusBonus
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SignatureRadiusBonus;
    /**
     * Bonus To standing gain towards non CONCORD npcs  
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(100)
    public int SocialBonus;
    /**
     * Autogenerated skill attribute, socialMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SocialMutator;
    /**
     * Tracking Speed Bonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeedBonus;
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
    public static final Booster.MetaGroup METAGROUP = new Booster.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2806 :
            {
                return NonDiminishingSkillInjectorUses;
            }
            case  848 :
            {
                return AoeCloudSizeBonus;
            }
            case  895 :
            {
                return ArmorDamageAmountBonus;
            }
            case  1147 :
            {
                return BoosterAOEVelocityPenalty;
            }
            case  1141 :
            {
                return BoosterArmorHPPenalty;
            }
            case  1142 :
            {
                return BoosterArmorRepairAmountPenalty;
            }
            case  1150 :
            {
                return BoosterCapacitorCapacityPenalty;
            }
            case  330 :
            {
                return BoosterDuration;
            }
            case  1089 :
            {
                return BoosterEffectChance1;
            }
            case  1090 :
            {
                return BoosterEffectChance2;
            }
            case  1091 :
            {
                return BoosterEffectChance3;
            }
            case  1092 :
            {
                return BoosterEffectChance4;
            }
            case  1093 :
            {
                return BoosterEffectChance5;
            }
            case  2422 :
            {
                return BoosterLastInjectionDatetime;
            }
            case  1647 :
            {
                return BoosterMaxCharAgeHours;
            }
            case  1151 :
            {
                return BoosterMaxVelocityPenalty;
            }
            case  1149 :
            {
                return BoosterMissileAOECloudPenalty;
            }
            case  1148 :
            {
                return BoosterMissileVelocityPenalty;
            }
            case  616 :
            {
                return BoosterShieldBoostAmountPenalty;
            }
            case  1143 :
            {
                return BoosterShieldCapacityPenalty;
            }
            case  1146 :
            {
                return BoosterTurretFalloffPenalty;
            }
            case  1144 :
            {
                return BoosterTurretOptimalRangePenalty;
            }
            case  1145 :
            {
                return BoosterTurretTrackingPenalty;
            }
            case  1087 :
            {
                return Boosterness;
            }
            case  1079 :
            {
                return CapacitorCapacityBonus;
            }
            case  175 :
            {
                return CharismaBonus;
            }
            case  292 :
            {
                return DamageMultiplierBonus;
            }
            case  349 :
            {
                return FalloffBonus;
            }
            case  1916 :
            {
                return FollowsJumpClones;
            }
            case  176 :
            {
                return IntelligenceBonus;
            }
            case  557 :
            {
                return MaxFlightTimeBonus;
            }
            case  177 :
            {
                return MemoryBonus;
            }
            case  1890 :
            {
                return Nondestructible;
            }
            case  178 :
            {
                return PerceptionBonus;
            }
            case  294 :
            {
                return RangeSkillBonus;
            }
            case  293 :
            {
                return RofBonus;
            }
            case  566 :
            {
                return ScanResolutionBonus;
            }
            case  548 :
            {
                return ShieldBoostMultiplier;
            }
            case  554 :
            {
                return SignatureRadiusBonus;
            }
            case  362 :
            {
                return SocialBonus;
            }
            case  438 :
            {
                return SocialMutator;
            }
            case  767 :
            {
                return TrackingSpeedBonus;
            }
            case  315 :
            {
                return VelocityBonus;
            }
            case  179 :
            {
                return WillpowerBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Booster> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Booster>
    {
        public static final String RESOURCE_PATH = "SDE/items/implant/Booster.yaml";
        private Map<String, Booster> cache = (null);

        @Override
        public IMetaCategory<? super Booster> category() {
            return Implant.METACAT;
        }

        @Override
        public int getGroupId() {
            return  303;
        }

        @Override
        public String getName() {
            return "Booster";
        }

        @Override
        public synchronized Map<String, Booster> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Booster.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Booster> items;
        }
    }
}
