package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Autogenerated skill attribute, shieldCapacityBonus
 */
public class ShieldCapacityBonus
    extends DoubleAttribute
{
    public static final ShieldCapacityBonus INSTANCE = new ShieldCapacityBonus();

    @Override
    public int getId() {
        return  337;
    }

    @Override
    public int getCatId() {
        return  2;
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
        return "ShieldCapacityBonus";
    }
}