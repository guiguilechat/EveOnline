package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class ShipBonusTacticalDestroyerCaldari3
    extends IntAttribute
{
    public static final ShipBonusTacticalDestroyerCaldari3 INSTANCE = new ShipBonusTacticalDestroyerCaldari3();

    @Override
    public int getId() {
        return  2017;
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
        return "ShipBonusTacticalDestroyerCaldari3";
    }
}
