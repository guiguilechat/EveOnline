package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * The type of resource needed to be consumed for each activation cycle of this structure.
 */
public class ConsumptionType
    extends IntAttribute
{
    public static final ConsumptionType INSTANCE = new ConsumptionType();

    @Override
    public int getId() {
        return  713;
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
        return "ConsumptionType";
    }
}
