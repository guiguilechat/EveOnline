package fr.guiguilechat.jcelechat.model.sde.items.types;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.Item;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.EncounterSurveillanceSystem;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileCynoInhibitor;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileDecoyUnit;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileDepot;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileJumpDisruptor;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileMicroJumpUnit;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileScanInhibitor;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileSiphonUnit;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileTractorUnit;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileVault;
import fr.guiguilechat.jcelechat.model.sde.items.types.deployable.MobileWarpDisruptor;

public abstract class Deployable
    extends Item
{
    /**
     * The number of hit points on the entities armor.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ArmorHP;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Ladar strength.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double ScanLadarStrength;
    /**
     * Amount of maximum shield HP on the item.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int ShieldCapacity;
    /**
     * Amount of time taken to fully recharge the shield.
     */
    @HighIsGood(false)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ShieldRechargeRate;
    /**
     * Signature Radius is used for turret tracking and scanning.
     */
    @HighIsGood(false)
    @Stackable(false)
    @DefaultIntValue(100)
    public int SignatureRadius;
    /**
     * Authoring has been moved to FSD
     * Tech level of an item
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(1)
    public int TechLevel;

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  265 :
            {
                return ArmorHP;
            }
            case  9 :
            {
                return Hp;
            }
            case  209 :
            {
                return ScanLadarStrength;
            }
            case  263 :
            {
                return ShieldCapacity;
            }
            case  479 :
            {
                return ShieldRechargeRate;
            }
            case  552 :
            {
                return SignatureRadius;
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
    public int getCategoryId() {
        return  22;
    }

    @Override
    public Class<?> getCategory() {
        return Deployable.class;
    }

    public static Map<String, ? extends Deployable> loadCategory() {
        return Stream.of(EncounterSurveillanceSystem.load(), MobileCynoInhibitor.load(), MobileDecoyUnit.load(), MobileDepot.load(), MobileJumpDisruptor.load(), MobileMicroJumpUnit.load(), MobileScanInhibitor.load(), MobileSiphonUnit.load(), MobileTractorUnit.load(), MobileVault.load(), MobileWarpDisruptor.load()).flatMap((m -> m.entrySet().stream())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}