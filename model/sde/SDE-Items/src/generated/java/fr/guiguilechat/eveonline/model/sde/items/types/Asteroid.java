package fr.guiguilechat.eveonline.model.sde.items.types;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.guiguilechat.eveonline.model.sde.items.Item;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.AncientCompressedIce;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Arkonor;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Bistot;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.CommonMoonAsteroids;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Crokite;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.DarkOchre;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.EmpireAsteroids;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.ExceptionalMoonAsteroids;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Gneiss;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Hedbergite;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Hemorphite;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Ice;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Jaspet;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Kernite;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Mercoxit;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Omber;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Plagioclase;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Pyroxeres;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.RareMoonAsteroids;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Scordite;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Spodumain;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.UbiquitousMoonAsteroids;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.UncommonMoonAsteroids;
import fr.guiguilechat.eveonline.model.sde.items.types.asteroid.Veldspar;

public abstract class Asteroid
    extends Item
{

    @Override
    public int getCategoryId() {
        return  25;
    }

    @Override
    public Class<?> getCategory() {
        return Asteroid.class;
    }

    public static Map<String, ? extends Asteroid> loadCategory() {
        return Stream.of(ExceptionalMoonAsteroids.load(), Plagioclase.load(), Hedbergite.load(), RareMoonAsteroids.load(), Spodumain.load(), AncientCompressedIce.load(), Pyroxeres.load(), DarkOchre.load(), CommonMoonAsteroids.load(), Arkonor.load(), Gneiss.load(), Omber.load(), Ice.load(), Scordite.load(), Veldspar.load(), Crokite.load(), Bistot.load(), Kernite.load(), Mercoxit.load(), EmpireAsteroids.load(), UbiquitousMoonAsteroids.load(), Jaspet.load(), Hemorphite.load(), UncommonMoonAsteroids.load()).flatMap((m -> m.entrySet().stream())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
