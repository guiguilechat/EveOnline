package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Maximum distance between two possible targets for the structure doomsday.
 */
public class LightningWeaponTargetRange
    extends IntAttribute
{
    public final static LightningWeaponTargetRange INSTANCE = new LightningWeaponTargetRange();

    @Override
    public int getId() {
        return  2105;
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
        return "LightningWeaponTargetRange";
    }
}