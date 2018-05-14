package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Multiplied by Gallente Carrier skill level.
 */
public class ShipBonusSupercarrierG1
    extends IntAttribute
{
    public final static ShipBonusSupercarrierG1 INSTANCE = new ShipBonusSupercarrierG1();

    @Override
    public int getId() {
        return  2385;
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
