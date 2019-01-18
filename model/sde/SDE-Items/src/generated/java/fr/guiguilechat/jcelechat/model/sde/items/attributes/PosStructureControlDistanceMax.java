package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * The maximum distance from the control tower, at which structures can be controlled.
 */
public class PosStructureControlDistanceMax
    extends IntAttribute
{
    public static final PosStructureControlDistanceMax INSTANCE = new PosStructureControlDistanceMax();

    @Override
    public int getId() {
        return  1214;
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
        return  15000.0;
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
        return "PosStructureControlDistanceMax";
    }
}
