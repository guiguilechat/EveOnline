package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Chance of NPC effect to be activated each duration
 */
public class ECMEntityChance
    extends IntAttribute
{
    public final static ECMEntityChance INSTANCE = new ECMEntityChance();

    @Override
    public int getId() {
        return  930;
    }

    @Override
    public int getCatId() {
        return  25;
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
}
