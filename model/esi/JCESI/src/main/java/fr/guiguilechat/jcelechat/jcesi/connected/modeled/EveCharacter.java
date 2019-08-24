package fr.guiguilechat.jcelechat.jcesi.connected.modeled;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.guiguilechat.jcelechat.jcesi.ESITools;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Attributes;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.CharBookmarks;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Industry;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Informations;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Location;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Notifications;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Skills;
import fr.guiguilechat.jcelechat.jcesi.connected.modeled.character.Wallet;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.M_get_standings_3;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_assets;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_attributes;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_industry_jobs;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_loyalty_points;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_online;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_orders;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_roles;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_characters_character_id_wallet_journal;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_corporations_corporation_id_industry_jobs;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.R_get_universe_types_type_id;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.responses.get_dogma_dynamic_items_type_id_item_id_dogma_attributes;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.get_characters_character_id_assets_location_flag;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.get_characters_character_id_roles_roles;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.get_characters_character_id_roles_roles_at_base;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.get_characters_character_id_roles_roles_at_hq;
import fr.guiguilechat.jcelechat.model.jcesi.compiler.compiled.structures.get_characters_character_id_roles_roles_at_other;
import fr.lelouet.collectionholders.impl.collections.ObsMapHolderImpl;
import fr.lelouet.collectionholders.impl.numbers.ObsDoubleHolderImpl;
import fr.lelouet.collectionholders.interfaces.ObsObjHolder;
import fr.lelouet.collectionholders.interfaces.collections.ObsListHolder;
import fr.lelouet.collectionholders.interfaces.collections.ObsMapHolder;
import fr.lelouet.collectionholders.interfaces.collections.ObsSetHolder;
import fr.lelouet.collectionholders.interfaces.numbers.ObsBoolHolder;
import fr.lelouet.collectionholders.interfaces.numbers.ObsDoubleHolder;
import fr.lelouet.collectionholders.interfaces.numbers.ObsIntHolder;
import fr.lelouet.tools.synchronization.LockWatchDog;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.LongBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableNumberValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableMap;

public class EveCharacter {

	protected final ESIAccount con;

	public final Attributes attributes;

	public final CharBookmarks bms;

	public final Industry industry;

	public final Informations infos;

	public final Location location;

	public final Notifications notifications;

	public final Skills skills;

	public final Wallet wallet;

	public EveCharacter(ESIAccount con) {
		this.con = con;
		attributes = new Attributes(con);
		bms = new CharBookmarks(con);
		industry = new Industry(con);
		infos = new Informations(con);
		location = new Location(con);
		notifications = new Notifications(con);
		skills = new Skills(con);
		wallet = new Wallet(con);
	}

	//
	// roles
	//

	public ObsObjHolder<R_get_characters_character_id_roles> getRolesData() {
		return con.raw.cache.characters.roles(con.characterId());
	}

	private ObsSetHolder<get_characters_character_id_roles_roles> rolesCache = null;

	public ObsSetHolder<get_characters_character_id_roles_roles> getRoles() {
		if (rolesCache == null) {
			ObsObjHolder<R_get_characters_character_id_roles> data = getRolesData();
			LockWatchDog.BARKER.syncExecute(data, () -> {
				if (rolesCache == null) {
					rolesCache = data.toList(roles -> Arrays.asList(roles.roles)).distinct();
				}
			});
		}
		return rolesCache;
	}

	private ObsSetHolder<get_characters_character_id_roles_roles_at_hq> rolesHQCache = null;

	public ObsSetHolder<get_characters_character_id_roles_roles_at_hq> getRolesHQ() {
		if (rolesHQCache == null) {
			ObsObjHolder<R_get_characters_character_id_roles> data = getRolesData();
			LockWatchDog.BARKER.syncExecute(data, () -> {
				if (rolesHQCache == null) {
					rolesHQCache = data.toList(roles -> Arrays.asList(roles.roles_at_hq)).distinct();
				}
			});
		}
		return rolesHQCache;
	}

