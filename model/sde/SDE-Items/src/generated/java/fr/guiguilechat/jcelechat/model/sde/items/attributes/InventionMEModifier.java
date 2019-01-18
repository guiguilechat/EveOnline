package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.DoubleAttribute;


/**
 * Modifies the mineral efficiency of invented BPCs
 */
public class InventionMEModifier
    extends DoubleAttribute
{
    public static final InventionMEModifier INSTANCE = new InventionMEModifier();

    @Override
    public int getId() {
        return  1113;
    }

    @Override
    public int getCatId() {
        return  9;
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
        return "InventionMEModifier";
    }
}
