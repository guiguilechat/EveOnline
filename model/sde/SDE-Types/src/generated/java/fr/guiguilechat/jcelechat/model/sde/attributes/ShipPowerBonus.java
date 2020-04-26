package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Autogenerated skill attribute, shipPowerBonus
 */
public class ShipPowerBonus
    extends IntAttribute
{
    public static final ShipPowerBonus INSTANCE = new ShipPowerBonus();

    @Override
    public int getId() {
        return  334;
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
        return "ShipPowerBonus";
    }
}
