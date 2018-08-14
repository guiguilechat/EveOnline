package fr.guiguilechat.jcelechat.model.sde.items.types;

import java.util.Arrays;
import java.util.Collection;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.Item;

public abstract class Bonus
    extends Item
{
    public final static Bonus.MetaCat METACAT = new Bonus.MetaCat();

    @Override
    public IMetaCategory<Bonus> getCategory() {
        return METACAT;
    }

    public static class MetaCat
        implements IMetaCategory<Bonus>
    {

        @Override
        public int getCategoryId() {
            return  14;
        }

        @Override
        public String getName() {
            return "Bonus";
        }

        @Override
        public Collection<IMetaGroup<? extends Bonus>> groups() {
            return Arrays.asList();
        }
    }
}
