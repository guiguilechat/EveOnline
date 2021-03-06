package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * eliteBonusHeavyInterdictors2
 */
public class EliteBonusHeavyInterdictors2
    extends IntAttribute
{
    public static final EliteBonusHeavyInterdictors2 INSTANCE = new EliteBonusHeavyInterdictors2();

    @Override
    public int getId() {
        return  1247;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public Number getDefaultValue() {
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
        return "EliteBonusHeavyInterdictors2";
    }
}
