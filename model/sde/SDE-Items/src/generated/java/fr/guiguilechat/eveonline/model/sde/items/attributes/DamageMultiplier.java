package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Damage multiplier.
 */
public class DamageMultiplier
    extends DoubleAttribute
{
    public final static DamageMultiplier INSTANCE = new DamageMultiplier();

    @Override
    public int getId() {
        return  64;
    }

    @Override
    public int getCatId() {
        return  29;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return false;
    }

    @Override
    public String toString() {
        return "DamageMultiplier";
    }
}
