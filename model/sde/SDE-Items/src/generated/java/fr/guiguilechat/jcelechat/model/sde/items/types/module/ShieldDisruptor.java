package fr.guiguilechat.jcelechat.model.sde.items.types.module;

import fr.guiguilechat.jcelechat.model.sde.items.types.Module;

public class ShieldDisruptor
    extends Module
{

    @Override
    public int getGroupId() {
        return  321;
    }

    @Override
    public Class<?> getGroup() {
        return ShieldDisruptor.class;
    }
}