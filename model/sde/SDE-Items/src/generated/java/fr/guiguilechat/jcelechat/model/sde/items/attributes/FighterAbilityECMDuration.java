package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Duration
 */
public class FighterAbilityECMDuration
    extends IntAttribute
{
    public static final FighterAbilityECMDuration INSTANCE = new FighterAbilityECMDuration();

    @Override
    public int getId() {
        return  2220;
    }

    @Override
    public int getCatId() {
        return  34;
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
        return false;
    }

    @Override
    public String toString() {
        return "FighterAbilityECMDuration";
    }
}
