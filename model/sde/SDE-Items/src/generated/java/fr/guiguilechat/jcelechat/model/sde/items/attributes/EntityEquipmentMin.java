package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class EntityEquipmentMin
    extends IntAttribute
{
    public static final EntityEquipmentMin INSTANCE = new EntityEquipmentMin();

    @Override
    public int getId() {
        return  456;
    }

    @Override
    public int getCatId() {
        return  19;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return  0.0;
    }

    @Override
    public boolean getPublished() {
        return false;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "EntityEquipmentMin";
    }
}
