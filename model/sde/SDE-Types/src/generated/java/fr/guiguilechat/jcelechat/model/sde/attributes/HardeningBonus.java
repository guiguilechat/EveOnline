package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Autogenerated skill attribute, hardeningBonus
 */
public class HardeningBonus
    extends DoubleAttribute
{
    public static final HardeningBonus INSTANCE = new HardeningBonus();

    @Override
    public int getId() {
        return  958;
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
        return "HardeningBonus";
    }
}
