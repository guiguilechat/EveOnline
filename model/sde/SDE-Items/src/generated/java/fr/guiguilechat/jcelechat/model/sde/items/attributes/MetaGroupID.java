package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Authoring has been moved to FSD.
 * meta group of type
 * 
 *  3: Story-line (Cosmos)
 *  4: Faction
 *  5: Officer (rare asteroid NPCs)
 *  6: Deadspace
 * 
 * 
 */
public class MetaGroupID
    extends IntAttribute
{
    public static final MetaGroupID INSTANCE = new MetaGroupID();

    @Override
    public int getId() {
        return  1692;
    }

    @Override
    public int getCatId() {
        return  0;
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
        return "MetaGroupID";
    }
}
