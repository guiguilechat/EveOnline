package fr.guiguilechat.jcelechat.model.sde.types.structuremodule;

import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.StructureModule;
import org.yaml.snakeyaml.Yaml;

public class StructureCitadelServiceModule
    extends StructureModule
{
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup01;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup02;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipGroup03;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType1;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType10;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType11;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType2;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType3;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType4;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType5;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType6;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType7;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType8;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int CanFitShipType9;
    /**
     * CPU need of module
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Cpu;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int MaxTypeFitted;
    /**
     * current power need
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Power;
    /**
     * Fuel consumed at the beginning of each hour to keep a service module online.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFuelAmount;
    /**
     * Fuel consumed by the structure service module
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFuelConsumptionGroup;
    /**
     * Fuel consumed to online the service module.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFuelOnlineAmount;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ServiceModuleFullPowerStateArmorPlatingMultiplier;
    /**
     * This attribute is authored on structure service modules and when the service module is online will be used to overwrite a hitpoint multiplier attribute on the structure.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int ServiceModuleFullPowerStateHitpointMultiplier;
    public static final StructureCitadelServiceModule.MetaGroup METAGROUP = new StructureCitadelServiceModule.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  1298 :
            {
                return CanFitShipGroup01;
            }
            case  1299 :
            {
                return CanFitShipGroup02;
            }
            case  1300 :
            {
                return CanFitShipGroup03;
            }
            case  1302 :
            {
                return CanFitShipType1;
            }
            case  2488 :
            {
                return CanFitShipType10;
            }
            case  2758 :
            {
                return CanFitShipType11;
            }
            case  1303 :
            {
                return CanFitShipType2;
            }
            case  1304 :
            {
                return CanFitShipType3;
            }
            case  1305 :
            {
                return CanFitShipType4;
            }
            case  1944 :
            {
                return CanFitShipType5;
            }
            case  2103 :
            {
                return CanFitShipType6;
            }
            case  2463 :
            {
                return CanFitShipType7;
            }
            case  2486 :
            {
                return CanFitShipType8;
            }
            case  2487 :
            {
                return CanFitShipType9;
            }
            case  50 :
            {
                return Cpu;
            }
            case  2431 :
            {
                return MaxTypeFitted;
            }
            case  30 :
            {
                return Power;
            }
            case  2109 :
            {
                return ServiceModuleFuelAmount;
            }
            case  2108 :
            {
                return ServiceModuleFuelConsumptionGroup;
            }
            case  2110 :
            {
                return ServiceModuleFuelOnlineAmount;
            }
            case  2804 :
            {
                return ServiceModuleFullPowerStateArmorPlatingMultiplier;
            }
            case  2744 :
            {
                return ServiceModuleFullPowerStateHitpointMultiplier;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<StructureCitadelServiceModule> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<StructureCitadelServiceModule>
    {
        public static final String RESOURCE_PATH = "SDE/types/structuremodule/StructureCitadelServiceModule.yaml";
        private Map<String, StructureCitadelServiceModule> cache = (null);

        @Override
        public IMetaCategory<? super StructureCitadelServiceModule> category() {
            return StructureModule.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1321;
        }

        @Override
        public String getName() {
            return "StructureCitadelServiceModule";
        }

        @Override
        public synchronized Map<String, StructureCitadelServiceModule> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(StructureCitadelServiceModule.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, StructureCitadelServiceModule> types;
        }
    }
}