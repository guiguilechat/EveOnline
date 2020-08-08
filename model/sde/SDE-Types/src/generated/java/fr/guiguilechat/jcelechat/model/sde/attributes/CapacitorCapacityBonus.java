package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Autogenerated skill attribute, CapacitorCapacityBonus
 */
public class CapacitorCapacityBonus
    extends DoubleAttribute
{
    public static final CapacitorCapacityBonus INSTANCE = new CapacitorCapacityBonus();

    @Override
    public int getId() {
        return  1079;
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
        return "CapacitorCapacityBonus";
    }
}
