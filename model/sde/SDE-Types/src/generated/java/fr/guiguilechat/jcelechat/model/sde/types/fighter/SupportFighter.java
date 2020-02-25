package fr.guiguilechat.jcelechat.model.sde.types.fighter;

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
import fr.guiguilechat.jcelechat.model.sde.types.Fighter;
import org.yaml.snakeyaml.Yaml;

public class SupportFighter
    extends Fighter
{
    /**
     * Duration
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityECMDuration;
    /**
     * Effectiveness Falloff
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityECMRangeFalloff;
    /**
     * Optimal Range
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityECMRangeOptimal;
    /**
     * Gravimetric ECM Jammer Strength
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double FighterAbilityECMStrengthGravimetric;
    /**
     * Ladar ECM Jammer Strength
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double FighterAbilityECMStrengthLadar;
    /**
     * Magnetometric ECM Jammer Strength
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double FighterAbilityECMStrengthMagnetometric;
    /**
     * Radar ECM Jammer Strength
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double FighterAbilityECMStrengthRadar;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityECMTargetJam;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityECMTargetSuccess;
    /**
     * Energy Amount Neutralized
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityEnergyNeutralizerAmount;
    /**
     * Duration
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityEnergyNeutralizerDuration;
    /**
     * Effectiveness Falloff
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityEnergyNeutralizerFalloffRange;
    /**
     * Optimal Range
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityEnergyNeutralizerOptimalRange;
    /**
     * Duration
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityStasisWebifierDuration;
    /**
     * Effectiveness Falloff
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityStasisWebifierFalloffRange;
    /**
     * Optimal Range
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityStasisWebifierOptimalRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityStasisWebifierResistanceID;
    /**
     * Maximum Velocity Bonus
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityStasisWebifierSpeedPenalty;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityStasisWebifierSpeedPenaltyInterim;
    /**
     * Duration
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityWarpDisruptionDuration;
    /**
     * Warp Disruption Strength
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityWarpDisruptionPointStrength;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterAbilityWarpDisruptionPointStrengthInterim;
    /**
     * Optimal Range
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int FighterAbilityWarpDisruptionRange;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterSquadronIsStandupSupport;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int FighterSquadronIsSupport;
    public static final SupportFighter.MetaGroup METAGROUP = new SupportFighter.MetaGroup();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  2220 :
            {
                return FighterAbilityECMDuration;
            }
            case  2222 :
            {
                return FighterAbilityECMRangeFalloff;
            }
            case  2221 :
            {
                return FighterAbilityECMRangeOptimal;
            }
            case  2246 :
            {
                return FighterAbilityECMStrengthGravimetric;
            }
            case  2247 :
            {
                return FighterAbilityECMStrengthLadar;
            }
            case  2248 :
            {
                return FighterAbilityECMStrengthMagnetometric;
            }
            case  2249 :
            {
                return FighterAbilityECMStrengthRadar;
            }
            case  2251 :
            {
                return FighterAbilityECMTargetJam;
            }
            case  2250 :
            {
                return FighterAbilityECMTargetSuccess;
            }
            case  2211 :
            {
                return FighterAbilityEnergyNeutralizerAmount;
            }
            case  2208 :
            {
                return FighterAbilityEnergyNeutralizerDuration;
            }
            case  2210 :
            {
                return FighterAbilityEnergyNeutralizerFalloffRange;
            }
            case  2209 :
            {
                return FighterAbilityEnergyNeutralizerOptimalRange;
            }
            case  2183 :
            {
                return FighterAbilityStasisWebifierDuration;
            }
            case  2187 :
            {
                return FighterAbilityStasisWebifierFalloffRange;
            }
            case  2186 :
            {
                return FighterAbilityStasisWebifierOptimalRange;
            }
            case  2188 :
            {
                return FighterAbilityStasisWebifierResistanceID;
            }
            case  2184 :
            {
                return FighterAbilityStasisWebifierSpeedPenalty;
            }
            case  2185 :
            {
                return FighterAbilityStasisWebifierSpeedPenaltyInterim;
            }
            case  2203 :
            {
                return FighterAbilityWarpDisruptionDuration;
            }
            case  2205 :
            {
                return FighterAbilityWarpDisruptionPointStrength;
            }
            case  2206 :
            {
                return FighterAbilityWarpDisruptionPointStrengthInterim;
            }
            case  2204 :
            {
                return FighterAbilityWarpDisruptionRange;
            }
            case  2741 :
            {
                return FighterSquadronIsStandupSupport;
            }
            case  2213 :
            {
                return FighterSquadronIsSupport;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaGroup<SupportFighter> getGroup() {
        return METAGROUP;
    }

    public static class MetaGroup
        implements IMetaGroup<SupportFighter>
    {
        public static final String RESOURCE_PATH = "SDE/types/fighter/SupportFighter.yaml";
        private Map<String, SupportFighter> cache = (null);

        @Override
        public IMetaCategory<? super SupportFighter> category() {
            return Fighter.METACAT;
        }

        @Override
        public int getGroupId() {
            return  1537;
        }

        @Override
        public String getName() {
            return "SupportFighter";
        }

        @Override
        public synchronized Map<String, SupportFighter> load() {
            if (cache == null) {
                try(final InputStreamReader reader = new InputStreamReader(SupportFighter.MetaGroup.class.getClassLoader().getResourceAsStream((RESOURCE_PATH)))) {
                    cache = new Yaml().loadAs(reader, (Container.class)).types;
                } catch (final Exception exception) {
                    throw new UnsupportedOperationException("catch this", exception);
                }
            }
            return Collections.unmodifiableMap(cache);
        }

        private static class Container {
            public LinkedHashMap<String, SupportFighter> types;
        }
    }
}