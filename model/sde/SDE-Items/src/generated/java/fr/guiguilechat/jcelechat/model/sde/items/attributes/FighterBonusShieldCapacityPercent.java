package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * Bonus to fighter hitpoint (%)
 */
public class FighterBonusShieldCapacityPercent
    extends DoubleAttribute
{
    public static final FighterBonusShieldCapacityPercent INSTANCE = new FighterBonusShieldCapacityPercent();

    @Override
    public int getId() {
        return  2335;
    }

    @Override
    public int getCatId() {
        return  38;
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
        return "FighterBonusShieldCapacityPercent";
    }
}
