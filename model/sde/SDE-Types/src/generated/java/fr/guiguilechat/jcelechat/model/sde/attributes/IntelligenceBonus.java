package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * +/- bonus to the intelligence of a character.
 */
public class IntelligenceBonus
    extends IntAttribute
{
    public static final IntelligenceBonus INSTANCE = new IntelligenceBonus();

    @Override
    public int getId() {
        return  176;
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
        return "IntelligenceBonus";
    }
}