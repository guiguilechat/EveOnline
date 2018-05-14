package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * 
 */
public class IndustrialCoreLocalLogisticsAmountBonus
    extends IntAttribute
{
    public final static IndustrialCoreLocalLogisticsAmountBonus INSTANCE = new IndustrialCoreLocalLogisticsAmountBonus();

    @Override
    public int getId() {
        return  2607;
    }

    @Override
    public int getCatId() {
        return  37;
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
}
