package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Percent bonus for Stasis Webifiers maximum range
 */
public class StasisWebRangeBonus
    extends IntAttribute
{
    public final static StasisWebRangeBonus INSTANCE = new StasisWebRangeBonus();

    @Override
    public int getId() {
        return  2747;
    }

    @Override
    public int getCatId() {
        return  28;
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
}
