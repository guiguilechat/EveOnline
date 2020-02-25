package fr.guiguilechat.jcelechat.model.sde.types.skill;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.Skill;
import org.yaml.snakeyaml.Yaml;

public class CorporationManagement
    extends Skill
{
    /**
     * The base cost of hiring an ally into a war
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(10000000)
    public int BaseDefenderAllyCost;
    /**
     * If set to 1 on a skill then this skill can not be trained on accounts that are marked as Trial.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanNotBeTrainedOnTrial;
    /**
     * +/- modifier to the number of members that a CEO can manage within their corporation.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CorporationMemberBonus;
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
    public int SkillAllyCostModifierBonus;
    public static final CorporationManagement.MetaGroup METAGROUP = new CorporationManagement.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1820 :
            {
                return BaseDefenderAllyCost;
            }
            case  1047 :
            {
                return CanNotBeTrainedOnTrial;
            }
            case  191 :
            {
                return CorporationMemberBonus;
            }
            case  183 :
            {
                return RequiredSkill2;
            }
            case  278 :
            {
                return RequiredSkill2Level;
            }
            case  1821 :
            {
                return SkillAllyCostModifierBonus;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<CorporationManagement> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CorporationManagement>
    {
        public static final String RESOURCE_PATH = "SDE/types/skill/CorporationManagement.yaml";
        private Map<String, CorporationManagement> cache = (null);

        @Override
        public IMetaCategory<? super CorporationManagement> category() {
            return Skill.METACAT;
        }

        @Override
        public int getGroupId() {
            return  266;
        }

        @Override
        public String getName() {
            return "CorporationManagement";
        }

        @Override
        public synchronized Map<String, CorporationManagement> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(CorporationManagement.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CorporationManagement> types;
        }
    }
}