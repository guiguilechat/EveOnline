package fr.guiguilechat.eveonline.model.sde.items.types.implant;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.eveonline.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.eveonline.model.sde.items.annotations.Stackable;
import fr.guiguilechat.eveonline.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberSocial
    extends Implant
{
    /**
     * Autogenerated skill attribute, NegotiationBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NegotiationBonus;
    /**
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    /**
     * Autogenerated skill attribute, socialMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SocialMutator;
    /**
     * Bonus To standing gain towards non CONCORD npcs  
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(100)
    public int SocialBonus;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, connectionBonusMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ConnectionBonusMutator;
    /**
     * Autogenerated skill attribute, diplomacyMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double DiplomacyMutator;
    /**
     * Autogenerated skill attribute, fastTalkMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FastTalkMutator;
    public final static String RESOURCE_PATH = "SDE/items/implant/CyberSocial.yaml";
    private static LinkedHashMap<String, CyberSocial> cache = (null);

    @Override
    public int getGroupId() {
        return  750;
    }

    @Override
    public Class<?> getGroup() {
        return CyberSocial.class;
    }

    public static synchronized LinkedHashMap<String, CyberSocial> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(CyberSocial.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return (cache);
    }

    private static class Container {
        public LinkedHashMap<String, CyberSocial> items;
    }
}
