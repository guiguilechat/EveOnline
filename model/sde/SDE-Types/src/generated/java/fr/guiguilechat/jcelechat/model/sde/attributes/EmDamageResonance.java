package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Electro magnetic damage multiplier for shield and armor. Represented as "% Resistance" in the UI.
 */
public class EmDamageResonance
    extends DoubleAttribute
{
    public static final EmDamageResonance INSTANCE = new EmDamageResonance();

    @Override
    public int getId() {
        return  113;
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
        return "EmDamageResonance";
    }
}
