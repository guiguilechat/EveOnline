package fr.guiguilechat.jcelechat.jcesi.disconnected;

import fr.guiguilechat.jcelechat.jcesi.ConnectedImpl;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.G_IDCAccess;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;

/**
 * singleton fo access to static (disconnected) calls.
 *
 */
public class ESIStatic extends ConnectedImpl implements G_IDCAccess {

	public static final ESIStatic INSTANCE = new ESIStatic();

	public final CacheStatic cache = new CacheStatic(this);

	private ESIStatic() {
	}

	@Override
	public ObservableSet<String> getRoles() {
		return FXCollections.emptyObservableSet();
	};

}