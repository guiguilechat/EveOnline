package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class RemoteArmorRepairerFalloffBonus
    extends IntAttribute
{
    public final static RemoteArmorRepairerFalloffBonus INSTANCE = new RemoteArmorRepairerFalloffBonus();

    @Override
    public int getId() {
        return  2694;
    }

    @Override
    public int getCatId() {
        return  3;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "RemoteArmorRepairerFalloffBonus";
    }
}
