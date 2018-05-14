package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Multiplier to the kinetic damage resonance of something.
 */
public class KineticDamageResonanceMultiplier
    extends DoubleAttribute
{
    public final static KineticDamageResonanceMultiplier INSTANCE = new KineticDamageResonanceMultiplier();

    @Override
    public int getId() {
        return  131;
    }

    @Override
    public int getCatId() {
        return  7;
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
        return true;
    }
}
