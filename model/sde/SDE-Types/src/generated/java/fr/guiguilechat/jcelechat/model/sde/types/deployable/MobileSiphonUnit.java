package fr.guiguilechat.jcelechat.model.sde.types.deployable;

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
import fr.guiguilechat.jcelechat.model.sde.types.Deployable;
import org.yaml.snakeyaml.Yaml;

public class MobileSiphonUnit
    extends Deployable
{
    /**
     * How long it takes to anchor or unanchor this object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(60000)
    public int AnchoringDelay;
    /**
     * The maximum security level at which the structure can be anchored. Used as a non-functional display attribute on some deployables.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double AnchoringSecurityLevelMax;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorUniformity;
    /**
     * Minimum distance where a starbase structure can be anchored at from the control tower shield extremity in meters.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ControlTowerMinimumDistance;
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
    /**
     * Gravimetric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanGravimetricStrength;
    /**
     * Magnetometric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanMagnetometricStrength;
    /**
     * Radar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanRadarStrength;
    /**
     * DO NOT MESS WITH This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldUniformity;
    /**
     * Amount of Polymer Materials stolen from active Polymer Reactor Array every cycle. 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SiphonPolyMaterial;
    /**
     * Amount of Processed Materials stolen from active Simple Reactor Array every cycle.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SiphonProMaterial;
    /**
     * The amount of Raw Material stolen from active Moon Harvester Arrays each cycle.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SiphonRawMaterial;
    /**
     * Amount of stolen materials that is destroyed.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int SiphonWasteAmount;
    /**
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double StructureUniformity;
    /**
     * This number is deducted from the %chance of the seeping to armor, to slow seep of damage through shield.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double Uniformity;
    public static final MobileSiphonUnit.MetaGroup METAGROUP = new MobileSiphonUnit.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  556 :
            {
                return AnchoringDelay;
            }
            case  1032 :
            {
                return AnchoringSecurityLevelMax;
            }
            case  524 :
            {
                return ArmorUniformity;
            }
            case  1165 :
            {
                return ControlTowerMinimumDistance;
            }
            case  182 :
            {
                return RequiredSkill1;
            }
            case  277 :
            {
                return RequiredSkill1Level;
            }
            case  211 :
            {
                return ScanGravimetricStrength;
            }
            case  210 :
            {
                return ScanMagnetometricStrength;
            }
            case  208 :
            {
                return ScanRadarStrength;
            }
            case  484 :
            {
                return ShieldUniformity;
            }
            case  1933 :
            {
                return SiphonPolyMaterial;
            }
            case  1929 :
            {
                return SiphonProMaterial;
            }
            case  1928 :
            {
                return SiphonRawMaterial;
            }
            case  1930 :
            {
                return SiphonWasteAmount;
            }
            case  525 :
            {
                return StructureUniformity;
            }
            case  136 :
            {
                return Uniformity;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<MobileSiphonUnit> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<MobileSiphonUnit>
    {
        public static final String RESOURCE_PATH = "SDE/types/deployable/MobileSiphonUnit.yaml";
        private Map<String, MobileSiphonUnit> cache = (null);

        @Override
        public IMetaCategory<? super MobileSiphonUnit> category() {
            return Deployable.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1247;
        }

        @Override
        public String getName() {
            return "MobileSiphonUnit";
        }

        @Override
        public synchronized Map<String, MobileSiphonUnit> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(MobileSiphonUnit.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, MobileSiphonUnit> types;
        }
    }
}
