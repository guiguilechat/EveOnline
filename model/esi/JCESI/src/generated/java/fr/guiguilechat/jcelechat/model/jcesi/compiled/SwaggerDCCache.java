package fr.guiguilechat.jcelechat.model.jcesi.compiled;

import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Alliances;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Characters;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Contracts;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Corporations;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Dogma;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Fw;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Incursions;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Industry;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Insurance;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Killmails;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Loyalty;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Markets;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Opportunities;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Route;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Search;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Sovereignty;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Status;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Universe;
import fr.guiguilechat.jcelechat.model.jcesi.compiled.disconnected.Wars;
import fr.guiguilechat.jcelechat.model.jcesi.interfaces.ISwaggerCacheHelper;

public abstract class SwaggerDCCache<T extends G_IDCAccess>
    implements ISwaggerCacheHelper
{
    public final T swagger;
    public final Alliances alliances = new Alliances(this);
    public final Characters characters = new Characters(this);
    public final Contracts contracts = new Contracts(this);
    public final Corporations corporations = new Corporations(this);
    public final Dogma dogma = new Dogma(this);
    public final Fw fw = new Fw(this);
    public final Incursions incursions = new Incursions(this);
    public final Industry industry = new Industry(this);
    public final Insurance insurance = new Insurance(this);
    public final Killmails killmails = new Killmails(this);
    public final Loyalty loyalty = new Loyalty(this);
    public final Markets markets = new Markets(this);
    public final Opportunities opportunities = new Opportunities(this);
    public final Route route = new Route(this);
    public final Sovereignty sovereignty = new Sovereignty(this);
    public final Status status = new Status(this);
    public final Universe universe = new Universe(this);
    public final Wars wars = new Wars(this);
    public final Search search = new Search(this);

    public SwaggerDCCache(T swag) {
        swagger = swag;
    }
}