package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Autogenerated skill attribute, warpCapacitorNeedBonus
 */
public class WarpCapacitorNeedBonus
    extends IntAttribute
{
    public final static WarpCapacitorNeedBonus INSTANCE = new WarpCapacitorNeedBonus();

    @Override
    public int getId() {
        return  319;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }
}
