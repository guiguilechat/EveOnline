package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Duration
 */
public class FighterAbilityMicroWarpDriveDuration
    extends IntAttribute
{
    public static final FighterAbilityMicroWarpDriveDuration INSTANCE = new FighterAbilityMicroWarpDriveDuration();

    @Override
    public int getId() {
        return  2157;
    }

    @Override
    public int getCatId() {
        return  34;
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
        return "FighterAbilityMicroWarpDriveDuration";
    }
}
