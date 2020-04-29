package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * 
 */
public class NpcGuidanceDisruptorDischarge
    extends DoubleAttribute
{
    public static final NpcGuidanceDisruptorDischarge INSTANCE = new NpcGuidanceDisruptorDischarge();

    @Override
    public int getId() {
        return  2514;
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
        return "NpcGuidanceDisruptorDischarge";
    }
}