package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Autogenerated skill attribute, manufacturingTimeBonus
 */
public class ManufacturingTimeBonus
    extends IntAttribute
{
    public static final ManufacturingTimeBonus INSTANCE = new ManufacturingTimeBonus();

    @Override
    public int getId() {
        return  440;
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
        return "ManufacturingTimeBonus";
    }
}
