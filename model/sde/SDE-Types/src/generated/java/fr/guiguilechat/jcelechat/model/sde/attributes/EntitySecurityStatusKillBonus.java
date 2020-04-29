package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * How much security status is modified by for killing this entity.  Depending on the entity, this may be a positive or negative amount.
 * Value is a % movement of the character's current security towards the upper/lower limit.
 */
public class EntitySecurityStatusKillBonus
    extends DoubleAttribute
{
    public static final EntitySecurityStatusKillBonus INSTANCE = new EntitySecurityStatusKillBonus();

    @Override
    public int getId() {
        return  252;
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
        return "EntitySecurityStatusKillBonus";
    }
}