package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Capacity of material bay
 */
public class SpecialMaterialBayCapacity
    extends IntAttribute
{
    public static final SpecialMaterialBayCapacity INSTANCE = new SpecialMaterialBayCapacity();

    @Override
    public int getId() {
        return  1770;
    }

    @Override
    public int getCatId() {
        return  4;
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
        return "SpecialMaterialBayCapacity";
    }
}
