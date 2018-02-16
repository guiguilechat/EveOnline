package fr.guiguilechat.eveonline.model.sde.items.types;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.guiguilechat.eveonline.model.sde.items.Item;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AmarrNavyRoamingBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AmarrNavyRoamingCapital;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AmarrNavyRoamingCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AmarrNavyRoamingFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AmarrNavyRoamingLogistics;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelCommanderBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelCommanderDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelDreadnought;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelOfficer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidAngelCartelTitan;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaiderDreadnought;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaiderTitan;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersCommanderBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersCommanderDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidBloodRaidersOfficer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasCommanderBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasCommanderDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasDreadnought;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasOfficer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidGuristasTitan;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidMordusLegionCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidMordusLegionCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidMordusLegionCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCommanderBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCommanderDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneOfficer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneSupercarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidRogueDroneSwarm;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationCommanderBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationCommanderDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationDreadnought;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationOfficer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSanshaSNationSupercarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisCommanderBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisCommanderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisCommanderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisCommanderDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisCommanderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisDreadnought;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisOfficer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.AsteroidSerpentisTitan;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.Billboard;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.CapturePoint;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.ConcordDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.Convoy;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.ConvoyDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.CustomsOfficial;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceAngelCartelBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceAngelCartelBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceAngelCartelCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceAngelCartelDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceAngelCartelFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceBloodRaidersBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceBloodRaidersBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceBloodRaidersCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceBloodRaidersDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceBloodRaidersFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceGuristasBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceGuristasBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceGuristasCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceGuristasDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceGuristasFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceOverseerBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceOverseerCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceOverseerFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceOverseerSBelongings;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceOverseerSSentry;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceOverseerSStructure;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceRogueDroneBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceRogueDroneBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceRogueDroneCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceRogueDroneDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceRogueDroneFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceRogueDroneSwarm;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSanshaSNationBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSanshaSNationBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSanshaSNationCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSanshaSNationDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSanshaSNationFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSerpentisBattleCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSerpentisBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSerpentisCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSerpentisDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSerpentisFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperAwakenedDefender;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperAwakenedPatroller;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperAwakenedSentinel;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperEmergentDefender;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperEmergentPatroller;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperEmergentSentinel;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperSleeplessDefender;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperSleeplessPatroller;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperSleeplessSentinel;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DeadspaceSleeperUpgradedAvenger;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DestructibleAgentsInSpace;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DestructibleSentryGun;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DrifterBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DrifterReinforcements;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.DrifterResponseBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWAmarrEmpireBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWAmarrEmpireCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWAmarrEmpireDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWAmarrEmpireFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWCaldariStateBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWCaldariStateCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWCaldariStateDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWCaldariStateFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWGallenteFederationBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWGallenteFederationCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWGallenteFederationDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWGallenteFederationFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWInfrastructureHub;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWMinmatarRepublicBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWMinmatarRepublicCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWMinmatarRepublicDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FWMinmatarRepublicFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.FactionDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.ForceAuxiliary;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.GhostSitesAngelCartelCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.GhostSitesBloodRaidersCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.GhostSitesGuristasCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.GhostSitesMorduSLegion;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.GhostSitesSanshasCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.GhostSitesSerpentisCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithAmarrBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithAmarrCapital;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithAmarrCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithAmarrFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithCaldariBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithCaldariCapital;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithCaldariCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithCaldariFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithDrifters;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithGallenteBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithGallenteCapital;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithGallenteCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithGallenteFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithMinmatarBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithMinmatarCapital;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithMinmatarCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.HiddenZenithMinmatarFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IncursionSanshaSNationBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IncursionSanshaSNationCapital;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IncursionSanshaSNationCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IncursionSanshaSNationFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularCarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularFighter;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.IrregularFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.LCODrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.LargeCollidableShip;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.LargeCollidableStructure;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MinorThreat;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireCarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionAmarrEmpireOther;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCONCORDBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCONCORDCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCONCORDFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateCarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionCaldariStateOther;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionContainer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionFactionBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionFactionCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionFactionFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionFactionIndustrials;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionFactionTransports;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionFighterDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGallenteFederationBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGallenteFederationBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGallenteFederationCarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGallenteFederationCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGallenteFederationDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGallenteFederationFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGenericBattleCruisers;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGenericBattleships;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGenericCruisers;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGenericDestroyers;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGenericFrigates;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionGenericSupercarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionKhanidBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionKhanidCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionKhanidFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMinmatarRepublicBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMinmatarRepublicBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMinmatarRepublicCarrier;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMinmatarRepublicCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMinmatarRepublicDestroyer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMinmatarRepublicFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMorduBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMorduCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionMorduFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionThukkerCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.MissionThukkerFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCDreadnought;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCIndustrialCommand;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCMiningBarge;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCMiningExhumer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCMiningFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCMiningHauler;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.NPCTitan;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.PirateDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.PoliceDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingAngelCartelBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingAngelCartelCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingAngelCartelFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingBloodRaiderBattlecruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingBloodRaiderBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingBloodRaiderCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingBloodRaiderFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingSerpentisBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingSerpentisCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingSerpentisFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RoamingSleepersCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.RogueDrone;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.ScatterContainer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.SentryGun;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.SpawnContainer;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StorylineBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StorylineCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StorylineFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StorylineMissionBattleship;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StorylineMissionCruiser;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StorylineMissionFrigate;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.StructureEntities;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.TemporaryCloud;
import fr.guiguilechat.eveonline.model.sde.items.types.entity.TutorialSeekers;

