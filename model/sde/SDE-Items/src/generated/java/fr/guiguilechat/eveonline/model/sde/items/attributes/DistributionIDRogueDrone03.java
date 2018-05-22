package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Distribution ID for sov upgrades in Rogue Drone space
 */
public class DistributionIDRogueDrone03
    extends IntAttribute
{
    public final static DistributionIDRogueDrone03 INSTANCE = new DistributionIDRogueDrone03();

    @Override
    public int getId() {
        return  1727;
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

    @Override
    public String toString() {
        return "DistributionIDRogueDrone03";
    }
}
