package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class ThermalDamageResistanceBonusBonus
    extends IntAttribute
{
    public final static ThermalDamageResistanceBonusBonus INSTANCE = new ThermalDamageResistanceBonusBonus();

    @Override
    public int getId() {
        return  2405;
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
        return "ThermalDamageResistanceBonusBonus";
    }
}