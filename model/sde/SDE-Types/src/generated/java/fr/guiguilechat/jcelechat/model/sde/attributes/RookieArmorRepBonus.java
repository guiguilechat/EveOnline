package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Bonus to armor repair amount
 */
public class RookieArmorRepBonus
    extends IntAttribute
{
    public static final RookieArmorRepBonus INSTANCE = new RookieArmorRepBonus();

    @Override
    public int getId() {
        return  1833;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public Number getDefaultValue() {
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
        return "RookieArmorRepBonus";
    }
}
