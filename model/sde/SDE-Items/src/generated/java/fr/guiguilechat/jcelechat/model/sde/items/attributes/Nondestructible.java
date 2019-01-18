package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * This will make the item non-destructible upon podding.  ONLY FOR IMPLANTS AND BOOSTERS
 */
public class Nondestructible
    extends IntAttribute
{
    public static final Nondestructible INSTANCE = new Nondestructible();

    @Override
    public int getId() {
        return  1890;
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
        return "Nondestructible";
    }
}
