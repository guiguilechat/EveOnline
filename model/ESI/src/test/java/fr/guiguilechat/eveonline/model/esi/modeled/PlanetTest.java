package fr.guiguilechat.eveonline.model.esi.modeled;

import org.testng.Assert;
import org.testng.annotations.Test;

import fr.guiguilechat.eveonline.model.esi.modeled.PI.ColonyInfo;
import is.ccp.tech.esi.responses.R_get_characters_character_id_planets;
import is.ccp.tech.esi.responses.R_get_characters_character_id_planets_planet_id;
import is.ccp.tech.esi.responses.R_get_characters_character_id_planets_planet_id_pins;

public class PlanetTest {

	@Test
	public void testCreation() {
		R_get_characters_character_id_planets_planet_id base = new R_get_characters_character_id_planets_planet_id();
		R_get_characters_character_id_planets info = new R_get_characters_character_id_planets();
		base.pins = new R_get_characters_character_id_planets_planet_id_pins[1];
		info.owner_id = 13;

		ColonyInfo colo = new ColonyInfo(base);
		colo.addInfo(info);

		Assert.assertEquals(colo.pins, base.pins);
		Assert.assertEquals(colo.owner_id, info.owner_id);
	}

}
