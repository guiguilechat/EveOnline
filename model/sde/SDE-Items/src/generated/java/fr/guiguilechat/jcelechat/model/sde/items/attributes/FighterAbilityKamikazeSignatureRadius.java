package fr.guiguilechat.jcelechat.model.sde.items.attributes;

import fr.guiguilechat.jcelechat.model.sde.items.IntAttribute;


/**
 * 
 */
public class FighterAbilityKamikazeSignatureRadius
    extends IntAttribute
{
    public static final FighterAbilityKamikazeSignatureRadius INSTANCE = new FighterAbilityKamikazeSignatureRadius();

    @Override
    public int getId() {
        return  2329;
    }

    @Override
    public int getCatId() {
        return  34;
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
        return "FighterAbilityKamikazeSignatureRadius";
    }
}
