package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * eliteBonusHeavyInterdictors1
 */
public class EliteBonusHeavyInterdictors1
    extends IntAttribute
{
    public final static EliteBonusHeavyInterdictors1 INSTANCE = new EliteBonusHeavyInterdictors1();

    @Override
    public int getId() {
        return  1246;
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
        return "EliteBonusHeavyInterdictors1";
    }
}