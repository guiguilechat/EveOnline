package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Multiplied by Amarr Carrier skill level.
 */
public class ShipBonusForceAuxiliaryA4
    extends IntAttribute
{
    public static final ShipBonusForceAuxiliaryA4 INSTANCE = new ShipBonusForceAuxiliaryA4();

    @Override
    public int getId() {
        return  2320;
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
        return "ShipBonusForceAuxiliaryA4";
    }
}
