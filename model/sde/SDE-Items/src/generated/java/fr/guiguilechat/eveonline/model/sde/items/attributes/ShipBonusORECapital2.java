package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * shipBonusORECapital2
 */
public class ShipBonusORECapital2
    extends IntAttribute
{
    public final static ShipBonusORECapital2 INSTANCE = new ShipBonusORECapital2();

    @Override
    public int getId() {
        return  1240;
    }

    @Override
    public int getCatId() {
        return  7;
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
        return "ShipBonusORECapital2";
    }
}
