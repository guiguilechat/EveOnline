package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Multiplies EXPLOSIVE damage taken by Armor. 
 */
public class ArmorExplosiveDamageResonance
    extends DoubleAttribute
{
    public final static ArmorExplosiveDamageResonance INSTANCE = new ArmorExplosiveDamageResonance();

    @Override
    public int getId() {
        return  268;
    }

    @Override
    public int getCatId() {
        return  3;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return false;
    }
}
