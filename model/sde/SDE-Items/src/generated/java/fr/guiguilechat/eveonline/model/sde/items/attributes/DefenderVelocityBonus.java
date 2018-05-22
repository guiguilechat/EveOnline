package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Autogenerated skill attribute, defenderVelocityBonus
 */
public class DefenderVelocityBonus
    extends IntAttribute
{
    public final static DefenderVelocityBonus INSTANCE = new DefenderVelocityBonus();

    @Override
    public int getId() {
        return  432;
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

    @Override
    public String toString() {
        return "DefenderVelocityBonus";
    }
}