	private ObsSetHolder<get_characters_character_id_roles_roles_at_base> rolesBaseCache = null;

	public ObsSetHolder<get_characters_character_id_roles_roles_at_base> getRolesBase() {
		if (rolesBaseCache == null) {
			ObsObjHolder<R_get_characters_character_id_roles> data = getRolesData();
			LockWatchDog.BARKER.syncExecute(data, () -> {
				if (rolesBaseCache == null) {
					rolesBaseCache = data.toList(roles -> Arrays.asList(roles.roles_at_base)).distinct();
				}
			});
		}
		return rolesBaseCache;
	}

	private ObsSetHolder<get_characters_character_id_roles_roles_at_other> rolesOtherCache = null;

	public ObsSetHolder<get_characters_character_id_roles_roles_at_other> getRolesOthers() {
		if (rolesOtherCache == null) {
			ObsObjHolder<R_get_characters_character_id_roles> data = getRolesData();
			LockWatchDog.BARKER.syncExecute(data, () -> {
				if (rolesOtherCache == null) {
					rolesOtherCache = data.toList(roles -> Arrays.asList(roles.roles_at_other)).distinct();
				}
			});
		}
		return rolesOtherCache;
	}

	//
	// online state
	//

	private ObsObjHolder<R_get_characters_character_id_online> online = null;

