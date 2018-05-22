package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Thermal Damage
 */
public class FighterAbilityAttackMissileDamageTherm
    extends IntAttribute
{
    public final static FighterAbilityAttackMissileDamageTherm INSTANCE = new FighterAbilityAttackMissileDamageTherm();

    @Override
    public int getId() {
        return  2228;
    }

    @Override
    public int getCatId() {
        return  34;
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
        return false;
    }

    @Override
    public String toString() {
        return "FighterAbilityAttackMissileDamageTherm";
    }
}
