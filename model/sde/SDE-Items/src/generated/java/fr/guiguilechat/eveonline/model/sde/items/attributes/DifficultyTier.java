package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * sets the difficulty tier for abyssal deadspace keys
 */
public class DifficultyTier
    extends IntAttribute
{
    public final static DifficultyTier INSTANCE = new DifficultyTier();

    @Override
    public int getId() {
        return  2761;
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
        return  1.0;
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
        return "DifficultyTier";
    }
}
