package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Bonus to maxRangeBonus
 */
public class MaxRangeBonusBonus
    extends IntAttribute
{
    public static final MaxRangeBonusBonus INSTANCE = new MaxRangeBonusBonus();

    @Override
    public int getId() {
        return  1315;
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
        return "MaxRangeBonusBonus";
    }
}
