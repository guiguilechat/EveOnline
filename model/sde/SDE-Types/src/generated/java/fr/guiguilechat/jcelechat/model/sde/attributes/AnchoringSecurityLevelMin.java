package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * The minimum security level at which the structure can be anchored.
 */
public class AnchoringSecurityLevelMin
    extends DoubleAttribute
{
    public static final AnchoringSecurityLevelMin INSTANCE = new AnchoringSecurityLevelMin();

    @Override
    public int getId() {
        return  1946;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return -1.0;
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
        return "AnchoringSecurityLevelMin";
    }
}
