package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class DroneControlDistance
    extends IntAttribute
{
    public final static DroneControlDistance INSTANCE = new DroneControlDistance();

    @Override
    public int getId() {
        return  458;
    }

    @Override
    public int getCatId() {
        return  10;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return  20000.0;
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
        return "DroneControlDistance";
    }
}