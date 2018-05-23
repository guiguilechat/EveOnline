package fr.guiguilechat.eveonline.model.sde.items.attributes;

import fr.guiguilechat.eveonline.model.sde.items.IntAttribute;


/**
 * Rig Bonus that affects spew asteroid belt radius from moon extraction
 */
public class MoonRigSpewRadiusBonus
    extends IntAttribute
{
    public final static MoonRigSpewRadiusBonus INSTANCE = new MoonRigSpewRadiusBonus();

    @Override
    public int getId() {
        return  2709;
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

    @Override
    public String toString() {
        return "MoonRigSpewRadiusBonus";
    }
}