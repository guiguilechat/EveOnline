package fr.guiguilechat.jcelechat.model.sde.locations.algos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.guiguilechat.jcelechat.model.sde.locations.SolarSystem;

public class RegionSplitterMain {

	private static final Logger logger = LoggerFactory.getLogger(RegionSplitterMain.class);

	public static void main(String[] args) {
		// show("Orien", 2);
		// show("Orien", 1);
		// show("Gelfiven", 1);
		// show("Eredan", 1);
		// show("Eredan", 2);
		// show("Eredan", 3);
		// show("Hek", 2);
		// show("Hek", 3);
		show("Hek", 4, false);
	}

	public static void show(String sysName, int qtty, boolean useSquareDistance) {
		logger.info(
				"around " + sysName + " in " + qtty + " ="
						+ HSRegionSplitter.INSTANCE.around(SolarSystem.getSystem(sysName), qtty, useSquareDistance));
	}

}