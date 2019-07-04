package fr.guiguilechat.jcelechat.jcesi.disconnected.modeled.market;

import java.util.HashMap;
import java.util.Map;

import fr.guiguilechat.jcelechat.jcesi.disconnected.CacheStatic;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_markets_region_id_orders;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.order_type;
import fr.lelouet.collectionholders.interfaces.collections.ObsListHolder;
import fr.lelouet.collectionholders.interfaces.numbers.ObsDoubleHolder;
import fr.lelouet.tools.synchronization.LockWatchDog;
import javafx.beans.value.ObservableDoubleValue;

public class RegionalMarket {

	private final ObsListHolder<R_get_markets_region_id_orders> orders;
	private final CacheStatic cache;
	private final int regionID;

	public RegionalMarket(CacheStatic cache, int regionID) {
		orders = cache.markets.orders(order_type.all, regionID, null);
		this.cache = cache;
		this.regionID = regionID;
	}

	// typeid-> cached orders
	private Map<Integer, RegionTypeOrders> cachedOrders = new HashMap<>();

	public RegionTypeOrders getMarketOrders(int typeID) {
		RegionTypeOrders ret = cachedOrders.get(typeID);
		if (ret == null) {
			ret = LockWatchDog.BARKER.syncExecute(cachedOrders, () -> {
				RegionTypeOrders ret2 = cachedOrders.get(typeID);
				if (ret2 == null) {
					ret2 = new RegionTypeOrders(orders, typeID);
					cachedOrders.put(typeID, ret2);
				}
				return ret2;
			});
		}
		return ret;
	}

	public ObsDoubleHolder getPrice(int typeID, long qtty, boolean buy) {
		return getMarketOrders(typeID).getPrice(buy, qtty);
	}

	public ObservableDoubleValue getSO(int typeID, long qtty) {
		ObsDoubleHolder var = getMarketOrders(typeID).getPrice(false, qtty);
		var.get();
		return var.asObservableNumber();
	}

	public ObservableDoubleValue getBO(int typeID, long qtty) {
		ObsDoubleHolder var = getMarketOrders(typeID).getPrice(true, qtty);
		var.get();
		return var.asObservableNumber();
	}

	//
	// history
	//

	private final HashMap<Integer, RegionTypeHistory> historiesByTypeID = new HashMap<>();

	public RegionTypeHistory getHistory(int typeID) {
		RegionTypeHistory ret = historiesByTypeID.get(typeID);
		if (ret == null) {
			ret = LockWatchDog.BARKER.syncExecute(historiesByTypeID, () -> {
				RegionTypeHistory ret2 = historiesByTypeID.get(typeID);
				if (ret2 == null) {
					ret2 = new RegionTypeHistory(cache, regionID, typeID);
					historiesByTypeID.put(typeID, ret2);
				}
				return ret2;
			});
		}
		return ret;
	}

}
