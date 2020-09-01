package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.RealAttribute;


/**
 * Bonus to fighter shield recharge (%)
 */
public class FighterBonusShieldRechargePercent
    extends RealAttribute
{
    public static final FighterBonusShieldRechargePercent INSTANCE = new FighterBonusShieldRechargePercent();

    @Override
    public int getId() {
        return  2338;
    }

    @Override
    public boolean getHighIsGood() {
        return false;
    }

    @Override
    public Number getDefaultValue() {
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
        return "FighterBonusShieldRechargePercent";
    }
}
