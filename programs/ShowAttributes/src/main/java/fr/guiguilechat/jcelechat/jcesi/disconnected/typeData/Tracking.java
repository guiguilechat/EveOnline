package fr.guiguilechat.jcelechat.jcesi.disconnected.typeData;

import java.util.Map;

import fr.guiguilechat.jcelechat.jcesi.disconnected.TypeData;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_universe_types_type_id;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.get_dogma_dynamic_items_type_id_item_id_dogma_effects;

public class Tracking implements TypeData {

	public static Tracking INS = new Tracking();

	protected Tracking() {
	}

	@Override
	public String apply(R_get_universe_types_type_id type, Map<Integer, Double> attIdToValue,
			Map<Integer, get_dogma_dynamic_items_type_id_item_id_dogma_effects> effectId2effect) {
		var sig = signatureRadius(attIdToValue);
		var range = orbitRange(attIdToValue);
		var velocity = orbitVelocity(attIdToValue);
		// System.err.println("type " + type.name + " sig=" + sig + " range=" +
		// range + " velo=" + velocity);
		return formater()
				.format(velocity * 40000 / sig / range);
	}

	@Override
	public String name() {
		return "tracking";
	}

}
