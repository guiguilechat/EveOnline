package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * 
 */
public class PassiveShieldThermalDamageResonance
    extends DoubleAttribute
{
    public final static PassiveShieldThermalDamageResonance INSTANCE = new PassiveShieldThermalDamageResonance();

    @Override
    public int getId() {
        return  1425;
    }

    @Override
    public int getCatId() {
        return  2;
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
        return "PassiveShieldThermalDamageResonance";
    }
}