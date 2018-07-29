package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * Bonus to fighter ROF (%)
 */
public class FighterBonusROFPercent
    extends DoubleAttribute
{
    public final static FighterBonusROFPercent INSTANCE = new FighterBonusROFPercent();

    @Override
    public int getId() {
        return  2337;
    }

    @Override
    public int getCatId() {
        return  38;
    }

    @Override
    public boolean getHighIsGood() {
        return false;
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
        return "FighterBonusROFPercent";
    }
}