package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Moon rig bonus that delays spew asteroid decay
 */
public class MoonRigAsteroidDecayBonus
    extends IntAttribute
{
    public static final MoonRigAsteroidDecayBonus INSTANCE = new MoonRigAsteroidDecayBonus();

    @Override
    public int getId() {
        return  2708;
    }

    @Override
    public int getCatId() {
        return  37;
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
        return "MoonRigAsteroidDecayBonus";
    }
}
