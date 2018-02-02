package fr.guiguilechat.eveonline.model.sde.items.types;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.guiguilechat.eveonline.model.sde.items.Item;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.AccelerationGateKeys;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.AdvancedCapitalConstructionComponents;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.ArtifactsAndPrototypes;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Biohazard;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.CapitalConstructionComponents;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Commodities;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.ConstructionComponents;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.CriminalTags;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.DataInterfaces;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Datacores;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.DecryptorsSleepers;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.DecryptorsTakmahl;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.DecryptorsTalocan;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.DecryptorsYanJung;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.DepricatedSubsystems;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Drugs;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.EmpireBountyReimbursementTags;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.EmpireInsigniaDrops;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Frozen;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.General;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.HybridTechComponents;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Identification;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Lease;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Livestock;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.MaterialsAndCompounds;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Miscellaneous;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.ObsoleteBooks;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.OverseerPersonalEffects;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Radioactive;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Refinables;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.ResearchData;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.SecurityTags;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.ShipLogs;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.SlaveReception;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.SleeperComponents;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.StationComponents;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.StrongBoxes;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.SurfaceInfrastructurePrefabUnits;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.TechnicalDataChips;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.Tool;
import fr.guiguilechat.eveonline.model.sde.items.types.commodity.UnknownComponents;

public abstract class Commodity
    extends Item
{

    @Override
    public int getCategoryId() {
        return  17;
    }

    @Override
    public Class<?> getCategory() {
        return Commodity.class;
    }

    public static Map<String, ? extends Commodity> loadCategory() {
        return Stream.of(AccelerationGateKeys.load(), AdvancedCapitalConstructionComponents.load(), ArtifactsAndPrototypes.load(), Biohazard.load(), CapitalConstructionComponents.load(), Commodities.load(), ConstructionComponents.load(), CriminalTags.load(), DataInterfaces.load(), Datacores.load(), DecryptorsSleepers.load(), DecryptorsTakmahl.load(), DecryptorsTalocan.load(), DecryptorsYanJung.load(), DepricatedSubsystems.load(), Drugs.load(), EmpireBountyReimbursementTags.load(), EmpireInsigniaDrops.load(), Frozen.load(), General.load(), HybridTechComponents.load(), Identification.load(), Lease.load(), Livestock.load(), MaterialsAndCompounds.load(), Miscellaneous.load(), ObsoleteBooks.load(), OverseerPersonalEffects.load(), Radioactive.load(), Refinables.load(), ResearchData.load(), SecurityTags.load(), ShipLogs.load(), SlaveReception.load(), SleeperComponents.load(), StationComponents.load(), StrongBoxes.load(), SurfaceInfrastructurePrefabUnits.load(), TechnicalDataChips.load(), Tool.load(), UnknownComponents.load()).flatMap((m -> m.entrySet().stream())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
