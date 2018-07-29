package fr.guiguilechat.jcelechat.model.sde.items.types.specialeditionassets;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

import fr.guiguilechat.jcelechat.model.sde.items.types.SpecialEditionAssets;

public class TournamentCardsNewEdenOpenYC114
    extends SpecialEditionAssets
{
    public final static String RESOURCE_PATH = "SDE/items/specialeditionassets/TournamentCardsNewEdenOpenYC114.yaml";
    private static LinkedHashMap<String, TournamentCardsNewEdenOpenYC114> cache = (null);

    @Override
    public int getGroupId() {
        return  1195;
    }

    @Override
    public Class<?> getGroup() {
        return TournamentCardsNewEdenOpenYC114 .class;
    }

    public static synchronized LinkedHashMap<String, TournamentCardsNewEdenOpenYC114> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(TournamentCardsNewEdenOpenYC114 .class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, TournamentCardsNewEdenOpenYC114> items;
    }
}