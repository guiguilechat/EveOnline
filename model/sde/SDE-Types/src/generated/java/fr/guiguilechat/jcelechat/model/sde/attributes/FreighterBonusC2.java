package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class FreighterBonusC2
    extends IntAttribute
{
    public static final FreighterBonusC2 INSTANCE = new FreighterBonusC2();

    @Override
    public int getId() {
        return  889;
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
        return "FreighterBonusC2";
    }
}
