package fr.guiguilechat.eveonline.model.sde.items.types.entity;

import fr.guiguilechat.eveonline.model.sde.items.types.Entity;

public class IrregularStructure
    extends Entity
{

    @Override
    public int getGroupId() {
        return  1927;
    }

    @Override
    public Class<?> getGroup() {
        return IrregularStructure.class;
    }
}
