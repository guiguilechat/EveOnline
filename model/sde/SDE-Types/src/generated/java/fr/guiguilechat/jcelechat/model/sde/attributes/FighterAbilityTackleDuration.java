package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Duration
 */
public class FighterAbilityTackleDuration
    extends IntAttribute
{
    public static final FighterAbilityTackleDuration INSTANCE = new FighterAbilityTackleDuration();

    @Override
    public int getId() {
        return  2238;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public Number getDefaultValue() {
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
        return "FighterAbilityTackleDuration";
    }
}
