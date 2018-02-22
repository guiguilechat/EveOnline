package fr.guiguilechat.eveonline.programs.manager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.guiguilechat.eveonline.model.apiv2.APIRoot;
import fr.guiguilechat.eveonline.model.apiv2.Account.EveChar;
import fr.guiguilechat.eveonline.model.apiv2.Char.Content;
import fr.guiguilechat.eveonline.model.apiv2.Char.OrderEntry;
import fr.guiguilechat.eveonline.model.esi.ESIAccount;
import fr.guiguilechat.eveonline.model.sde.industry.Blueprint;
import fr.guiguilechat.eveonline.model.sde.industry.Blueprint.Material;
import fr.guiguilechat.eveonline.model.sde.industry.InventionDecryptor;
import fr.guiguilechat.eveonline.model.sde.items.MetaInf;
import fr.guiguilechat.eveonline.model.sde.locations.Constellation;
import fr.guiguilechat.eveonline.model.sde.locations.Region;
import fr.guiguilechat.eveonline.model.sde.locations.SolarSystem;
import fr.guiguilechat.eveonline.model.sde.locations.Station;
import fr.guiguilechat.eveonline.model.sde.npcs.Agent;
import fr.guiguilechat.eveonline.model.sde.npcs.Corporation;
import fr.guiguilechat.eveonline.model.sde.npcs.LPOffer;
import fr.guiguilechat.eveonline.model.sde.npcs.LPOffer.ItemRef;
import fr.guiguilechat.eveonline.programs.manager.Settings.JobActivity;
import fr.guiguilechat.eveonline.programs.manager.Settings.ProvisionType;
import fr.guiguilechat.eveonline.programs.manager.Settings.SSODevKey;
import fr.guiguilechat.eveonline.programs.manager.Settings.ScheduledJob;
import fr.guiguilechat.eveonline.programs.manager.Settings.TeamDescription;
import fr.guiguilechat.eveonline.programs.manager.Settings.TeamDescription.Provision;
import fr.guiguilechat.eveonline.programs.manager.panes.EvePane;
import fr.guiguilechat.eveonline.programs.manager.panes.api.APIPane;
import fr.guiguilechat.eveonline.programs.manager.panes.industry.IndustryTab;
import fr.guiguilechat.eveonline.programs.manager.panes.mission.MissionTab;
import fr.guiguilechat.eveonline.programs.manager.panes.provision.ProvisionPane;
import fr.guiguilechat.eveonline.programs.manager.panes.status.StatusPane;
import fr.guiguilechat.eveonline.programs.manager.panes.team.TeamsPane;
import fr.guiguilechat.eveonline.programs.manager.settings.ISettings;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Manager extends Application implements EvePane {

	private static final Logger logger = LoggerFactory.getLogger(Manager.class);

	public static void main(String[] args) {
		int parrallelism = Runtime.getRuntime().availableProcessors() * 50;
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "" + parrallelism);

		launch(args);
	}

	@Override
	public Manager parent() {
		return this;
	}

	public Settings settings = ISettings.load(Settings.class);

	public final ObservableList<APIRoot> apiXMLV2 = FXCollections.observableArrayList();
	public final ObservableMap<String, ObservableList<ESIAccount>> ssoDev2Clients = FXCollections.observableHashMap();
	public final ObservableMap<String, ESIAccount> ssoChar2Con = FXCollections.observableHashMap();

	protected BorderPane mainLayout = new BorderPane();

	protected StatusPane statuspane = new StatusPane(this);
	protected ProvisionPane provisionpane = new ProvisionPane(this);
	protected TeamsPane teamPane = new TeamsPane(this);
	protected APIPane apiPane = new APIPane(this);
	protected IndustryTab industryPane = new IndustryTab(this);
	protected MissionTab missionPane = new MissionTab(this);
	protected TabPane tabs;
	protected Tab statustab, provisiontab, teamtab, apitab, indusTab, missiontab;

	private EvePane[] children = new EvePane[] { statuspane, provisionpane, teamPane, apiPane, missionPane,
			industryPane };

	@Override
	public EvePane[] subEvePanes() {
		return children;
	}

	@Override
	public boolean isShownSubPane(EvePane child) {
		return tabs.getSelectionModel().getSelectedItem().getContent() == child;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ISettings.attachStoreListeners(settings);
		logger.debug("start manager");
		primaryStage.setTitle("guigui lechat manager");

		// set the tabs
		statustab = new Tab("status", statuspane);
		provisiontab = new Tab("provision", provisionpane);
		teamtab = new Tab("teams", teamPane);
		apitab = new Tab("apis", apiPane);
		indusTab = new Tab("industry", industryPane);
		missiontab = new Tab("mission", missionPane);
		tabs = new TabPane(statustab, provisiontab, indusTab, missiontab, teamtab, apitab);
		tabs.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		tabs.setSide(Side.LEFT);
		tabs.getSelectionModel().selectedItemProperty().addListener((ov, old, now) -> {
			if (old != null) {
				((EvePane) old.getContent()).propagateIsShown(false);
			}
			if (now != null) {
				((EvePane) now.getContent()).propagateIsShown(true);
			}
		});
		// prevent moving out of options until we have at least one correct API.
		tabs.getSelectionModel().selectedItemProperty().addListener((obj, old, now) -> checkXMLV2OrSetOptionsTab());
		checkXMLV2OrSetOptionsTab();

		TitledPane tpDebug = new TitledPane("debug", debugPane);
		tpDebug.setExpanded(false);
		mainLayout.setCenter(tabs);
		mainLayout.setBottom(tpDebug);

		logger.debug("making scene");
		Scene scene = new Scene(mainLayout, 800, 900);
		primaryStage.setScene(scene);
		primaryStage.show();

		logger.debug("propagate xmlV2");
		for (Entry<Integer, String> a : settings.xmlV2Keys.entrySet()) {
			apiXMLV2.add(new APIRoot(a.getKey(), a.getValue()));
		}
		propagateNewXMLV2(apiXMLV2.toArray(new APIRoot[0]));

		logger.debug("create esi connections");
		for (Entry<String, SSODevKey> e : settings.ssoKeys().entrySet()) {
			String name = e.getKey();
			SSODevKey key = e.getValue();
			ObservableList<ESIAccount> list = FXCollections.observableArrayList();
			for (Entry<String, String> a : key.character2Refresh.entrySet()) {
				ESIAccount con = new ESIAccount(a.getValue(), key.base64);
				list.add(con);
				ssoChar2Con.put(con.verify.characterName(), con);
			}
			ssoDev2Clients.put(name, list);
		}

		logger.debug("propagate teams");
		for (String team : settings.teams().keySet()) {
			for (String charname : settings.teams().get(team).members) {
				propagateAdd2Team(team, charname);
			}
		}
		propagateFocusedTeam(settings.focusedTeam);
		logger.debug("manager started");
		propagateIsShown(true);
		new Thread(this::precache).start();
	}

	protected void precache() {
		new Thread(MetaInf::load).start();
		new Thread(Blueprint::load).start();
		new Thread(InventionDecryptor::load).start();
		new Thread(MetaInf::load).start();
		new Thread(Region::load).start();
		new Thread(Constellation::load).start();
		new Thread(SolarSystem::load).start();
		new Thread(Station::load).start();
		new Thread(Agent::load).start();
		new Thread(Corporation::load).start();
		new Thread(LPOffer::load).start();
	}

	protected void checkXMLV2OrSetOptionsTab() {
		if (settings.xmlV2Keys.isEmpty()) {
			tabs.getSelectionModel().select(apitab);
		}
	}

	//
	// event handling
	//


	@Override
	public void onDelXMLV2(int key) {
		for (Iterator<APIRoot> it = apiXMLV2.iterator(); it.hasNext();) {
			if (it.next().key.keyID == key) {
				it.remove();
			}
		}
	}

	// external calls
	// modification of the settings
	//

	// XMLV2 API

	public void removeXMLV2(int keyID) {
		settings.xmlV2Keys.remove(keyID);
		settings.store();
		propagateDelXMLV2(keyID);
	}

	public APIRoot addXMLV2(int key, String code) {
		// first check the api
		APIRoot newapi = new APIRoot(key, code);
		if (newapi.getInfos() == null) {
			return null;
		}
		// then remove former api with same key
		String oldCode = settings.xmlV2Keys.put(key, code);
		settings.store();

		// we can't modify the apiroot, as they have final args. so remove and add.
		if (oldCode != null) {
			apiXMLV2.removeIf(ar -> ar.key.keyID == key);
		}
		apiXMLV2.add(newapi);
		if (oldCode == null) {
			propagateNewXMLV2(newapi);
		}
		return newapi;
	}

	public SSODevKey addSSODev(String name, String appID, String base64, String callback) {
		SSODevKey ret = settings.ssoKeys().get(name);
		if (ret == null) {
			ret = new SSODevKey();
			ret.appID = appID;
			ret.base64 = base64;
			ret.callback = callback;
			settings.ssoKeys().put(name, ret);
			settings.store();
			ssoDev2Clients.put(name, FXCollections.observableArrayList());
			return ret;
		} else {
			logger.warn("error, key with name " + name + " already exists");
			return null;
		}
	}

	public void delSSODev(String name) {
		SSODevKey dev = settings.ssoKeys().remove(name);
		if (dev == null) {
			logger.warn("error, key with name " + name + " not present, can't remove");
		}
		settings.store();
		ssoDev2Clients.remove(name);
		for (String charName : dev.character2Refresh.keySet()) {
			ssoChar2Con.remove(charName);
		}
	}

	/**
	 * add an sso api
	 *
	 * @param devName
	 *          the dev key name
	 * @param refreshToken
	 *          the refresh token
	 */
	public void addSSOClient(String devName, String refreshToken) {
		SSODevKey devkey = settings.ssoKeys().get(devName);
		if (devkey == null) {
			logger.warn("can't find devkey for name " + devName);
			debug("can't find devkey for name " + devName);
			return;
		}
		if (devkey.character2Refresh.containsValue(refreshToken)) {
			debug("refresh token already accepted");
			return;
		}
		ESIAccount con = new ESIAccount(refreshToken, devkey.base64);
		debug("received refresh for user " + con.verify.characterName());
		devkey.character2Refresh.put(con.verify.characterName(), refreshToken);
		settings.store();
		ssoChar2Con.put(con.verify.characterName(), con);
		ObservableList<ESIAccount> keylist = ssoDev2Clients.get(devName);
		if (keylist == null) {
			keylist = FXCollections.observableArrayList();
			ssoDev2Clients.put(devName, keylist);
		}
		keylist.add(con);
		debug("added user connection " + con.verify.characterName());
	}

	public void delSSOClient(ESIAccount con) {
		String name = con.verify.characterName();
		for (SSODevKey dev : settings.ssoKeys().values()) {
			dev.character2Refresh.remove(name);
		}
		settings.store();
		ssoChar2Con.remove(name);
		for (ObservableList<ESIAccount> dc : ssoDev2Clients.values()) {
			dc.remove(con);
		}
	}

	public APIRoot getXMLV2(int key) {
		for (APIRoot a : apiXMLV2) {
			if (a.key.keyID == key) {
				return a;
			}
		}
		return null;
	}

	public Stream<EveChar> streamChars() {
		return apiXMLV2.parallelStream().flatMap(a -> a.account.characters().stream());
	}

	public Stream<EveChar> streamTeamCharacters(String team) {
		if (team != null && settings.teams().containsKey(team)) {
			Set<String> members = settings.teams().get(team).members;
			return streamChars().filter(c -> members.contains(c.name));
		}
		return Stream.empty();
	}

	public Stream<EveChar> streamFTeamCharacters() {
		return streamTeamCharacters(settings.focusedTeam);
	}

	// team

	public boolean renameTeam(String old, String now) {
		if (old != null && settings.teams().keySet().contains(old) && now != null && now.length() > 0
				&& !settings.teams().keySet().contains(now)) {
			settings.teams().put(now, settings.teams().remove(old));
			if (old.equals(settings.focusedTeam)) {
				settings.focusedTeam = now;
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean copyTeam(String from, String newname) {
		if (from != null && settings.teams().containsKey(from) && newname != null && newname.length() > 0
				&& !settings.teams().containsKey(newname)) {
			settings.teams().put(newname, settings.teams().get(from).clone());
			return true;
		} else {
			return false;
		}
	}

	public void add2Team(String character, String team) {
		settings.teams().get(team).members.add(character);
		settings.store();
		propagateAdd2Team(team, character);
	}

	public void del2Team(String character, String team) {
		settings.teams().get(team).members.remove(character);
		settings.store();
		propagateDel2Team(team, character);
	}

	public void setFocusedTeam(String name) {
		if (name == settings.focusedTeam || name != null && name.equals(settings.focusedTeam)) {
			return;
		}
		debug("focusing on team " + name);
		settings.focusedTeam = name;
		settings.store();
		propagateFocusedTeam(name);
	}

	/**
	 * find all the possible systems names for the given team.
	 *
	 * @return distinct parallel stream of system names
	 */
	public Stream<String> streamTeamPossibleSystems(String team) {
		Set<String> allowedChars = settings.teams().get(team).members;
		Stream<EveChar> chars = apiXMLV2.parallelStream().flatMap(a -> a.account.characters().parallelStream())
				.filter(c -> allowedChars.contains(c.name));
		return chars.parallel().flatMap(this::streamCharPossibleSystems).distinct();
	}

	public Stream<String> streamCharPossibleSystems(EveChar c) {
		return Stream.concat(getCharAssets(c).keySet().stream(),
				Stream.concat(getCharBOs(c).keySet().stream(), getCharSOs(c).keySet().stream())).filter(s -> s != null)
				.distinct();
	}

	/**
	 * get the set of system the focused team is limited to
	 *
	 * @return
	 */
	public Set<String> getFTeamSystemLimit() {
		return getTeamSystemLimit(settings.focusedTeam);
	}

	public Set<String> getTeamSystemLimit(String team) {
		if (team != null) {
			return settings.teams().get(team).systems;
		}
		return Collections.emptySet();
	}

	/**
	 * add a system to the limit of a team
	 *
	 * @param teamName
	 * @param sysName
	 * @return
	 */
	public boolean addTeamSystem(String teamName, String sysName) {
		Set<String> teamSystems = settings.teams().get(teamName).systems;
		if (!teamSystems.add(sysName)) {
			return false;
		}
		propagateAddTeamSystem(teamName, sysName);
		settings.store();
		return true;
	}

	/**
	 * remove a system from the limit of a team
	 *
	 * @param teamName
	 * @param sysName
	 * @return
	 */
	public boolean remTeamSystem(String teamName, String sysName) {
		Set<String> teamSystems = settings.teams().get(teamName).systems;
		if (!teamSystems.remove(sysName)) {
			return false;
		}
		propagateRemTeamSystem(teamName, sysName);
		settings.store();
		return true;
	}

	// provision

	/** get the provision of materials for the focused team. */
	public Provision getTeamProvision(String team, ProvisionType provitype) {
		if (team == null || settings.teams().get(team) == null) {
			return null;
		}
		switch (provitype) {
		case MATERIAL:
			return settings.teams().get(team).provisionMaterials;
		case PRODUCT:
			return settings.teams().get(team).provisionProduct;
		case SO:
			return settings.teams().get(team).provisionSO;
		default:
			throw new UnsupportedOperationException("can't handle " + provitype);
		}
	}

	/** set the requirement in lp offer to given value for the focused team */
	public void provisionLPOffer(ProvisionType ptype, LPOffer offer, int requirement) {
		HashMap<Integer, Integer> proviMatLP = getTeamProvision(settings.focusedTeam, ptype).lpoffers;
		int diff = requirement - proviMatLP.getOrDefault(offer.id, 0);
		if (requirement <= 0) {
			proviMatLP.remove(offer.id);
		} else {
			proviMatLP.put(offer.id, requirement);
		}
		HashMap<Integer, Integer> proviTotal = getTeamProvision(settings.focusedTeam, ptype).total;

		for (ItemRef e : ptype == ProvisionType.MATERIAL ? offer.requirements.items : Arrays.asList(offer.product)) {
			int id = fr.guiguilechat.eveonline.model.sde.items.MetaInf.getItem(e.item).id;
			int newQtty = proviTotal.getOrDefault(id, 0)
					+ e.quantity * diff;
			if (newQtty > 0) {
				proviTotal.put(id, newQtty);
			} else {
				proviTotal.remove(id);
			}
			propagateNewProvision(ptype, id, newQtty);
		}

		settings.store();
	}

	public void provisionLPOffer(LPOffer offer, int mat, int product, int so) {
		provisionLPOffer(ProvisionType.MATERIAL, offer, mat);
		provisionLPOffer(ProvisionType.PRODUCT, offer, product);
		provisionLPOffer(ProvisionType.SO, offer, so);
	}

	/** set the requirement in BP to given value for the focused team */
	public void provisionBP(ProvisionType ptype, Blueprint bp, int requirement) {
		HashMap<Integer, Integer> proviBP = getTeamProvision(settings.focusedTeam, ptype).blueprints;
		int diff = requirement - proviBP.getOrDefault(bp.id, 0);
		if (requirement <= 0) {
			proviBP.remove(bp.id);
		} else {
			proviBP.put(bp.id, requirement);
		}
		HashMap<Integer, Integer> proviTotal = getTeamProvision(settings.focusedTeam, ptype).total;
		for (Material m : ptype == ProvisionType.MATERIAL ? bp.manufacturing.materials : bp.manufacturing.products) {
			int mid = MetaInf.getItem(m.name).id;
			int newQtty = proviTotal.getOrDefault(mid, 0) + m.quantity * diff;
			if (newQtty > 0) {
				proviTotal.put(mid, newQtty);
			} else {
				proviTotal.remove(mid);
			}
			propagateNewProvision(ptype, mid, newQtty);
		}
		settings.store();
	}

	public void provisionBP(Blueprint bp, int mat, int product, int so) {
		provisionBP(ProvisionType.MATERIAL, bp, mat);
		provisionBP(ProvisionType.PRODUCT, bp, product);
		provisionBP(ProvisionType.SO, bp, so);
	}

	// items, bo, so

	/** only fetch characer data once every X minutes */
	protected int assetCacheDelayMinutes = 10;

	/** char->system->typeID->qtty */
	protected Map<String, Map<String, Map<Integer, Long>>> cachedAssetsByCharName = Collections
			.synchronizedMap(new HashMap<>());
	protected Map<String, Date> expireAssetsByCharName = Collections.synchronizedMap(new HashMap<>());

	/**
	 * cache and get the (possible) assets of a char.
	 *
	 * @param c
	 *          a char.
	 * @return system > itemId > qtty for this char
	 */
	public Map<String, Map<Integer, Long>> getCharAssets(EveChar c) {
		Date cacheExpire = expireAssetsByCharName.get(c.name);
		Date now = new Date();
		if (cacheExpire != null && cacheExpire.after(now)) {
			logger.trace("returning old cache for assets of character " + c.name);
			return cachedAssetsByCharName.get(c.name);
		} else {
			Map<String, Map<Integer, Long>> itemsqtty = fetchCharAssets(c);
			cachedAssetsByCharName.put(c.name, itemsqtty);
			expireAssetsByCharName.put(c.name, new Date(now.getTime() + assetCacheDelayMinutes * 60000));
			logger.trace("new items for " + c.name + " : " + itemsqtty);
			return itemsqtty;
		}
	}

	/** char->system->typeID->qtty */
	protected Map<String, Map<String, Map<Integer, Long>>> cachedBOsByCharName = Collections
			.synchronizedMap(new HashMap<>());
	protected Map<String, Date> expireBOsByCharName = Collections.synchronizedMap(new HashMap<>());

	/**
	 * cache and get the (possible) buy orders of a char.
	 *
	 * @param c
	 *          a char.
	 * @return system > itemId > qtty for this char
	 */
	public Map<String, Map<Integer, Long>> getCharBOs(EveChar c) {
		Date cacheExpire = expireBOsByCharName.get(c.name);
		Date now = new Date();
		if (cacheExpire != null && cacheExpire.after(now)) {
			logger.trace("returning old cache for bo of character " + c.name);
			return cachedBOsByCharName.get(c.name);
		} else {
			Map<String, Map<Integer, Long>> itemsqtty = fetchCharBOs(c);
			cachedBOsByCharName.put(c.name, itemsqtty);
			expireBOsByCharName.put(c.name, new Date(now.getTime() + assetCacheDelayMinutes * 60000));
			logger.trace("new bo for " + c.name + " : " + itemsqtty);
			return itemsqtty;
		}
	}

	/** char->system->typeID->qtty */
	protected Map<String, Map<String, Map<Integer, Long>>> cachedSOsByCharName = Collections
			.synchronizedMap(new HashMap<>());
	protected Map<String, Date> expireSOsByCharName = Collections.synchronizedMap(new HashMap<>());

	/**
	 * cache and get the (possible) sell orders of a char.
	 *
	 * @param c
	 *          a char.
	 * @return system > itemId > qtty for this char
	 */
	public Map<String, Map<Integer, Long>> getCharSOs(EveChar c) {
		Date cacheExpire = expireSOsByCharName.get(c.name);
		Date now = new Date();
		if (cacheExpire != null && cacheExpire.after(now)) {
			logger.trace("returning old cache for so of character " + c.name);
			return cachedSOsByCharName.get(c.name);
		} else {
			Map<String, Map<Integer, Long>> itemsqtty = fetchCharSOs(c);
			cachedSOsByCharName.put(c.name, itemsqtty);
			expireSOsByCharName.put(c.name, new Date(now.getTime() + assetCacheDelayMinutes * 60000));
			logger.trace("new items for " + c.name + " : " + itemsqtty);
			return itemsqtty;
		}
	}

	/** get the name of a station's system */
	protected String getStationSystem(long stationId) {
		Station station = Station.load().get(Station.loadById().get((int) stationId));
		String system = null;
		if (station != null) {
			system = station.solarSystem;
		}
		return system;

	}

	/** fetch the assets of given character */
	protected Map<String, Map<Integer, Long>> fetchCharAssets(EveChar c) {
		HashMap<String, Map<Integer, Long>> itemsqtty = new HashMap<>();
		for (Entry<Long, ArrayList<Content>> e : c.assetList().entrySet()) {
			String system = getStationSystem(e.getKey());
			if (system != null) {
				Map<Integer, Long> sysItems = itemsqtty.get(system);
				if (sysItems == null) {
					sysItems = new HashMap<>();
					itemsqtty.put(system, sysItems);
				}
				for (Content co : e.getValue()) {
					sysItems.put(co.typeID, co.quantity + sysItems.getOrDefault(co.typeID, 0l));
					// System.err.println("inv " + c.name + " " + station.name + " " +
					// station.system + " "
					// + db.getElementById(co.typeID) + " : " + co.quantity);
				}
			} else {
				logger.debug("no station for char " + c.name + " assets with id " + e.getKey());
			}
		}
		return itemsqtty;
	}

	/** fetch BO of given character */
	protected Map<String, Map<Integer, Long>> fetchCharBOs(EveChar c) {
		HashMap<String, Map<Integer, Long>> itemsqtty = new HashMap<>();
		for (OrderEntry a : c.marketOrders()) {
			if (a.isOpen() && a.isBuyOrder()) {
				String system = getStationSystem(a.stationID);
				if (system == null) {
					logger.debug("no station for BO with id " + a.stationID);
				}
				Map<Integer, Long> sysGain = itemsqtty.get(system);
				if (sysGain == null) {
					sysGain = new HashMap<>();
					itemsqtty.put(system, sysGain);
				}
				sysGain.put(a.typeID, a.volRemaining + sysGain.getOrDefault(a.typeID, 0l));
			}
		}
		return itemsqtty;
	}

	/** fetch BO of given character */
	protected Map<String, Map<Integer, Long>> fetchCharSOs(EveChar c) {
		HashMap<String, Map<Integer, Long>> itemsqtty = new HashMap<>();
		for (OrderEntry a : c.marketOrders()) {
			if (a.isOpen() && !a.isBuyOrder()) {
				String system = getStationSystem(a.stationID);
				if (system == null) {
					logger.debug("no station for SO with id " + a.stationID);
				}
				Map<Integer, Long> sysGain = itemsqtty.get(system);
				if (sysGain == null) {
					sysGain = new HashMap<>();
					itemsqtty.put(system, sysGain);
				}
				sysGain.put(a.typeID, a.volRemaining + sysGain.getOrDefault(a.typeID, 0l));

			}
		}
		return itemsqtty;
	}

	// team management for bo, so, and assets

	// assets

	/**
	 * contains for each team the last list of items retrieved
	 */
	protected Map<String, Map<Integer, Long>> cachedTeamAssets = Collections.synchronizedMap(new HashMap<>());
	{
		settings.teams().addListener((MapChangeListener<String, TeamDescription>) change -> {
			if(change.wasRemoved()) {
				cachedTeamAssets.remove(change.getKey());
			}
		});
	}

	/**
	 * get the list of items for given team. fires a
	 * {@link #propagateFocusedTeamNewItems(Map)}
	 *
	 * @param team
	 *          the name of the team
	 * @return the new list of items.
	 */
	public Map<Integer, Long> getTeamAssets(String team) {
		if (team == null) {
			return Collections.emptyMap();
		}
		Map<Integer, Long> newItems = fetchTeamAssets(team, getTeamSystemLimit(team));

		Map<Integer, Long> oldItems = cachedTeamAssets.get(team);
		Map<Integer, Long> diff = new HashMap<>(newItems);
		if (oldItems != null) {
			for (Entry<Integer, Long> e : oldItems.entrySet()) {
				long value = newItems.getOrDefault(e.getKey(), 0l) - e.getValue();
				if (value != 0) {
					diff.put(e.getKey(), value);
				} else {
					diff.remove(e.getKey());
				}
			}
		}
		cachedTeamAssets.put(team, newItems);
		if (!diff.isEmpty()) {
			logger.trace("items diff for team " + team + " : " + diff);
			propagateTeamNewAssets(team, diff);
		}
		return newItems;
	}

	protected Map<Integer, Long> fetchTeamAssets(String name, Set<String> teamSystems) {
		Stream<Map.Entry<Integer, Long>> teamAssetsStream = streamTeamCharacters(name)
				.flatMap(c -> getCharAssets(c).entrySet().stream())
				.filter(e -> teamSystems.isEmpty() || teamSystems.contains(e.getKey()))
				.flatMap(e -> e.getValue().entrySet().stream());
		return teamAssetsStream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Long::sum));
	}

	public Map<Integer, Long> getFTeamAssets() {
		if (settings.focusedTeam == null) {
			logger.debug("null focused team");
			return Collections.emptyMap();
		}
		return getTeamAssets(settings.focusedTeam);
	}

	// bos

	public Map<Integer, Long> getTeamBOs(String team) {
		if (team == null) {
			logger.debug("null team");
			return Collections.emptyMap();
		}
		Set<String> teamSystems = getTeamSystemLimit(team);
		Stream<Map.Entry<Integer, Long>> teamBOsStream = streamTeamCharacters(team)
				.flatMap(c -> getCharBOs(c).entrySet().stream())
				.filter(e -> e.getKey() == null || teamSystems.isEmpty() || teamSystems.contains(e.getKey()))
				.flatMap(e -> e.getValue().entrySet().stream());
		return teamBOsStream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Long::sum));
	}

	// sos

	public Map<Integer, Long> getTeamSOs(String team) {
		if (team == null) {
			logger.debug("null team");
			return Collections.emptyMap();
		}
		Set<String> teamSystems = getTeamSystemLimit(team);
		Stream<Map.Entry<Integer, Long>> teamBOsStream = streamTeamCharacters(team)
				.flatMap(c -> getCharSOs(c).entrySet().stream())
				.filter(e -> e.getKey() == null || teamSystems.isEmpty() || teamSystems.contains(e.getKey()))
				.flatMap(e -> e.getValue().entrySet().stream());
		return teamBOsStream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Long::sum));
	}

	// debug

	protected static class DebugEntry {
		String message;
		Class<? extends EvePane> context;
		Date date;
	}

	protected TableView<DebugEntry> debugPane = new TableView<>();
	{
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		TableColumn<DebugEntry, String> dateCol = new TableColumn<>("date");
		dateCol.setCellValueFactory(ct -> new ReadOnlyObjectWrapper<>(dateFormat.format(ct.getValue().date)));
		debugPane.getColumns().add(dateCol);

		TableColumn<DebugEntry, String> ctxtCol = new TableColumn<>("context");
		ctxtCol.setCellValueFactory(ct -> new ReadOnlyObjectWrapper<>(ct.getValue().context.getSimpleName()));
		ctxtCol.setMinWidth(130);
		debugPane.getColumns().add(ctxtCol);

		TableColumn<DebugEntry, String> messCol = new TableColumn<>("message");
		messCol.setCellValueFactory(ct -> new ReadOnlyObjectWrapper<>(ct.getValue().message));
		messCol.setMinWidth(500);
		debugPane.getColumns().add(messCol);

		dateCol.setSortType(TableColumn.SortType.DESCENDING);
		dateCol.setSortable(true);
		debugPane.getSortOrder().add(dateCol);

	}

	/**
	 * add item to the debug pane. synchronized.
	 *
	 * @param clazz
	 *          the class of the item which wants to add an entry
	 * @param data
	 *          the information
	 */
	public void printDebug(Class<? extends EvePane> clazz, String data) {
		synchronized (debugPane) {
			DebugEntry de = new DebugEntry();
			de.message = data;
			de.context = clazz;
			de.date = new Date();
			debugPane.getItems().add(de);
			debugPane.sort();
		}
	}

	public void addShop(Map<String, Integer> items) {
		for (Entry<String, Integer> e : items.entrySet()) {
			settings.shopList().put(e.getKey(), settings.shopList().getOrDefault(e.getKey(), 0) + e.getValue());
		}
	}

	public void delShop(String key) {
		settings.shopList().remove(key);
	}

	public void setShop(String name, int qtty) {
		settings.shopList().put(name, qtty);
	}

	public void addJob(String bp, JobActivity activity, String details, int nbRuns) {
		ScheduledJob sj = new ScheduledJob(bp, activity, details);
		settings.scheduled().put(sj, settings.scheduled().getOrDefault(sj, 0) + nbRuns);
	}

}
