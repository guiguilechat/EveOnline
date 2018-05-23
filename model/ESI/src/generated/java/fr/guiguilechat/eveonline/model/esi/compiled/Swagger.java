package fr.guiguilechat.eveonline.model.esi.compiled;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id_contacts;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id_contacts_labels;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id_icons;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_names;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_agents_research;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_assets;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_attributes;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_blueprints;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_bookmarks;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_bookmarks_folders;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_calendar;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_calendar_event_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_calendar_event_id_attendees;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_clones;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contacts;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contacts_labels;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contracts;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contracts_contract_id_bids;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contracts_contract_id_items;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_corporationhistory;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fatigue;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fittings;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fleet;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fw_stats;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_industry_jobs;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_killmails_recent;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_location;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_loyalty_points;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail_labels;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail_lists;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail_mail_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_medals;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mining;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_notifications;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_notifications_contacts;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_online;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_opportunities;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_orders;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_orders_history;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_planets;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_planets_planet_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_portrait;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_roles;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_search;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_ship;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_skillqueue;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_skills;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_standings;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_stats;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_titles;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_wallet_journal;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_wallet_transactions;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_names;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporation_corporation_id_mining_extractions;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporation_corporation_id_mining_observers;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporation_corporation_id_mining_observers_observer_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_alliancehistory;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_assets;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_blueprints;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_bookmarks;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_bookmarks_folders;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contacts;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contacts_labels;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_containers_logs;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contracts;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contracts_contract_id_bids;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contracts_contract_id_items;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_customs_offices;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_divisions;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_facilities;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_fw_stats;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_icons;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_industry_jobs;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_killmails_recent;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_medals;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_medals_issued;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_members_titles;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_membertracking;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_orders;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_orders_history;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_outposts_outpost_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_roles;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_roles_history;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_shareholders;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_standings;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_starbases;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_starbases_starbase_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_structures;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_titles;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_wallets;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_wallets_division_journal;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_wallets_division_transactions;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_names;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_dogma_attributes_attribute_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_dogma_effects_effect_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fleets_fleet_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fleets_fleet_id_members;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fleets_fleet_id_wings;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_leaderboards;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_leaderboards_characters;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_leaderboards_corporations;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_stats;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_systems;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_wars;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_incursions;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_industry_facilities;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_industry_systems;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_insurance_prices;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_killmails_killmail_id_killmail_hash;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_loyalty_stores_corporation_id_offers;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_groups_market_group_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_prices;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_region_id_history;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_region_id_orders;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_structures_structure_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_opportunities_groups_group_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_opportunities_tasks_task_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_search;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_sovereignty_campaigns;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_sovereignty_map;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_sovereignty_structures;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_status;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_ancestries;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_asteroid_belts_asteroid_belt_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_bloodlines;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_categories_category_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_constellations_constellation_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_factions;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_graphics_graphic_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_groups_group_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_moons_moon_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_planets_planet_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_races;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_regions_region_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_schematics_schematic_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_stargates_stargate_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_stars_star_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_stations_station_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_structures_structure_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_system_jumps;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_system_kills;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_systems_system_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_types_type_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_wars_war_id;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_wars_war_id_killmails;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_affiliation;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_character_id_assets_locations;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_character_id_assets_names;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_character_id_fittings_created;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_corporations_corporation_id_assets_locations;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_corporations_corporation_id_assets_names;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_fleets_fleet_id_wings_created;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_fleets_fleet_id_wings_wing_id_squads_created;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_universe_ids;
import fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_universe_names;

