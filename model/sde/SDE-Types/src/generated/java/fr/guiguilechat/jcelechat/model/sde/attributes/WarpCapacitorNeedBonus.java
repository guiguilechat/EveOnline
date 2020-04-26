package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Autogenerated skill attribute, warpCapacitorNeedBonus
 */
public class WarpCapacitorNeedBonus
    extends IntAttribute
{
    public static final WarpCapacitorNeedBonus INSTANCE = new WarpCapacitorNeedBonus();

    @Override
    public int getId() {
        return  319;
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
        return "WarpCapacitorNeedBonus";
    }
}
