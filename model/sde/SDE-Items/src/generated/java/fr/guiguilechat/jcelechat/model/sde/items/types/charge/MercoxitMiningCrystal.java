package fr.guiguilechat.jcelechat.model.sde.items.types.charge;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Charge;
import org.yaml.snakeyaml.Yaml;

public class MercoxitMiningCrystal
    extends Charge
{
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * The size of the charges that can fit in the turret/whatever.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ChargeSize;
    /**
     * The chance of damage to the crystal each time it is used.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CrystalVolatilityChance;
    /**
     * The amount of damage done if the crystal is damaged in the process of using it.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CrystalVolatilityDamage;
    /**
     * Whether this tool causes damage to crystals with each use of them.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CrystalsGetDamaged;
    /**
     * current structure damage dealt to module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Damage;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * One of the groups of launcher this charge can be loaded into.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LauncherGroup;
    /**
     * The main color of a ship type.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MainColor;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
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
     * The group at which the mining crystal is tuned to mine.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SpecialisationAsteroidGroup;
    /**
     * The amount the yield is modified when mining the asteroid group this crystal is tuned for.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double SpecialisationAsteroidYieldMultiplier;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * The capacitor charge required to disengage this crystal from the unit it is installed in.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UnfitCapCost;
    public final static MercoxitMiningCrystal.MetaGroup METAGROUP = new MercoxitMiningCrystal.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  317 :
            {
                return CapNeedBonus;
            }
            case  128 :
            {
                return ChargeSize;
            }
            case  783 :
            {
                return CrystalVolatilityChance;
            }
            case  784 :
            {
                return CrystalVolatilityDamage;
            }
            case  786 :
            {
                return CrystalsGetDamaged;
            }
            case  3 :
            {
                return Damage;
            }
            case  9 :
            {
                return Hp;
            }
            case  137 :
            {
                return LauncherGroup;
            }
            case  124 :
            {
                return MainColor;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  781 :
            {
                return SpecialisationAsteroidGroup;
            }
            case  782 :
            {
                return SpecialisationAsteroidYieldMultiplier;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  785 :
            {
                return UnfitCapCost;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<MercoxitMiningCrystal> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MercoxitMiningCrystal>
    {
        public final static String RESOURCE_PATH = "SDE/items/charge/MercoxitMiningCrystal.yaml";
        private Map<String, MercoxitMiningCrystal> cache = (null);

        @Override
        public IMetaCategory<? super MercoxitMiningCrystal> category() {
            return Charge.METACAT;
        }

        @Override
        public int getGroupId() {
            return  663;
        }

        @Override
        public String getName() {
            return "MercoxitMiningCrystal";
        }

        @Override
        public synchronized Map<String, MercoxitMiningCrystal> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(MercoxitMiningCrystal.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MercoxitMiningCrystal> items;
        }
    }
}
