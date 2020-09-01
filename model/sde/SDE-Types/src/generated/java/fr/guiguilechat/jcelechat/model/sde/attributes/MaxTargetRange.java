package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.RealAttribute;


/**
 * Maximum range at which the scanner can lock a target.
 */
public class MaxTargetRange
    extends RealAttribute
{
    public static final MaxTargetRange INSTANCE = new MaxTargetRange();

    @Override
    public int getId() {
        return  76;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return false;
    }

    @Override
    public String toString() {
        return "MaxTargetRange";
    }
}
