package fr.guiguilechat.jcelechat.libs.regioncycler;

import fr.guiguilechat.jcelechat.model.sde.locations.algos.IRegionCycler;
import fr.lelouet.tools.solver.fondhamilton.GeneticFondHamilton;

/**
 * create several generation of solutions . Each generation, mutations are
 * added, and mutation and parents are merged, then the best are kept. A
 * solution is an ordering of the possible systems indexes. Solutions are stored
 * as the array of indices, as well as the total size to avoid useless
 * computation. An mutation is a permutation of two systems. mergin two
 * solutions consists in taking the beginning of the first, then adding the
 * remaining systems in the order they are present in the second.
 */
public class GeneticRegionCycler extends GeneticFondHamilton implements IRegionCycler {

	public static final GeneticRegionCycler INSTANCE = new GeneticRegionCycler();

}
