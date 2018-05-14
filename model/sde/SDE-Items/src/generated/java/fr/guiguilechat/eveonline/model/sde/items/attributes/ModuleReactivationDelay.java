package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Amount of time that has to be waited after the deactivation of this module until it can be reactivated.
 */
public class ModuleReactivationDelay
    extends IntAttribute
{
    public final static ModuleReactivationDelay INSTANCE = new ModuleReactivationDelay();

    @Override
    public int getId() {
        return  669;
    }

    @Override
    public int getCatId() {
        return  7;
    }

    @Override
    public boolean getHighIsGood() {
        return false;
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
}
