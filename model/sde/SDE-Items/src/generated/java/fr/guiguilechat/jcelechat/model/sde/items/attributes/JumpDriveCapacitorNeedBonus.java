package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class JumpDriveCapacitorNeedBonus
    extends IntAttribute
{
    public static final JumpDriveCapacitorNeedBonus INSTANCE = new JumpDriveCapacitorNeedBonus();

    @Override
    public int getId() {
        return  899;
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
        return "JumpDriveCapacitorNeedBonus";
    }
}
