package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Maximum scan error
 */
public class MaxScanDeviation
    extends DoubleAttribute
{
    public static final MaxScanDeviation INSTANCE = new MaxScanDeviation();

    @Override
    public int getId() {
        return  788;
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
        return "MaxScanDeviation";
    }
}
