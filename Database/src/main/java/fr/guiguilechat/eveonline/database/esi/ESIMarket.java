package fr.guiguilechat.eveonline.database.esi;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ESIMarket {

	private static final Logger logger = LoggerFactory.getLogger(ESIMarket.class);

	private final String historyURL;
	private final String ordersURL;
	public final int region;

	private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd");
	private final ObjectMapper datedMapper = new ObjectMapper();
	{
		datedMapper.setDateFormat(DATE_FORMATTER);
	}

	private final ObjectMapper mapper = new ObjectMapper();

	public ESIMarket(int regionID) {
		region = regionID;
		historyURL = "https://esi.tech.ccp.is/dev/markets/" + regionID + "/history/?";
		ordersURL = "https://esi.tech.ccp.is/latest/markets/" + regionID + "/orders/?";
	}

	private HashMap<Integer, List<HistoryData>> cachedHistories = new HashMap<>();

	public static class HistoryData {
		public Calendar date;
		public long order_count;
		public long volume;
		public double highest;
		public double average;
		public double lowest;
	}

	public List<HistoryData> getHistory(int itemId) {
		List<HistoryData> ret = cachedHistories.get(itemId);
		if (ret == null) {
			String url = historyURL + "type_id=" + itemId;
			try {
				ret = datedMapper.readValue(new URL(url), new TypeReference<List<HistoryData>>() {
				});
				cachedHistories.put(itemId, ret);
			} catch (IOException e) {
				throw new UnsupportedOperationException("catch this", e);
			}
		}
		return ret;
	}

	public Stream<HistoryData> getHistoryAfter(int itemID, Date limit) {
		return getHistory(itemID).stream().filter(h -> h.date.after(limit));
	}

	/**
	 * get the total sell price of an item over last month
	 *
	 * @param itemId
	 *          the id of the item
	 * @param regionID
	 *          the id of the region
	 * @return
	 */
	public double getMonthTotalPrice(int itemId) {
		double totalPrice = 0;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		Date firstDate = cal.getTime();
		for (HistoryData d : getHistory(itemId)) {
			if (d.date.after(firstDate)) {
				totalPrice += d.volume * d.average;
			}
		}
		return totalPrice;
	}

	public int getMonthNBOrders(int itemId) {
		int totalOrders = 0;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		Date firstDate = cal.getTime();
		for (HistoryData d : getHistory(itemId)) {
			if (d.date.after(firstDate)) {
				totalOrders += d.volume;
			}
		}
		return totalOrders;
	}

	public static class ItemMedianData {
		public long qtty;
		public double average;

		public ItemMedianData() {
			this(0, 0.0);
		}

		public ItemMedianData(long qtty, double average) {
			this.qtty = qtty;
			this.average = average;
		}

	}

	/**
	 * for each period of given number of day, compute the total iskvolume =
	 * nbsell*sellvalue. Each period is then ponderated by opposite age( period 0
	 * is ponderated 1, period n is ponderated n+1) then we return the median
	 * value of iskvolume .
	 *
	 * @param itemId
	 * @param nbPeriods
	 *          number of periods we consider
	 * @param periodDays
	 *          number of day to consider as a period. Use 30 for monthly.
	 * @return
	 */
	public ItemMedianData getPonderatedMedianMonthlyAverage(int itemId, int nbPeriods, int periodDays) {
		int today = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		double[] sumMonthSO = new double[nbPeriods];
		long[] sumMonthQtty = new long[nbPeriods];
		// for each month, the total sell numbers and total
		for (HistoryData d : getHistory(itemId)) {
			int dayDiff = today - d.date.get(Calendar.DAY_OF_YEAR);
			// if the data was in previous year we have to add the actual number of
			// days in that year.
			if (dayDiff < 0) {
				dayDiff += d.date.getActualMaximum(Calendar.DAY_OF_YEAR);
			}
			int dataMonth = nbPeriods - 1 - dayDiff / periodDays;
			if (dataMonth >= 0) {
				sumMonthQtty[dataMonth] += d.volume;
				sumMonthSO[dataMonth] += d.volume * d.average;
			}
		}
		// then create an array to sort containing the average sell order for each
		// period
		// weight[i]= i+1 so for n elements we need n*(n+1)/2 cells
		double[] ponderatedSizeAvg = new double[nbPeriods * (nbPeriods + 1) / 2];
		long[] ponderatedSizeQtty = new long[nbPeriods * (nbPeriods + 1) / 2];
		for (int i = 0; i < nbPeriods; i++) {
			// first indexs in the ponderated array
			int pi = i * (i + 1) / 2;
			double monthAvgValue = sumMonthSO[i] / sumMonthQtty[i];
			for (int j = 0; j <= i; j++) {
				ponderatedSizeAvg[pi + j] = monthAvgValue;
				ponderatedSizeQtty[pi + j] = sumMonthQtty[i];
			}
		}
		Arrays.sort(ponderatedSizeAvg);
		Arrays.sort(ponderatedSizeQtty);
		return new ItemMedianData(ponderatedSizeQtty[ponderatedSizeQtty.length / 2],
				ponderatedSizeAvg[ponderatedSizeAvg.length / 2]);
	}

	protected HashMap<Integer, MyOrder[]> cachedBOs = new HashMap<>();

	/**
	 * get the highest BO value for given item ID. eg if item 5 has 10 BO at 100,
	 * 10 BO at 90, requesting 10 will return 1000, requesting 20 will return
	 * 1900, requesting 11 will return 1090
	 *
	 * @param itemID
	 *          the id of the item
	 * @param quantity
	 *          number of items to consider
	 * @return the sum of highest quantity buy orders values.
	 */
	public double getBO(int itemID, long quantity) {
		MyOrder[] cached = cachedBOs.get(itemID);
		if (cached == null) {
			cached = loadOrders(itemID, true);
			cachedBOs.put(itemID, cached);
		}
		if (cached == null || cached.length == 0) {
			return 0.0;
		}
		// System.err.println(cached.length + " orders for id " + itemID + " on
		// region " + region);
		// iteratively add the quantity first volume price.
		double ret = 0;
		for (MyOrder mo : cached) {
			long vol = Math.min(mo.volume, quantity);
			ret += mo.price * vol;
			quantity -= vol;
			if (quantity == 0) {
				return ret;
			}
		}
		// if there was not enough quantity to feed the request, we cfan't sell it.
		// so the BO is 0
		return ret;
	}

	private Map<Integer, MyOrder[]> syncBOs = Collections.synchronizedMap(cachedBOs);

	public void cacheBOs(int... itemIDs) {
		if (itemIDs == null) {
			return;
		}
		IntStream.of(itemIDs).distinct().filter(i -> !syncBOs.containsKey(i)).parallel()
		.forEach(i -> syncBOs.put(i, loadOrders(i, true)));
	}

	protected HashMap<Integer, MyOrder[]> cachedSOs = new HashMap<>();

	/**
	 * get the value of SO for given item ID and given quantity
	 *
	 * @param itemID
	 *          the id of the item
	 * @param quantity
	 *          the total quantity to consider for SO
	 * @return the sum of the quantity lowest SO values.
	 */
	public double getSO(int itemID, long quantity) {
		MyOrder[] cached = cachedSOs.get(itemID);
		if (cached == null) {
			cached = loadOrders(itemID, false);
			cachedSOs.put(itemID, cached);
		}
		if (cached == null || cached.length == 0) {
			return Double.POSITIVE_INFINITY;
		}
		double ret = 0;
		for (MyOrder mo : cached) {
			long vol = Math.min(mo.volume, quantity);
			ret += mo.price * vol;
			quantity -= vol;
			if (quantity == 0) {
				return ret;
			}
		}
		// if there was not enough quantity to feed the request, we set the price to
		// infinite. we CANT buy that many items
		return Double.POSITIVE_INFINITY;
	}

	private Map<Integer, MyOrder[]> syncSOs = Collections.synchronizedMap(cachedSOs);

	public void cacheSOs(int... itemIDs) {
		if (itemIDs == null) {
			return;
		}
		IntStream.of(itemIDs).distinct().filter(i -> !syncSOs.containsKey(i)).parallel()
		.forEach(i -> syncSOs.put(i, loadOrders(i, false)));
	}

	protected static class MarketOrder {
		public long order_id;
		public int type_id;
		public long location_id;
		public long volume_total;
		public long volume_remain;
		public long min_volume;
		public double price;
		public boolean is_buy_order;
		public int duration;
		public String issued;
		public String range;
	}

	protected static class MyOrder {
		public long volume;
		public double price;

		public MyOrder() {
		}

		public MyOrder(long volume, double price) {
			this.volume = volume;
			this.price = price;
		}
	}

	protected MyOrder[] loadOrders(int itemID, boolean buy) {
		String url = ordersURL + "type_id=" + itemID + "&order_type=" + (buy ? "buy" : "sell");
		try {
			MarketOrder[] orders = mapper.readValue(new URL(url), MarketOrder[].class);
			MyOrder[] arr = Stream.of(orders).map(mo -> new MyOrder(mo.volume_remain, mo.price)).toArray(MyOrder[]::new);
			Arrays.sort(arr, buy ? (mo1, mo2) -> (int) Math.signum(mo2.price - mo1.price)
					: (mo1, mo2) -> (int) Math.signum(mo1.price - mo2.price));
			return arr;
		} catch (IOException e) {
			return new MyOrder[] {};
		}
	}

	public static class MarketPrice {
		public double adjusted_price;
		public double average_price;
		public long type_id;
	}

	public static MarketPrice[] prices() {
		String url = "https://esi.tech.ccp.is/latest/markets/prices/";
		try {
			MarketPrice[] orders = new ObjectMapper().readValue(new URL(url), MarketPrice[].class);
			return orders;
		} catch (IOException e) {
			logger.debug("while retrieving prices ", e);
			return new MarketPrice[] {};
		}
	}

	public static class MarketPriceCache {
		public HashMap<Long, Double> adjusted = new HashMap<>();
		public HashMap<Long, Double> average = new HashMap<>();
	}

	/**
	 * cache the url https://esi.tech.ccp.is/latest/markets/prices/ in two usable
	 * maps.
	 *
	 * @return
	 */
	public static MarketPriceCache cacheMarketPrices() {
		logger.debug("caching marketprices");
		MarketPriceCache ret = new MarketPriceCache();
		for (MarketPrice mp : prices()) {
			ret.adjusted.put(mp.type_id, mp.adjusted_price);
			ret.average.put(mp.type_id, mp.average_price);
		}
		return ret;
	}

	protected MarketPriceCache cachePrices = null;

	/**
	 * get the esi average price of an item. the prices are cached for a
	 * ESIMarket, though several ESIMarket should return the same result.
	 *
	 * @param id
	 *          item to get the average price
	 * @return average price of item with given id.
	 */
	public double priceAverage(long id) {
		synchronized (this) {
			if (cachePrices == null) {
				cachePrices = cacheMarketPrices();
			}
		}
		Double ret = cachePrices.average.get(id);
		if (ret == null) {
			logger.debug("can't get average price of item " + id);
		}
		return ret == null ? 0l : ret;
	}

	/**
	 * get the esi adjusted price of an item. the prices are cached for a
	 * ESIMarket, though several ESIMarket should return the same result.
	 *
	 * @param id
	 *          item to get the adjusted price
	 * @return adjusted price of item with given id.
	 */
	public double priceAdjusted(long id) {
		synchronized (this) {
			if (cachePrices == null) {
				cachePrices = cacheMarketPrices();
			}
		}
		Double ret = cachePrices.adjusted.get(id);
		if (ret == null) {
			logger.debug("can't get adjusted price of item " + id);
		}
		return ret == null ? 0l : ret;
	}

}