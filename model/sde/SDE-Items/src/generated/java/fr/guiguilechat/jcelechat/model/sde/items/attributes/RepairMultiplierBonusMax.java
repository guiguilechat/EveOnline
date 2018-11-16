package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class RepairMultiplierBonusMax
    extends IntAttribute
{
    public final static RepairMultiplierBonusMax INSTANCE = new RepairMultiplierBonusMax();

    @Override
    public int getId() {
        return  2797;
    }

    @Override
    public int getCatId() {
        return  20;
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
        return "RepairMultiplierBonusMax";
    }
}
