package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * If this ship attribute is NOT 0 then they will be prevented from docking in stations or structures.
 */
public class DisallowDocking
    extends IntAttribute
{
    public static final DisallowDocking INSTANCE = new DisallowDocking();

    @Override
    public int getId() {
        return  2354;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "DisallowDocking";
    }
}
