package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class RemoteArmorRepairerOptimalBonus
    extends IntAttribute
{
    public static final RemoteArmorRepairerOptimalBonus INSTANCE = new RemoteArmorRepairerOptimalBonus();

    @Override
    public int getId() {
        return  2695;
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
        return "RemoteArmorRepairerOptimalBonus";
    }
}
