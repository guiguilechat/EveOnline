package fr.guiguilechat.jcelechat.jcesi.connected.modeled;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.guiguilechat.jcelechat.jcesi.connected.ESIConnected;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.corporation.Bookmarks;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.responses.M_get_assets_8;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.responses.M_get_blueprints_8;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.responses.R_get_corporations_corporation_id_industry_jobs;
import fr.guiguilechat.jcelechat.model.jcesi.interfaces.ObsMapHolder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class Corporation {

	protected final ESIAccount con;

	public Corporation(ESIAccount con) {
		this.con = con;
		bms = new Bookmarks(con);
	}

	public final Bookmarks bms;

	// industry jobs

	public ObsMapHolder<Integer, R_get_corporations_corporation_id_industry_jobs> getIndustryJobs() {
		return con.raw.cache.corporations
				.industry_jobs(con.character.infos.corporationId().get(), false);
	}

	public static boolean isManufacture(R_get_corporations_corporation_id_industry_jobs job) {
		return job.activity_id == 1;
	}

	public static boolean isTE(R_get_corporations_corporation_id_industry_jobs job) {
		return job.activity_id == 3;
	}

	public static boolean isME(R_get_corporations_corporation_id_industry_jobs job) {
		return job.activity_id == 4;
	}

	public static boolean isCopy(R_get_corporations_corporation_id_industry_jobs job) {
		return job.activity_id == 5;
	}

	public static boolean isInvetion(R_get_corporations_corporation_id_industry_jobs job) {
		return job.activity_id == 8;
	}

	private ObservableMap<Long, ObservableMap<Integer, Integer>> cachedAssets = FXCollections
			.observableMap(new LinkedHashMap<>());

	private long assetsExpire = 0;

	/**
	 *
	 * @return the location->typeid->quantity
	 */
	public ObservableMap<Long, ObservableMap<Integer, Integer>> getAssets() {
		synchronized (cachedAssets) {
			if (assetsExpire < System.currentTimeMillis()) {
				M_get_assets_8[] itemsArr = ESIConnected
						.loadPages(
								(p, h) -> con.raw.get_corporations_assets(con.character.infos.corporationId().get(), p,
										h),
								l -> assetsExpire = l)
						.stream().filter(asset -> !"AutoFit".equals(asset.location_flag))
						.toArray(M_get_assets_8[]::new);
				// we make the map of itemid->locations. if a location is actually an
				// asset, we
				// iterally map it to this asset's location instead
				Map<Long, Long> baseLocationMap = Stream.of(itemsArr)
						.collect(Collectors.toMap(i -> i.item_id, i -> i.location_id));
				Map<Long, Long> idToLocation = baseLocationMap.entrySet().stream()
						.collect(Collectors.toMap(Entry::getKey, e -> {
							Long ret = e.getValue();
							while (baseLocationMap.containsKey(ret)) {
								ret = baseLocationMap.get(ret);
							}
							return ret;
						}));
				Map<Long, Map<Integer, Integer>> newitems = Stream.of(itemsArr)
						.collect(Collectors.toMap(a -> idToLocation.get(a.item_id), Corporation::makeMap, Corporation::mergeMap));

				for (Entry<Long, Map<Integer, Integer>> e : newitems.entrySet()) {
					ObservableMap<Integer, Integer> om = cachedAssets.get(e.getKey());
					if (om == null) {
						om = FXCollections.observableHashMap();
						cachedAssets.put(e.getKey(), om);
					}
					om.keySet().retainAll(e.getValue().keySet());
					om.putAll(e.getValue());
				}
			}
		}
		return cachedAssets;
	}

	private static Map<Integer, Integer> makeMap(M_get_assets_8 asset) {
		Map<Integer, Integer> ret = new HashMap<>();
		ret.put(asset.type_id, asset.quantity);
		return ret;
	}

	private static Map<Integer, Integer> mergeMap(Map<Integer, Integer> m1, Map<Integer, Integer> m2) {
		for (Entry<Integer, Integer> e : m2.entrySet()) {
			m1.merge(e.getKey(), e.getValue(), (a, b) -> a + b);
		}
		return m1;
	}

	public ObsMapHolder<Long, M_get_blueprints_8> getBlueprints() {
		return con.raw.cache.corporations
				.blueprints(con.character.infos.corporationId().get());
	}

}