package fr.guiguilechat.eveonline.model.sde.items.types;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.guiguilechat.eveonline.model.sde.items.Item;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.planetarycommodities.AdvancedCommodities;
import fr.guiguilechat.eveonline.model.sde.items.types.planetarycommodities.BasicCommodities;
import fr.guiguilechat.eveonline.model.sde.items.types.planetarycommodities.RefinedCommodities;
import fr.guiguilechat.eveonline.model.sde.items.types.planetarycommodities.SpecializedCommodities;

public abstract class PlanetaryCommodities
    extends Item
{
    /**
     * Cost multiplier per m3 volume of this commodity when importing to a planet
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(1)
    public int ImportTaxMultiplier;
    /**
     * Export tax multiplier when exporting this commodity off a planet.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(1)
    public int ExportTaxMultiplier;

    @Override
    public int getCategoryId() {
        return  43;
    }

    @Override
    public Class<?> getCategory() {
        return PlanetaryCommodities.class;
    }

    public static Map<String, ? extends PlanetaryCommodities> loadCategory() {
        return Stream.of(AdvancedCommodities.load(), BasicCommodities.load(), SpecializedCommodities.load(), RefinedCommodities.load()).flatMap((m -> m.entrySet().stream())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
