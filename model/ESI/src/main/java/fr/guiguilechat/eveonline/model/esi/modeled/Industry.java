package fr.guiguilechat.eveonline.model.esi.modeled;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.guiguilechat.eveonline.model.esi.direct.ESIRawConnection;
import is.ccp.tech.esi.responses.R_get_industry_systems;
import is.ccp.tech.esi.responses.R_get_industry_systems_cost_indices;

public class Industry {

	protected final ESIRawConnection raw;

	public Industry(ESIRawConnection raw) {
		this.raw = raw;
	}

	public IndustryIndices getSystemIndices(int sysID) {
		dlIndexes();
		synchronized (systemIndicesCache) {
			return systemIndicesCache.get(sysID);
		}
	}

	private long systemIndicesCacheEnd = 0;

	private Map<Integer, IndustryIndices> systemIndicesCache = new HashMap<>();

	private void dlIndexes() {
		if (System.currentTimeMillis() <= systemIndicesCacheEnd) {
			return;
		}
		synchronized (systemIndicesCache) {
			Map<String, List<String>> headers = new HashMap<>();
			R_get_industry_systems[] results = raw.get_industry_systems(headers);
			systemIndicesCache.clear();
			for (R_get_industry_systems r : results) {
				int sysid = r.solar_system_id;
				IndustryIndices indices = new IndustryIndices();
				for (R_get_industry_systems_cost_indices t : r.cost_indices) {
					switch (t.activity) {
					case "copying":
						indices.copying = t.cost_index;
					case "invention":
						indices.invention = t.cost_index;
					case "manufacturing":
						indices.manufacturing = t.cost_index;
					case "reaction":
						indices.reaction = t.cost_index;
					case "researching_material_efficiency":
						indices.researching_material_efficiency = t.cost_index;
					case "researching_time_efficiency":
						indices.researching_time_efficiency = t.cost_index;
						break;
					default:
						throw new UnsupportedOperationException("can't handle activity " + t.activity);
					}
				}
				systemIndicesCache.put(sysid, indices);
			}
			systemIndicesCacheEnd = System.currentTimeMillis()
					+ 1000
							* ZonedDateTime.parse(headers.get("Expires").get(0), DateTimeFormatter.RFC_1123_DATE_TIME).toEpochSecond()
					- 1000
							* ZonedDateTime.parse(headers.get("Date").get(0), DateTimeFormatter.RFC_1123_DATE_TIME).toEpochSecond();
		}
	}

	public static class IndustryIndices {
		public float manufacturing, researching_time_efficiency, researching_material_efficiency, copying, invention,
		reaction;
	}

}
