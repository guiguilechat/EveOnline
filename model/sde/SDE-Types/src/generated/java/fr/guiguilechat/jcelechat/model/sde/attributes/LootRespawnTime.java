package fr.guiguilechat.jcelechat.model.sde.attributes;

import fr.guiguilechat.jcelechat.model.sde.DoubleAttribute;


/**
 * The number of milliseconds before the container replenishes the loot inside itself.
 */
public class LootRespawnTime
    extends DoubleAttribute
{
    public static final LootRespawnTime INSTANCE = new LootRespawnTime();

    @Override
    public int getId() {
        return  470;
    }

    @Override
    public boolean getHighIsGood() {
        return true;
    }

    @Override
    public double getDefaultValue() {
        return  600000.0;
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
        return "LootRespawnTime";
    }
}
