package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import fr.guiguilechat.eveonline.model.sde.items.types.Entity;

public class IrregularSuperCarrier
    extends Entity
{

    @Override
    public int getGroupId() {
        return  1731;
    }

    @Override
    public Class<?> getGroup() {
        return IrregularSuperCarrier.class;
    }
}
