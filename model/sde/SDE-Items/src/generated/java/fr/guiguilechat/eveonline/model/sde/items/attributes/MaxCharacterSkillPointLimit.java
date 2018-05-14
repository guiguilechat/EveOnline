package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * The maximum amount of skill points that the character can have before the item is unusable
 */
public class MaxCharacterSkillPointLimit
    extends IntAttribute
{
    public final static MaxCharacterSkillPointLimit INSTANCE = new MaxCharacterSkillPointLimit();

    @Override
    public int getId() {
        return  2459;
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
