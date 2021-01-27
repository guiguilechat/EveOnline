package fr.guiguilechat.jcelechat.jcesi.disconnected;

import java.util.stream.Collectors;

import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_markets_region_id_orders;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_status;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.order_type;
import fr.lelouet.collectionholders.interfaces.ObsObjHolder;
import fr.lelouet.collectionholders.interfaces.collections.ObsListHolder;
import javafx.collections.ListChangeListener;

public class CacheTester {

	public static void main(String[] args) {
		CacheStatic con = ESIStatic.INSTANCE.cache();

		// noparam-> container
		System.out.println("noparam->container started");
		ObsObjHolder<R_get_status> status = con.status.status();
		status.follow((now) -> System.out.println("noparam->container new number of players " + now.players));
		status.get();

		// noparam-> list
		System.out.println("noparam->list started");
		ObsListHolder<Integer> attributes = con.dogma.attributes();
		attributes.followItems(li -> System.out.println("noparam->list " + li.next() + " added " + li.getAddedSubList()
		+ " ; removed " + li.getRemoved() + " hasnext" + li.next()));
		attributes.get();

		// noparam-> map
		// can't find any

		// params->list
		System.out.println("params->list started");
		// vni sell orders in sinq laison
		ObsListHolder<R_get_markets_region_id_orders> orders = con.markets.orders(order_type.sell, 10000032, 17843);
		orders.followItems((ListChangeListener<R_get_markets_region_id_orders>) li -> System.out.println("params->list "
				+ li.next() + " added " + li.getAddedSubList().stream().map(order -> order.price).collect(Collectors.toList())
				+ " ; removed " + li.getRemoved() + " hasnext" + li.next()));
		orders.get();
		System.err.println("after wait we have " + orders.get().size() + " orders");
	}
}
