package fr.guiguilechat.jcelechat.model.sde.locations;

import java.util.stream.Stream;

public class ShowRegionSystemsTruesec {

	public static void main(String[] args) {
		String regionName = "Metropolis";
		boolean nexts = true;
		if (args != null && args.length > 0 && args[0].length() > 0) {
			regionName = args[0];
		}
		Region reg = Region.getRegion(regionName);
		Stream<Region> regions = Stream.of(reg);
		if (nexts) {
			regions = Stream.concat(regions, reg.adjacentRegions.stream().map(Region::getRegion));
		}
		regions.flatMap(Region::systems).sorted().map(SolarSystem::getSystem)
		.forEach(s -> System.out.println(s.name + "\t" + s.truesec));
	}

}