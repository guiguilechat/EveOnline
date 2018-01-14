
package fr.guiguilechat.eveonline.model.sde.compiled.items.specialeditionassets;

import java.io.FileReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.compiled.items.SpecialEditionAssets;
import org.yaml.snakeyaml.Yaml;

public class TournamentCardsAllianceTournamentAllStars
    extends SpecialEditionAssets
{

    public final static String RESOURCE_PATH = "SDE/specialeditionassets/TournamentCardsAllianceTournamentAllStars.yaml";
    private static LinkedHashMap<String, TournamentCardsAllianceTournamentAllStars> cache = (null);

    @Override
    public int getGroupId() {
        return  1225;
    }

    @Override
    public Class<?> getGroup() {
        return TournamentCardsAllianceTournamentAllStars.class;
    }

    public static LinkedHashMap<String, TournamentCardsAllianceTournamentAllStars> load() {
        if ((cache==null)) {
            try {
                cache = new Yaml().loadAs(new FileReader((RESOURCE_PATH)), (Container.class)).items;
            } catch (Exception _x) {
            }
        }
        return (cache);
    }

    private static class Container {

        public LinkedHashMap<String, TournamentCardsAllianceTournamentAllStars> items;

    }

}
