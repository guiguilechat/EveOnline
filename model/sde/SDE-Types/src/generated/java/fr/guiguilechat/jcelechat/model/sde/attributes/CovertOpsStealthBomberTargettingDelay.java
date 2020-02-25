package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class CovertOpsStealthBomberTargettingDelay
    extends IntAttribute
{
    public static final CovertOpsStealthBomberTargettingDelay INSTANCE = new CovertOpsStealthBomberTargettingDelay();

    @Override
    public int getId() {
        return  1035;
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
        return  20000.0;
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
        return "CovertOpsStealthBomberTargettingDelay";
    }
}