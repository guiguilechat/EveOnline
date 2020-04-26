package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Scales the accuracy of some targeted weapon.
 */
public class AccuracyMultiplier
    extends DoubleAttribute
{
    public static final AccuracyMultiplier INSTANCE = new AccuracyMultiplier();

    @Override
    public int getId() {
        return  205;
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
        return true;
    }

    @Override
    public String toString() {
        return "AccuracyMultiplier";
    }
}