public interface Swagger {
    public final static String[] SCOPES = new String[] {"esi-characters.write_contacts.v1", "esi-skills.read_skills.v1", "esi-characters.read_fatigue.v1", "esi-corporations.read_divisions.v1", "esi-corporations.read_corporation_membership.v1", "esi-bookmarks.read_character_bookmarks.v1", "esi-assets.read_corporation_assets.v1", "esi-fittings.read_fittings.v1", "esi-contracts.read_corporation_contracts.v1", "esi-fleets.write_fleet.v1", "esi-ui.write_waypoint.v1", "esi-industry.read_character_jobs.v1", "esi-bookmarks.read_corporation_bookmarks.v1", "esi-clones.read_clones.v1", "esi-industry.read_character_mining.v1", "esi-characters.read_agents_research.v1", "esi-calendar.respond_calendar_events.v1", "esi-location.read_online.v1", "esi-mail.read_mail.v1", "esi-characterstats.read.v1", "esi-search.search_structures.v1", "esi-corporations.read_contacts.v1", "esi-corporations.read_container_logs.v1", "esi-characters.read_contacts.v1", "esi-fittings.write_fittings.v1", "esi-markets.structure_markets.v1", "esi-wallet.read_corporation_wallets.v1", "esi-characters.read_corporation_roles.v1", "esi-wallet.read_character_wallet.v1", "esi-assets.read_assets.v1", "esi-killmails.read_killmails.v1", "esi-characters.read_medals.v1", "esi-location.read_ship_type.v1", "esi-skills.read_skillqueue.v1", "esi-contracts.read_character_contracts.v1", "esi-mail.send_mail.v1", "esi-alliances.read_contacts.v1", "esi-location.read_location.v1", "esi-ui.open_window.v1", "esi-fleets.read_fleet.v1", "esi-industry.read_corporation_mining.v1", "esi-corporations.read_blueprints.v1", "esi-calendar.read_calendar_events.v1", "esi-markets.read_character_orders.v1", "esi-markets.read_corporation_orders.v1", "esi-characters.read_notifications.v1", "esi-characters.read_standings.v1", "esi-characters.read_opportunities.v1", "esi-corporations.read_standings.v1", "esi-industry.read_corporation_jobs.v1", "esi-characters.read_fw_stats.v1", "esi-corporations.read_titles.v1", "esi-universe.read_structures.v1", "esi-corporations.track_members.v1", "esi-corporations.read_fw_stats.v1", "esi-characters.read_loyalty.v1", "esi-mail.organize_mail.v1", "esi-corporations.read_structures.v1", "esi-corporations.read_outposts.v1", "esi-corporations.read_starbases.v1", "esi-clones.read_implants.v1", "esi-killmails.read_corporation_killmails.v1", "esi-corporations.read_medals.v1", "esi-planets.manage_planets.v1", "esi-characters.read_titles.v1", "esi-corporations.read_facilities.v1", "esi-characters.read_blueprints.v1", "esi-planets.read_customs_offices.v1"};
    /**
     * the roles required for {@link #get_corporation_corporation_id_mining_extractions this method}
     */
    public final static String[] GET_CORPORATION_CORPORATION_ID_MINING_EXTRACTIONS_ROLES = new String[] {"Structure_manager"};
    /**
     * the roles required for {@link #get_corporation_corporation_id_mining_observers this method}
     */
    public final static String[] GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_ROLES = new String[] {"Accountant"};
    /**
     * the roles required for {@link #get_corporation_corporation_id_mining_observers_observer_id this method}
     */
    public final static String[] GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_OBSERVER_ID_ROLES = new String[] {"Accountant"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_assets this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_ASSETS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #post_corporations_corporation_id_assets_locations this method}
     */
    public final static String[] POST_CORPORATIONS_CORPORATION_ID_ASSETS_LOCATIONS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #post_corporations_corporation_id_assets_names this method}
     */
    public final static String[] POST_CORPORATIONS_CORPORATION_ID_ASSETS_NAMES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_blueprints this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_BLUEPRINTS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_containers_logs this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_CONTAINERS_LOGS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_customs_offices this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_CUSTOMS_OFFICES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_divisions this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_DIVISIONS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_facilities this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_FACILITIES_ROLES = new String[] {"Factory_Manager"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_industry_jobs this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_INDUSTRY_JOBS_ROLES = new String[] {"FactoryManager"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_killmails_recent this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_KILLMAILS_RECENT_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_medals_issued this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_MEDALS_ISSUED_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_members_limit this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_MEMBERS_LIMIT_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_members_titles this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_MEMBERS_TITLES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_membertracking this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_MEMBERTRACKING_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_orders this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_ORDERS_ROLES = new String[] {"Accountant", "Trader"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_orders_history this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_ORDERS_HISTORY_ROLES = new String[] {"Accountant", "Trader"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_outposts this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_OUTPOSTS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_outposts_outpost_id this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_OUTPOSTS_OUTPOST_ID_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_roles_history this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_ROLES_HISTORY_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_shareholders this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_SHAREHOLDERS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_starbases this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_STARBASES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_starbases_starbase_id this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_STARBASES_STARBASE_ID_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_structures this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_STRUCTURES_ROLES = new String[] {"StationManager"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_titles this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_TITLES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_wallets this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_ROLES = new String[] {"Accountant", "Junior_Accountant"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_wallets_division_journal this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_JOURNAL_ROLES = new String[] {"Accountant", "Junior_Accountant"};
    /**
     * the roles required for {@link #get_corporations_corporation_id_wallets_division_transactions this method}
     */
    public final static String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_TRANSACTIONS_ROLES = new String[] {"Accountant", "Junior_Accountant"};

    public String flatten(Object o);

    public String connectGet(String url, boolean connected, Map<String, List<String>> headerHandler);

    public String connectPost(String url, Map<String, Object> content, boolean connected, Map<String, List<String>> headerHandler);

    public<T> T convert(String line, Class<? extends T> clazz);

    public default int[] get_alliances(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_alliances_names[] get_alliances_names(int[] alliance_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/names/"+"?"+(alliance_ids==null?"":"&alliance_ids="+flatten(alliance_ids)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_names[].class));
    }

    public default R_get_alliances_alliance_id get_alliances_alliance_id(int alliance_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/{alliance_id}/".replace("{alliance_id}", ""+alliance_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id.class));
    }

    public default R_get_alliances_alliance_id_contacts[] get_alliances_alliance_id_contacts(int alliance_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/{alliance_id}/contacts/".replace("{alliance_id}", ""+alliance_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id_contacts[].class));
    }

    public default R_get_alliances_alliance_id_contacts_labels[] get_alliances_alliance_id_contacts_labels(int alliance_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/{alliance_id}/contacts/labels/".replace("{alliance_id}", ""+alliance_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id_contacts_labels[].class));
    }

    public default int[] get_alliances_alliance_id_corporations(int alliance_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/{alliance_id}/corporations/".replace("{alliance_id}", ""+alliance_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_alliances_alliance_id_icons get_alliances_alliance_id_icons(int alliance_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/alliances/{alliance_id}/icons/".replace("{alliance_id}", ""+alliance_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_alliances_alliance_id_icons.class));
    }

    public default R_post_characters_affiliation[] post_characters_affiliation(int[] characters, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/affiliation/");
        Map<String, Object> content = new HashMap<>();
        content.put("characters", characters);
        String fetched = connectPost(url, content, false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_affiliation[].class));
    }

    public default R_get_characters_names[] get_characters_names(long[] character_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/names/"+"?"+(character_ids==null?"":"&character_ids="+flatten(character_ids)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_names[].class));
    }

    public default R_get_characters_character_id get_characters_character_id(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id.class));
    }

    public default R_get_characters_character_id_agents_research[] get_characters_character_id_agents_research(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/agents_research/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_agents_research[].class));
    }

    public default R_get_characters_character_id_assets[] get_characters_character_id_assets(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/assets/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_assets[].class));
    }

