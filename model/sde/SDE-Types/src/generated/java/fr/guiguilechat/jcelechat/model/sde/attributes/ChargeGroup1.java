package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * One of the groups of charge this launcher can be loaded with.
 */
public class ChargeGroup1
    extends IntAttribute
{
    public static final ChargeGroup1 INSTANCE = new ChargeGroup1();

    @Override
    public int getId() {
        return  604;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "ChargeGroup1";
    }
}
