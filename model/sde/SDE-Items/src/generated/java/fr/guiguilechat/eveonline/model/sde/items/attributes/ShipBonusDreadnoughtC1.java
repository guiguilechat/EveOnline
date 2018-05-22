package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Multiplied by Caldari Dreadnought skill level
 */
public class ShipBonusDreadnoughtC1
    extends IntAttribute
{
    public final static ShipBonusDreadnoughtC1 INSTANCE = new ShipBonusDreadnoughtC1();

    @Override
    public int getId() {
        return  2286;
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
        return "ShipBonusDreadnoughtC1";
    }
}
