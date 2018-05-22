package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Multiplier for the missile's speed.
 */
public class MissileEntityVelocityMultiplier
    extends DoubleAttribute
{
    public final static MissileEntityVelocityMultiplier INSTANCE = new MissileEntityVelocityMultiplier();

    @Override
    public int getId() {
        return  645;
    }

    @Override
    public int getCatId() {
        return  30;
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
        return "MissileEntityVelocityMultiplier";
    }
}
