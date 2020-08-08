package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Autogenerated skill attribute, maxRangeBonus
 */
public class MaxRangeBonus
    extends DoubleAttribute
{
    public static final MaxRangeBonus INSTANCE = new MaxRangeBonus();

    @Override
    public int getId() {
        return  351;
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
        return true;
    }

    @Override
    public String toString() {
        return "MaxRangeBonus";
    }
}
