package fr.guiguilechat.eveonline.database.esi;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ESINpcCorporations {

	public static class Corporation {
		public int ceo_id;
		public String corporation_description;
		public String corporation_name;
		public int creator_id;
		public String faction;
		public int member_count;
		public double tax_rate;
		public String ticker;
		public String url;
	}

	private final String CORPORATIONS_LIST_URL = "https://esi.tech.ccp.is/latest/corporations/npccorps";

	private final ObjectMapper om = new ObjectMapper();

	int[] ids = null;

	public int[] getIDs() {
		if (ids == null) {
			try {
				ids = om.readValue(new URL(CORPORATIONS_LIST_URL), int[].class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ids;
	}

	private final String CORPORATIONS_DETAIL_URL = "https://esi.tech.ccp.is/latest/corporations/";

	private LinkedHashMap<Integer, Corporation> cachedCorpos = null;

	/** set to true when all corporations are loaded */
	private boolean fullLoad = false;

	public LinkedHashMap<Integer, Corporation> getCorpos() {
		// first case : we loaded NO corporation. load all.
		if (cachedCorpos == null) {
			cachedCorpos = new LinkedHashMap<>();
			Map<Integer, Corporation> syncCache = Collections.synchronizedMap(cachedCorpos);
			IntStream.of(getIDs()).parallel().forEach(i -> syncCache.put(i, loadCorporation(i)));
			fullLoad = true;
		}
		// second case : we got some corporations already. load all the other ones.
		if (!fullLoad) {
			Map<Integer, Corporation> syncCache = Collections.synchronizedMap(cachedCorpos);
			IntStream.of(getIDs()).filter(i -> !syncCache.containsKey(i)).parallel()
			.forEach(i -> syncCache.put(i, loadCorporation(i)));
			fullLoad = true;
		}
		return cachedCorpos;
	}

	/**
	 * get corporation informations
	 *
	 * @param id
	 *          the corporation id
	 * @return the cached data. if not in cache, cache it.
	 */
	public Corporation getCorpo(int id) {
		if (cachedCorpos == null) {
			cachedCorpos = new LinkedHashMap<>();
		}
		Corporation corpo = cachedCorpos.get(id);
		if (corpo == null) {
			corpo = loadCorporation(id);
			cachedCorpos.put(id, corpo);
		}
		return corpo;
	}

	protected Corporation loadCorporation(int id) {
		Corporation ret = null;
		try {
			ret = om.readValue(new URL(CORPORATIONS_DETAIL_URL + id), Corporation.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	public static void main(String[] args) {
		for (Entry<Integer, Corporation> e : new ESINpcCorporations().getCorpos().entrySet()) {
			System.err.println(" " + e.getKey() + " :" + e.getValue().corporation_name);
		}
	}

}