public abstract class Entity
    extends Item
{

    @Override
    public int getCategoryId() {
        return  11;
    }

    @Override
    public Class<?> getCategory() {
        return Entity.class;
    }

    public static Map<String, ? extends Entity> loadCategory() {
        return Stream.of(AmarrNavyRoamingBattleship.load(), AmarrNavyRoamingCapital.load(), AmarrNavyRoamingCruiser.load(), AmarrNavyRoamingFrigate.load(), AmarrNavyRoamingLogistics.load(), AsteroidAngelCartelBattleCruiser.load(), AsteroidAngelCartelBattleship.load(), AsteroidAngelCartelCommanderBattleCruiser.load(), AsteroidAngelCartelCommanderBattleship.load(), AsteroidAngelCartelCommanderCruiser.load(), AsteroidAngelCartelCommanderDestroyer.load(), AsteroidAngelCartelCommanderFrigate.load(), AsteroidAngelCartelCruiser.load(), AsteroidAngelCartelDestroyer.load(), AsteroidAngelCartelDreadnought.load(), AsteroidAngelCartelFrigate.load(), AsteroidAngelCartelHauler.load(), AsteroidAngelCartelOfficer.load(), AsteroidAngelCartelTitan.load(), AsteroidBloodRaiderDreadnought.load(), AsteroidBloodRaiderTitan.load(), AsteroidBloodRaidersBattleCruiser.load(), AsteroidBloodRaidersBattleship.load(), AsteroidBloodRaidersCommanderBattleCruiser.load(), AsteroidBloodRaidersCommanderBattleship.load(), AsteroidBloodRaidersCommanderCruiser.load(), AsteroidBloodRaidersCommanderDestroyer.load(), AsteroidBloodRaidersCommanderFrigate.load(), AsteroidBloodRaidersCruiser.load(), AsteroidBloodRaidersDestroyer.load(), AsteroidBloodRaidersFrigate.load(), AsteroidBloodRaidersHauler.load(), AsteroidBloodRaidersOfficer.load(), AsteroidGuristasBattleCruiser.load(), AsteroidGuristasBattleship.load(), AsteroidGuristasCommanderBattleCruiser.load(), AsteroidGuristasCommanderBattleship.load(), AsteroidGuristasCommanderCruiser.load(), AsteroidGuristasCommanderDestroyer.load(), AsteroidGuristasCommanderFrigate.load(), AsteroidGuristasCruiser.load(), AsteroidGuristasDestroyer.load(), AsteroidGuristasDreadnought.load(), AsteroidGuristasFrigate.load(), AsteroidGuristasHauler.load(), AsteroidGuristasOfficer.load(), AsteroidGuristasTitan.load(), AsteroidMordusLegionCommanderBattleship.load(), AsteroidMordusLegionCommanderCruiser.load(), AsteroidMordusLegionCommanderFrigate.load(), AsteroidRogueDroneBattleCruiser.load(), AsteroidRogueDroneBattleship.load(), AsteroidRogueDroneCarrier.load(), AsteroidRogueDroneCommanderBattleCruiser.load(), AsteroidRogueDroneCommanderBattleship.load(), AsteroidRogueDroneCommanderCruiser.load(), AsteroidRogueDroneCommanderDestroyer.load(), AsteroidRogueDroneCommanderFrigate.load(), AsteroidRogueDroneCruiser.load(), AsteroidRogueDroneDestroyer.load(), AsteroidRogueDroneFrigate.load(), AsteroidRogueDroneHauler.load(), AsteroidRogueDroneOfficer.load(), AsteroidRogueDroneSupercarrier.load(), AsteroidRogueDroneSwarm.load(), AsteroidSanshaSNationBattleCruiser.load(), AsteroidSanshaSNationBattleship.load(), AsteroidSanshaSNationCommanderBattleCruiser.load(), AsteroidSanshaSNationCommanderBattleship.load(), AsteroidSanshaSNationCommanderCruiser.load(), AsteroidSanshaSNationCommanderDestroyer.load(), AsteroidSanshaSNationCommanderFrigate.load(), AsteroidSanshaSNationCruiser.load(), AsteroidSanshaSNationDestroyer.load(), AsteroidSanshaSNationDreadnought.load(), AsteroidSanshaSNationFrigate.load(), AsteroidSanshaSNationHauler.load(), AsteroidSanshaSNationOfficer.load(), AsteroidSanshaSNationSupercarrier.load(), AsteroidSerpentisBattleCruiser.load(), AsteroidSerpentisBattleship.load(), AsteroidSerpentisCommanderBattleCruiser.load(), AsteroidSerpentisCommanderBattleship.load(), AsteroidSerpentisCommanderCruiser.load(), AsteroidSerpentisCommanderDestroyer.load(), AsteroidSerpentisCommanderFrigate.load(), AsteroidSerpentisCruiser.load(), AsteroidSerpentisDestroyer.load(), AsteroidSerpentisDreadnought.load(), AsteroidSerpentisFrigate.load(), AsteroidSerpentisHauler.load(), AsteroidSerpentisOfficer.load(), AsteroidSerpentisTitan.load(), Billboard.load(), CapturePoint.load(), ConcordDrone.load(), Convoy.load(), ConvoyDrone.load(), CustomsOfficial.load(), DeadspaceAngelCartelBattleCruiser.load(), DeadspaceAngelCartelBattleship.load(), DeadspaceAngelCartelCruiser.load(), DeadspaceAngelCartelDestroyer.load(), DeadspaceAngelCartelFrigate.load(), DeadspaceBloodRaidersBattleCruiser.load(), DeadspaceBloodRaidersBattleship.load(), DeadspaceBloodRaidersCruiser.load(), DeadspaceBloodRaidersDestroyer.load(), DeadspaceBloodRaidersFrigate.load(), DeadspaceGuristasBattleCruiser.load(), DeadspaceGuristasBattleship.load(), DeadspaceGuristasCruiser.load(), DeadspaceGuristasDestroyer.load(), DeadspaceGuristasFrigate.load(), DeadspaceOverseerBattleship.load(), DeadspaceOverseerCruiser.load(), DeadspaceOverseerFrigate.load(), DeadspaceOverseerSBelongings.load(), DeadspaceOverseerSSentry.load(), DeadspaceOverseerSStructure.load(), DeadspaceRogueDroneBattleCruiser.load(), DeadspaceRogueDroneBattleship.load(), DeadspaceRogueDroneCruiser.load(), DeadspaceRogueDroneDestroyer.load(), DeadspaceRogueDroneFrigate.load(), DeadspaceRogueDroneSwarm.load(), DeadspaceSanshaSNationBattleCruiser.load(), DeadspaceSanshaSNationBattleship.load(), DeadspaceSanshaSNationCruiser.load(), DeadspaceSanshaSNationDestroyer.load(), DeadspaceSanshaSNationFrigate.load(), DeadspaceSerpentisBattleCruiser.load(), DeadspaceSerpentisBattleship.load(), DeadspaceSerpentisCruiser.load(), DeadspaceSerpentisDestroyer.load(), DeadspaceSerpentisFrigate.load(), DeadspaceSleeperAwakenedDefender.load(), DeadspaceSleeperAwakenedPatroller.load(), DeadspaceSleeperAwakenedSentinel.load(), DeadspaceSleeperEmergentDefender.load(), DeadspaceSleeperEmergentPatroller.load(), DeadspaceSleeperEmergentSentinel.load(), DeadspaceSleeperSleeplessDefender.load(), DeadspaceSleeperSleeplessPatroller.load(), DeadspaceSleeperSleeplessSentinel.load(), DeadspaceSleeperUpgradedAvenger.load(), DestructibleAgentsInSpace.load(), DestructibleSentryGun.load(), DrifterBattleship.load(), DrifterReinforcements.load(), DrifterResponseBattleship.load(), FWAmarrEmpireBattlecruiser.load(), FWAmarrEmpireCruiser.load(), FWAmarrEmpireDestroyer.load(), FWAmarrEmpireFrigate.load(), FWCaldariStateBattlecruiser.load(), FWCaldariStateCruiser.load(), FWCaldariStateDestroyer.load(), FWCaldariStateFrigate.load(), FWGallenteFederationBattlecruiser.load(), FWGallenteFederationCruiser.load(), FWGallenteFederationDestroyer.load(), FWGallenteFederationFrigate.load(), FWInfrastructureHub.load(), FWMinmatarRepublicBattlecruiser.load(), FWMinmatarRepublicCruiser.load(), FWMinmatarRepublicDestroyer.load(), FWMinmatarRepublicFrigate.load(), FactionDrone.load(), ForceAuxiliary.load(), GhostSitesAngelCartelCruiser.load(), GhostSitesBloodRaidersCruiser.load(), GhostSitesGuristasCruiser.load(), GhostSitesMorduSLegion.load(), GhostSitesSanshasCruiser.load(), GhostSitesSerpentisCruiser.load(), HiddenZenithAmarrBattleship.load(), HiddenZenithAmarrCapital.load(), HiddenZenithAmarrCruiser.load(), HiddenZenithAmarrFrigate.load(), HiddenZenithCaldariBattleship.load(), HiddenZenithCaldariCapital.load(), HiddenZenithCaldariCruiser.load(), HiddenZenithCaldariFrigate.load(), HiddenZenithDrifters.load(), HiddenZenithGallenteBattleship.load(), HiddenZenithGallenteCapital.load(), HiddenZenithGallenteCruiser.load(), HiddenZenithGallenteFrigate.load(), HiddenZenithMinmatarBattleship.load(), HiddenZenithMinmatarCapital.load(), HiddenZenithMinmatarCruiser.load(), HiddenZenithMinmatarFrigate.load(), IncursionSanshaSNationBattleship.load(), IncursionSanshaSNationCapital.load(), IncursionSanshaSNationCruiser.load(), IncursionSanshaSNationFrigate.load(), IrregularBattlecruiser.load(), IrregularBattleship.load(), IrregularCarrier.load(), IrregularCruiser.load(), IrregularDestroyer.load(), IrregularFighter.load(), IrregularFrigate.load(), LCODrone.load(), LargeCollidableShip.load(), LargeCollidableStructure.load(), MinorThreat.load(), MissionAmarrEmpireBattlecruiser.load(), MissionAmarrEmpireBattleship.load(), MissionAmarrEmpireCarrier.load(), MissionAmarrEmpireCruiser.load(), MissionAmarrEmpireDestroyer.load(), MissionAmarrEmpireFrigate.load(), MissionAmarrEmpireOther.load(), MissionCONCORDBattleship.load(), MissionCONCORDCruiser.load(), MissionCONCORDFrigate.load(), MissionCaldariStateBattlecruiser.load(), MissionCaldariStateBattleship.load(), MissionCaldariStateCarrier.load(), MissionCaldariStateCruiser.load(), MissionCaldariStateDestroyer.load(), MissionCaldariStateFrigate.load(), MissionCaldariStateOther.load(), MissionContainer.load(), MissionDrone.load(), MissionFactionBattleship.load(), MissionFactionCruiser.load(), MissionFactionFrigate.load(), MissionFactionIndustrials.load(), MissionFactionTransports.load(), MissionFighterDrone.load(), MissionGallenteFederationBattlecruiser.load(), MissionGallenteFederationBattleship.load(), MissionGallenteFederationCarrier.load(), MissionGallenteFederationCruiser.load(), MissionGallenteFederationDestroyer.load(), MissionGallenteFederationFrigate.load(), MissionGenericBattleCruisers.load(), MissionGenericBattleships.load(), MissionGenericCruisers.load(), MissionGenericDestroyers.load(), MissionGenericFrigates.load(), MissionGenericSupercarrier.load(), MissionKhanidBattleship.load(), MissionKhanidCruiser.load(), MissionKhanidFrigate.load(), MissionMinmatarRepublicBattlecruiser.load(), MissionMinmatarRepublicBattleship.load(), MissionMinmatarRepublicCarrier.load(), MissionMinmatarRepublicCruiser.load(), MissionMinmatarRepublicDestroyer.load(), MissionMinmatarRepublicFrigate.load(), MissionMorduBattleship.load(), MissionMorduCruiser.load(), MissionMorduFrigate.load(), MissionThukkerCruiser.load(), MissionThukkerFrigate.load(), NPCBattlecruiser.load(), NPCBattleship.load(), NPCCruiser.load(), NPCDreadnought.load(), NPCFrigate.load(), NPCIndustrialCommand.load(), NPCMiningBarge.load(), NPCMiningExhumer.load(), NPCMiningFrigate.load(), NPCMiningHauler.load(), NPCTitan.load(), PirateDrone.load(), PoliceDrone.load(), RoamingAngelCartelBattleship.load(), RoamingAngelCartelCruiser.load(), RoamingAngelCartelFrigate.load(), RoamingBloodRaiderBattlecruiser.load(), RoamingBloodRaiderBattleship.load(), RoamingBloodRaiderCruiser.load(), RoamingBloodRaiderFrigate.load(), RoamingSerpentisBattleship.load(), RoamingSerpentisCruiser.load(), RoamingSerpentisFrigate.load(), RoamingSleepersCruiser.load(), RogueDrone.load(), ScatterContainer.load(), SentryGun.load(), SpawnContainer.load(), StorylineBattleship.load(), StorylineCruiser.load(), StorylineFrigate.load(), StorylineMissionBattleship.load(), StorylineMissionCruiser.load(), StorylineMissionFrigate.load(), StructureEntities.load(), TemporaryCloud.load(), TutorialSeekers.load()).flatMap((m -> m.entrySet().stream())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
