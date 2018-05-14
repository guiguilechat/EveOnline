package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Multiplied by Minmatar Carrier skill level.
 */
public class ShipBonusForceAuxiliaryM2
    extends DoubleAttribute
{
    public final static ShipBonusForceAuxiliaryM2 INSTANCE = new ShipBonusForceAuxiliaryM2();

    @Override
    public int getId() {
        return  2318;
    }

    @Override
    public int getCatId() {
        return  37;
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
}
