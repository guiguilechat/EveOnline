package fr.guiguilechat.jcelechat.model.sde.items.types.skill;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class Scanning
    extends Skill
{
    /**
     * Bonus to chance of opening a container (for skills).
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int AccessDifficultyBonusAbsolutePercent;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationBonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxScanDeviationModifier;
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
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanStrengthBonus;
    /**
     * Autogenerated skill attribute, scanspeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ScanspeedBonus;
    /**
     * Adds to the virus coherence of profession modules
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int VirusCoherenceBonus;
    public final static Scanning.MetaGroup METAGROUP = new Scanning.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1772 :
            {
                return AccessDifficultyBonusAbsolutePercent;
            }
            case  66 :
            {
                return DurationBonus;
            }
            case  1156 :
            {
                return MaxScanDeviationModifier;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  846 :
            {
                return ScanStrengthBonus;
            }
            case  308 :
            {
                return ScanspeedBonus;
            }
            case  1915 :
            {
                return VirusCoherenceBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<Scanning> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Scanning>
    {
        public final static String RESOURCE_PATH = "SDE/items/skill/Scanning.yaml";
        private Map<String, Scanning> cache = (null);

        @Override
        public IMetaCategory<? super Scanning> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1217;
        }

        @Override
        public String getName() {
            return "Scanning";
        }

        @Override
        public synchronized Map<String, Scanning> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(Scanning.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Scanning> items;
        }
    }
}
