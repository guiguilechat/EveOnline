package fr.guiguilechat.jcelechat.model.sde.items.types.module;

import fr.guiguilechat.jcelechat.model.sde.items.types.Module;

public class Autopilot
    extends Module
{

    @Override
    public int getGroupId() {
        return  309;
    }

    @Override
    public Class<?> getGroup() {
        return Autopilot.class;
    }
}