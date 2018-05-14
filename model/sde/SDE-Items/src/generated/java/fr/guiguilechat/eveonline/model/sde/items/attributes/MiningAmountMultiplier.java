package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * The factor by which the amount mined by a mining laser is scaled.
 */
public class MiningAmountMultiplier
    extends DoubleAttribute
{
    public final static MiningAmountMultiplier INSTANCE = new MiningAmountMultiplier();

    @Override
    public int getId() {
        return  207;
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
        return  1.0;
    }

    @Override
    public boolean getPublished() {
        return false;
    }

    @Override
    public boolean getStackable() {
        return false;
    }
}
