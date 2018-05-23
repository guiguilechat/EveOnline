package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Percentage of pay from agent 
 */
public class NegotiationPercentage
    extends IntAttribute
{
    public final static NegotiationPercentage INSTANCE = new NegotiationPercentage();

    @Override
    public int getId() {
        return  355;
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
        return  1.0;
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
        return "NegotiationPercentage";
    }
}