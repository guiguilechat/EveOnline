package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * The number of utility element slots a virus has.
 */
public class VirusElementSlots
    extends IntAttribute
{
    public final static VirusElementSlots INSTANCE = new VirusElementSlots();

    @Override
    public int getId() {
        return  1911;
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
        return "VirusElementSlots";
    }
}
