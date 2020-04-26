package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * The factor by which the amount mined by a mining laser is scaled.
 */
public class MiningAmountMultiplier
    extends DoubleAttribute
{
    public static final MiningAmountMultiplier INSTANCE = new MiningAmountMultiplier();

    @Override
    public int getId() {
        return  207;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return  1.0;
    }

    @Override
    public boolean getPublished() {
        return false;
    }

    @Override
    public boolean getStackable() {
        return false;
    }

    @Override
    public String toString() {
        return "MiningAmountMultiplier";
    }
}
