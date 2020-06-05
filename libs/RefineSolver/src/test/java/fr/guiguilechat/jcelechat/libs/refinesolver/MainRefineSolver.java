package fr.guiguilechat.jcelechat.libs.refinesolver;

public class MainRefineSolver {

	public static void main(String[] args) {
		// we just want 20M trit.

		var params = new Params().withQuantity(34, 20000000)
				// 500 isk/m³ to move
				.withVolumicCost(500)
				// activate debug
				.withDebug(true)
				// only use compressed ore
				.withOnlyCompressed(true)
				// only take tritanium
				// .withTypeLimits(34)
				// only take veldspar versions
				.withGroupsLimit(462)
				// allow two commands
				.withMaxCommands(2)
				//
				;

		Commands result = new RefineSolver().solve(params);
		System.out.println(result.commands);
		System.out.println("price : " + result.commands.get(0).prices());
		System.out.println("cost : " + result.commands.get(0).cost);

	}

}
