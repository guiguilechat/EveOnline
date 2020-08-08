package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * 
 */
public class ImplantBonusVelocity
    extends DoubleAttribute
{
    public static final ImplantBonusVelocity INSTANCE = new ImplantBonusVelocity();

    @Override
    public int getId() {
        return  1076;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public Number getDefaultValue() {
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
        return "ImplantBonusVelocity";
    }
}
