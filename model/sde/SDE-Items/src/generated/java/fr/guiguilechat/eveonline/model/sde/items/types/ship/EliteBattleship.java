package fr.guiguilechat.eveonline.model.sde.items.types.ship;

import fr.guiguilechat.eveonline.model.sde.items.types.Ship;

public class EliteBattleship
    extends Ship
{

    @Override
    public int getGroupId() {
        return  381;
    }

    @Override
    public Class<?> getGroup() {
        return EliteBattleship.class;
    }
}
