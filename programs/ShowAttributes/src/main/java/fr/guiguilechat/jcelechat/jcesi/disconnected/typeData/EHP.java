package fr.guiguilechat.jcelechat.jcesi.disconnected.typeData;

import java.util.Map;

import fr.guiguilechat.jcelechat.jcesi.disconnected.TypeData;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_universe_types_type_id;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.get_dogma_dynamic_items_type_id_item_id_dogma_effects;

public abstract class EHP implements TypeData {

	protected EHP() {
	}

	@Override
	public String apply(R_get_universe_types_type_id type, Map<Integer, Double> attIdToValue,
			Map<Integer, get_dogma_dynamic_items_type_id_item_id_dogma_effects> effectId2effect) {
		return formater().format(shieldHP(attIdToValue) / shieldResonnance(attIdToValue)
				+ armorHP(attIdToValue) / armorResonnance(attIdToValue) + hullHP(attIdToValue) / hullResonnance(attIdToValue));
	}

	public abstract double shieldResonnance(Map<Integer, Double> attIdToValue);

	public abstract double armorResonnance(Map<Integer, Double> attIdToValue);

	public abstract double hullResonnance(Map<Integer, Double> attIdToValue);

	public static final EHP EM = new EHP() {

		@Override
		public String name() {
			return "EM EHP";
		}

		@Override
		public double shieldResonnance(Map<Integer, Double> attIdToValue) {
			return shieldEmResonnance(attIdToValue);
		}

		@Override
		public double hullResonnance(Map<Integer, Double> attIdToValue) {
			return hullEmResonnance(attIdToValue);
		}

		@Override
		public double armorResonnance(Map<Integer, Double> attIdToValue) {
			return armorEmResonnance(attIdToValue);
		}
	};

	public static final EHP TH = new EHP() {

		@Override
		public String name() {
			return "TH EHP";
		}

		@Override
		public double shieldResonnance(Map<Integer, Double> attIdToValue) {
			return shieldThResonnance(attIdToValue);
		}

		@Override
		public double hullResonnance(Map<Integer, Double> attIdToValue) {
			return hullThResonnance(attIdToValue);
		}

		@Override
		public double armorResonnance(Map<Integer, Double> attIdToValue) {
			return armorThResonnance(attIdToValue);
		}
	};

	public static final EHP KI = new EHP() {

		@Override
		public String name() {
			return "KI EHP";
		}

		@Override
		public double shieldResonnance(Map<Integer, Double> attIdToValue) {
			return shieldKiResonnance(attIdToValue);
		}

		@Override
		public double hullResonnance(Map<Integer, Double> attIdToValue) {
			return hullKiResonnance(attIdToValue);
		}

		@Override
		public double armorResonnance(Map<Integer, Double> attIdToValue) {
			return armorKiResonnance(attIdToValue);
		}
	};

	public static final EHP EX = new EHP() {

		@Override
		public String name() {
			return "EX EHP";
		}

		@Override
		public double shieldResonnance(Map<Integer, Double> attIdToValue) {
			return shieldExResonnance(attIdToValue);
		}

		@Override
		public double hullResonnance(Map<Integer, Double> attIdToValue) {
			return hullExResonnance(attIdToValue);
		}

		@Override
		public double armorResonnance(Map<Integer, Double> attIdToValue) {
			return armorExResonnance(attIdToValue);
		}
	};

}
