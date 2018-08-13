package fr.guiguilechat.jcelechat.model.sde.items.types.module;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.MetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.Module;
import org.yaml.snakeyaml.Yaml;

public class ArmorReinforcer
    extends Module
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorHPBonusAdd;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * Attribute for adding mass to a ship via an afterburner or MWD.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MassAddition;
    /**
     * Authoring has been moved to FSD.
     * meta group of type
     * 
     *  3: Story-line (Cosmos)
     *  4: Faction
     *  5: Officer (rare asteroid NPCs)
     *  6: Deadspace
     * 
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MetaGroupID;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * The type ID of the skill that is required.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1;
    /**
     * Required skill level for skill 1
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int RequiredSkill1Level;
    public final static ArmorReinforcer.MetaGroup METAGROUP = new ArmorReinforcer.MetaGroup();
    public final static String RESOURCE_PATH = "SDE/items/module/ArmorReinforcer.yaml";
    private static Map<String, ArmorReinforcer> cache = (null);

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1159 :
            {
                return ArmorHPBonusAdd;
            }
            case  50 :
            {
                return Cpu;
            }
            case  796 :
            {
                return MassAddition;
            }
            case  1692 :
            {
                return MetaGroupID;
            }
            case  30 :
            {
                return Power;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public int getGroupId() {
        return  329;
    }

    @Override
    public fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<ArmorReinforcer> getGroup() {
        return METAGROUP;
    }

    public static synchronized Map<String, ArmorReinforcer> load() {
        if (cache == null) {
            try {
                cache = new Yaml().loadAs(new InputStreamReader(ArmorReinforcer.class.getClassLoader().getResourceAsStream((RESOURCE_PATH))), (Container.class)).items;
            } catch (final Exception exception) {
                throw new UnsupportedOperationException("catch this", exception);
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    private static class Container {
        public LinkedHashMap<String, ArmorReinforcer> items;
    }

    public static class MetaGroup
        implements fr.guiguilechat.jcelechat.model.sde.items.MetaGroup<ArmorReinforcer>
    {

        @Override
        public MetaCategory<? super ArmorReinforcer> category() {
            return Module.METACAT;
        }

        @Override
        public String getName() {
            return "ArmorReinforcer";
        }

        @Override
        public Collection<ArmorReinforcer> items() {
            return (load().values());
        }
    }
}
