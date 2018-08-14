package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Social
    extends Skill
{
    /**
     * Autogenerated skill attribute, connectionBonusMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ConnectionBonusMutator;
    /**
     * Autogenerated skill attribute, criminalConnectionsMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double CriminalConnectionsMutator;
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
    /**
     * Autogenerated skill attribute, NegotiationBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int NegotiationBonus;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2;
    /**
     * Required skill level for skill 2
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill2Level;
    /**
     * Autogenerated skill attribute, socialMutator
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SocialMutator;
    public final static Social.MetaGroup METAGROUP = new Social.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  412 :
            {
                return ConnectionBonusMutator;
            }
            case  413 :
            {
                return CriminalConnectionsMutator;
            }
            case  414 :
            {
                return DiplomacyMutator;
            }
            case  415 :
            {
                return FastTalkMutator;
            }
            case  437 :
            {
                return NegotiationBonus;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  438 :
            {
                return SocialMutator;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Social> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Social>
    {
        public final static String RESOURCE_PATH = "SDE/items/skill/Social.yaml";
        private Map<String, Social> cache = (null);

        @Override
        public IMetaCategory<? super Social> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  278;
        }

        @Override
        public String getName() {
            return "Social";
        }

        @Override
        public synchronized Map<String, Social> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Social.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Social> items;
        }
    }
}
