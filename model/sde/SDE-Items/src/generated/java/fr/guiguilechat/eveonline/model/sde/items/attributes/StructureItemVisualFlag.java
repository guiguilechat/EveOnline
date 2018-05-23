package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Dogma attribute that specifies if the item should have the structure icon or not.
 */
public class StructureItemVisualFlag
    extends IntAttribute
{
    public final static StructureItemVisualFlag INSTANCE = new StructureItemVisualFlag();

    @Override
    public int getId() {
        return  2334;
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
        return false;
    }

    @Override
    public boolean getStackable() {
        return true;
    }

    @Override
    public String toString() {
        return "StructureItemVisualFlag";
    }
}