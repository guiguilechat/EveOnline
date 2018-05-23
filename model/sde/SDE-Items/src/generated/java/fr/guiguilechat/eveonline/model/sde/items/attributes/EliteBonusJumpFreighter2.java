package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * eliteBonusJumpFreighter2
 */
public class EliteBonusJumpFreighter2
    extends IntAttribute
{
    public final static EliteBonusJumpFreighter2 INSTANCE = new EliteBonusJumpFreighter2();

    @Override
    public int getId() {
        return  1312;
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
        return "EliteBonusJumpFreighter2";
    }
}