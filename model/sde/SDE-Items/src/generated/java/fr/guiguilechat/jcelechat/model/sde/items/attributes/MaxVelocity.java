package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * Maximum velocity of ship
 */
public class MaxVelocity
    extends DoubleAttribute
{
    public static final MaxVelocity INSTANCE = new MaxVelocity();

    @Override
    public int getId() {
        return  37;
    }

    @Override
    public int getCatId() {
        return  17;
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
        return false;
    }

    @Override
    public String toString() {
        return "MaxVelocity";
    }
}
