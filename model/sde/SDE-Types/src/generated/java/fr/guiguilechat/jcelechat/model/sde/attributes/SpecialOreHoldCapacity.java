package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Capacity of ore-only hold
 */
public class SpecialOreHoldCapacity
    extends IntAttribute
{
    public static final SpecialOreHoldCapacity INSTANCE = new SpecialOreHoldCapacity();

    @Override
    public int getId() {
        return  1556;
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
        return "SpecialOreHoldCapacity";
    }
}
