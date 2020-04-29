package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Max Range for NPC Target Paint
 */
public class EntityTargetPaintMaxRange
    extends IntAttribute
{
    public static final EntityTargetPaintMaxRange INSTANCE = new EntityTargetPaintMaxRange();

    @Override
    public int getId() {
        return  941;
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
        return "EntityTargetPaintMaxRange";
    }
}