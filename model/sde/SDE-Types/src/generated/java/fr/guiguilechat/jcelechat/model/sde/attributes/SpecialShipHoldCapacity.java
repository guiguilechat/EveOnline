package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Capacity of ship-only hold
 */
public class SpecialShipHoldCapacity
    extends IntAttribute
{
    public static final SpecialShipHoldCapacity INSTANCE = new SpecialShipHoldCapacity();

    @Override
    public int getId() {
        return  1560;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "SpecialShipHoldCapacity";
    }
}
