package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Multiplied by Minmatar Carrier skill level.
 */
public class ShipBonusSupercarrierM3
    extends IntAttribute
{
    public final static ShipBonusSupercarrierM3 INSTANCE = new ShipBonusSupercarrierM3();

    @Override
    public int getId() {
        return  2392;
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
