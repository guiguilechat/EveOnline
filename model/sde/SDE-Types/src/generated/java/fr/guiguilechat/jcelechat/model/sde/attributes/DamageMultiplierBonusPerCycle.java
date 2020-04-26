package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * 
 */
public class DamageMultiplierBonusPerCycle
    extends DoubleAttribute
{
    public static final DamageMultiplierBonusPerCycle INSTANCE = new DamageMultiplierBonusPerCycle();

    @Override
    public int getId() {
        return  2733;
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
        return "DamageMultiplierBonusPerCycle";
    }
}
