package fr.guiguilechat.jcelechat.esi.connected.modeled;

public class Route {

	protected final ESIAccount con;

	public Route(ESIAccount con) {
		this.con = con;
	}

	public void append(long locationId) {
		con.raw.post_ui_autopilot_waypoint(false, false, locationId, null);
	}

	public void insert(long locationId) {
		con.raw.post_ui_autopilot_waypoint(true, false, locationId, null);
	}

	public void setDesto(long locationId) {
		con.raw.post_ui_autopilot_waypoint(true, true, locationId, null);
	}

	public void setRoute(long... locationIds) {
		if (locationIds == null || locationIds.length == 0) {
			return;
		}
		boolean cleared = false;
		for (long loc : locationIds) {
			if (cleared) {
				append(loc);
			} else {
				setDesto(loc);
			}
			cleared = true;
		}
	}

}