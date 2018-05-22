package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Autogenerated skill attribute, refiningYieldMutator
 */
public class RefiningYieldMutator
    extends IntAttribute
{
    public final static RefiningYieldMutator INSTANCE = new RefiningYieldMutator();

    @Override
    public int getId() {
        return  379;
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
        return "RefiningYieldMutator";
    }
}
