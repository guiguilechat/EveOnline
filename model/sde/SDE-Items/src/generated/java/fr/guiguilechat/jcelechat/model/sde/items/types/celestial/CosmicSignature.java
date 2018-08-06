package fr.guiguilechat.jcelechat.model.sde.items.types.celestial;

import fr.guiguilechat.jcelechat.model.sde.items.types.Celestial;

public class CosmicSignature
    extends Celestial
{

    @Override
    public int getGroupId() {
        return  502;
    }

    @Override
    public Class<?> getGroup() {
        return CosmicSignature.class;
    }
}
