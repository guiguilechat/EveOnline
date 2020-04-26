package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Autogenerated skill attribute, criminalConnectionsMutator
 */
public class CriminalConnectionsMutator
    extends DoubleAttribute
{
    public static final CriminalConnectionsMutator INSTANCE = new CriminalConnectionsMutator();

    @Override
    public int getId() {
        return  413;
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
        return "CriminalConnectionsMutator";
    }
}
