package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Used by Battlecruisers for large turret capacitor reduction
 */
public class BcLargeTurretCap
    extends DoubleAttribute
{
    public final static BcLargeTurretCap INSTANCE = new BcLargeTurretCap();

    @Override
    public int getId() {
        return  1788;
    }

    @Override
    public int getCatId() {
        return  9;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return  1.0;
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
