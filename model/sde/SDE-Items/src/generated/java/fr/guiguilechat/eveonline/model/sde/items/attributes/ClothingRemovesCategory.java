package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * This item of clothing does not allow the category specified to be equipped with this item. It will be removed
 */
public class ClothingRemovesCategory
    extends IntAttribute
{
    public final static ClothingRemovesCategory INSTANCE = new ClothingRemovesCategory();

    @Override
    public int getId() {
        return  1956;
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
        return "ClothingRemovesCategory";
    }
}