package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Bonus to drone damage, HP and mining yield
 */
public class RookieDroneBonus
    extends IntAttribute
{
    public static final RookieDroneBonus INSTANCE = new RookieDroneBonus();

    @Override
    public int getId() {
        return  1831;
    }

    @Override
    public int getCatId() {
        return  0;
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
        return "RookieDroneBonus";
    }
}
