package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * ORE Mining frigate bonus 1
 */
public class ShipBonusOREfrig1
    extends IntAttribute
{
    public final static ShipBonusOREfrig1 INSTANCE = new ShipBonusOREfrig1();

    @Override
    public int getId() {
        return  1842;
    }

    @Override
    public int getCatId() {
        return  9;
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
        return "ShipBonusOREfrig1";
    }
}
