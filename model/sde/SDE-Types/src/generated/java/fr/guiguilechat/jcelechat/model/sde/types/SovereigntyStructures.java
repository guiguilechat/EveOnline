package fr.guiguilechat.jcelechat.model.sde.types;

import java.util.Arrays;
import java.util.Collection;
import fr.guiguilechat.jcelechat.model.sde.Attribute;
import fr.guiguilechat.jcelechat.model.sde.EveType;
import fr.guiguilechat.jcelechat.model.sde.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.types.sovereigntystructures.InfrastructureHub;
import fr.guiguilechat.jcelechat.model.sde.types.sovereigntystructures.TerritorialClaimUnit;

public abstract class SovereigntyStructures
    extends EveType
{
    /**
     * Gravimetric strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanGravimetricStrength;
    /**
     * Ladar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanLadarStrength;
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
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(100)
    public int SignatureRadius;
    public static final SovereigntyStructures.MetaCat METACAT = new SovereigntyStructures.MetaCat();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  211 :
            {
                return ScanGravimetricStrength;
            }
            case  209 :
            {
                return ScanLadarStrength;
            }
            case  210 :
            {
                return ScanMagnetometricStrength;
            }
            case  208 :
            {
                return ScanRadarStrength;
            }
            case  552 :
            {
                return SignatureRadius;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaCategory<SovereigntyStructures> getCategory() {
        return METACAT;
    }

    public static class MetaCat
        implements IMetaCategory<SovereigntyStructures>
    {

        @Override
        public int getCategoryId() {
            return  40;
        }

        @Override
        public String getName() {
            return "SovereigntyStructures";
        }

        @Override
        public Collection<IMetaGroup<? extends SovereigntyStructures>> groups() {
            return Arrays.asList(TerritorialClaimUnit.METAGROUP, InfrastructureHub.METAGROUP);
        }
    }
}