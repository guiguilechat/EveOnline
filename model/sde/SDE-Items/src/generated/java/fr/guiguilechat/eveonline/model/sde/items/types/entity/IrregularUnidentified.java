package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import fr.guiguilechat.eveonline.model.sde.items.types.Entity;

public class IrregularUnidentified
    extends Entity
{

    @Override
    public int getGroupId() {
        return  1929;
    }

    @Override
    public Class<?> getGroup() {
        return IrregularUnidentified.class;
    }
}
