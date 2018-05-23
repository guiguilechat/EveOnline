package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Bonus attribute for armor repair amount.
 */
public class ArmorDamageAmountBonus
    extends IntAttribute
{
    public final static ArmorDamageAmountBonus INSTANCE = new ArmorDamageAmountBonus();

    @Override
    public int getId() {
        return  895;
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
        return "ArmorDamageAmountBonus";
    }
}