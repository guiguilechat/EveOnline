package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.DoubleAttribute;


/**
 * Autogenerated skill attribute, smugglingChanceBonus
 */
public class SmugglingChanceBonus
    extends DoubleAttribute
{
    public final static SmugglingChanceBonus INSTANCE = new SmugglingChanceBonus();

    @Override
    public int getId() {
        return  447;
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
