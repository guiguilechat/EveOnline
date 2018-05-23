package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Autogenerated skill attribute, cloakVelocityBonus
 */
public class CloakVelocityBonus
    extends IntAttribute
{
    public final static CloakVelocityBonus INSTANCE = new CloakVelocityBonus();

    @Override
    public int getId() {
        return  555;
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
        return "CloakVelocityBonus";
    }
}