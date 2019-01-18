package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Maximum Velocity Bonus
 */
public class FighterAbilityAfterburnerSpeedBonus
    extends IntAttribute
{
    public static final FighterAbilityAfterburnerSpeedBonus INSTANCE = new FighterAbilityAfterburnerSpeedBonus();

    @Override
    public int getId() {
        return  2151;
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
        return  100.0;
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
        return "FighterAbilityAfterburnerSpeedBonus";
    }
}
