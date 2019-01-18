package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * The capacity of the fleet hangar.
 */
public class FleetHangarCapacity
    extends IntAttribute
{
    public static final FleetHangarCapacity INSTANCE = new FleetHangarCapacity();

    @Override
    public int getId() {
        return  912;
    }

    @Override
    public int getCatId() {
        return  40;
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
        return "FleetHangarCapacity";
    }
}
