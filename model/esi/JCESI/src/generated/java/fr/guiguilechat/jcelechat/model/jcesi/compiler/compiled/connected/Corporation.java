package fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.connected;

import java.util.HashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.jcesi.LockWatchDog;
import fr.guiguilechat.jcelechat.jcesi.interfaces.ObsListHolder;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.SwaggerCOCache;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.keys.K_7_int_long;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_corporation_corporation_id_mining_extractions;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_corporation_corporation_id_mining_observers;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_corporation_corporation_id_mining_observers_observer_id;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Corporation {
    public final SwaggerCOCache<?> cache;
    private final Map<Integer, ObsListHolder<R_get_corporation_corporation_id_mining_extractions>> get_corporation_corporation_id_mining_extractions_holder = new HashMap<>();
    private final Map<Integer, ObsListHolder<R_get_corporation_corporation_id_mining_observers>> get_corporation_corporation_id_mining_observers_holder = new HashMap<>();
    private final Map<K_7_int_long, ObsListHolder<R_get_corporation_corporation_id_mining_observers_observer_id>> get_corporation_corporation_id_mining_observers_observer_id_holder = new HashMap<>();

    public Corporation(SwaggerCOCache<?> parent) {
        cache = parent;
    }

    /**
     * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.
     * 
     * cache over {@link Swagger#get_corporation_mining_extractions}<br />
     * 
     * @param corporation_id
     *     An EVE corporation ID
     */
    public ObsListHolder<R_get_corporation_corporation_id_mining_extractions> mining_extractions(int corporation_id) {
        ObsListHolder<R_get_corporation_corporation_id_mining_extractions> ret = get_corporation_corporation_id_mining_extractions_holder.get(corporation_id);
        if (ret == null) {
            LockWatchDog.BARKER.tak(get_corporation_corporation_id_mining_extractions_holder);
            synchronized (get_corporation_corporation_id_mining_extractions_holder)
            {
                LockWatchDog.BARKER.hld(get_corporation_corporation_id_mining_extractions_holder);
                ret = get_corporation_corporation_id_mining_extractions_holder.get(corporation_id);
                if (ret == null) {
                    ObservableList<R_get_corporation_corporation_id_mining_extractions> holder = FXCollections.observableArrayList();
                    ret = (cache).toHolder(holder);
                    get_corporation_corporation_id_mining_extractions_holder.put(corporation_id, ret);
                    ObsListHolder<R_get_corporation_corporation_id_mining_extractions> finalRet = ret;
                    (cache).addFetchCacheArray("get_corporation_corporation_id_mining_extractions", (page, headerHandler) -> (cache.swagger).get_corporation_mining_extractions(corporation_id, page, headerHandler), arr -> {
                        LockWatchDog.BARKER.tak(holder);
                        synchronized (holder)
                        {
                            LockWatchDog.BARKER.hld(holder);
                            holder.setAll(arr);
                            finalRet.dataReceived();
                        }
                        LockWatchDog.BARKER.rel(holder);
                    }
                    , new String[] {"Station_Manager"});
                }
            }
            LockWatchDog.BARKER.rel(get_corporation_corporation_id_mining_extractions_holder);
        }
        return ret;
    }

    /**
     * Paginated list of all entities capable of observing and recording mining for a corporation
     * 
     * cache over {@link Swagger#get_corporation_mining_observers}<br />
     * 
     * @param corporation_id
     *     An EVE corporation ID
     */
    public ObsListHolder<R_get_corporation_corporation_id_mining_observers> mining_observers(int corporation_id) {
        ObsListHolder<R_get_corporation_corporation_id_mining_observers> ret = get_corporation_corporation_id_mining_observers_holder.get(corporation_id);
        if (ret == null) {
            LockWatchDog.BARKER.tak(get_corporation_corporation_id_mining_observers_holder);
            synchronized (get_corporation_corporation_id_mining_observers_holder)
            {
                LockWatchDog.BARKER.hld(get_corporation_corporation_id_mining_observers_holder);
                ret = get_corporation_corporation_id_mining_observers_holder.get(corporation_id);
                if (ret == null) {
                    ObservableList<R_get_corporation_corporation_id_mining_observers> holder = FXCollections.observableArrayList();
                    ret = (cache).toHolder(holder);
                    get_corporation_corporation_id_mining_observers_holder.put(corporation_id, ret);
                    ObsListHolder<R_get_corporation_corporation_id_mining_observers> finalRet = ret;
                    (cache).addFetchCacheArray("get_corporation_corporation_id_mining_observers", (page, headerHandler) -> (cache.swagger).get_corporation_mining_observers(corporation_id, page, headerHandler), arr -> {
                        LockWatchDog.BARKER.tak(holder);
                        synchronized (holder)
                        {
                            LockWatchDog.BARKER.hld(holder);
                            holder.setAll(arr);
                            finalRet.dataReceived();
                        }
                        LockWatchDog.BARKER.rel(holder);
                    }
                    , new String[] {"Accountant"});
                }
            }
            LockWatchDog.BARKER.rel(get_corporation_corporation_id_mining_observers_holder);
        }
        return ret;
    }

    /**
     * Paginated record of all mining seen by an observer
     * 
     * cache over {@link Swagger#get_corporation_mining_observers}<br />
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param observer_id
     *     A mining observer id
     */
    public ObsListHolder<R_get_corporation_corporation_id_mining_observers_observer_id> mining_observers(int corporation_id, long observer_id) {
        K_7_int_long param = new K_7_int_long(corporation_id, observer_id);
        ObsListHolder<R_get_corporation_corporation_id_mining_observers_observer_id> ret = get_corporation_corporation_id_mining_observers_observer_id_holder.get(param);
        if (ret == null) {
            LockWatchDog.BARKER.tak(get_corporation_corporation_id_mining_observers_observer_id_holder);
            synchronized (get_corporation_corporation_id_mining_observers_observer_id_holder)
            {
                LockWatchDog.BARKER.hld(get_corporation_corporation_id_mining_observers_observer_id_holder);
                ret = get_corporation_corporation_id_mining_observers_observer_id_holder.get(param);
                if (ret == null) {
                    ObservableList<R_get_corporation_corporation_id_mining_observers_observer_id> holder = FXCollections.observableArrayList();
                    ret = (cache).toHolder(holder);
                    get_corporation_corporation_id_mining_observers_observer_id_holder.put(param, ret);
                    ObsListHolder<R_get_corporation_corporation_id_mining_observers_observer_id> finalRet = ret;
                    (cache).addFetchCacheArray("get_corporation_corporation_id_mining_observers_observer_id", (page, headerHandler) -> (cache.swagger).get_corporation_mining_observers(corporation_id, observer_id, page, headerHandler), arr -> {
                        LockWatchDog.BARKER.tak(holder);
                        synchronized (holder)
                        {
                            LockWatchDog.BARKER.hld(holder);
                            holder.setAll(arr);
                            finalRet.dataReceived();
                        }
                        LockWatchDog.BARKER.rel(holder);
                    }
                    , new String[] {"Accountant"});
                }
            }
            LockWatchDog.BARKER.rel(get_corporation_corporation_id_mining_observers_observer_id_holder);
        }
        return ret;
    }
}
