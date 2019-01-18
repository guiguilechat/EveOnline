package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * Autogenerated skill attribute, blueprintmanufactureTimeBonus
 */
public class BlueprintmanufactureTimeBonus
    extends IntAttribute
{
    public static final BlueprintmanufactureTimeBonus INSTANCE = new BlueprintmanufactureTimeBonus();

    @Override
    public int getId() {
        return  453;
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
        return "BlueprintmanufactureTimeBonus";
    }
}
