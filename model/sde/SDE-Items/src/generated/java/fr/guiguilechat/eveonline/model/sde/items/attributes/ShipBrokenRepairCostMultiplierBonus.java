package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class ShipBrokenRepairCostMultiplierBonus
    extends IntAttribute
{
    public final static ShipBrokenRepairCostMultiplierBonus INSTANCE = new ShipBrokenRepairCostMultiplierBonus();

    @Override
    public int getId() {
        return  1294;
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
}
