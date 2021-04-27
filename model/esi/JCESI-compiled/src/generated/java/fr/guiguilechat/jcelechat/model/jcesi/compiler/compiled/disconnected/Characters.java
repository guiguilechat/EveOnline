package fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.disconnected;

import java.util.HashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.SwaggerDCCache;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_corporationhistory;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_portrait;
import fr.lelouet.collectionholders.impl.ObsObjHolderSimple;
import fr.lelouet.collectionholders.impl.collections.ObsListHolderImpl;
import fr.lelouet.collectionholders.interfaces.ObsObjHolder;
import fr.lelouet.collectionholders.interfaces.collections.ObsListHolder;
import fr.lelouet.tools.synchronization.LockWatchDog;

public class Characters {
    public final SwaggerDCCache<?> cache;
    private final Map<Integer, ObsListHolderImpl<R_get_characters_character_id_corporationhistory>> get_characters_character_id_corporationhistory_holder = new HashMap<>();
    private final Map<Integer, ObsObjHolderSimple<R_get_characters_character_id_portrait>> get_characters_character_id_portrait_holder = new HashMap<>();
    private final Map<Integer, ObsObjHolderSimple<R_get_characters_character_id>> get_characters_character_id_holder = new HashMap<>();

    public Characters(SwaggerDCCache<?> parent) {
        cache = parent;
    }

    /**
     * Get a list of all the corporations a character has been a member of
     * 
     * cache over {@link Swagger#get_characters_corporationhistory}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObsListHolder<R_get_characters_character_id_corporationhistory> corporationhistory(int character_id) {
        ObsListHolderImpl<R_get_characters_character_id_corporationhistory> ret = get_characters_character_id_corporationhistory_holder.get(character_id);
        if (ret == null) {
            LockWatchDog.BARKER.tak(get_characters_character_id_corporationhistory_holder);
            try {
                synchronized (get_characters_character_id_corporationhistory_holder)
                {
                    LockWatchDog.BARKER.hld(get_characters_character_id_corporationhistory_holder);
                    {
                        ret = get_characters_character_id_corporationhistory_holder.get(character_id);
                        if (ret == null) {
                            ret = new ObsListHolderImpl<R_get_characters_character_id_corporationhistory>();
                            get_characters_character_id_corporationhistory_holder.put(character_id, ret);
                            ObsListHolderImpl<R_get_characters_character_id_corporationhistory> finalRet = ret;
                            (cache).addFetchCacheArray("get_characters_character_id_corporationhistory", (page, properties) -> (cache.swagger).get_characters_corporationhistory(character_id, properties), arr -> finalRet.set(arr));
                        }
                    }
                    LockWatchDog.BARKER.rel(get_characters_character_id_corporationhistory_holder);
                }
            } finally {
                LockWatchDog.BARKER.rel(get_characters_character_id_corporationhistory_holder);
            }
        }
        return ret;
    }

    /**
     * Public information about a character
     * 
     * cache over {@link Swagger#get_characters}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObsObjHolder<R_get_characters_character_id> get(int character_id) {
        ObsObjHolderSimple<R_get_characters_character_id> ret = get_characters_character_id_holder.get(character_id);
        if (ret == null) {
            LockWatchDog.BARKER.tak(get_characters_character_id_holder);
            try {
                synchronized (get_characters_character_id_holder)
                {
                    LockWatchDog.BARKER.hld(get_characters_character_id_holder);
                    {
                        ret = get_characters_character_id_holder.get(character_id);
                        if (ret == null) {
                            ret = new ObsObjHolderSimple<R_get_characters_character_id>();
                            ObsObjHolderSimple<R_get_characters_character_id> finalRet = ret;
                            get_characters_character_id_holder.put(character_id, ret);
                            (cache).addFetchCacheObject("get_characters_character_id", properties -> (cache.swagger).get_characters(character_id, properties), item -> finalRet.set(item));
                        }
                    }
                    LockWatchDog.BARKER.rel(get_characters_character_id_holder);
                }
            } finally {
                LockWatchDog.BARKER.rel(get_characters_character_id_holder);
            }
        }
        return ret;
    }

    /**
     * Get portrait urls for a character
     * 
     * cache over {@link Swagger#get_characters_portrait}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObsObjHolder<R_get_characters_character_id_portrait> portrait(int character_id) {
        ObsObjHolderSimple<R_get_characters_character_id_portrait> ret = get_characters_character_id_portrait_holder.get(character_id);
        if (ret == null) {
            LockWatchDog.BARKER.tak(get_characters_character_id_portrait_holder);
            try {
                synchronized (get_characters_character_id_portrait_holder)
                {
                    LockWatchDog.BARKER.hld(get_characters_character_id_portrait_holder);
                    {
                        ret = get_characters_character_id_portrait_holder.get(character_id);
                        if (ret == null) {
                            ret = new ObsObjHolderSimple<R_get_characters_character_id_portrait>();
                            ObsObjHolderSimple<R_get_characters_character_id_portrait> finalRet = ret;
                            get_characters_character_id_portrait_holder.put(character_id, ret);
                            (cache).addFetchCacheObject("get_characters_character_id_portrait", properties -> (cache.swagger).get_characters_portrait(character_id, properties), item -> finalRet.set(item));
                        }
                    }
                    LockWatchDog.BARKER.rel(get_characters_character_id_portrait_holder);
                }
            } finally {
                LockWatchDog.BARKER.rel(get_characters_character_id_portrait_holder);
            }
        }
        return ret;
    }
}
