package fr.guiguilechat.jcelechat.model.sde.items.types.implant;

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
import fr.guiguilechat.jcelechat.model.sde.items.types.Implant;
import org.yaml.snakeyaml.Yaml;

public class CyberArmor
    extends Implant
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorHpBonus2;
    /**
     * Autogenerated skill attribute, capNeedBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CapNeedBonus;
    /**
     * Autogenerated skill attribute, DurationBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DurationSkillBonus;
    /**
     * Autogenerated skill attribute, hullHpBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int HullHpBonus;
    /**
     * Whether an item is an implant or not
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Implantness;
    /**
     * Autogenerated skill attribute, repairBonus
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RepairBonus;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;
    public final static CyberArmor.MetaGroup METAGROUP = new CyberArmor.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1083 :
            {
                return ArmorHpBonus2;
            }
            case  317 :
            {
                return CapNeedBonus;
            }
            case  312 :
            {
                return DurationSkillBonus;
            }
            case  327 :
            {
                return HullHpBonus;
            }
            case  331 :
            {
                return Implantness;
            }
            case  806 :
            {
                return RepairBonus;
            }
            case  422 :
            {
                return TechLevel;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<CyberArmor> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<CyberArmor>
    {
        public final static String RESOURCE_PATH = "SDE/items/implant/CyberArmor.yaml";
        private Map<String, CyberArmor> cache = (null);

        @Override
        public IMetaCategory<? super CyberArmor> category() {
            return Implant.METACAT;
        }

        @Override
        public int getGroupId() {
            return  738;
        }

        @Override
        public String getName() {
            return "CyberArmor";
        }

        @Override
        public synchronized Map<String, CyberArmor> load() {
            if (cache == null) {
                try {
                    cache = new Yaml().loadAs(new InputStreamReader(CyberArmor.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, CyberArmor> items;
        }
    }
}
