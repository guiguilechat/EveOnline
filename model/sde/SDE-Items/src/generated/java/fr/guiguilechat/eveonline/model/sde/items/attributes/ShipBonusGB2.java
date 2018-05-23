package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * skill bonus attribute2 for gallente battleship
 */
public class ShipBonusGB2
    extends DoubleAttribute
{
    public final static ShipBonusGB2 INSTANCE = new ShipBonusGB2();

    @Override
    public int getId() {
        return  561;
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
        return "ShipBonusGB2";
    }
}