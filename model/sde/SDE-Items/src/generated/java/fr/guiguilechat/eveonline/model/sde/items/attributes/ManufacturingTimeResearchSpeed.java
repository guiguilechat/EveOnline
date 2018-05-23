package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Research speed 
 */
public class ManufacturingTimeResearchSpeed
    extends IntAttribute
{
    public final static ManufacturingTimeResearchSpeed INSTANCE = new ManufacturingTimeResearchSpeed();

    @Override
    public int getId() {
        return  385;
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
        return  1.0;
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
        return "ManufacturingTimeResearchSpeed";
    }
}