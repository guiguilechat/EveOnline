package fr.guiguilechat.eveonline.model.sde.load.fsd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniverseLoadTest {

	@Test
	public void loadUniverse() {
		Assert.assertEquals(Universe.load().eve.get("TheForge").constellations.get("Kimotoro").systems.get("Jita").hub,
				true);
	}

}
