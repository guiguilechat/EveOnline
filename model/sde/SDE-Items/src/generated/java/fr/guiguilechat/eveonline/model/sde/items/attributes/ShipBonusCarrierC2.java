package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Multiplied by Caldari Carrier skill level.
 */
public class ShipBonusCarrierC2
    extends IntAttribute
{
    public final static ShipBonusCarrierC2 INSTANCE = new ShipBonusCarrierC2();

    @Override
    public int getId() {
        return  2364;
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
