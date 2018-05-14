package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * The power cost to warp per one kg per AU (floats do not have the resolution for meters).
 */
public class WarpCapacitorNeed
    extends DoubleAttribute
{
    public final static WarpCapacitorNeed INSTANCE = new WarpCapacitorNeed();

    @Override
    public int getId() {
        return  153;
    }

    @Override
    public int getCatId() {
        return  9;
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
}
