package fr.guiguilechat.eveonline.model.sde.items.types;

import fr.guiguilechat.eveonline.model.sde.items.Item;

public abstract class Effects
    extends Item
{

    @Override
    public int getCategoryId() {
        return  53;
    }

    @Override
    public Class<?> getCategory() {
        return Effects.class;
    }
}
