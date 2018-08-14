package fr.guiguilechat.jcelechat.model.sde.items.types;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.Item;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.subsystem.CoreSystems;
import fr.guiguilechat.jcelechat.model.sde.items.types.subsystem.DefensiveSystems;
import fr.guiguilechat.jcelechat.model.sde.items.types.subsystem.OffensiveSystems;
import fr.guiguilechat.jcelechat.model.sde.items.types.subsystem.PropulsionSystems;

public abstract class Subsystem
    extends Item
{
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
    @DefaultIntValue(0)
    public int Hp;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int LowSlotModifier;
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
    public final static Subsystem.MetaCat METACAT = new Subsystem.MetaCat();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
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
            case  1375 :
            {
                return MedSlotModifier;
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
    public IMetaCategory<Subsystem> getCategory() {
        return METACAT;
    }

    public static class MetaCat
        implements IMetaCategory<Subsystem>
    {
        @SuppressWarnings("unchecked")
        private final static IMetaGroup<? extends Subsystem> [] groups = new IMetaGroup[] {DefensiveSystems.METAGROUP, OffensiveSystems.METAGROUP, PropulsionSystems.METAGROUP, CoreSystems.METAGROUP };

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
            return Arrays.asList(groups);
        }

        @Override
        public Map<String, Subsystem> load() {
            HashMap<String, Subsystem> ret = new HashMap<>();
            groups().stream().flatMap(img -> img.load().entrySet().stream()).forEach(e -> ret.put(e.getKey(), e.getValue()));
            return ret;
        }
    }
}
