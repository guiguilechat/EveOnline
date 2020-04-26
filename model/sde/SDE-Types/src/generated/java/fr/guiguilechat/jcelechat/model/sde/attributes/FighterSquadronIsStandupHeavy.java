package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * 
 */
public class FighterSquadronIsStandupHeavy
    extends IntAttribute
{
    public static final FighterSquadronIsStandupHeavy INSTANCE = new FighterSquadronIsStandupHeavy();

    @Override
    public int getId() {
        return  2742;
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
        return "FighterSquadronIsStandupHeavy";
    }
}
