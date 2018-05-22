package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * The hull damage proportion at which an entity becomes incapacitated.
 */
public class IncapacitationRatio
    extends DoubleAttribute
{
    public final static IncapacitationRatio INSTANCE = new IncapacitationRatio();

    @Override
    public int getId() {
        return  156;
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
        return "IncapacitationRatio";
    }
}
