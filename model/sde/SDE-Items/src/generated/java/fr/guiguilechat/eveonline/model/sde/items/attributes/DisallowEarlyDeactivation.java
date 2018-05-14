package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Signifies that this module if activated, will prevent ejection from the ship it is fitted to and extend the log out ship removal timer.
 */
public class DisallowEarlyDeactivation
    extends IntAttribute
{
    public final static DisallowEarlyDeactivation INSTANCE = new DisallowEarlyDeactivation();

    @Override
    public int getId() {
        return  906;
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
