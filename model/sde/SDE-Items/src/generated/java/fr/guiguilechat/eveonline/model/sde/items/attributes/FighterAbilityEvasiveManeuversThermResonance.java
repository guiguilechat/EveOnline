package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Shield Thermal Damage Resistance
 */
public class FighterAbilityEvasiveManeuversThermResonance
    extends DoubleAttribute
{
    public final static FighterAbilityEvasiveManeuversThermResonance INSTANCE = new FighterAbilityEvasiveManeuversThermResonance();

    @Override
    public int getId() {
        return  2119;
    }

    @Override
    public int getCatId() {
        return  34;
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
}
