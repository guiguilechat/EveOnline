package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class ActivationBlockedStrenght
    extends IntAttribute
{
    public final static ActivationBlockedStrenght INSTANCE = new ActivationBlockedStrenght();

    @Override
    public int getId() {
        return  1350;
    }

    @Override
    public int getCatId() {
        return  27;
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
