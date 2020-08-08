package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Autogenerated skill attribute, max flightTimeBonus
 */
public class MaxFlightTimeBonus
    extends IntAttribute
{
    public static final MaxFlightTimeBonus INSTANCE = new MaxFlightTimeBonus();

    @Override
    public int getId() {
        return  557;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public Number getDefaultValue() {
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
        return "MaxFlightTimeBonus";
    }
}
