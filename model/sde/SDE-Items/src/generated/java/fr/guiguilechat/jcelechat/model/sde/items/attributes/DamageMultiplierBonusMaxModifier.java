package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * Modifier for damageMultiplierBonusMax used by Triglavians
 */
public class DamageMultiplierBonusMaxModifier
    extends DoubleAttribute
{
    public static final DamageMultiplierBonusMaxModifier INSTANCE = new DamageMultiplierBonusMaxModifier();

    @Override
    public int getId() {
        return  2823;
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
        return true;
    }

    @Override
    public String toString() {
        return "DamageMultiplierBonusMaxModifier";
    }
}