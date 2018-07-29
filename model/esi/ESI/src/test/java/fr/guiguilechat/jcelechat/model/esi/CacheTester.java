package fr.guiguilechat.jcelechat.model.esi;

import java.util.stream.Collectors;

import fr.guiguilechat.jcelechat.esi.ConnectedImpl;
import fr.guiguilechat.jcelechat.esi.disconnected.CacheStatic;
import fr.guiguilechat.jcelechat.esi.disconnected.ESIStatic;
import fr.guiguilechat.jcelechat.model.esi.compiled.G_ITransfer;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_markets_region_id_orders;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_status;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class CacheTester {

	public static void main(String[] args) {
		CacheStatic con = ESIStatic.INSTANCE.cache;


		// noparam-> container
		System.out.println("noparam->container started");
		Property<R_get_status> status = con.status.status();
		ConnectedImpl.listenO(status, (ChangeListener<R_get_status>) (ob, old, now) -> System.out
				.println("noparam->container new number of players " + now.players));

		// noparam-> list
		System.out.println("noparam->list started");
		ObservableList<Integer> attributes = con.dogma.attributes();

		ConnectedImpl.listenL(attributes, li -> System.out
				.println("noparam->list " + li.next() + " added " + li.getAddedSubList() + " ; removed " + li.getRemoved()
				+ " hasnext" + li.next()));
		ConnectedImpl.waitL(attributes);

		// noparam-> map
		// can't find any

		// params->list
		System.out.println("params->list started");
		// vni sell orders in sinq laison
		ObservableList<R_get_markets_region_id_orders> orders = con.markets.orders(G_ITransfer.order_type.sell, 10000032,
				17843);

		ConnectedImpl.listenL(orders,
				(ListChangeListener<R_get_markets_region_id_orders>) li -> System.out.println("params->list "
						+ li.next() + " added " + li.getAddedSubList().stream().map(order -> order.price).collect(Collectors.toList())
						+ " ; removed " + li.getRemoved() + " hasnext" + li.next()));
		ConnectedImpl.waitL(orders);
	}
}
