package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class EliteIndustrialCovertCloakBonus
    extends IntAttribute
{
    public static final EliteIndustrialCovertCloakBonus INSTANCE = new EliteIndustrialCovertCloakBonus();

    @Override
    public int getId() {
        return  1361;
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
        return "EliteIndustrialCovertCloakBonus";
    }
}
