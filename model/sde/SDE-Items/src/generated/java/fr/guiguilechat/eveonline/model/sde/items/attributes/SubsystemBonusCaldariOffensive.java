package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * 
 */
public class SubsystemBonusCaldariOffensive
    extends DoubleAttribute
{
    public final static SubsystemBonusCaldariOffensive INSTANCE = new SubsystemBonusCaldariOffensive();

    @Override
    public int getId() {
        return  1444;
    }

    @Override
    public int getCatId() {
        return  7;
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
        return "SubsystemBonusCaldariOffensive";
    }
}
