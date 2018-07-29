package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * 
 */
public class PassiveArmorThermalDamageResonance
    extends DoubleAttribute
{
    public final static PassiveArmorThermalDamageResonance INSTANCE = new PassiveArmorThermalDamageResonance();

    @Override
    public int getId() {
        return  1419;
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
        return "PassiveArmorThermalDamageResonance";
    }
}