package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * 
 */
public class SubsystemBonusMinmatarOffensive3
    extends DoubleAttribute
{
    public static final SubsystemBonusMinmatarOffensive3 INSTANCE = new SubsystemBonusMinmatarOffensive3();

    @Override
    public int getId() {
        return  1534;
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
        return false;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "SubsystemBonusMinmatarOffensive3";
    }
}
