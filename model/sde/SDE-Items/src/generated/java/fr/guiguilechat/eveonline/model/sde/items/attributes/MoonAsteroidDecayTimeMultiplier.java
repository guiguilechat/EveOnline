package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Decay time for asteroid created from moon spew
 */
public class MoonAsteroidDecayTimeMultiplier
    extends IntAttribute
{
    public final static MoonAsteroidDecayTimeMultiplier INSTANCE = new MoonAsteroidDecayTimeMultiplier();

    @Override
    public int getId() {
        return  2706;
    }

    @Override
    public int getCatId() {
        return  4;
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
        return false;
    }

    @Override
    public boolean getStackable() {
        return true;
    }
}
