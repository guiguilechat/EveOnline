package fr.guiguilechat.jcelechat.model.sde.items.types.apparel;

import fr.guiguilechat.jcelechat.model.sde.items.types.Apparel;

public class Piercings
    extends Apparel
{

    @Override
    public int getGroupId() {
        return  1085;
    }

    @Override
    public Class<?> getGroup() {
        return Piercings.class;
    }
}