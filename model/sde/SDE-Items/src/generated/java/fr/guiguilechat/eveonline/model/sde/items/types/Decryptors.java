
package fr.guiguilechat.eveonline.model.sde.items.types;

import fr.guiguilechat.eveonline.model.sde.items.Item;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;

public abstract class Decryptors
    extends Item
{

    /**
     * Modifies the max runs in a blueprint created through invention
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double InventionMaxRunModifier;
    /**
     * Modifies base chance of successful invention
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double InventionPropabilityMultiplier;
    /**
     * Modifies the mineral efficiency of invented BPCs
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double InventionMEModifier;
    /**
     * Modifies the time efficiency of invented BPCs
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultValue(0.0D)
    public double InventionTEModifier;

    @Override
    public int getCategoryId() {
        return  35;
    }

    @Override
    public Class<?> getCategory() {
        return Decryptors.class;
    }

}