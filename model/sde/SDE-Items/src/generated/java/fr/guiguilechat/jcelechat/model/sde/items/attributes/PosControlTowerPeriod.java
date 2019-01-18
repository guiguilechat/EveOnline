package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * The interval for fuel consumption of a control tower
 */
public class PosControlTowerPeriod
    extends IntAttribute
{
    public static final PosControlTowerPeriod INSTANCE = new PosControlTowerPeriod();

    @Override
    public int getId() {
        return  722;
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
        return  10000.0;
    }

    @Override
    public boolean getPublished() {
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "PosControlTowerPeriod";
    }
}
