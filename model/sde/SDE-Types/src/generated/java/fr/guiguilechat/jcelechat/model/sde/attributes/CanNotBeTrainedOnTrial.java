package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * If set to 1 on a skill then this skill can not be trained on accounts that are marked as Trial.
 */
public class CanNotBeTrainedOnTrial
    extends IntAttribute
{
    public static final CanNotBeTrainedOnTrial INSTANCE = new CanNotBeTrainedOnTrial();

    @Override
    public int getId() {
        return  1047;
    }

    @Override
    public int getCatId() {
        return  9;
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
        return "CanNotBeTrainedOnTrial";
    }
}