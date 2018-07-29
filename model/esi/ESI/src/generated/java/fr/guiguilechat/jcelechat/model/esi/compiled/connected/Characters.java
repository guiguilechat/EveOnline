package fr.guiguilechat.jcelechat.model.esi.compiled.connected;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;
import fr.guiguilechat.jcelechat.model.esi.compiled.SwaggerCOCache;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_0_int_Integer;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_18_int_int;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_19_String_LString_int_Boolean;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_1_int_int;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_2_int_int;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_3_Boolean_int;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_4_Integer_int_Lint;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_5_int_int;
import fr.guiguilechat.jcelechat.model.esi.compiled.keys.K_6_Long_int;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_assets_8;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_blueprints_8;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_bookmarks_9;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_contacts_labels_2;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_contracts_22;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_contracts_contract_bids_4;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_contracts_contract_items_6;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_journal_13;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_killmails_2;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.M_get_standings_3;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_agents_research;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_attributes;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_bookmarks_folders;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_calendar;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_calendar_event_id;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_calendar_event_id_attendees;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_clones;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_contacts;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_fatigue;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_fittings;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_fleet;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_fw_stats;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_industry_jobs;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_location;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_loyalty_points;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_mail;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_mail_labels;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_mail_lists;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_mail_mail_id;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_medals;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_mining;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_notifications;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_notifications_contacts;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_online;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_opportunities;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_orders;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_orders_history;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_planets;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_planets_planet_id;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_roles;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_search;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_ship;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_skillqueue;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_skills;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_stats;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_titles;
import fr.guiguilechat.jcelechat.model.esi.compiled.responses.R_get_characters_character_id_wallet_transactions;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class Characters {
    public final SwaggerCOCache<?> cache;
    private final Map<Integer, ObservableList<R_get_characters_character_id_agents_research>> get_characters_character_id_agents_research_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_attributes>> get_characters_character_id_attributes_holder = new HashMap<>();
    private final Map<K_0_int_Integer, ObservableList<R_get_characters_character_id_calendar>> get_characters_character_id_calendar_holder = new HashMap<>();
    private final Map<K_1_int_int, ObservableList<R_get_characters_character_id_calendar_event_id_attendees>> get_characters_character_id_calendar_event_id_attendees_holder = new HashMap<>();
    private final Map<Integer, ObservableList<M_get_contacts_labels_2>> get_characters_character_id_contacts_labels_holder = new HashMap<>();
    private final Map<Integer, ObservableList<M_get_contracts_22>> get_characters_character_id_contracts_holder = new HashMap<>();
    private final Map<K_2_int_int, ObservableMap<Integer, M_get_contracts_contract_bids_4>> get_characters_character_id_contracts_contract_id_bids_holder = new HashMap<>();
    private final Map<K_2_int_int, ObservableMap<Long, M_get_contracts_contract_items_6>> get_characters_character_id_contracts_contract_id_items_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_fatigue>> get_characters_character_id_fatigue_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_fittings>> get_characters_character_id_fittings_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_fleet>> get_characters_character_id_fleet_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_fw_stats>> get_characters_character_id_fw_stats_holder = new HashMap<>();
    private final Map<Integer, ObservableList<Integer>> get_characters_character_id_implants_holder = new HashMap<>();
    private final Map<K_3_Boolean_int, ObservableMap<Integer, R_get_characters_character_id_industry_jobs>> get_characters_character_id_industry_jobs_holder = new HashMap<>();
    private final Map<Integer, ObservableList<M_get_killmails_2>> get_characters_character_id_killmails_recent_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_location>> get_characters_character_id_location_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_loyalty_points>> get_characters_character_id_loyalty_points_holder = new HashMap<>();
    private final Map<K_4_Integer_int_Lint, ObservableList<R_get_characters_character_id_mail>> get_characters_character_id_mail_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_mail_lists>> get_characters_character_id_mail_lists_holder = new HashMap<>();
    private final Map<K_5_int_int, Property<R_get_characters_character_id_mail_mail_id>> get_characters_character_id_mail_mail_id_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_medals>> get_characters_character_id_medals_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_mining>> get_characters_character_id_mining_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_notifications_contacts>> get_characters_character_id_notifications_contacts_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_opportunities>> get_characters_character_id_opportunities_holder = new HashMap<>();
    private final Map<Integer, ObservableMap<Long, R_get_characters_character_id_orders_history>> get_characters_character_id_orders_history_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_planets>> get_characters_character_id_planets_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_ship>> get_characters_character_id_ship_holder = new HashMap<>();
    private final Map<Integer, ObservableList<M_get_standings_3>> get_characters_character_id_standings_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_titles>> get_characters_character_id_titles_holder = new HashMap<>();
    private final Map<Integer, Property<Double>> get_characters_character_id_wallet_holder = new HashMap<>();
    private final Map<K_6_Long_int, ObservableMap<Long, R_get_characters_character_id_wallet_transactions>> get_characters_character_id_wallet_transactions_holder = new HashMap<>();
    private final Map<Integer, ObservableMap<Long, M_get_blueprints_8>> get_characters_character_id_blueprints_holder = new HashMap<>();
    private final Map<Integer, ObservableList<M_get_bookmarks_9>> get_characters_character_id_bookmarks_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_bookmarks_folders>> get_characters_character_id_bookmarks_folders_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_contacts>> get_characters_character_id_contacts_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_notifications>> get_characters_character_id_notifications_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_online>> get_characters_character_id_online_holder = new HashMap<>();
    private final Map<Integer, ObservableMap<Long, R_get_characters_character_id_orders>> get_characters_character_id_orders_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_roles>> get_characters_character_id_roles_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_skillqueue>> get_characters_character_id_skillqueue_holder = new HashMap<>();
    private final Map<Integer, ObservableList<R_get_characters_character_id_stats>> get_characters_character_id_stats_holder = new HashMap<>();
    private final Map<Integer, ObservableList<M_get_assets_8>> get_characters_character_id_assets_holder = new HashMap<>();
    private final Map<K_1_int_int, Property<R_get_characters_character_id_calendar_event_id>> get_characters_character_id_calendar_event_id_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_clones>> get_characters_character_id_clones_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_mail_labels>> get_characters_character_id_mail_labels_holder = new HashMap<>();
    private final Map<K_18_int_int, Property<R_get_characters_character_id_planets_planet_id>> get_characters_character_id_planets_planet_id_holder = new HashMap<>();
    private final Map<K_19_String_LString_int_Boolean, Property<R_get_characters_character_id_search>> get_characters_character_id_search_holder = new HashMap<>();
    private final Map<Integer, Property<R_get_characters_character_id_skills>> get_characters_character_id_skills_holder = new HashMap<>();
    private final Map<Integer, ObservableMap<Long, M_get_journal_13>> get_characters_character_id_wallet_journal_holder = new HashMap<>();

    public Characters(SwaggerCOCache<?> parent) {
        cache = parent;
    }

    /**
     * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints = remainderPoints + pointsPerDay * days(currentTime - researchStartDate)
     * 
     * cache over {@link Swagger#get_characters_agents_research}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_agents_research> agents_research(int character_id) {
        ObservableList<R_get_characters_character_id_agents_research> ret = get_characters_character_id_agents_research_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_agents_research_holder)
            {
                ret = get_characters_character_id_agents_research_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_agents_research> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_agents_research_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_agents_research", (page, headerHandler) -> (cache.swagger).get_characters_agents_research(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return attributes of a character
     * 
     * cache over {@link Swagger#get_characters_attributes}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_attributes> attributes(int character_id) {
        Property<R_get_characters_character_id_attributes> ret = get_characters_character_id_attributes_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_attributes_holder)
            {
                ret = get_characters_character_id_attributes_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_attributes> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_attributes_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_attributes", headerHandler -> (cache.swagger).get_characters_attributes(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event.
     * 
     * cache over {@link Swagger#get_characters_calendar}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param from_event
     *     The event ID to retrieve events from
     */
    public ObservableList<R_get_characters_character_id_calendar> calendar(int character_id, Integer from_event) {
        K_0_int_Integer param = new K_0_int_Integer(character_id, from_event);
        ObservableList<R_get_characters_character_id_calendar> ret = get_characters_character_id_calendar_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_calendar_holder)
            {
                ret = get_characters_character_id_calendar_holder.get(param);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_calendar> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_calendar_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_calendar", (page, headerHandler) -> (cache.swagger).get_characters_calendar(character_id, from_event, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Get all invited attendees for a given event
     * 
     * cache over {@link Swagger#get_characters_calendar_attendees}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param event_id
     *     The id of the event requested
     */
    public ObservableList<R_get_characters_character_id_calendar_event_id_attendees> calendar_attendees(int character_id, int event_id) {
        K_1_int_int param = new K_1_int_int(event_id, character_id);
        ObservableList<R_get_characters_character_id_calendar_event_id_attendees> ret = get_characters_character_id_calendar_event_id_attendees_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_calendar_event_id_attendees_holder)
            {
                ret = get_characters_character_id_calendar_event_id_attendees_holder.get(param);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_calendar_event_id_attendees> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_calendar_event_id_attendees_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_calendar_event_id_attendees", (page, headerHandler) -> (cache.swagger).get_characters_calendar_attendees(character_id, event_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return custom labels for a character's contacts
     * 
     * cache over {@link Swagger#get_characters_contacts_labels}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<M_get_contacts_labels_2> contacts_labels(int character_id) {
        ObservableList<M_get_contacts_labels_2> ret = get_characters_character_id_contacts_labels_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_contacts_labels_holder)
            {
                ret = get_characters_character_id_contacts_labels_holder.get(character_id);
                if (ret == null) {
                    ObservableList<M_get_contacts_labels_2> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_contacts_labels_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_contacts_labels", (page, headerHandler) -> (cache.swagger).get_characters_contacts_labels(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is "in_progress".
     * 
     * cache over {@link Swagger#get_characters_contracts}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<M_get_contracts_22> contracts(int character_id) {
        ObservableList<M_get_contracts_22> ret = get_characters_character_id_contracts_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_contracts_holder)
            {
                ret = get_characters_character_id_contracts_holder.get(character_id);
                if (ret == null) {
                    ObservableList<M_get_contracts_22> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_contracts_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_contracts", (page, headerHandler) -> (cache.swagger).get_characters_contracts(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Lists bids on a particular auction contract
     * 
     * cache over {@link Swagger#get_characters_contracts_bids}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param contract_id
     *     ID of a contract
     */
    public ObservableMap<Integer, M_get_contracts_contract_bids_4> contracts_bids(int character_id, int contract_id) {
        K_2_int_int param = new K_2_int_int(contract_id, character_id);
        ObservableMap<Integer, M_get_contracts_contract_bids_4> ret = get_characters_character_id_contracts_contract_id_bids_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_contracts_contract_id_bids_holder)
            {
                ret = get_characters_character_id_contracts_contract_id_bids_holder.get(param);
                if (ret == null) {
                    ObservableMap<Integer, M_get_contracts_contract_bids_4> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_contracts_contract_id_bids_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_contracts_contract_id_bids", (page, headerHandler) -> (cache.swagger).get_characters_contracts_bids(character_id, contract_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Integer, M_get_contracts_contract_bids_4> newmap = new LinkedHashMap<>();
                            for (M_get_contracts_contract_bids_4 val: arr) {
                                newmap.put((val.bid_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Lists items of a particular contract
     * 
     * cache over {@link Swagger#get_characters_contracts_items}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param contract_id
     *     ID of a contract
     */
    public ObservableMap<Long, M_get_contracts_contract_items_6> contracts_items(int character_id, int contract_id) {
        K_2_int_int param = new K_2_int_int(contract_id, character_id);
        ObservableMap<Long, M_get_contracts_contract_items_6> ret = get_characters_character_id_contracts_contract_id_items_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_contracts_contract_id_items_holder)
            {
                ret = get_characters_character_id_contracts_contract_id_items_holder.get(param);
                if (ret == null) {
                    ObservableMap<Long, M_get_contracts_contract_items_6> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_contracts_contract_id_items_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_contracts_contract_id_items", (page, headerHandler) -> (cache.swagger).get_characters_contracts_items(character_id, contract_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Long, M_get_contracts_contract_items_6> newmap = new LinkedHashMap<>();
                            for (M_get_contracts_contract_items_6 val: arr) {
                                newmap.put((val.record_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a character's jump activation and fatigue information
     * 
     * cache over {@link Swagger#get_characters_fatigue}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_fatigue> fatigue(int character_id) {
        Property<R_get_characters_character_id_fatigue> ret = get_characters_character_id_fatigue_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_fatigue_holder)
            {
                ret = get_characters_character_id_fatigue_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_fatigue> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_fatigue_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_fatigue", headerHandler -> (cache.swagger).get_characters_fatigue(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return fittings of a character
     * 
     * cache over {@link Swagger#get_characters_fittings}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_fittings> fittings(int character_id) {
        ObservableList<R_get_characters_character_id_fittings> ret = get_characters_character_id_fittings_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_fittings_holder)
            {
                ret = get_characters_character_id_fittings_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_fittings> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_fittings_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_fittings", (page, headerHandler) -> (cache.swagger).get_characters_fittings(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return the fleet ID the character is in, if any.
     * 
     * cache over {@link Swagger#get_characters_fleet}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_fleet> fleet(int character_id) {
        Property<R_get_characters_character_id_fleet> ret = get_characters_character_id_fleet_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_fleet_holder)
            {
                ret = get_characters_character_id_fleet_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_fleet> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_fleet_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_fleet", headerHandler -> (cache.swagger).get_characters_fleet(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Statistical overview of a character involved in faction warfare
     * 
     * cache over {@link Swagger#get_characters_fw_stats}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_fw_stats> fw_stats(int character_id) {
        Property<R_get_characters_character_id_fw_stats> ret = get_characters_character_id_fw_stats_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_fw_stats_holder)
            {
                ret = get_characters_character_id_fw_stats_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_fw_stats> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_fw_stats_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_fw_stats", headerHandler -> (cache.swagger).get_characters_fw_stats(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return implants on the active clone of a character
     * 
     * cache over {@link Swagger#get_characters_implants}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<Integer> implants(int character_id) {
        ObservableList<Integer> ret = get_characters_character_id_implants_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_implants_holder)
            {
                ret = get_characters_character_id_implants_holder.get(character_id);
                if (ret == null) {
                    ObservableList<Integer> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_implants_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_implants", (page, headerHandler) -> IntStream.of((cache.swagger).get_characters_implants(character_id, headerHandler)).mapToObj((Integer::valueOf)).toArray((Integer[]::new)), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * List industry jobs placed by a character
     * 
     * cache over {@link Swagger#get_characters_industry_jobs}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param include_completed
     *     Whether retrieve completed character industry jobs as well
     */
    public ObservableMap<Integer, R_get_characters_character_id_industry_jobs> industry_jobs(int character_id, Boolean include_completed) {
        K_3_Boolean_int param = new K_3_Boolean_int(include_completed, character_id);
        ObservableMap<Integer, R_get_characters_character_id_industry_jobs> ret = get_characters_character_id_industry_jobs_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_industry_jobs_holder)
            {
                ret = get_characters_character_id_industry_jobs_holder.get(param);
                if (ret == null) {
                    ObservableMap<Integer, R_get_characters_character_id_industry_jobs> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_industry_jobs_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_industry_jobs", (page, headerHandler) -> (cache.swagger).get_characters_industry_jobs(character_id, include_completed, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Integer, R_get_characters_character_id_industry_jobs> newmap = new LinkedHashMap<>();
                            for (R_get_characters_character_id_industry_jobs val: arr) {
                                newmap.put((val.job_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of a character's kills and losses going back 90 days
     * 
     * cache over {@link Swagger#get_characters_killmails_recent}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<M_get_killmails_2> killmails_recent(int character_id) {
        ObservableList<M_get_killmails_2> ret = get_characters_character_id_killmails_recent_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_killmails_recent_holder)
            {
                ret = get_characters_character_id_killmails_recent_holder.get(character_id);
                if (ret == null) {
                    ObservableList<M_get_killmails_2> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_killmails_recent_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_killmails_recent", (page, headerHandler) -> (cache.swagger).get_characters_killmails_recent(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.
     * 
     * cache over {@link Swagger#get_characters_location}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_location> location(int character_id) {
        Property<R_get_characters_character_id_location> ret = get_characters_character_id_location_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_location_holder)
            {
                ret = get_characters_character_id_location_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_location> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_location_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_location", headerHandler -> (cache.swagger).get_characters_location(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of loyalty points for all corporations the character has worked for
     * 
     * cache over {@link Swagger#get_characters_loyalty_points}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_loyalty_points> loyalty_points(int character_id) {
        ObservableList<R_get_characters_character_id_loyalty_points> ret = get_characters_character_id_loyalty_points_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_loyalty_points_holder)
            {
                ret = get_characters_character_id_loyalty_points_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_loyalty_points> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_loyalty_points_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_loyalty_points", (page, headerHandler) -> (cache.swagger).get_characters_loyalty_points(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.
     * 
     * cache over {@link Swagger#get_characters_mail}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param labels
     *     Fetch only mails that match one or more of the given labels
     * @param last_mail_id
     *     List only mail with an ID lower than the given ID, if present
     */
    public ObservableList<R_get_characters_character_id_mail> mail(int character_id, int[] labels, Integer last_mail_id) {
        K_4_Integer_int_Lint param = new K_4_Integer_int_Lint(last_mail_id, character_id, labels);
        ObservableList<R_get_characters_character_id_mail> ret = get_characters_character_id_mail_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_mail_holder)
            {
                ret = get_characters_character_id_mail_holder.get(param);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_mail> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_mail_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_mail", (page, headerHandler) -> (cache.swagger).get_characters_mail(character_id, labels, last_mail_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return all mailing lists that the character is subscribed to
     * 
     * cache over {@link Swagger#get_characters_mail_lists}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_mail_lists> mail_lists(int character_id) {
        ObservableList<R_get_characters_character_id_mail_lists> ret = get_characters_character_id_mail_lists_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_mail_lists_holder)
            {
                ret = get_characters_character_id_mail_lists_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_mail_lists> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_mail_lists_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_mail_lists", (page, headerHandler) -> (cache.swagger).get_characters_mail_lists(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return the contents of an EVE mail
     * 
     * cache over {@link Swagger#get_characters_mail}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param mail_id
     *     An EVE mail ID
     */
    public Property<R_get_characters_character_id_mail_mail_id> mail(int character_id, int mail_id) {
        K_5_int_int param = new K_5_int_int(mail_id, character_id);
        Property<R_get_characters_character_id_mail_mail_id> ret = get_characters_character_id_mail_mail_id_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_mail_mail_id_holder)
            {
                ret = get_characters_character_id_mail_mail_id_holder.get(param);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_mail_mail_id> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_mail_mail_id_holder.put(param, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_mail_mail_id", headerHandler -> (cache.swagger).get_characters_mail(character_id, mail_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of medals the character has
     * 
     * cache over {@link Swagger#get_characters_medals}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_medals> medals(int character_id) {
        ObservableList<R_get_characters_character_id_medals> ret = get_characters_character_id_medals_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_medals_holder)
            {
                ret = get_characters_character_id_medals_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_medals> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_medals_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_medals", (page, headerHandler) -> (cache.swagger).get_characters_medals(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Paginated record of all mining done by a character for the past 30 days
     * 
     * cache over {@link Swagger#get_characters_mining}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_mining> mining(int character_id) {
        ObservableList<R_get_characters_character_id_mining> ret = get_characters_character_id_mining_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_mining_holder)
            {
                ret = get_characters_character_id_mining_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_mining> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_mining_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_mining", (page, headerHandler) -> (cache.swagger).get_characters_mining(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return notifications about having been added to someone's contact list
     * 
     * cache over {@link Swagger#get_characters_notifications_contacts}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_notifications_contacts> notifications_contacts(int character_id) {
        ObservableList<R_get_characters_character_id_notifications_contacts> ret = get_characters_character_id_notifications_contacts_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_notifications_contacts_holder)
            {
                ret = get_characters_character_id_notifications_contacts_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_notifications_contacts> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_notifications_contacts_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_notifications_contacts", (page, headerHandler) -> (cache.swagger).get_characters_notifications_contacts(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of tasks finished by a character
     * 
     * cache over {@link Swagger#get_characters_opportunities}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_opportunities> opportunities(int character_id) {
        ObservableList<R_get_characters_character_id_opportunities> ret = get_characters_character_id_opportunities_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_opportunities_holder)
            {
                ret = get_characters_character_id_opportunities_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_opportunities> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_opportunities_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_opportunities", (page, headerHandler) -> (cache.swagger).get_characters_opportunities(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * List cancelled and expired market orders placed by a character up to 90 days in the past.
     * 
     * cache over {@link Swagger#get_characters_orders_history}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableMap<Long, R_get_characters_character_id_orders_history> orders_history(int character_id) {
        ObservableMap<Long, R_get_characters_character_id_orders_history> ret = get_characters_character_id_orders_history_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_orders_history_holder)
            {
                ret = get_characters_character_id_orders_history_holder.get(character_id);
                if (ret == null) {
                    ObservableMap<Long, R_get_characters_character_id_orders_history> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_orders_history_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_orders_history", (page, headerHandler) -> (cache.swagger).get_characters_orders_history(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Long, R_get_characters_character_id_orders_history> newmap = new LinkedHashMap<>();
                            for (R_get_characters_character_id_orders_history val: arr) {
                                newmap.put((val.order_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns a list of all planetary colonies owned by a character.
     * 
     * cache over {@link Swagger#get_characters_planets}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_planets> planets(int character_id) {
        ObservableList<R_get_characters_character_id_planets> ret = get_characters_character_id_planets_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_planets_holder)
            {
                ret = get_characters_character_id_planets_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_planets> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_planets_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_planets", (page, headerHandler) -> (cache.swagger).get_characters_planets(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Get the current ship type, name and id
     * 
     * cache over {@link Swagger#get_characters_ship}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_ship> ship(int character_id) {
        Property<R_get_characters_character_id_ship> ret = get_characters_character_id_ship_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_ship_holder)
            {
                ret = get_characters_character_id_ship_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_ship> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_ship_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_ship", headerHandler -> (cache.swagger).get_characters_ship(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return character standings from agents, NPC corporations, and factions
     * 
     * cache over {@link Swagger#get_characters_standings}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<M_get_standings_3> standings(int character_id) {
        ObservableList<M_get_standings_3> ret = get_characters_character_id_standings_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_standings_holder)
            {
                ret = get_characters_character_id_standings_holder.get(character_id);
                if (ret == null) {
                    ObservableList<M_get_standings_3> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_standings_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_standings", (page, headerHandler) -> (cache.swagger).get_characters_standings(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns a character's titles
     * 
     * cache over {@link Swagger#get_characters_titles}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_titles> titles(int character_id) {
        ObservableList<R_get_characters_character_id_titles> ret = get_characters_character_id_titles_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_titles_holder)
            {
                ret = get_characters_character_id_titles_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_titles> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_titles_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_titles", (page, headerHandler) -> (cache.swagger).get_characters_titles(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns a character's wallet balance
     * 
     * cache over {@link Swagger#get_characters_wallet}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<Double> wallet(int character_id) {
        Property<Double> ret = get_characters_character_id_wallet_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_wallet_holder)
            {
                ret = get_characters_character_id_wallet_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<Double> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_wallet_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_wallet", headerHandler -> (cache.swagger).get_characters_wallet(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Get wallet transactions of a character
     * 
     * cache over {@link Swagger#get_characters_wallet_transactions}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param from_id
     *     Only show transactions happened before the one referenced by this id
     */
    public ObservableMap<Long, R_get_characters_character_id_wallet_transactions> wallet_transactions(int character_id, Long from_id) {
        K_6_Long_int param = new K_6_Long_int(from_id, character_id);
        ObservableMap<Long, R_get_characters_character_id_wallet_transactions> ret = get_characters_character_id_wallet_transactions_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_wallet_transactions_holder)
            {
                ret = get_characters_character_id_wallet_transactions_holder.get(param);
                if (ret == null) {
                    ObservableMap<Long, R_get_characters_character_id_wallet_transactions> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_wallet_transactions_holder.put(param, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_wallet_transactions", (page, headerHandler) -> (cache.swagger).get_characters_wallet_transactions(character_id, from_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Long, R_get_characters_character_id_wallet_transactions> newmap = new LinkedHashMap<>();
                            for (R_get_characters_character_id_wallet_transactions val: arr) {
                                newmap.put((val.transaction_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of blueprints the character owns
     * 
     * cache over {@link Swagger#get_characters_blueprints}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableMap<Long, M_get_blueprints_8> blueprints(int character_id) {
        ObservableMap<Long, M_get_blueprints_8> ret = get_characters_character_id_blueprints_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_blueprints_holder)
            {
                ret = get_characters_character_id_blueprints_holder.get(character_id);
                if (ret == null) {
                    ObservableMap<Long, M_get_blueprints_8> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_blueprints_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_blueprints", (page, headerHandler) -> (cache.swagger).get_characters_blueprints(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Long, M_get_blueprints_8> newmap = new LinkedHashMap<>();
                            for (M_get_blueprints_8 val: arr) {
                                newmap.put((val.item_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * A list of your character's personal bookmarks
     * 
     * cache over {@link Swagger#get_characters_bookmarks}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<M_get_bookmarks_9> bookmarks(int character_id) {
        ObservableList<M_get_bookmarks_9> ret = get_characters_character_id_bookmarks_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_bookmarks_holder)
            {
                ret = get_characters_character_id_bookmarks_holder.get(character_id);
                if (ret == null) {
                    ObservableList<M_get_bookmarks_9> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_bookmarks_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_bookmarks", (page, headerHandler) -> (cache.swagger).get_characters_bookmarks(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * A list of your character's personal bookmark folders
     * 
     * cache over {@link Swagger#get_characters_bookmarks_folders}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_bookmarks_folders> bookmarks_folders(int character_id) {
        ObservableList<R_get_characters_character_id_bookmarks_folders> ret = get_characters_character_id_bookmarks_folders_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_bookmarks_folders_holder)
            {
                ret = get_characters_character_id_bookmarks_folders_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_bookmarks_folders> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_bookmarks_folders_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_bookmarks_folders", (page, headerHandler) -> (cache.swagger).get_characters_bookmarks_folders(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return contacts of a character
     * 
     * cache over {@link Swagger#get_characters_contacts}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_contacts> contacts(int character_id) {
        ObservableList<R_get_characters_character_id_contacts> ret = get_characters_character_id_contacts_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_contacts_holder)
            {
                ret = get_characters_character_id_contacts_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_contacts> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_contacts_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_contacts", (page, headerHandler) -> (cache.swagger).get_characters_contacts(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return character notifications
     * 
     * cache over {@link Swagger#get_characters_notifications}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_notifications> notifications(int character_id) {
        ObservableList<R_get_characters_character_id_notifications> ret = get_characters_character_id_notifications_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_notifications_holder)
            {
                ret = get_characters_character_id_notifications_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_notifications> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_notifications_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_notifications", (page, headerHandler) -> (cache.swagger).get_characters_notifications(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Checks if the character is currently online
     * 
     * cache over {@link Swagger#get_characters_online}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_online> online(int character_id) {
        Property<R_get_characters_character_id_online> ret = get_characters_character_id_online_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_online_holder)
            {
                ret = get_characters_character_id_online_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_online> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_online_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_online", headerHandler -> (cache.swagger).get_characters_online(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * List open market orders placed by a character
     * 
     * cache over {@link Swagger#get_characters_orders}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableMap<Long, R_get_characters_character_id_orders> orders(int character_id) {
        ObservableMap<Long, R_get_characters_character_id_orders> ret = get_characters_character_id_orders_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_orders_holder)
            {
                ret = get_characters_character_id_orders_holder.get(character_id);
                if (ret == null) {
                    ObservableMap<Long, R_get_characters_character_id_orders> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_orders_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_orders", (page, headerHandler) -> (cache.swagger).get_characters_orders(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Long, R_get_characters_character_id_orders> newmap = new LinkedHashMap<>();
                            for (R_get_characters_character_id_orders val: arr) {
                                newmap.put((val.order_id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns a character's corporation roles
     * 
     * cache over {@link Swagger#get_characters_roles}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_roles> roles(int character_id) {
        Property<R_get_characters_character_id_roles> ret = get_characters_character_id_roles_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_roles_holder)
            {
                ret = get_characters_character_id_roles_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_roles> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_roles_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_roles", headerHandler -> (cache.swagger).get_characters_roles(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * List the configured skill queue for the given character
     * 
     * cache over {@link Swagger#get_characters_skillqueue}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_skillqueue> skillqueue(int character_id) {
        ObservableList<R_get_characters_character_id_skillqueue> ret = get_characters_character_id_skillqueue_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_skillqueue_holder)
            {
                ret = get_characters_character_id_skillqueue_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_skillqueue> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_skillqueue_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_skillqueue", (page, headerHandler) -> (cache.swagger).get_characters_skillqueue(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns aggregate yearly stats for a character
     * 
     * cache over {@link Swagger#get_characters_stats}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<R_get_characters_character_id_stats> stats(int character_id) {
        ObservableList<R_get_characters_character_id_stats> ret = get_characters_character_id_stats_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_stats_holder)
            {
                ret = get_characters_character_id_stats_holder.get(character_id);
                if (ret == null) {
                    ObservableList<R_get_characters_character_id_stats> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_stats_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_stats", (page, headerHandler) -> (cache.swagger).get_characters_stats(character_id, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of the characters assets
     * 
     * cache over {@link Swagger#get_characters_assets}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableList<M_get_assets_8> assets(int character_id) {
        ObservableList<M_get_assets_8> ret = get_characters_character_id_assets_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_assets_holder)
            {
                ret = get_characters_character_id_assets_holder.get(character_id);
                if (ret == null) {
                    ObservableList<M_get_assets_8> finalret = FXCollections.observableArrayList();
                    ret = finalret;
                    ret.add(null);
                    get_characters_character_id_assets_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_assets", (page, headerHandler) -> (cache.swagger).get_characters_assets(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            finalret.setAll(arr);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Get all the information for a specific event
     * 
     * cache over {@link Swagger#get_characters_calendar}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param event_id
     *     The id of the event requested
     */
    public Property<R_get_characters_character_id_calendar_event_id> calendar(int character_id, int event_id) {
        K_1_int_int param = new K_1_int_int(event_id, character_id);
        Property<R_get_characters_character_id_calendar_event_id> ret = get_characters_character_id_calendar_event_id_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_calendar_event_id_holder)
            {
                ret = get_characters_character_id_calendar_event_id_holder.get(param);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_calendar_event_id> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_calendar_event_id_holder.put(param, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_calendar_event_id", headerHandler -> (cache.swagger).get_characters_calendar(character_id, event_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * A list of the character's clones
     * 
     * cache over {@link Swagger#get_characters_clones}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_clones> clones(int character_id) {
        Property<R_get_characters_character_id_clones> ret = get_characters_character_id_clones_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_clones_holder)
            {
                ret = get_characters_character_id_clones_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_clones> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_clones_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_clones", headerHandler -> (cache.swagger).get_characters_clones(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Return a list of the users mail labels, unread counts for each label and a total unread count.
     * 
     * cache over {@link Swagger#get_characters_mail_labels}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_mail_labels> mail_labels(int character_id) {
        Property<R_get_characters_character_id_mail_labels> ret = get_characters_character_id_mail_labels_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_mail_labels_holder)
            {
                ret = get_characters_character_id_mail_labels_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_mail_labels> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_mail_labels_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_mail_labels", headerHandler -> (cache.swagger).get_characters_mail_labels(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.
     * 
     * cache over {@link Swagger#get_characters_planets}<br />
     * 
     * @param character_id
     *     An EVE character ID
     * @param planet_id
     *     Planet id of the target planet
     */
    public Property<R_get_characters_character_id_planets_planet_id> planets(int character_id, int planet_id) {
        K_18_int_int param = new K_18_int_int(planet_id, character_id);
        Property<R_get_characters_character_id_planets_planet_id> ret = get_characters_character_id_planets_planet_id_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_planets_planet_id_holder)
            {
                ret = get_characters_character_id_planets_planet_id_holder.get(param);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_planets_planet_id> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_planets_planet_id_holder.put(param, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_planets_planet_id", headerHandler -> (cache.swagger).get_characters_planets(character_id, planet_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Search for entities that match a given sub-string.
     * 
     * cache over {@link Swagger#get_characters}<br />
     * 
     * @param categories
     *     Type of entities to search for
     * @param character_id
     *     An EVE character ID
     * @param search
     *     The string to search on
     * @param strict
     *     Whether the search should be a strict match
     */
    public Property<R_get_characters_character_id_search> get(String[] categories, int character_id, String search, Boolean strict) {
        K_19_String_LString_int_Boolean param = new K_19_String_LString_int_Boolean(search, categories, character_id, strict);
        Property<R_get_characters_character_id_search> ret = get_characters_character_id_search_holder.get(param);
        if (ret == null) {
            synchronized (get_characters_character_id_search_holder)
            {
                ret = get_characters_character_id_search_holder.get(param);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_search> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_search_holder.put(param, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_search", headerHandler -> (cache.swagger).get_characters(categories, character_id, search, strict, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * List all trained skills for the given character
     * 
     * cache over {@link Swagger#get_characters_skills}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public Property<R_get_characters_character_id_skills> skills(int character_id) {
        Property<R_get_characters_character_id_skills> ret = get_characters_character_id_skills_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_skills_holder)
            {
                ret = get_characters_character_id_skills_holder.get(character_id);
                if (ret == null) {
                    SimpleObjectProperty<R_get_characters_character_id_skills> finalret = new SimpleObjectProperty<>();
                    ret = finalret;
                    ret.setValue(null);
                    get_characters_character_id_skills_holder.put(character_id, ret);
                    (cache).addFetchCacheObject("get_characters_character_id_skills", headerHandler -> (cache.swagger).get_characters_skills(character_id, headerHandler), item -> {
                        synchronized (finalret)
                        {
                            finalret.set(item);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }

    /**
     * Retrieve the given character's wallet journal going 30 days back
     * 
     * cache over {@link Swagger#get_characters_wallet_journal}<br />
     * 
     * @param character_id
     *     An EVE character ID
     */
    public ObservableMap<Long, M_get_journal_13> wallet_journal(int character_id) {
        ObservableMap<Long, M_get_journal_13> ret = get_characters_character_id_wallet_journal_holder.get(character_id);
        if (ret == null) {
            synchronized (get_characters_character_id_wallet_journal_holder)
            {
                ret = get_characters_character_id_wallet_journal_holder.get(character_id);
                if (ret == null) {
                    ObservableMap<Long, M_get_journal_13> finalret = FXCollections.observableHashMap();
                    ret = finalret;
                    ret.put(null, null);
                    get_characters_character_id_wallet_journal_holder.put(character_id, ret);
                    (cache).addFetchCacheArray("get_characters_character_id_wallet_journal", (page, headerHandler) -> (cache.swagger).get_characters_wallet_journal(character_id, page, headerHandler), arr -> {
                        synchronized (finalret)
                        {
                            LinkedHashMap<Long, M_get_journal_13> newmap = new LinkedHashMap<>();
                            for (M_get_journal_13 val: arr) {
                                newmap.put((val.id), (val));
                            }
                            finalret.entrySet();
                            finalret.putAll(newmap);
                        }
                    }
                    );
                }
            }
        }
        return ret;
    }
}
