package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Multiplier to the capacity of a shield.
 */
public class ShieldCapacityMultiplier
    extends DoubleAttribute
{
    public final static ShieldCapacityMultiplier INSTANCE = new ShieldCapacityMultiplier();

    @Override
    public int getId() {
        return  146;
    }

    @Override
    public int getCatId() {
        return  2;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return  1.0;
    }

    @Override
    public boolean getPublished() {
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "ShieldCapacityMultiplier";
    }
}
