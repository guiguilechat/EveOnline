package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * 
 */
public class SubsystemBonusGallenteOffensive
    extends DoubleAttribute
{
    public final static SubsystemBonusGallenteOffensive INSTANCE = new SubsystemBonusGallenteOffensive();

    @Override
    public int getId() {
        return  1439;
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
        return "SubsystemBonusGallenteOffensive";
    }
}