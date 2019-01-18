package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * This attribute deactivates the booster after the character's age reaches a certain amount
 */
public class BoosterMaxCharAgeHours
    extends IntAttribute
{
    public static final BoosterMaxCharAgeHours INSTANCE = new BoosterMaxCharAgeHours();

    @Override
    public int getId() {
        return  1647;
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
        return "BoosterMaxCharAgeHours";
    }
}
