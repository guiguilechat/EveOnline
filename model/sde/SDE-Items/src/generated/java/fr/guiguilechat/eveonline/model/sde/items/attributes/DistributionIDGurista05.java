package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Distribution ID for sov upgrades in Guristas space
 */
public class DistributionIDGurista05
    extends IntAttribute
{
    public final static DistributionIDGurista05 INSTANCE = new DistributionIDGurista05();

    @Override
    public int getId() {
        return  1719;
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
        return false;
    }

    @Override
    public boolean getStackable() {
        return true;
    }
}
