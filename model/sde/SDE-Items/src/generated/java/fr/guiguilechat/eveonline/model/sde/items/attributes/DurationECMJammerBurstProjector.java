package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class DurationECMJammerBurstProjector
    extends IntAttribute
{
    public final static DurationECMJammerBurstProjector INSTANCE = new DurationECMJammerBurstProjector();

    @Override
    public int getId() {
        return  2398;
    }

    @Override
    public int getCatId() {
        return  7;
    }

    @Override
    public boolean getHighIsGood() {
        return false;
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
}
