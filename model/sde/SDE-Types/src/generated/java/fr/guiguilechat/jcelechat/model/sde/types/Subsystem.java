package fr.guiguilechat.jcelechat.model.sde.types;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.EveType;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.subsystem.CoreSubsystem;
import fr.guiguilechat.jcelechat.model.sde.types.subsystem.DefensiveSubsystem;
import fr.guiguilechat.jcelechat.model.sde.types.subsystem.OffensiveSubsystem;
import fr.guiguilechat.jcelechat.model.sde.types.subsystem.PropulsionSubsystem;

public abstract class Subsystem
    extends EveType
{
    /**
     * The cargo space allowed
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Capacity;
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
    @DefaultDoubleValue(0.0)
    public double Hp;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LowSlotModifier;
    /**
     * Integer that describes the types mass
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double Mass;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MedSlotModifier;
    /**
     * Authoring has been moved to FSD
     * The ranking of the module within its tech level
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaLevel;
    /**
     * Radius of an object in meters
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Radius;
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
    public int SubSystemSlot;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {fr.guiguilechat.jcelechat.model.sde.attributes.Mass.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.Hp.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1Level.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.SubSystemSlot.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.HiSlotModifier.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.MedSlotModifier.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.LowSlotModifier.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.Radius.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.FitsToShipType.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.TechLevel.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.Capacity.INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1 .INSTANCE, fr.guiguilechat.jcelechat.model.sde.attributes.MetaLevel.INSTANCE })));
    public static final Subsystem.MetaCat METACAT = new Subsystem.MetaCat();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  38 :
            {
                return Capacity;
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
            case  1376 :
            {
                return LowSlotModifier;
            }
            case  4 :
            {
                return Mass;
            }
            case  1375 :
            {
                return MedSlotModifier;
            }
            case  633 :
            {
                return MetaLevel;
            }
            case  162 :
            {
                return Radius;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  1366 :
            {
                return SubSystemSlot;
            }
            case  422 :
            {
                return TechLevel;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaCategory<Subsystem> getCategory() {
        return METACAT;
    }

    public static class MetaCat
        implements IMetaCategory<Subsystem>
    {

        @Override
        public int getCategoryId() {
            return  32;
        }

        @Override
        public String getName() {
            return "Subsystem";
        }

        @Override
        public Collection<IMetaGroup<? extends Subsystem>> groups() {
            return Arrays.asList(DefensiveSubsystem.METAGROUP, OffensiveSubsystem.METAGROUP, PropulsionSubsystem.METAGROUP, CoreSubsystem.METAGROUP);
        }
    }
}
