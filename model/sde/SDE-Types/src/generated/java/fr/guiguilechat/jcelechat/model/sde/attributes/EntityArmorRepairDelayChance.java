package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * Chance that an entity will delay employing armor repair.
 */
public class EntityArmorRepairDelayChance
    extends DoubleAttribute
{
    public static final EntityArmorRepairDelayChance INSTANCE = new EntityArmorRepairDelayChance();

    @Override
    public int getId() {
        return  638;
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
        return "EntityArmorRepairDelayChance";
    }
}
