package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * 
 */
public class SubsystemBonusMinmatarDefensive
    extends DoubleAttribute
{
    public static final SubsystemBonusMinmatarDefensive INSTANCE = new SubsystemBonusMinmatarDefensive();

    @Override
    public int getId() {
        return  1448;
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
        return "SubsystemBonusMinmatarDefensive";
    }
}
