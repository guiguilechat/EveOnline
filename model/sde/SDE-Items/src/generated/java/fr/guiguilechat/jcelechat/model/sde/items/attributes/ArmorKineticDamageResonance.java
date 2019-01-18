package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * Multiplies KINETIC damage taken by Armor. 
 */
public class ArmorKineticDamageResonance
    extends DoubleAttribute
{
    public static final ArmorKineticDamageResonance INSTANCE = new ArmorKineticDamageResonance();

    @Override
    public int getId() {
        return  269;
    }

    @Override
    public int getCatId() {
        return  3;
    }

    @Override
    public boolean getHighIsGood() {
        return false;
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
        return "ArmorKineticDamageResonance";
    }
}
