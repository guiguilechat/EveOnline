package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Survey Scanner Range Bonus
 */
public class SurveyScannerRangeBonus
    extends IntAttribute
{
    public final static SurveyScannerRangeBonus INSTANCE = new SurveyScannerRangeBonus();

    @Override
    public int getId() {
        return  1234;
    }

    @Override
    public int getCatId() {
        return  7;
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
        return false;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "SurveyScannerRangeBonus";
    }
}
