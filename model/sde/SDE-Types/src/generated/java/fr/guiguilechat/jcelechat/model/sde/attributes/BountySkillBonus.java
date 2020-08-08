package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Autogenerated skill attribute, bountySkillBonus
 */
public class BountySkillBonus
    extends IntAttribute
{
    public static final BountySkillBonus INSTANCE = new BountySkillBonus();

    @Override
    public int getId() {
        return  627;
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
        return "BountySkillBonus";
    }
}
