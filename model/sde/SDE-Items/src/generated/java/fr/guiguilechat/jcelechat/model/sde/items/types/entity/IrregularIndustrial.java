package fr.guiguilechat.jcelechat.model.sde.items.types.entity;

import fr.guiguilechat.jcelechat.model.sde.items.types.Entity;

public class IrregularIndustrial
    extends Entity
{

    @Override
    public int getGroupId() {
        return  1895;
    }

    @Override
    public Class<?> getGroup() {
        return IrregularIndustrial.class;
    }
}