	protected ObsObjHolder<R_get_characters_character_id_online> getOnline() {
		if (online == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (online == null) {
					online = con.raw.cache.characters.online(con.characterId());
				}
			});
		}
		return online;
	}

	private ObsBoolHolder isonline = null;

	public ObsBoolHolder isOnline() {
		if (isonline == null) {
			LockWatchDog.BARKER.syncExecute(getOnline(), () -> {
				if (isonline == null) {
					isonline = getOnline().test(onl -> onl.online);
				}
			});
		}
		return isonline;
	}

	private ObsObjHolder<OffsetDateTime> lastlogin = null;

	public ObsObjHolder<OffsetDateTime> getLastLogin() {
		if (lastlogin == null) {
			LockWatchDog.BARKER.syncExecute(getOnline(), () -> {
				if (lastlogin == null) {
					lastlogin = getOnline().map(onl -> ESITools.convertDate(onl.last_login));
				}
			});
		}
		return lastlogin;
	}

	private ObsObjHolder<OffsetDateTime> lastlogout = null;

	public ObsObjHolder<OffsetDateTime> getLastlogout() {
		if (lastlogout == null) {
			LockWatchDog.BARKER.syncExecute(getOnline(), () -> {
				if (lastlogout == null) {
					lastlogout = getOnline()
							.map(onl -> ESITools.convertDate(onl.last_logout));
				}
			});
		}
		return lastlogout;
	}

	// slots for industry jobs

	private ObsIntHolder researchSlots = null;

	public ObsIntHolder availableResearchSlots() {
		if(researchSlots==null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (researchSlots == null) {
					// System.err.println("making research slots for " +
					// con.characterName());
					ObsIntHolder jobs = industry.getResearchJobs().size();
					// System.err.println("indus jobs is " + jobs.get());
					ObsIntHolder corpJobs = con.corporation.getIndustryJobs().values()
							.filter(j -> j.installer_id == con.characterId() && (Corporation.isCopy(j) || Corporation.isInvention(j)
									|| Corporation.isME(j) || Corporation.isTE(j)))
							.size();
					// System.err.println("corps jobs is " + corpJobs.get());
					ObsIntHolder skill1 = skills.ID2Level().at(3406, 0).mapInt(i -> i);
					// System.err.println("skill 3406 is " + skill1.get());
					ObsIntHolder skill2 = skills.ID2Level().at(24624, 0).mapInt(i -> i);
					// System.err.println("skill 24624 is " + skill2.get());
					ObsIntHolder totalSlots = skill1.add(skill2).add(1);
					// System.err.println("total slots is " + totalSlots.get());
					ObsIntHolder totalJobs = jobs.add(corpJobs);
					// System.err.println("total jobs is " + totalJobs.get());
					researchSlots = totalSlots.sub(totalJobs);
					// System.err.println("research slots is " + researchSlots.get());
				}
			});
		}
		return researchSlots;
	}

	public ObservableNumberValue availableManufSlots() {
		ObsMapHolder<Integer, R_get_characters_character_id_industry_jobs> charjobs = industry.getIndustryJobs();
		charjobs.values().filter(Industry::isManufacture).size();
		LongBinding charJobsVar = Bindings.createLongBinding(() -> {
			synchronized (charjobs) {
				return charjobs.get().values().stream().filter(Industry::isManufacture).count();
			}
		}, charjobs.asObservable());
		ObsMapHolder<Integer, R_get_corporations_corporation_id_industry_jobs> corpJobs = con.corporation.getIndustryJobs();
		LongBinding corpJobsVar = Bindings.createLongBinding(() -> {
			synchronized (corpJobs) {
				return corpJobs.get().values().stream().filter(j -> j.installer_id == con.characterId())
						.filter(j -> Corporation.isManufacture(j)).count();
			}
		}, corpJobs.asObservable());
		return new SimpleIntegerProperty(
				1 + skills.ID2Level().getOrDefault(3387, 0) + skills.ID2Level().getOrDefault(24625, 0)).subtract(charJobsVar)
				.subtract(corpJobsVar);
	}

	//
	// assets
	//

	// locationid->typeid->number
	private ObsMapHolder<Long, ObservableMap<Integer, Integer>> cachedAssets = null;

	/**
	 *
	 * @return the locationID->typeid->quantity
	 */
	public ObsMapHolder<Long, ObservableMap<Integer, Integer>> getAssets() {
		if (cachedAssets == null) {
			synchronized (this) {
				if (cachedAssets == null) {
					ObsListHolder<R_get_characters_character_id_assets> assets = con.raw.cache.characters
							.assets(con.characterId());
					ObservableMap<Long, ObservableMap<Integer, Integer>> map = FXCollections.observableHashMap();
					cachedAssets = con.raw.cache.toHolder(map);
					synchronized (assets) {
						assets.followItems(c -> applyNewAssets(c, map));
						assets.follow((ass) -> cachedAssets.dataReceived());
					}

				}
			}
		}
		return cachedAssets;
	}

	/**
	 * get the assets and production of a character
	 *
	 * @param account
	 *          the account of a character
	 * @return the map of itemid to qtty for each assets this character owns.
	 */
	public Map<Integer, Integer> getAssetsProd() {
		Map<Integer, Integer> assets = getAssets().get().values().parallelStream().flatMap(m -> m.entrySet().stream())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), Integer::sum));
		Map<Integer, Integer> prod = industry.getIndustryJobs().get().values().stream().parallel()
				.filter(Industry::isManufacture)
				.collect(Collectors.toMap(e -> e.product_type_id, e -> e.runs, Integer::sum));
		return Stream.concat(assets.entrySet().stream(), prod.entrySet().stream())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::sum));
	}

	/**
	 * called when a change happens to the list of assets. When this happens, we
	 * recreate the whole map and put it back .
	 *
	 * @param c
	 * @param map
	 */
	protected void applyNewAssets(Change<? extends R_get_characters_character_id_assets> c,
			ObservableMap<Long, ObservableMap<Integer, Integer>> map) {
		c.next();

		// the listener is called everytime the full list of items in
		// modified. thus everytime, we recreate it
		R_get_characters_character_id_assets[] itemsArr = c.getAddedSubList().stream()
				.filter(asset -> !get_characters_character_id_assets_location_flag.AutoFit.equals(asset.location_flag))
				.toArray(R_get_characters_character_id_assets[]::new);

		// we make the map of itemid->locations. if a location is actually an
		// asset, we iteratively map it to this asset's location instead
		Map<Long, Long> baseLocationMap = Stream.of(itemsArr)
				.collect(Collectors.toMap(i -> i.item_id, i -> i.location_id, (l1, l2) -> l1));
		Map<Long, Long> idToLocation = baseLocationMap.entrySet().stream().collect(Collectors.toMap(Entry::getKey, e -> {
			Long ret = e.getValue();
			while (baseLocationMap.containsKey(ret)) {
				ret = baseLocationMap.get(ret);
			}
			return ret;
		}));

		Map<Long, Map<Integer, Integer>> newitems = Stream.of(itemsArr)
				.collect(Collectors.toMap(a -> idToLocation.get(a.item_id), EveCharacter::makeMap, EveCharacter::mergeMap));
		synchronized (map) {
			map.keySet().retainAll(newitems.keySet());
			for (Entry<Long, Map<Integer, Integer>> e : newitems.entrySet()) {
				ObservableMap<Integer, Integer> om = map.get(e.getKey());
				if (om == null) {
					om = FXCollections.observableHashMap();
					map.put(e.getKey(), om);
				}
				om.keySet().retainAll(e.getValue().keySet());
				om.putAll(e.getValue());
			}
		}
	}

	private static Map<Integer, Integer> makeMap(R_get_characters_character_id_assets asset) {
		Map<Integer, Integer> ret = new HashMap<>();
		ret.put(asset.type_id, asset.quantity);
		return ret;
	}

	private static Map<Integer, Integer> mergeMap(Map<Integer, Integer> m1, Map<Integer, Integer> m2) {
		for (Entry<Integer, Integer> e : m2.entrySet()) {
			m1.merge(e.getKey(), e.getValue(), (a, b) -> a + b);
		}
		return m1;
	}

	//
	// market orders
	//

	private ObsMapHolder<Integer, Integer> marketSOs = null;

	private ObsMapHolder<Integer, Integer> marketBOs = null;

	private void makeBOSOs() {
		if (marketSOs == null || marketBOs == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (marketSOs == null || marketBOs == null) {
					ObservableMap<Integer, Integer> underlyingsos = FXCollections.observableMap(new HashMap<>());
					ObsMapHolderImpl<Integer, Integer> newmarketSOs = new ObsMapHolderImpl<>(underlyingsos);
					ObservableMap<Integer, Integer> underlyingbos = FXCollections.observableMap(new HashMap<>());
					ObsMapHolderImpl<Integer, Integer> newmarketBOs = new ObsMapHolderImpl<>(underlyingbos);
					getMarketOrders().follow((map) -> {
						HashMap<Integer, Integer> newMapsos = new HashMap<>();
						HashMap<Integer, Integer> newMapbos = new HashMap<>();
						for (R_get_characters_character_id_orders v : map.values()) {
							if (!v.is_buy_order) {
								newMapsos.put(v.type_id, newMapsos.getOrDefault(v.type_id, 0) + v.volume_remain);
							} else {
								newMapbos.put(v.type_id, newMapbos.getOrDefault(v.type_id, 0) + v.volume_remain);
							}
						}
						synchronized (underlyingsos) {
							underlyingsos.keySet().retainAll(newMapsos.keySet());
							underlyingsos.putAll(newMapsos);
						}
						newmarketSOs.dataReceived();
						synchronized (underlyingbos) {
							underlyingbos.keySet().retainAll(newMapbos.keySet());
							underlyingbos.putAll(newMapbos);
						}
						newmarketBOs.dataReceived();
					});
					marketSOs = newmarketSOs;
					marketBOs = newmarketBOs;
				}
			});
		}
	}

	public ObsMapHolder<Integer, Integer> getMarketSOs() {
		makeBOSOs();
		return marketSOs;
	}

	public ObsMapHolder<Integer, Integer> getMarketBOs() {
		makeBOSOs();
		return marketBOs;
	}

	private ObsMapHolder<Long, R_get_characters_character_id_orders> cacheOrders = null;

	public ObsMapHolder<Long, R_get_characters_character_id_orders> getMarketOrders() {
		if (cacheOrders == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (cacheOrders == null) {
					cacheOrders = ObsMapHolderImpl.toMap(con.raw.cache.characters.orders(con.characterId()), o -> o.order_id);
				}
			});
		}
		return cacheOrders;
	}

	//
	// journal
	//

	private ObsMapHolder<Long, R_get_characters_character_id_wallet_journal> journal;

	public ObsMapHolder<Long, R_get_characters_character_id_wallet_journal> getJournal() {
		if (journal == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (journal == null) {
					journal = con.raw.cache.characters.wallet_journal(con.characterId()).toMap(j -> j.id);
				}
			});
		}
		return journal;
	}

	//
	// standings
	//

	private ObsMapHolder<Integer, M_get_standings_3> standings;

	public ObsMapHolder<Integer, M_get_standings_3> getStandings() {
		if (standings == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (standings == null) {
					standings = con.raw.cache.characters.standings(con.characterId()).toMap(std -> std.from_id);
				}
			});
		}
		return standings;
	}

	//
	// LP
	//

	private ObsMapHolder<Integer, R_get_characters_character_id_loyalty_points> lps;

	public ObsMapHolder<Integer, R_get_characters_character_id_loyalty_points> getLPs() {
		if (lps == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (lps == null) {
					lps = con.raw.cache.characters.loyalty_points(con.characterId()).toMap(lp -> lp.corporation_id);
				}
			});
		}
		return lps;
	}

	//
	// skills and training
	//

	ObsDoubleHolder currentAcquisitionRate = null;

	public ObsDoubleHolder getCurrentHourlySPRate() {
		if(currentAcquisitionRate==null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				if (currentAcquisitionRate == null) {
					ObsDoubleHolderImpl ret = new ObsDoubleHolderImpl();
					R_get_universe_types_type_id[] holdSkil = new 	R_get_universe_types_type_id[1];
					R_get_characters_character_id_attributes[] holdAtt = new R_get_characters_character_id_attributes[1];
					Runnable apply = () -> {
						if (holdSkil[0] != null && holdAtt[0] != null) {
							ret.set(getHourlySPRate(holdSkil[0], holdAtt[0]));
						}
					};
					skills.getTrainingSkill().follow((newValue) -> {
						holdSkil[0] = newValue;
						apply.run();
					});
					attributes.get().follow((newValue) -> {
						holdAtt[0] = newValue;
						apply.run();
					});
					currentAcquisitionRate = ret;
				}
			});
		}
		return currentAcquisitionRate;
	}

	public static double getHourlySPRate(R_get_universe_types_type_id skill,
			R_get_characters_character_id_attributes attributes) {
		if (skill.type_id == 0) {
			return 0.0;
		}
		get_dogma_dynamic_items_type_id_item_id_dogma_attributes dogma_primary = Stream.of(skill.dogma_attributes)
				.filter(att -> att.attribute_id == 180).findAny().orElse(null);
		get_dogma_dynamic_items_type_id_item_id_dogma_attributes dogma_secondary = Stream.of(skill.dogma_attributes)
				.filter(att -> att.attribute_id == 181).findAny().orElse(null);
		return 60 * (dogma_primary != null ? Attributes.getAttribute((int) dogma_primary.value, attributes) : 0)
				+ 30 * (dogma_secondary != null ? Attributes.getAttribute((int) dogma_secondary.value, attributes) : 0);
	}

	//
	// alpha state
	//

	ObsBoolHolder isAlpha = null;

	public ObsBoolHolder isAlpha() {
		if (isAlpha == null) {
			LockWatchDog.BARKER.syncExecute(this, () -> {
				ObsBoolHolder limited = skills.hasLimitedskill();
				ObsBoolHolder training = skills.getCurrentSkillAvgAcquisitionRate().test(d -> d > 0);
				ObsDoubleHolder theoretical = getCurrentHourlySPRate();
				ObsDoubleHolder effective = skills.getCurrentSkillAvgAcquisitionRate();
				isAlpha = limited.or(training.and(effective.div(theoretical).test(d -> d < 0.55)));
			});
		}
		return isAlpha;
	}

}
