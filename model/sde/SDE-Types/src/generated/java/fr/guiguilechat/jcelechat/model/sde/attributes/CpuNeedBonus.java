package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.IntAttribute;


/**
 * Autogenerated skill attribute, cpuNeedBonus
 */
public class CpuNeedBonus
    extends IntAttribute
{
    public static final CpuNeedBonus INSTANCE = new CpuNeedBonus();

    @Override
    public int getId() {
        return  310;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public Number getDefaultValue() {
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
        return "CpuNeedBonus";
    }
}
