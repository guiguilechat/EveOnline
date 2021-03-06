package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * ORE Mining frigate bonus 1
 */
public class ShipBonusOREfrig1
    extends IntAttribute
{
    public static final ShipBonusOREfrig1 INSTANCE = new ShipBonusOREfrig1();

    @Override
    public int getId() {
        return  1842;
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
        return "ShipBonusOREfrig1";
    }
}
