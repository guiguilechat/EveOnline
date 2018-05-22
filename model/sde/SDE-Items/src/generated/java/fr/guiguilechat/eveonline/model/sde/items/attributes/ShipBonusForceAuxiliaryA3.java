package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Multiplied by Amarr Carrier skill level.
 */
public class ShipBonusForceAuxiliaryA3
    extends IntAttribute
{
    public final static ShipBonusForceAuxiliaryA3 INSTANCE = new ShipBonusForceAuxiliaryA3();

    @Override
    public int getId() {
        return  2310;
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

    @Override
    public String toString() {
        return "ShipBonusForceAuxiliaryA3";
    }
}
