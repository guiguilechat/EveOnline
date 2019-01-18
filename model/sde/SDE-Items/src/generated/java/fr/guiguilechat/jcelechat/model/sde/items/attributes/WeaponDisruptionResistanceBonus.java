package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * 
 */
public class WeaponDisruptionResistanceBonus
    extends DoubleAttribute
{
    public static final WeaponDisruptionResistanceBonus INSTANCE = new WeaponDisruptionResistanceBonus();

    @Override
    public int getId() {
        return  2353;
    }

    @Override
    public int getCatId() {
        return  37;
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
        return "WeaponDisruptionResistanceBonus";
    }
}
