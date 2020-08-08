package fr.guiguilechat.jcelechat.jcesi.tools;

import fr.guiguilechat.jcelechat.jcesi.disconnected.modeled.market.RegionalMarket;
import fr.guiguilechat.tools.JFXTools;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.Property;

/**
 * Tools to use the {@link RegionalMarket}
 */
public class MarketHelpers {

	/**
	 *
	 * @param typeID
	 * @param marketHolder
	 * @return a new property bound to the highest BO of given typeid in the given
	 *         market region
	 */
	public static DoubleProperty bo(int typeID, Property<RegionalMarket> marketHolder) {
		return JFXTools.extractDouble(marketHolder, m -> m.getBO(typeID, 1).asObservableNumber());
	}

	/**
	 *
	 * @param typeID
	 * @param marketHolder
	 * @return a new property bound to the lowest SO of given typeid in the given
	 *         market region
	 */
	public static DoubleProperty so(int typeID, Property<RegionalMarket> marketHolder) {
		return JFXTools.extractDouble(marketHolder, m -> m.getSO(typeID, 1).asObservableNumber());
	}

	/**
	 *
	 * @param typeID
	 * @param marketHolder
	 * @return a new property bound to the average daily value of given typeid in
	 *         the given market region
	 */
	public static DoubleProperty weeklyAVG(int typeID, Property<RegionalMarket> marketHolder) {
		return JFXTools.extractDouble(marketHolder, m -> m.getHistory(typeID).weekly.getAverage().asObservableNumber());
	}

	/**
	 *
	 * @param typeID
	 * @param marketHolder
	 * @return a new property bound to the average weekly volume of given typeid
	 *         in the given market region
	 */
	public static LongProperty weeklyVOL(int typeID, Property<RegionalMarket> marketHolder) {
		return JFXTools.extractLong(marketHolder, m -> m.getHistory(typeID).weekly.getVolume().asObservableNumber());
	}

	/**
	 *
	 * @param typeID
	 * @param marketHolder
	 * @return a new property bound to the average montlhy value of given typeid
	 *         in the given market region
	 */
	public static DoubleProperty monthlyAVG(int typeID, Property<RegionalMarket> marketHolder) {
		return JFXTools.extractDouble(marketHolder, m -> m.getHistory(typeID).monthly.getAverage().asObservableNumber());
	}

	/**
	 *
	 * @param typeID
	 * @param marketHolder
	 * @return a new property bound to the average monthly volume of given typeid
	 *         in the given market region
	 */
	public static LongProperty monthlyVOL(int typeID, Property<RegionalMarket> marketHolder) {
		return JFXTools.extractLong(marketHolder, m -> m.getHistory(typeID).monthly.getVolume().asObservableNumber());
	}
}
