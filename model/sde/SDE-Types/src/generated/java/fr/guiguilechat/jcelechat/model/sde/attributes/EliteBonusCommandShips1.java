package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * 
 */
public class EliteBonusCommandShips1
    extends DoubleAttribute
{
    public static final EliteBonusCommandShips1 INSTANCE = new EliteBonusCommandShips1();

    @Override
    public int getId() {
        return  1000;
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
        return "EliteBonusCommandShips1";
    }
}
