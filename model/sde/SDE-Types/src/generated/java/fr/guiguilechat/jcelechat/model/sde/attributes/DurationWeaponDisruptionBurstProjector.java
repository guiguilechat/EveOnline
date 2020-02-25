package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class DurationWeaponDisruptionBurstProjector
    extends IntAttribute
{
    public static final DurationWeaponDisruptionBurstProjector INSTANCE = new DurationWeaponDisruptionBurstProjector();

    @Override
    public int getId() {
        return  2397;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "DurationWeaponDisruptionBurstProjector";
    }
}