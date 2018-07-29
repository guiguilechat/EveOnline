package fr.guiguilechat.jcelechat.model.sde.items.types;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.guiguilechat.jcelechat.model.sde.items.Item;
import fr.guiguilechat.jcelechat.model.sde.items.types.structuremodule.*;

public abstract class StructureModule
    extends Item
{

    @Override
    public int getCategoryId() {
        return  66;
    }

    @Override
    public Class<?> getCategory() {
        return StructureModule.class;
    }

    public static Map<String, ? extends StructureModule> loadCategory() {
        return Stream.of(OLDStructureResourceRigLIceReprocessing.load(), OLDStructureResourceRigLOreReprocessing.load(), OLDStructureResourceRigMHSOreReprocessing.load(), OLDStructureResourceRigMIce1Reprocessing.load(), OLDStructureResourceRigMIce2Reprocessing.load(), OLDStructureResourceRigMLNSOreReprocessing.load(), OLDStructureResourceRigXLReprocessing.load(), OutpostConversionRigs.load(), StructureAdministrationServiceModule.load(), StructureAdvertisementServiceModule.load(), StructureAreaDenialModule.load(), StructureArmorReinforcer.load(), StructureAssemblyRigLSubsystem.load(), StructureBiochemicalReactorRigMME.load(), StructureBiochemicalReactorRigMTE.load(), StructureBurstProjector.load(), StructureCapacitorBattery.load(), StructureCapacitorPowerRelay.load(), StructureCitadelRigLDroneHitpointsAndSpeed.load(), StructureCitadelRigMDroneHitpoints.load(), StructureCitadelRigMDroneSpeed.load(), StructureCitadelRigXLDroneAndPDB.load(), StructureCitadelServiceModule.load(), StructureCombatRigLAoELauncherApplicationAndProjection.load(), StructureCombatRigLEWProjectionAndCapReduction.load(), StructureCombatRigLEnergyNeutralizerProjectionAndCapReduction.load(), StructureCombatRigLMaxTargetsAndSensorBoosting.load(), StructureCombatRigLMissileApplicationAndProjection.load(), StructureCombatRigLPointDefenseBatteryApplicationAndProjection.load(), StructureCombatRigMBoostedSensors.load(), StructureCombatRigMEWCapReduction.load(), StructureCombatRigMEWProjection.load(), StructureCombatRigMEnergyNeutralizerCapReduction.load(), StructureCombatRigMEnergyNeutralizerProjection.load(), StructureCombatRigMMaxTargets.load(), StructureCombatRigMMissileApplication.load(), StructureCombatRigMMissileProjection.load(), StructureCombatRigXLDoomsdayAndTargeting.load(), StructureCombatRigXLEnergyNeutralizerAndEW.load(), StructureCombatRigXLMissileAndAoEMissile.load(), StructureCompositeReactorRigMME.load(), StructureCompositeReactorRigMTE.load(), StructureDisruptionBattery.load(), StructureDoomsdayWeapon.load(), StructureDrillingRigLProficiency.load(), StructureDrillingRigMEfficiency.load(), StructureDrillingRigMStability.load(), StructureECMBattery.load(), StructureEnergyNeutralizer.load(), StructureEngineeringRigLAdvancedComponentEfficiency.load(), StructureEngineeringRigLAdvancedLargeShipEfficiency.load(), StructureEngineeringRigLAdvancedMediumShipEfficiency.load(), StructureEngineeringRigLAdvancedSmallShipEfficiency.load(), StructureEngineeringRigLAmmunitionEfficiency.load(), StructureEngineeringRigLBasicCapitalComponentEfficiency.load(), StructureEngineeringRigLBasicLargeShipEfficiency.load(), StructureEngineeringRigLBasicMediumShipEfficiency.load(), StructureEngineeringRigLBasicSmallShipEfficiency.load(), StructureEngineeringRigLBlueprintCopyOptimization.load(), StructureEngineeringRigLCapitalShipEfficiency.load(), StructureEngineeringRigLDroneAndFighterEfficiency.load(), StructureEngineeringRigLEquipmentEfficiency.load(), StructureEngineeringRigLInventionOptimization.load(), StructureEngineeringRigLMEResearchOptimization.load(), StructureEngineeringRigLStructureEfficiency.load(), StructureEngineeringRigLTEResearchOptimization.load(), StructureEngineeringRigMAdvancedComponentME.load(), StructureEngineeringRigMAdvancedComponentTE.load(), StructureEngineeringRigMAdvancedLargeShipME.load(), StructureEngineeringRigMAdvancedLargeShipTE.load(), StructureEngineeringRigMAdvancedMediumShipME.load(), StructureEngineeringRigMAdvancedMediumShipTE.load(), StructureEngineeringRigMAdvancedSmallShipME.load(), StructureEngineeringRigMAdvancedSmallShipTE.load(), StructureEngineeringRigMAmmunitionME.load(), StructureEngineeringRigMAmmunitionTE.load(), StructureEngineeringRigMBasicCapitalComponentME.load(), StructureEngineeringRigMBasicCapitalComponentTE.load(), StructureEngineeringRigMBasicLargeShipME.load(), StructureEngineeringRigMBasicLargeShipTE.load(), StructureEngineeringRigMBasicMediumShipME.load(), StructureEngineeringRigMBasicMediumShipTE.load(), StructureEngineeringRigMBasicSmallShipME.load(), StructureEngineeringRigMBasicSmallShipTE.load(), StructureEngineeringRigMBlueprintCopyAccelerator.load(), StructureEngineeringRigMBlueprintCopyCostOptimization.load(), StructureEngineeringRigMDroneAndFighterME.load(), StructureEngineeringRigMDroneAndFighterTE.load(), StructureEngineeringRigMEquipmentME.load(), StructureEngineeringRigMEquipmentTE.load(), StructureEngineeringRigMInventionAccelerator.load(), StructureEngineeringRigMInventionCostOptimization.load(), StructureEngineeringRigMMEResearchAccelerator.load(), StructureEngineeringRigMMEResearchCostOptimization.load(), StructureEngineeringRigMStructureME.load(), StructureEngineeringRigMStructureTE.load(), StructureEngineeringRigMTEResearchAccelerator.load(), StructureEngineeringRigMTEResearchCostOptimization.load(), StructureEngineeringRigXLEquipmentAndConsumableEfficiency.load(), StructureEngineeringRigXLLaboratoryOptimization.load(), StructureEngineeringRigXLShipEfficiency.load(), StructureEngineeringRigXLStructureAndComponentEfficiency.load(), StructureEngineeringServiceModule.load(), StructureFestivalLauncher.load(), StructureFittingModule.load(), StructureGuidedBombLauncher.load(), StructureHybridReactorRigMME.load(), StructureHybridReactorRigMTE.load(), StructureLaboratoryRigLCapitalComponent.load(), StructureLaboratoryRigLComponent.load(), StructureLaboratoryRigLModuleConsumableDrone.load(), StructureLaboratoryRigLShip.load(), StructureLaboratoryRigLStructureComponent.load(), StructureLaboratoryRigLSubsystem.load(), StructureLaboratoryRigMConsumable.load(), StructureLaboratoryRigMDrone.load(), StructureLaboratoryRigMLargeShip.load(), StructureLaboratoryRigMMediumShip.load(), StructureLaboratoryRigMModule.load(), StructureLaboratoryRigMSmallShip.load(), StructureLaboratoryRigXLAllComponents.load(), StructureLaboratoryRigXLEquipment.load(), StructureLaboratoryRigXLShip.load(), StructureMoonDrillingServiceModule.load(), StructureMultiroleMissileLauncher.load(), StructureObservatoryServiceModule.load(), StructureQAModules.load(), StructureReactorRigLEfficiency.load(), StructureResearchServiceModule.load(), StructureResourceProcessingServiceModule.load(), StructureResourceRigLReprocessing.load(), StructureResourceRigMAsteroidOreReprocessing.load(), StructureResourceRigMIceReprocessing.load(), StructureResourceRigMMoonOreReprocessing.load(), StructureResourceRigXLReprocessing.load(), StructureSignalAmplifier.load(), StructureStargateServiceModule.load(), StructureStasisWebifier.load(), StructureWarpScrambler.load(), StructureWeaponUpgrade.load(), StructureXLMissileLauncher.load(), UnpublishedStructureModules.load()).flatMap((m -> m.entrySet().stream())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
