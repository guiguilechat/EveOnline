package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class WarfareLinkCPUAdd
    extends IntAttribute
{
    public static final WarfareLinkCPUAdd INSTANCE = new WarfareLinkCPUAdd();

    @Override
    public int getId() {
        return  1882;
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
        return "WarfareLinkCPUAdd";
    }
}
