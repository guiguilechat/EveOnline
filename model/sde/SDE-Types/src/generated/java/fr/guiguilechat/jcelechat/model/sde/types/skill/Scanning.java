package fr.guiguilechat.jcelechat.model.sde.types.skill;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.attributes.AccessDifficultyBonusAbsolutePercent;
import fr.guiguilechat.jcelechat.model.sde.attributes.Capacity;
import fr.guiguilechat.jcelechat.model.sde.attributes.DurationBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.Mass;
import fr.guiguilechat.jcelechat.model.sde.attributes.MaxScanDeviationModifier;
import fr.guiguilechat.jcelechat.model.sde.attributes.PrimaryAttribute;
import fr.guiguilechat.jcelechat.model.sde.attributes.Radius;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill1Level;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill2;
import fr.guiguilechat.jcelechat.model.sde.attributes.RequiredSkill2Level;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanStrengthBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.ScanspeedBonus;
import fr.guiguilechat.jcelechat.model.sde.attributes.SecondaryAttribute;
import fr.guiguilechat.jcelechat.model.sde.attributes.SkillLevel;
import fr.guiguilechat.jcelechat.model.sde.attributes.SkillTimeConstant;
import fr.guiguilechat.jcelechat.model.sde.attributes.VirusCoherenceBonus;
import fr.guiguilechat.jcelechat.model.sde.types.Skill;
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
    public int accessdifficultybonusabsolutepercent;
    /**
     * Bonus to duration.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int durationbonus;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int maxscandeviationmodifier;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int requiredskill2;
    /**
     * Required skill level for skill 2
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int requiredskill2level;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int scanstrengthbonus;
    /**
     * Autogenerated skill attribute, scanspeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int scanspeedbonus;
    /**
     * Adds to the virus coherence of profession modules
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int viruscoherencebonus;
    public static final Set<Attribute> ATTRIBUTES = Collections.unmodifiableSet(new LinkedHashSet<>(Arrays.asList(new Attribute[] {DurationBonus.INSTANCE, Radius.INSTANCE, MaxScanDeviationModifier.INSTANCE, Mass.INSTANCE, Capacity.INSTANCE, AccessDifficultyBonusAbsolutePercent.INSTANCE, ScanStrengthBonus.INSTANCE, SkillTimeConstant.INSTANCE, ScanspeedBonus.INSTANCE, PrimaryAttribute.INSTANCE, RequiredSkill1Level.INSTANCE, SecondaryAttribute.INSTANCE, RequiredSkill2Level.INSTANCE, RequiredSkill1 .INSTANCE, RequiredSkill2 .INSTANCE, SkillLevel.INSTANCE, VirusCoherenceBonus.INSTANCE })));
    public static final Scanning.MetaGroup METAGROUP = new Scanning.MetaGroup();

    @Override
    public Number valueSet(Attribute attribute) {
        switch (attribute.getId()) {
            case  1772 :
            {
                return accessdifficultybonusabsolutepercent;
            }
            case  66 :
            {
                return durationbonus;
            }
            case  1156 :
            {
                return maxscandeviationmodifier;
            }
            case  183 :
            {
                return requiredskill2;
            }
            case  278 :
            {
                return requiredskill2level;
            }
            case  846 :
            {
                return scanstrengthbonus;
            }
            case  308 :
            {
                return scanspeedbonus;
            }
            case  1915 :
            {
                return viruscoherencebonus;
            }
            default:
            {
                return super.valueSet((attribute));
            }
        }
    }

    @Override
    public Set<Attribute> getAttributes() {
        return ATTRIBUTES;
    }

    @Override
    public IMetaGroup<Scanning> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<Scanning>
    {
        public static final String RESOURCE_PATH = "SDE/types/skill/Scanning.yaml";
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
                try(final InputStreamReader reader = new InputStreamReader(Scanning.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, Scanning> types;
        }
    }
}
