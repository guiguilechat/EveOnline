package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class MissionThukkerDestroyer
    extends Entity
{

    @Override
    public int getGroupId() {
        return  825;
    }

    @Override
    public Class<?> getGroup() {
        return MissionThukkerDestroyer.class;
    }
}