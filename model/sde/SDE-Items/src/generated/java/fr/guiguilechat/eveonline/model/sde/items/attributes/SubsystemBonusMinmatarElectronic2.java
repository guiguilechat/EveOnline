package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class SubsystemBonusMinmatarElectronic2
    extends IntAttribute
{
    public final static SubsystemBonusMinmatarElectronic2 INSTANCE = new SubsystemBonusMinmatarElectronic2();

    @Override
    public int getId() {
        return  1524;
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
}
