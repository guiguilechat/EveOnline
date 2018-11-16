package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class StructurePowerStateArmorPlatingMultiplier
    extends IntAttribute
{
    public final static StructurePowerStateArmorPlatingMultiplier INSTANCE = new StructurePowerStateArmorPlatingMultiplier();

    @Override
    public int getId() {
        return  2805;
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

    @Override
    public String toString() {
        return "StructurePowerStateArmorPlatingMultiplier";
    }
}
