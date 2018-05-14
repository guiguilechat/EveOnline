package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * eliteBonusElectronicAttackShip2
 */
public class EliteBonusElectronicAttackShip2
    extends IntAttribute
{
    public final static EliteBonusElectronicAttackShip2 INSTANCE = new EliteBonusElectronicAttackShip2();

    @Override
    public int getId() {
        return  1250;
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
}
