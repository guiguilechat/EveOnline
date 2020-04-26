package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Multiplied by Minmatar Titan skill level.
 */
public class ShipBonusTitanM2
    extends IntAttribute
{
    public static final ShipBonusTitanM2 INSTANCE = new ShipBonusTitanM2();

    @Override
    public int getId() {
        return  2419;
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
        return "ShipBonusTitanM2";
    }
}