    public default R_post_characters_character_id_assets_locations[] post_characters_character_id_assets_locations(int character_id, long[] item_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/assets/locations/".replace("{character_id}", ""+character_id));
        Map<String, Object> content = new HashMap<>();
        content.put("item_ids", item_ids);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_character_id_assets_locations[].class));
    }

    public default R_post_characters_character_id_assets_names[] post_characters_character_id_assets_names(int character_id, long[] item_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/assets/names/".replace("{character_id}", ""+character_id));
        Map<String, Object> content = new HashMap<>();
        content.put("item_ids", item_ids);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_character_id_assets_names[].class));
    }

    public default R_get_characters_character_id_attributes get_characters_character_id_attributes(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/attributes/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_attributes.class));
    }

    public default R_get_characters_character_id_blueprints[] get_characters_character_id_blueprints(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/blueprints/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_blueprints[].class));
    }

    public default R_get_characters_character_id_bookmarks[] get_characters_character_id_bookmarks(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/bookmarks/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_bookmarks[].class));
    }

    public default R_get_characters_character_id_bookmarks_folders[] get_characters_character_id_bookmarks_folders(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/bookmarks/folders/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_bookmarks_folders[].class));
    }

    public default R_get_characters_character_id_calendar[] get_characters_character_id_calendar(int character_id, Integer from_event, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/calendar/".replace("{character_id}", ""+character_id)+"?"+(from_event==null?"":"&from_event="+flatten(from_event)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_calendar[].class));
    }

    public default R_get_characters_character_id_calendar_event_id get_characters_character_id_calendar_event_id(int character_id, int event_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/calendar/{event_id}/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_calendar_event_id.class));
    }

    public default R_get_characters_character_id_calendar_event_id_attendees[] get_characters_character_id_calendar_event_id_attendees(int character_id, int event_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/calendar/{event_id}/attendees/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_calendar_event_id_attendees[].class));
    }

    public default R_get_characters_character_id_clones get_characters_character_id_clones(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/clones/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_clones.class));
    }

    public default R_get_characters_character_id_contacts[] get_characters_character_id_contacts(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contacts[].class));
    }

    public default int[] post_characters_character_id_contacts(int character_id, int[] contact_ids, Long label_id, float standing, Boolean watched, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(label_id==null?"":"&label_id="+flatten(label_id))+"&standing="+flatten(standing)+(watched==null?"":"&watched="+flatten(watched)));
        Map<String, Object> content = new HashMap<>();
        content.put("contact_ids", contact_ids);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_characters_character_id_contacts_labels[] get_characters_character_id_contacts_labels(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/contacts/labels/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contacts_labels[].class));
    }

    public default R_get_characters_character_id_contracts[] get_characters_character_id_contracts(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/contracts/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contracts[].class));
    }

    public default R_get_characters_character_id_contracts_contract_id_bids[] get_characters_character_id_contracts_contract_id_bids(int character_id, int contract_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/contracts/{contract_id}/bids/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contracts_contract_id_bids[].class));
    }

    public default R_get_characters_character_id_contracts_contract_id_items[] get_characters_character_id_contracts_contract_id_items(int character_id, int contract_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/contracts/{contract_id}/items/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_contracts_contract_id_items[].class));
    }

    public default R_get_characters_character_id_corporationhistory[] get_characters_character_id_corporationhistory(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/corporationhistory/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_corporationhistory[].class));
    }

    public default float post_characters_character_id_cspa(int character_id, int[] characters, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/cspa/".replace("{character_id}", ""+character_id));
        Map<String, Object> content = new HashMap<>();
        content.put("characters", characters);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (float.class));
    }

    public default R_get_characters_character_id_fatigue get_characters_character_id_fatigue(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/fatigue/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fatigue.class));
    }

    public default R_get_characters_character_id_fittings[] get_characters_character_id_fittings(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fittings[].class));
    }

    public default R_post_characters_character_id_fittings_created post_characters_character_id_fittings(int character_id, String description, fr.guiguilechat.eveonline.model.esi.compiled.structures.items[] items, String name, int ship_type_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id));
        Map<String, Object> content = new HashMap<>();
        content.put("description", description);
        content.put("items", items);
        content.put("name", name);
        content.put("ship_type_id", ship_type_id);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_characters_character_id_fittings_created.class));
    }

    public default R_get_characters_character_id_fleet get_characters_character_id_fleet(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/fleet/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fleet.class));
    }

    public default R_get_characters_character_id_fw_stats get_characters_character_id_fw_stats(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/fw/stats/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_fw_stats.class));
    }

    public default int[] get_characters_character_id_implants(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/implants/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_characters_character_id_industry_jobs[] get_characters_character_id_industry_jobs(int character_id, Boolean include_completed, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/industry/jobs/".replace("{character_id}", ""+character_id)+"?"+(include_completed==null?"":"&include_completed="+flatten(include_completed)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_industry_jobs[].class));
    }

    public default R_get_characters_character_id_killmails_recent[] get_characters_character_id_killmails_recent(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/killmails/recent/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_killmails_recent[].class));
    }

    public default R_get_characters_character_id_location get_characters_character_id_location(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/location/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_location.class));
    }

    public default R_get_characters_character_id_loyalty_points[] get_characters_character_id_loyalty_points(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/loyalty/points/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_loyalty_points[].class));
    }

    public default R_get_characters_character_id_mail[] get_characters_character_id_mail(int character_id, int[] labels, Integer last_mail_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mail/".replace("{character_id}", ""+character_id)+"?"+(labels==null?"":"&labels="+flatten(labels))+(last_mail_id==null?"":"&last_mail_id="+flatten(last_mail_id)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail[].class));
    }

    public default int post_characters_character_id_mail(int character_id, long approved_cost, String body, fr.guiguilechat.eveonline.model.esi.compiled.structures.recipients[] recipients, String subject, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mail/".replace("{character_id}", ""+character_id));
        Map<String, Object> content = new HashMap<>();
        content.put("approved_cost", approved_cost);
        content.put("body", body);
        content.put("recipients", recipients);
        content.put("subject", subject);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (int.class));
    }

    public default R_get_characters_character_id_mail_labels get_characters_character_id_mail_labels(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail_labels.class));
    }

    public default int post_characters_character_id_mail_labels(int character_id, String color, String name, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id));
        Map<String, Object> content = new HashMap<>();
        content.put("color", color);
        content.put("name", name);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (int.class));
    }

    public default R_get_characters_character_id_mail_lists[] get_characters_character_id_mail_lists(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mail/lists/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail_lists[].class));
    }

    public default R_get_characters_character_id_mail_mail_id get_characters_character_id_mail_mail_id(int character_id, int mail_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mail_mail_id.class));
    }

    public default R_get_characters_character_id_medals[] get_characters_character_id_medals(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/medals/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_medals[].class));
    }

    public default R_get_characters_character_id_mining[] get_characters_character_id_mining(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/mining/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_mining[].class));
    }

    public default R_get_characters_character_id_notifications[] get_characters_character_id_notifications(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/notifications/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_notifications[].class));
    }

    public default R_get_characters_character_id_notifications_contacts[] get_characters_character_id_notifications_contacts(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/notifications/contacts/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_notifications_contacts[].class));
    }

    public default R_get_characters_character_id_online get_characters_character_id_online(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/online/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_online.class));
    }

    public default R_get_characters_character_id_opportunities[] get_characters_character_id_opportunities(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/opportunities/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_opportunities[].class));
    }

    public default R_get_characters_character_id_orders[] get_characters_character_id_orders(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/orders/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_orders[].class));
    }

    public default R_get_characters_character_id_orders_history[] get_characters_character_id_orders_history(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/orders/history/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_orders_history[].class));
    }

    public default R_get_characters_character_id_planets[] get_characters_character_id_planets(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/planets/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_planets[].class));
    }

    public default R_get_characters_character_id_planets_planet_id get_characters_character_id_planets_planet_id(int character_id, int planet_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/planets/{planet_id}/".replace("{character_id}", ""+character_id).replace("{planet_id}", ""+planet_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_planets_planet_id.class));
    }

    public default R_get_characters_character_id_portrait get_characters_character_id_portrait(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/portrait/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_portrait.class));
    }

    public default R_get_characters_character_id_roles get_characters_character_id_roles(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/roles/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_roles.class));
    }

    public default R_get_characters_character_id_search get_characters_character_id_search(String[] categories, int character_id, Swagger.language language, String search, Boolean strict, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/search/".replace("{character_id}", ""+character_id)+"?"+(categories==null?"":"&categories="+flatten(categories))+(language==null?"":"&language="+flatten(language))+(search==null?"":"&search="+flatten(search))+(strict==null?"":"&strict="+flatten(strict)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_search.class));
    }

    public default R_get_characters_character_id_ship get_characters_character_id_ship(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/ship/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_ship.class));
    }

    public default R_get_characters_character_id_skillqueue[] get_characters_character_id_skillqueue(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/skillqueue/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_skillqueue[].class));
    }

    public default R_get_characters_character_id_skills get_characters_character_id_skills(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/skills/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_skills.class));
    }

    public default R_get_characters_character_id_standings[] get_characters_character_id_standings(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/standings/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_standings[].class));
    }

    public default R_get_characters_character_id_stats[] get_characters_character_id_stats(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/stats/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_stats[].class));
    }

    public default R_get_characters_character_id_titles[] get_characters_character_id_titles(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/titles/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_titles[].class));
    }

    public default double get_characters_character_id_wallet(int character_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/wallet/".replace("{character_id}", ""+character_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (double.class));
    }

    public default R_get_characters_character_id_wallet_journal[] get_characters_character_id_wallet_journal(int character_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/wallet/journal/".replace("{character_id}", ""+character_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_wallet_journal[].class));
    }

    public default R_get_characters_character_id_wallet_transactions[] get_characters_character_id_wallet_transactions(int character_id, Long from_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/characters/{character_id}/wallet/transactions/".replace("{character_id}", ""+character_id)+"?"+(from_id==null?"":"&from_id="+flatten(from_id)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_characters_character_id_wallet_transactions[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_EXTRACTIONS_ROLES here}</p>
     */
    public default R_get_corporation_corporation_id_mining_extractions[] get_corporation_corporation_id_mining_extractions(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporation/{corporation_id}/mining/extractions/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporation_corporation_id_mining_extractions[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_ROLES here}</p>
     */
    public default R_get_corporation_corporation_id_mining_observers[] get_corporation_corporation_id_mining_observers(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporation/{corporation_id}/mining/observers/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporation_corporation_id_mining_observers[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_OBSERVER_ID_ROLES here}</p>
     */
    public default R_get_corporation_corporation_id_mining_observers_observer_id[] get_corporation_corporation_id_mining_observers_observer_id(int corporation_id, long observer_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporation/{corporation_id}/mining/observers/{observer_id}/".replace("{corporation_id}", ""+corporation_id).replace("{observer_id}", ""+observer_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporation_corporation_id_mining_observers_observer_id[].class));
    }

    public default R_get_corporations_names[] get_corporations_names(int[] corporation_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/names/"+"?"+(corporation_ids==null?"":"&corporation_ids="+flatten(corporation_ids)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_names[].class));
    }

    public default int[] get_corporations_npccorps(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/npccorps/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_corporations_corporation_id get_corporations_corporation_id(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id.class));
    }

    public default R_get_corporations_corporation_id_alliancehistory[] get_corporations_corporation_id_alliancehistory(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/alliancehistory/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_alliancehistory[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ASSETS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_assets[] get_corporations_corporation_id_assets(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/assets/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_assets[].class));
    }

    /**
     * <p> require the roles specified {@link #POST_CORPORATIONS_CORPORATION_ID_ASSETS_LOCATIONS_ROLES here}</p>
     */
    public default R_post_corporations_corporation_id_assets_locations[] post_corporations_corporation_id_assets_locations(int corporation_id, long[] item_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/assets/locations/".replace("{corporation_id}", ""+corporation_id));
        Map<String, Object> content = new HashMap<>();
        content.put("item_ids", item_ids);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_corporations_corporation_id_assets_locations[].class));
    }

    /**
     * <p> require the roles specified {@link #POST_CORPORATIONS_CORPORATION_ID_ASSETS_NAMES_ROLES here}</p>
     */
    public default R_post_corporations_corporation_id_assets_names[] post_corporations_corporation_id_assets_names(int corporation_id, long[] item_ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/assets/names/".replace("{corporation_id}", ""+corporation_id));
        Map<String, Object> content = new HashMap<>();
        content.put("item_ids", item_ids);
        String fetched = connectPost(url, content, true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_corporations_corporation_id_assets_names[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_BLUEPRINTS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_blueprints[] get_corporations_corporation_id_blueprints(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/blueprints/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_blueprints[].class));
    }

    public default R_get_corporations_corporation_id_bookmarks[] get_corporations_corporation_id_bookmarks(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/bookmarks/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_bookmarks[].class));
    }

    public default R_get_corporations_corporation_id_bookmarks_folders[] get_corporations_corporation_id_bookmarks_folders(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/bookmarks/folders/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_bookmarks_folders[].class));
    }

    public default R_get_corporations_corporation_id_contacts[] get_corporations_corporation_id_contacts(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/contacts/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contacts[].class));
    }

    public default R_get_corporations_corporation_id_contacts_labels[] get_corporations_corporation_id_contacts_labels(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/contacts/labels/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contacts_labels[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_CONTAINERS_LOGS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_containers_logs[] get_corporations_corporation_id_containers_logs(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/containers/logs/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_containers_logs[].class));
    }

    public default R_get_corporations_corporation_id_contracts[] get_corporations_corporation_id_contracts(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/contracts/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contracts[].class));
    }

    public default R_get_corporations_corporation_id_contracts_contract_id_bids[] get_corporations_corporation_id_contracts_contract_id_bids(int contract_id, int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/contracts/{contract_id}/bids/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contracts_contract_id_bids[].class));
    }

    public default R_get_corporations_corporation_id_contracts_contract_id_items[] get_corporations_corporation_id_contracts_contract_id_items(int contract_id, int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/contracts/{contract_id}/items/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_contracts_contract_id_items[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_CUSTOMS_OFFICES_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_customs_offices[] get_corporations_corporation_id_customs_offices(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/customs_offices/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_customs_offices[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_DIVISIONS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_divisions get_corporations_corporation_id_divisions(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/divisions/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_divisions.class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_FACILITIES_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_facilities[] get_corporations_corporation_id_facilities(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/facilities/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_facilities[].class));
    }

    public default R_get_corporations_corporation_id_fw_stats get_corporations_corporation_id_fw_stats(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/fw/stats/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_fw_stats.class));
    }

    public default R_get_corporations_corporation_id_icons get_corporations_corporation_id_icons(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/icons/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_icons.class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_INDUSTRY_JOBS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_industry_jobs[] get_corporations_corporation_id_industry_jobs(int corporation_id, Boolean include_completed, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/industry/jobs/".replace("{corporation_id}", ""+corporation_id)+"?"+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_industry_jobs[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_KILLMAILS_RECENT_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_killmails_recent[] get_corporations_corporation_id_killmails_recent(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/killmails/recent/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_killmails_recent[].class));
    }

    public default R_get_corporations_corporation_id_medals[] get_corporations_corporation_id_medals(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/medals/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_medals[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEDALS_ISSUED_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_medals_issued[] get_corporations_corporation_id_medals_issued(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/medals/issued/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_medals_issued[].class));
    }

    public default int[] get_corporations_corporation_id_members(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/members/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (int[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEMBERS_LIMIT_ROLES here}</p>
     */
    public default int get_corporations_corporation_id_members_limit(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/members/limit/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (int.class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEMBERS_TITLES_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_members_titles[] get_corporations_corporation_id_members_titles(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/members/titles/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_members_titles[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEMBERTRACKING_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_membertracking[] get_corporations_corporation_id_membertracking(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/membertracking/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_membertracking[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ORDERS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_orders[] get_corporations_corporation_id_orders(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/orders/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_orders[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ORDERS_HISTORY_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_orders_history[] get_corporations_corporation_id_orders_history(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/orders/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_orders_history[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_OUTPOSTS_ROLES here}</p>
     */
    public default int[] get_corporations_corporation_id_outposts(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/outposts/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (int[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_OUTPOSTS_OUTPOST_ID_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_outposts_outpost_id get_corporations_corporation_id_outposts_outpost_id(int corporation_id, int outpost_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/outposts/{outpost_id}/".replace("{corporation_id}", ""+corporation_id).replace("{outpost_id}", ""+outpost_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_outposts_outpost_id.class));
    }

    public default R_get_corporations_corporation_id_roles[] get_corporations_corporation_id_roles(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/roles/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_roles[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ROLES_HISTORY_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_roles_history[] get_corporations_corporation_id_roles_history(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/roles/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_roles_history[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_SHAREHOLDERS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_shareholders[] get_corporations_corporation_id_shareholders(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/shareholders/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_shareholders[].class));
    }

    public default R_get_corporations_corporation_id_standings[] get_corporations_corporation_id_standings(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/standings/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_standings[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STARBASES_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_starbases[] get_corporations_corporation_id_starbases(int corporation_id, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/starbases/".replace("{corporation_id}", ""+corporation_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_starbases[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STARBASES_STARBASE_ID_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_starbases_starbase_id get_corporations_corporation_id_starbases_starbase_id(int corporation_id, long starbase_id, int system_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/starbases/{starbase_id}/".replace("{corporation_id}", ""+corporation_id).replace("{starbase_id}", ""+starbase_id)+"?"+"&system_id="+flatten(system_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_starbases_starbase_id.class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STRUCTURES_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_structures[] get_corporations_corporation_id_structures(int corporation_id, Swagger.language language, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/structures/".replace("{corporation_id}", ""+corporation_id)+"?"+(language==null?"":"&language="+flatten(language))+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_structures[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_TITLES_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_titles[] get_corporations_corporation_id_titles(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/titles/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_titles[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_wallets[] get_corporations_corporation_id_wallets(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/wallets/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_wallets[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_JOURNAL_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_wallets_division_journal[] get_corporations_corporation_id_wallets_division_journal(int corporation_id, int division, Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/wallets/{division}/journal/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_wallets_division_journal[].class));
    }

    /**
     * <p> require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_TRANSACTIONS_ROLES here}</p>
     */
    public default R_get_corporations_corporation_id_wallets_division_transactions[] get_corporations_corporation_id_wallets_division_transactions(int corporation_id, int division, Long from_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/corporations/{corporation_id}/wallets/{division}/transactions/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(from_id==null?"":"&from_id="+flatten(from_id)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_corporations_corporation_id_wallets_division_transactions[].class));
    }

    public default int[] get_dogma_attributes(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/dogma/attributes/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_dogma_attributes_attribute_id get_dogma_attributes_attribute_id(int attribute_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/dogma/attributes/{attribute_id}/".replace("{attribute_id}", ""+attribute_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_dogma_attributes_attribute_id.class));
    }

    public default int[] get_dogma_effects(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/dogma/effects/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_dogma_effects_effect_id get_dogma_effects_effect_id(int effect_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/dogma/effects/{effect_id}/".replace("{effect_id}", ""+effect_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_dogma_effects_effect_id.class));
    }

    public default R_get_fleets_fleet_id get_fleets_fleet_id(long fleet_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fleets/{fleet_id}/".replace("{fleet_id}", ""+fleet_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fleets_fleet_id.class));
    }

    public default R_get_fleets_fleet_id_members[] get_fleets_fleet_id_members(long fleet_id, Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fleets/{fleet_id}/members/".replace("{fleet_id}", ""+fleet_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fleets_fleet_id_members[].class));
    }

    public default void post_fleets_fleet_id_members(long fleet_id, int character_id, String role, long squad_id, long wing_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fleets/{fleet_id}/members/".replace("{fleet_id}", ""+fleet_id));
        Map<String, Object> content = new HashMap<>();
        content.put("character_id", character_id);
        content.put("role", role);
        content.put("squad_id", squad_id);
        content.put("wing_id", wing_id);
        connectPost(url, content, true, headerHandler);
    }

    public default R_get_fleets_fleet_id_wings[] get_fleets_fleet_id_wings(long fleet_id, Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fleets_fleet_id_wings[].class));
    }

    public default R_post_fleets_fleet_id_wings_created post_fleets_fleet_id_wings(long fleet_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id));
        String fetched = connectPost(url, Collections.emptyMap(), true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_fleets_fleet_id_wings_created.class));
    }

    public default R_post_fleets_fleet_id_wings_wing_id_squads_created post_fleets_fleet_id_wings_wing_id_squads(long fleet_id, long wing_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fleets/{fleet_id}/wings/{wing_id}/squads/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id));
        String fetched = connectPost(url, Collections.emptyMap(), true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_fleets_fleet_id_wings_wing_id_squads_created.class));
    }

    public default R_get_fw_leaderboards get_fw_leaderboards(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fw/leaderboards/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_leaderboards.class));
    }

    public default R_get_fw_leaderboards_characters get_fw_leaderboards_characters(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fw/leaderboards/characters/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_leaderboards_characters.class));
    }

    public default R_get_fw_leaderboards_corporations get_fw_leaderboards_corporations(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fw/leaderboards/corporations/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_leaderboards_corporations.class));
    }

    public default R_get_fw_stats[] get_fw_stats(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fw/stats/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_stats[].class));
    }

    public default R_get_fw_systems[] get_fw_systems(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fw/systems/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_systems[].class));
    }

    public default R_get_fw_wars[] get_fw_wars(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/fw/wars/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_fw_wars[].class));
    }

    public default R_get_incursions[] get_incursions(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/incursions/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_incursions[].class));
    }

    public default R_get_industry_facilities[] get_industry_facilities(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/industry/facilities/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_industry_facilities[].class));
    }

    public default R_get_industry_systems[] get_industry_systems(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/industry/systems/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_industry_systems[].class));
    }

    public default R_get_insurance_prices[] get_insurance_prices(Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/insurance/prices/"+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_insurance_prices[].class));
    }

    public default R_get_killmails_killmail_id_killmail_hash get_killmails_killmail_id_killmail_hash(String killmail_hash, int killmail_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/killmails/{killmail_id}/{killmail_hash}/".replace("{killmail_hash}", ""+killmail_hash).replace("{killmail_id}", ""+killmail_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_killmails_killmail_id_killmail_hash.class));
    }

    public default R_get_loyalty_stores_corporation_id_offers[] get_loyalty_stores_corporation_id_offers(int corporation_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/loyalty/stores/{corporation_id}/offers/".replace("{corporation_id}", ""+corporation_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_loyalty_stores_corporation_id_offers[].class));
    }

    public default int[] get_markets_groups(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/groups/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_markets_groups_market_group_id get_markets_groups_market_group_id(Swagger.language language, int market_group_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/groups/{market_group_id}/".replace("{market_group_id}", ""+market_group_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_groups_market_group_id.class));
    }

    public default R_get_markets_prices[] get_markets_prices(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/prices/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_prices[].class));
    }

    public default R_get_markets_structures_structure_id[] get_markets_structures_structure_id(Integer page, long structure_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_structures_structure_id[].class));
    }

    public default R_get_markets_region_id_history[] get_markets_region_id_history(int region_id, int type_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/{region_id}/history/".replace("{region_id}", ""+region_id)+"?"+"&type_id="+flatten(type_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_region_id_history[].class));
    }

    public default R_get_markets_region_id_orders[] get_markets_region_id_orders(Swagger.order_type order_type, Integer page, int region_id, Integer type_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/{region_id}/orders/".replace("{region_id}", ""+region_id)+"?"+(order_type==null?"":"&order_type="+flatten(order_type))+(page==null?"":"&page="+flatten(page))+(type_id==null?"":"&type_id="+flatten(type_id)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_markets_region_id_orders[].class));
    }

    public default int[] get_markets_region_id_types(Integer page, int region_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/markets/{region_id}/types/".replace("{region_id}", ""+region_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default int[] get_opportunities_groups(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/opportunities/groups/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_opportunities_groups_group_id get_opportunities_groups_group_id(int group_id, Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/opportunities/groups/{group_id}/".replace("{group_id}", ""+group_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_opportunities_groups_group_id.class));
    }

    public default int[] get_opportunities_tasks(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/opportunities/tasks/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_opportunities_tasks_task_id get_opportunities_tasks_task_id(int task_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/opportunities/tasks/{task_id}/".replace("{task_id}", ""+task_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_opportunities_tasks_task_id.class));
    }

    public default int[] get_route_origin_destination(int[] avoid, int[][] connections, int destination, Swagger.flag flag, int origin, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/route/{origin}/{destination}/".replace("{destination}", ""+destination).replace("{origin}", ""+origin)+"?"+(avoid==null?"":"&avoid="+flatten(avoid))+(connections==null?"":"&connections="+flatten(connections))+(flag==null?"":"&flag="+flatten(flag)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_search get_search(String[] categories, Swagger.language language, String search, Boolean strict, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/search/"+"?"+(categories==null?"":"&categories="+flatten(categories))+(language==null?"":"&language="+flatten(language))+(search==null?"":"&search="+flatten(search))+(strict==null?"":"&strict="+flatten(strict)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_search.class));
    }

    public default R_get_sovereignty_campaigns[] get_sovereignty_campaigns(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/sovereignty/campaigns/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_sovereignty_campaigns[].class));
    }

    public default R_get_sovereignty_map[] get_sovereignty_map(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/sovereignty/map/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_sovereignty_map[].class));
    }

    public default R_get_sovereignty_structures[] get_sovereignty_structures(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/sovereignty/structures/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_sovereignty_structures[].class));
    }

    public default R_get_status get_status(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/status/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_status.class));
    }

    public default void post_ui_autopilot_waypoint(boolean add_to_beginning, boolean clear_other_waypoints, long destination_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/ui/autopilot/waypoint/"+"?"+"&add_to_beginning="+flatten(add_to_beginning)+"&clear_other_waypoints="+flatten(clear_other_waypoints)+"&destination_id="+flatten(destination_id));
        connectPost(url, Collections.emptyMap(), true, headerHandler);
    }

    public default void post_ui_openwindow_contract(int contract_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/ui/openwindow/contract/"+"?"+"&contract_id="+flatten(contract_id));
        connectPost(url, Collections.emptyMap(), true, headerHandler);
    }

    public default void post_ui_openwindow_information(int target_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/ui/openwindow/information/"+"?"+"&target_id="+flatten(target_id));
        connectPost(url, Collections.emptyMap(), true, headerHandler);
    }

    public default void post_ui_openwindow_marketdetails(int type_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/ui/openwindow/marketdetails/"+"?"+"&type_id="+flatten(type_id));
        connectPost(url, Collections.emptyMap(), true, headerHandler);
    }

    public default void post_ui_openwindow_newmail(String body, int[] recipients, String subject, int to_corp_or_alliance_id, int to_mailing_list_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/ui/openwindow/newmail/");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        content.put("recipients", recipients);
        content.put("subject", subject);
        content.put("to_corp_or_alliance_id", to_corp_or_alliance_id);
        content.put("to_mailing_list_id", to_mailing_list_id);
        connectPost(url, content, true, headerHandler);
    }

    public default R_get_universe_ancestries[] get_universe_ancestries(Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/ancestries/"+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_ancestries[].class));
    }

    public default R_get_universe_asteroid_belts_asteroid_belt_id get_universe_asteroid_belts_asteroid_belt_id(int asteroid_belt_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/asteroid_belts/{asteroid_belt_id}/".replace("{asteroid_belt_id}", ""+asteroid_belt_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_asteroid_belts_asteroid_belt_id.class));
    }

    public default R_get_universe_bloodlines[] get_universe_bloodlines(Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/bloodlines/"+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_bloodlines[].class));
    }

    public default int[] get_universe_categories(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/categories/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_categories_category_id get_universe_categories_category_id(int category_id, Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/categories/{category_id}/".replace("{category_id}", ""+category_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_categories_category_id.class));
    }

    public default int[] get_universe_constellations(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/constellations/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_constellations_constellation_id get_universe_constellations_constellation_id(int constellation_id, Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/constellations/{constellation_id}/".replace("{constellation_id}", ""+constellation_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_constellations_constellation_id.class));
    }

    public default R_get_universe_factions[] get_universe_factions(Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/factions/"+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_factions[].class));
    }

    public default int[] get_universe_graphics(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/graphics/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_graphics_graphic_id get_universe_graphics_graphic_id(int graphic_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/graphics/{graphic_id}/".replace("{graphic_id}", ""+graphic_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_graphics_graphic_id.class));
    }

    public default int[] get_universe_groups(Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/groups/"+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_groups_group_id get_universe_groups_group_id(int group_id, Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/groups/{group_id}/".replace("{group_id}", ""+group_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_groups_group_id.class));
    }

    public default R_post_universe_ids post_universe_ids(Swagger.language language, String[] names, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/ids/"+"?"+(language==null?"":"&language="+flatten(language)));
        Map<String, Object> content = new HashMap<>();
        content.put("names", names);
        String fetched = connectPost(url, content, false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_universe_ids.class));
    }

    public default R_get_universe_moons_moon_id get_universe_moons_moon_id(int moon_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/moons/{moon_id}/".replace("{moon_id}", ""+moon_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_moons_moon_id.class));
    }

    public default R_post_universe_names[] post_universe_names(int[] ids, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/names/");
        Map<String, Object> content = new HashMap<>();
        content.put("ids", ids);
        String fetched = connectPost(url, content, false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_post_universe_names[].class));
    }

    public default R_get_universe_planets_planet_id get_universe_planets_planet_id(int planet_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/planets/{planet_id}/".replace("{planet_id}", ""+planet_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_planets_planet_id.class));
    }

    public default R_get_universe_races[] get_universe_races(Swagger.language language, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/races/"+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_races[].class));
    }

    public default int[] get_universe_regions(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/regions/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_regions_region_id get_universe_regions_region_id(Swagger.language language, int region_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/regions/{region_id}/".replace("{region_id}", ""+region_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_regions_region_id.class));
    }

    public default R_get_universe_schematics_schematic_id get_universe_schematics_schematic_id(int schematic_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/schematics/{schematic_id}/".replace("{schematic_id}", ""+schematic_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_schematics_schematic_id.class));
    }

    public default R_get_universe_stargates_stargate_id get_universe_stargates_stargate_id(int stargate_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/stargates/{stargate_id}/".replace("{stargate_id}", ""+stargate_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_stargates_stargate_id.class));
    }

    public default R_get_universe_stars_star_id get_universe_stars_star_id(int star_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/stars/{star_id}/".replace("{star_id}", ""+star_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_stars_star_id.class));
    }

    public default R_get_universe_stations_station_id get_universe_stations_station_id(int station_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/stations/{station_id}/".replace("{station_id}", ""+station_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_stations_station_id.class));
    }

    public default long[] get_universe_structures(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/structures/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (long[].class));
    }

    public default R_get_universe_structures_structure_id get_universe_structures_structure_id(long structure_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/structures/{structure_id}/".replace("{structure_id}", ""+structure_id));
        String fetched=connectGet(url,true, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_structures_structure_id.class));
    }

    public default R_get_universe_system_jumps[] get_universe_system_jumps(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/system_jumps/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_system_jumps[].class));
    }

    public default R_get_universe_system_kills[] get_universe_system_kills(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/system_kills/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_system_kills[].class));
    }

    public default int[] get_universe_systems(Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/systems/");
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_systems_system_id get_universe_systems_system_id(Swagger.language language, int system_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/systems/{system_id}/".replace("{system_id}", ""+system_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_systems_system_id.class));
    }

    public default int[] get_universe_types(Integer page, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/types/"+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_universe_types_type_id get_universe_types_type_id(Swagger.language language, int type_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/universe/types/{type_id}/".replace("{type_id}", ""+type_id)+"?"+(language==null?"":"&language="+flatten(language)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_universe_types_type_id.class));
    }

    public default int[] get_wars(Integer max_war_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/wars/"+"?"+(max_war_id==null?"":"&max_war_id="+flatten(max_war_id)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (int[].class));
    }

    public default R_get_wars_war_id get_wars_war_id(int war_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/wars/{war_id}/".replace("{war_id}", ""+war_id));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_wars_war_id.class));
    }

    public default R_get_wars_war_id_killmails[] get_wars_war_id_killmails(Integer page, int war_id, Map<String, List<String>> headerHandler) {
        String url = ("https://esi.tech.ccp.is/latest/wars/{war_id}/killmails/".replace("{war_id}", ""+war_id)+"?"+(page==null?"":"&page="+flatten(page)));
        String fetched=connectGet(url,false, headerHandler);
        return convert((fetched), (fr.guiguilechat.eveonline.model.esi.compiled.responses.R_get_wars_war_id_killmails[].class));
    }

    public static enum flag {
        shortest("shortest"),
        secure("secure"),
        insecure("insecure");
        public final String toString;

        flag(String toString) {
            this.toString = toString;
        }

        @Override
        public String toString() {
            return toString;
        }
    }

    public static enum language {
        de("de"),
        en_us("en-us"),
        fr("fr"),
        ja("ja"),
        ru("ru"),
        zh("zh");
        public final String toString;

        language(String toString) {
            this.toString = toString;
        }

        @Override
        public String toString() {
            return toString;
        }
    }

    public static enum order_type {
        buy("buy"),
        sell("sell"),
        all("all");
        public final String toString;

        order_type(String toString) {
            this.toString = toString;
        }

        @Override
        public String toString() {
            return toString;
        }
    }
}