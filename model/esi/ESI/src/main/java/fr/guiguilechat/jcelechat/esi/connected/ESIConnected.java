package fr.guiguilechat.jcelechat.esi.connected;

import java.util.Arrays;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.guiguilechat.jcelechat.esi.ConnectedImpl;
import fr.guiguilechat.jcelechat.esi.ESITools;
import fr.guiguilechat.jcelechat.esi.ESITools.AccessToken;
import fr.guiguilechat.jcelechat.model.esi.compiled.G_ICOAccess;
import fr.guiguilechat.tools.JFXTools;
import javafx.collections.ObservableSet;

/**
 * raw access to the esi services using a connection.
 *
 */
public class ESIConnected extends ConnectedImpl implements G_ICOAccess {

	private static final Logger logger = LoggerFactory.getLogger(ESIConnected.class);

	private final String basicAuth, refreshToken;

	protected AccessToken accessToken = null;

	public final CacheConnected cache = new CacheConnected(this);

	public ESIConnected(String refreshToken, String basicAuth) {
		this.basicAuth = basicAuth;
		this.refreshToken = refreshToken;
	}

	public boolean isNull() {
		return basicAuth == null || refreshToken == null;
	}

	protected String getAccessToken() {
		if (accessToken == null || accessToken.expire < System.currentTimeMillis()) {
			logger.trace("fetching access token");
			accessToken = ESITools.getAccessToken(basicAuth, refreshToken);
		}
		return accessToken == null ? null : accessToken.token;
	}

	@Override
	protected void addConnection(HashMap<String, String> props) {
		props.put("Authorization", "Bearer " + getAccessToken());
	}


	public static class R_Verify {
		public int CharacterID;
		public String CharacterName;
		public String ExpiresOn;
		public String Scopes;
		public String TokenType;
		public String CharacterOwnerHash;
		public String IntellectualProperty;
	}

	private R_Verify verify;

	private static final R_Verify NULLVERIFY = new R_Verify() {
		{
			CharacterID = 0;
			CharacterName = "DISCONNECTED";
			ExpiresOn = "";
			Scopes = "";
			TokenType = "";
			CharacterOwnerHash = "";
			IntellectualProperty = "";
		}
	};

	public R_Verify verify() {
		if (verify == null) {
			synchronized (this) {
				if (verify == null) {
					verify = isNull() ? NULLVERIFY
							: convert(connectGet("https://login.eveonline.com/oauth/verify", null), R_Verify.class);
				}
			}
		}
		return verify;
	}

	@Override
	public int hashCode() {
		return (basicAuth != null ? basicAuth.hashCode() : 0) + (refreshToken != null ? refreshToken.hashCode() : 0);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != ESIConnected.class) {
			return false;
		}
		ESIConnected o = (ESIConnected) obj;
		return (refreshToken == null && o.refreshToken == null
				|| refreshToken != null && refreshToken.equals(o.refreshToken))
				&& (basicAuth == null && o.basicAuth == null || basicAuth != null && basicAuth.equals(o.basicAuth));
	}

	// getting the roles

	private ObservableSet<String> roles;

	@Override
	public ObservableSet<String> getRoles() {
		if (roles == null) {
			synchronized (this) {
				if (roles == null) {
					roles = JFXTools.makeSet(cache.characters.roles(verify().CharacterID), r -> Arrays.asList(r.roles));
				}
			}
		}
		return roles;
	}
}
