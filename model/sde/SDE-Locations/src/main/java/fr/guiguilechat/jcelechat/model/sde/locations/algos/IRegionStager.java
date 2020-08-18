package fr.guiguilechat.jcelechat.model.sde.locations.algos;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.guiguilechat.jcelechat.model.sde.locations.SolarSystem;

public interface IRegionStager {

	public static class Params {

		public int clusters;

		//

		public boolean useSquareDistance = false;

		public Params withUseSquareDistance(boolean use) {
			useSquareDistance = use;
			return this;
		}

		public Params withSquareDistance() {
			return withUseSquareDistance(true);
		}

		//

		public Set<String> mustInclude = new HashSet<>();

		public Params withMustInclude(String... sysNames) {
			if (sysNames != null) {
				mustInclude.addAll(Arrays.asList(sysNames));
			}
			return this;
		}

		//

		public boolean debug = false;

		public Params withDebug(boolean debug) {
			this.debug = debug;
			return this;
		}

		public Params withDebug() {
			return withDebug(true);
		}

		//

		public boolean acceptNoStation = false;

		public Params withAcceptNoStations(boolean accept) {
			acceptNoStation = accept;
			return this;
		}

		public Params withAcceptNoStations() {
			return withAcceptNoStations(true);
		}

		//

		public Set<String> addRegions = new HashSet<>();

		public Params withRegions(String... regions) {
			if (regions != null) {
				addRegions.addAll(Arrays.asList(regions));
			}
			return this;
		}

		//

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("to" + clusters + "cluster");
			if (useSquareDistance) {
				sb.append(" sqrt");
			}
			if (acceptNoStation) {
				sb.append(" acceptNoStation");
			}
			if (!addRegions.isEmpty()) {
				sb.append(" add=" + addRegions);
			}
			if (!mustInclude.isEmpty()) {
				sb.append(" include="+mustInclude);
			}
			return sb.toString();
		}

		// create

		public static Params clusters(int clusters) {
			Params ret = new Params();
			ret.clusters = clusters;
			return ret;
		}

		public static Params clustersSquare(int clusters) {
			return clusters(clusters).withSquareDistance();
		}
	}

	public default Collection<SolarSystem> expand(SolarSystem source, Params params) {
		return ReachableRegionHs.around(source, params.addRegions.toArray(String[]::new));
	}

	/**
	 * evaluate the distances between the systems indexed.
	 *
	 * @param idx
	 * @return a new matrix of the distances between each system.
	 */
	public default int[][] jumps(SysIndex idx) {
		int[][] jumps = new int[idx.size()][idx.size()];
		for (int i = 0; i < idx.size(); i++) {
			SolarSystem from = idx.system(i);
			jumps[i][i] = 0;
			for (int j = i + 1; j < idx.size(); j++) {
				SolarSystem to = idx.system(j);
				jumps[i][j] = jumps[j][i] = fr.guiguilechat.jcelechat.model.sde.locations.route.SecStatusRouter.HS
						.getRoute(from.id, to.id).length;
			}
		}
		return jumps;
	}

	/**
	 * split the set of systems, around a source, accessible with jumps in the
	 * same region and in HS, in a given number of clusters around system.
	 *
	 * @param source
	 *          system to start the exploration of the region, in HS, around.
	 * @param clusters
	 *          number of central systems.
	 * @return a list of the systems that make the sum of square distances of each
	 *         concerned system in the region the lowest possible.
	 */
	public default List<SolarSystem> around(SolarSystem source, Params params) {
		SysIndex idx = new SysIndex(expand(source, params));
		int[][] jumps = jumps(idx);
		return around(idx, jumps, params);
	}

	public List<SolarSystem> around(SysIndex idx, int[][] jumps, Params params);

	static final Logger logger = LoggerFactory.getLogger(IRegionStager.class);

	public static void show(IRegionStager stager, String sysName, Params params) {
		long timeStart = System.currentTimeMillis();
		List<SolarSystem> res = stager.around(SolarSystem.getSystem(sysName), params);
		long timeStop = System.currentTimeMillis();
		logger.info("around " + sysName + " params=" + params + " =(" + (timeStop - timeStart) / 1000 + "s)" + res);
	}

}
