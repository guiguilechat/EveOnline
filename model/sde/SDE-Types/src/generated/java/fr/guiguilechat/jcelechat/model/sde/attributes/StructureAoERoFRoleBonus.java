package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class StructureAoERoFRoleBonus
    extends IntAttribute
{
    public static final StructureAoERoFRoleBonus INSTANCE = new StructureAoERoFRoleBonus();

    @Override
    public int getId() {
        return  2749;
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
        return "StructureAoERoFRoleBonus";
    }
}
