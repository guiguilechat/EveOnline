package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Bonus to drone armor repair amount
 */
public class DroneArmorDamageAmountBonus
    extends IntAttribute
{
    public final static DroneArmorDamageAmountBonus INSTANCE = new DroneArmorDamageAmountBonus();

    @Override
    public int getId() {
        return  1219;
    }

    @Override
    public int getCatId() {
        return  10;
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
        return "DroneArmorDamageAmountBonus";
    }
}