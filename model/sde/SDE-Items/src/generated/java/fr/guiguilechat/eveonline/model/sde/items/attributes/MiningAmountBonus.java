package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Autogenerated skill attribute, miningAmountBonus
 */
public class MiningAmountBonus
    extends IntAttribute
{
    public final static MiningAmountBonus INSTANCE = new MiningAmountBonus();

    @Override
    public int getId() {
        return  434;
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
        return "MiningAmountBonus";
    }
}