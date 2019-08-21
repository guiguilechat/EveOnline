package fr.guiguilechat.jcelechat.jcesi.disconnected;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import fr.guiguilechat.jcelechat.jcesi.interfaces.Requested;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.SwaggerDCCache;
import fr.lelouet.collectionholders.impl.AObsObjHolder;
import fr.lelouet.collectionholders.impl.ObsObjHolderBack;
import fr.lelouet.collectionholders.impl.collections.ObsListHolderImpl;
import fr.lelouet.collectionholders.impl.collections.ObsMapHolderImpl;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class CacheStatic extends SwaggerDCCache<ESIStatic> {

	public CacheStatic(ESIStatic swag) {
		super(swag);
	}

	@Override
	public <U> Pausable addFetchCacheArray(String name, BiFunction<Integer, Map<String, String>, Requested<U[]>> fetcher,
			Consumer<List<U>> cacheHandler, String... requiredRoles) {
		return swagger.addFetchCacheArray("STATIC_" + name, fetcher, cacheHandler, requiredRoles);
	}

	@Override
	public <U> Pausable addFetchCacheObject(String name, Function<Map<String, String>, Requested<U>> fetcher,
			Consumer<U> cacheHandler, String... requiredRoles) {
		return swagger.addFetchCacheObject("STATIC_" + name, fetcher, cacheHandler, requiredRoles);
	}

	@Override
	public <U> ObsListHolderImpl<U> toHolder(ObservableList<U> list) {
		return new ObsListHolderImpl<>(list);
	}

	@Override
	public <U, V> ObsMapHolderImpl<U, V> toHolder(ObservableMap<U, V> map) {
		return new ObsMapHolderImpl<>(map);
	}

	@Override
	public <U> AObsObjHolder<U> toHolder(ObservableValue<U> obj) {
		return new ObsObjHolderBack<>(obj);
	}

}
