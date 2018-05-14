package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Capacity of cruiser/battlecruiser ship hold
 */
public class SpecialMediumShipHoldCapacity
    extends IntAttribute
{
    public final static SpecialMediumShipHoldCapacity INSTANCE = new SpecialMediumShipHoldCapacity();

    @Override
    public int getId() {
        return  1562;
    }

    @Override
    public int getCatId() {
        return  4;
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
}
