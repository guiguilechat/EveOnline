package fr.guiguilechat.jcelechat.model.sde.types.structuremodule;

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
import fr.guiguilechat.jcelechat.model.sde.types.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureEngineeringRigMDroneAndFighterTE
    extends StructureModule
{
    /**
     * Bonus on Cost decrease for engineering rigs
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(1)
    public int AttributeEngRigCostBonus;
    /**
     * Bonus on Material decrease for engineering rigs
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double AttributeEngRigMatBonus;
    /**
     * Bonus on Time decrease for engineering rigs
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(1)
    public int AttributeEngRigTimeBonus;
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
    public int CanFitShipGroup03;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double HiSecModifier;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Hp;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double LowSecModifier;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxGroupFitted;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double NullSecModifier;
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
    public int RigSize;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SecurityModifier;
    /**
     * High-sec bonus on structure rigs.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int StructureRigBonus1;
    /**
     * High-sec bonus on structure rigs.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double StructureRigBonus2;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * How much of the upgrade capacity is used when this is fitted to a ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int UpgradeCost;
    public static final StructureEngineeringRigMDroneAndFighterTE.MetaGroup METAGROUP = new StructureEngineeringRigMDroneAndFighterTE.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2595 :
            {
                return AttributeEngRigCostBonus;
            }
            case  2594 :
            {
                return AttributeEngRigMatBonus;
            }
            case  2593 :
            {
                return AttributeEngRigTimeBonus;
            }
            case  1298 :
            {
                return CanFitShipGroup01;
            }
            case  1299 :
            {
                return CanFitShipGroup02;
            }
            case  1300 :
            {
                return CanFitShipGroup03;
            }
            case  2355 :
            {
                return HiSecModifier;
            }
            case  9 :
            {
                return Hp;
            }
            case  2356 :
            {
                return LowSecModifier;
            }
            case  1544 :
            {
                return MaxGroupFitted;
            }
            case  2357 :
            {
                return NullSecModifier;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  1547 :
            {
                return RigSize;
            }
            case  2358 :
            {
                return SecurityModifier;
            }
            case  2095 :
            {
                return StructureRigBonus1;
            }
            case  2096 :
            {
                return StructureRigBonus2;
            }
            case  422 :
            {
                return TechLevel;
            }
            case  1153 :
            {
                return UpgradeCost;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<StructureEngineeringRigMDroneAndFighterTE> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<StructureEngineeringRigMDroneAndFighterTE>
    {
        public static final String RESOURCE_PATH = "SDE/types/structuremodule/StructureEngineeringRigMDroneAndFighterTE.yaml";
        private Map<String, StructureEngineeringRigMDroneAndFighterTE> cache = (null);

        @Override
        public IMetaCategory<? super StructureEngineeringRigMDroneAndFighterTE> category() {
            return StructureModule.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1823;
        }

        @Override
        public String getName() {
            return "StructureEngineeringRigMDroneAndFighterTE";
        }

        @Override
        public synchronized Map<String, StructureEngineeringRigMDroneAndFighterTE> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(StructureEngineeringRigMDroneAndFighterTE.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, StructureEngineeringRigMDroneAndFighterTE> types;
        }
    }
}
