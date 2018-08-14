package fr.guiguilechat.jcelechat.model.sde.items.types.module;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class FighterSupportUnit
    extends Module
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup01;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup02;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType2;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * Bonus to fighter ROF (%)
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FighterBonusROFPercent;
    /**
     * Bonus to fighter hitpoint (%)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FighterBonusShieldCapacityPercent;
    /**
     * Bonus to fighter shield recharge (%)
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FighterBonusShieldRechargePercent;
    /**
     * Bonus to fighter Velocity (%)
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double FighterBonusVelocityPercent;
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
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
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
    public final static FighterSupportUnit.MetaGroup METAGROUP = new FighterSupportUnit.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1298 :
            {
                return CanFitShipGroup01;
            }
            case  1299 :
            {
                return CanFitShipGroup02;
            }
            case  1302 :
            {
                return CanFitShipType1;
            }
            case  1303 :
            {
                return CanFitShipType2;
            }
            case  50 :
            {
                return Cpu;
            }
            case  2337 :
            {
                return FighterBonusROFPercent;
            }
            case  2335 :
            {
                return FighterBonusShieldCapacityPercent;
            }
            case  2338 :
            {
                return FighterBonusShieldRechargePercent;
            }
            case  2336 :
            {
                return FighterBonusVelocityPercent;
            }
            case  1692 :
            {
                return MetaGroupID;
            }
            case  30 :
            {
                return Power;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<FighterSupportUnit> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<FighterSupportUnit>
    {
        public final static String RESOURCE_PATH = "SDE/items/module/FighterSupportUnit.yaml";
        private Map<String, FighterSupportUnit> cache = (null);

        @Override
        public IMetaCategory<? super FighterSupportUnit> category() {
            return Module.METACAT;
        }

        @Override
        public int getGroupId() {
            return  407;
        }

        @Override
        public String getName() {
            return "FighterSupportUnit";
        }

        @Override
        public synchronized Map<String, FighterSupportUnit> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(FighterSupportUnit.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, FighterSupportUnit> items;
        }
    }
}
