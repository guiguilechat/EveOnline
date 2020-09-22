package fr.guiguilechat.jcelechat.libs.regioncycler;

import java.util.function.Predicate;

import fr.guiguilechat.jcelechat.model.sde.locations.Region;
import fr.guiguilechat.jcelechat.model.sde.locations.SolarSystem;
import fr.guiguilechat.jcelechat.model.sde.locations.algos.IRegionCycler;
import fr.guiguilechat.jcelechat.model.sde.locations.algos.IRegionCycler.Params;

public class SastaCycleRefuges extends AMain {

	public static void main(String[] args) {
		new SastaCycleRefuges().run("Sasta");
		new SastaCycleRefuges().run("Sasta");
	}

	@Override
	protected IRegionCycler impl() {
		return GreedyDERegionCycler.INSTANCE;
	}

	@Override
	protected Predicate<SolarSystem> important() {
		return Params.IMPORTANT_REFUGES;
	}

	@Override
	protected Params params() {
		return super.params().withRegion(Region.EMPIRE_SANSHAS);
	}

}
