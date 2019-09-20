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
     * Modifier for damageMultiplierBonusMax used by Triglavians
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double DamageMultiplierBonusMaxModifier;
    /**
     * Modifier for Triglavian ramp-up value
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double DamageMultiplierBonusPerCycleModifier;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ImplantSetAmulet;
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
     * Autogenerated skill attribute, maxRangeBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double MaxRangeBonus;
    /**
     * +/- bonus to the memory of a character.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MemoryBonus;
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
    @DefaultDoubleValue(1.0)
    public double SetBonusMimesis;
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
     * Autogenerated skill attribute, smugglingChanceBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SmugglingChanceBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
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
    public static final Cyberimplant.MetaGroup METAGROUP = new Cyberimplant.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  624 :
            {
                return WarpSBonus;
            }
            case  151 :
            {
                return AgilityBonus;
            }
            case  335 :
            {
                return ArmorHpBonus;
            }
            case  2457 :
            {
                return ArmorRepairBonus;
            }
            case  1126 :
            {
                return BoosterAttributeModifier;
            }
            case  175 :
            {
                return CharismaBonus;
            }
            case  2823 :
            {
                return DamageMultiplierBonusMaxModifier;
            }
            case  2824 :
            {
                return DamageMultiplierBonusPerCycleModifier;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  864 :
            {
                return ImplantSetAmulet;
            }
            case  863 :
            {
                return ImplantSetAngel;
            }
            case  799 :
            {
                return ImplantSetBloodraider;
            }
            case  1552 :
            {
                return ImplantSetCaldariNavy;
            }
            case  1553 :
            {
                return ImplantSetFederationNavy;
            }
            case  838 :
            {
                return ImplantSetGuristas;
            }
            case  1550 :
            {
                return ImplantSetImperialNavy;
            }
            case  1571 :
            {
                return ImplantSetLGCaldariNavy;
            }
            case  1570 :
            {
                return ImplantSetLGFederationNavy;
            }
            case  1569 :
            {
                return ImplantSetLGImperialNavy;
            }
            case  1572 :
            {
                return ImplantSetLGRepublicFleet;
            }
            case  1293 :
            {
                return ImplantSetMordus;
            }
            case  1292 :
            {
                return ImplantSetORE;
            }
            case  1554 :
            {
                return ImplantSetRepublicFleet;
            }
            case  802 :
            {
                return ImplantSetSerpentis;
            }
            case  803 :
            {
                return ImplantSetSerpentis2;
            }
            case  1284 :
            {
                return ImplantSetSisters;
            }
            case  1291 :
            {
                return ImplantSetSyndicate;
            }
            case  1282 :
            {
                return ImplantSetThukker;
            }
            case  1932 :
            {
                return ImplantSetWarpSpeed;
            }
            case  331 :
            {
                return Implantness;
            }
            case  176 :
            {
                return IntelligenceBonus;
            }
            case  351 :
            {
                return MaxRangeBonus;
            }
            case  177 :
            {
                return MemoryBonus;
            }
            case  178 :
            {
                return PerceptionBonus;
            }
            case  294 :
            {
                return RangeSkillBonus;
            }
            case  1567 :
            {
                return ScanGravimetricStrengthModifier;
            }
            case  1027 :
            {
                return ScanGravimetricStrengthPercent;
            }
            case  1566 :
            {
                return ScanLadarStrengthModifier;
            }
            case  1028 :
            {
                return ScanLadarStrengthPercent;
            }
            case  1568 :
            {
                return ScanMagnetometricStrengthModifier;
            }
            case  1029 :
            {
                return ScanMagnetometricStrengthPercent;
            }
            case  1565 :
            {
                return ScanRadarStrengthModifier;
            }
            case  1030 :
            {
                return ScanRadarStrengthPercent;
            }
            case  846 :
            {
                return ScanStrengthBonus;
            }
            case  2825 :
            {
                return SetBonusMimesis;
            }
            case  548 :
            {
                return ShieldBoostMultiplier;
            }
            case  554 :
            {
                return SignatureRadiusBonus;
            }
            case  447 :
            {
                return SmugglingChanceBonus;
            }
            case  422 :
            {
                return TechLevel;
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
    public IMetaGroup<Cyberimplant> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Cyberimplant>
    {
        public static final String RESOURCE_PATH = "SDE/items/implant/Cyberimplant.yaml";
        private Map<String, Cyberimplant> cache = (null);

        @Override
        public IMetaCategory<? super Cyberimplant> category() {
            return Implant.METACAT;
        }

        @Override
        public int getGroupId() {
            return  300;
        }

        @Override
        public String getName() {
            return "Cyberimplant";
        }

        @Override
        public synchronized Map<String, Cyberimplant> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Cyberimplant.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Cyberimplant> items;
        }
    }
}
