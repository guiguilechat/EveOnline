package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class PassiveExplosiveDamageResonanceMultiplier
    extends IntAttribute
{
    public final static PassiveExplosiveDamageResonanceMultiplier INSTANCE = new PassiveExplosiveDamageResonanceMultiplier();

    @Override
    public int getId() {
        return  967;
    }

    @Override
    public int getCatId() {
        return  9;
    }

    @Override
    public boolean getHighIsGood() {
        return false;
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
        return false;
    }
}
