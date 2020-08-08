package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Bonus to Max Targeting Range
 */
public class MaxTargetRangeBonus
    extends DoubleAttribute
{
    public static final MaxTargetRangeBonus INSTANCE = new MaxTargetRangeBonus();

    @Override
    public int getId() {
        return  309;
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
        return "MaxTargetRangeBonus";
    }
}
