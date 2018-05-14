package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * +/- modifier to the number of members that a CEO can manage within their corporation.
 */
public class CorporationMemberBonus
    extends IntAttribute
{
    public final static CorporationMemberBonus INSTANCE = new CorporationMemberBonus();

    @Override
    public int getId() {
        return  191;
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
        return true;
    }

    @Override
    public boolean getStackable() {
        return true;
    }
}
