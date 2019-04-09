package fr.guiguilechat.jcelechat.model.sde.items.types;

import java.util.Arrays;
import java.util.Collection;
import fr.guiguilechat.jcelechat.model.sde.items.Attribute;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaCategory;
import fr.guiguilechat.jcelechat.model.sde.items.IMetaGroup;
import fr.guiguilechat.jcelechat.model.sde.items.Item;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultDoubleValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.DefaultIntValue;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.HighIsGood;
import fr.guiguilechat.jcelechat.model.sde.items.annotations.Stackable;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AbyssalDroneEntities;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AbyssalSpaceshipEntities;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AmarrNavyRoamingBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AmarrNavyRoamingCapital;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AmarrNavyRoamingCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AmarrNavyRoamingFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AmarrNavyRoamingLogistics;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelCommanderBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelCommanderDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelOfficer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidAngelCartelTitan;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaiderDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaiderTitan;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersCommanderBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersCommanderDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidBloodRaidersOfficer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasCommanderBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasCommanderDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasOfficer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidGuristasTitan;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidMordusLegionCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidMordusLegionCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidMordusLegionCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCommanderBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCommanderDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneOfficer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneSupercarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidRogueDroneSwarm;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationCommanderBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationCommanderDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationOfficer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSanshaSNationSupercarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisCommanderBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisCommanderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisCommanderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisCommanderDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisCommanderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisOfficer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.AsteroidSerpentisTitan;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.Billboard;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.CapturePoint;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.ConcordDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.Convoy;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.ConvoyDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.CustomsOfficial;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceAngelCartelBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceAngelCartelBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceAngelCartelCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceAngelCartelDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceAngelCartelFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceBloodRaidersBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceBloodRaidersBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceBloodRaidersCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceBloodRaidersDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceBloodRaidersFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceGuristasBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceGuristasBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceGuristasCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceGuristasDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceGuristasFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceOverseerBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceOverseerCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceOverseerFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceOverseerSBelongings;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceOverseerSSentry;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceOverseerSStructure;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceRogueDroneBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceRogueDroneBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceRogueDroneCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceRogueDroneDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceRogueDroneFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceRogueDroneSwarm;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSanshaSNationBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSanshaSNationBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSanshaSNationCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSanshaSNationDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSanshaSNationFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSerpentisBattleCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSerpentisBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSerpentisCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSerpentisDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSerpentisFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperAwakenedDefender;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperAwakenedPatroller;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperAwakenedSentinel;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperEmergentDefender;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperEmergentPatroller;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperEmergentSentinel;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperSleeplessDefender;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperSleeplessPatroller;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperSleeplessSentinel;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DeadspaceSleeperUpgradedAvenger;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DestructibleAgentsInSpace;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DestructibleSentryGun;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DrifterReinforcements;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.DrifterResponseBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.FWInfrastructureHub;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.FactionDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithAmarrBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithAmarrCapital;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithAmarrCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithAmarrFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithCaldariBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithCaldariCapital;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithCaldariCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithCaldariFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithDrifters;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithGallenteBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithGallenteCapital;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithGallenteCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithGallenteFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithMinmatarBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithMinmatarCapital;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithMinmatarCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.HiddenZenithMinmatarFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IncursionSanshaSNationBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IncursionSanshaSNationCapital;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IncursionSanshaSNationCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IncursionSanshaSNationFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularCarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularContainer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularFighter;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularFreighter;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularIndustrial;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularShuttle;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.IrregularUnidentified;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.LCODrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.LargeCollidableShip;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.LargeCollidableStructure;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MinorThreat;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireCarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionAmarrEmpireOther;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCONCORDBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCONCORDCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCONCORDFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateCarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionCaldariStateOther;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionContainer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionFactionBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionFactionCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionFactionFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionFactionIndustrials;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionFactionTransports;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionFighterDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGallenteFederationBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGallenteFederationBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGallenteFederationCarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGallenteFederationCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGallenteFederationDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGallenteFederationFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGenericBattleCruisers;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGenericBattleships;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGenericCruisers;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGenericDestroyers;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGenericFrigates;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionGenericSupercarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionKhanidBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionKhanidCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionKhanidFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMinmatarRepublicBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMinmatarRepublicBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMinmatarRepublicCarrier;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMinmatarRepublicCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMinmatarRepublicDestroyer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMinmatarRepublicFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMorduBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMorduCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionMorduFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionThukkerCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.MissionThukkerFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCDreadnought;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCForceAuxiliary;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCIndustrialCommand;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCMiningBarge;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCMiningExhumer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCMiningFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCMiningHauler;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.NPCTitan;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.PirateDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.PoliceDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.PrecursorCache;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingAngelCartelBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingAngelCartelCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingAngelCartelFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingBloodRaiderBattlecruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingBloodRaiderBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingBloodRaiderCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingBloodRaiderFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingSerpentisBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingSerpentisCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RoamingSerpentisFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.RogueDrone;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.SeekerScouts;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.SentryGun;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.SpawnContainer;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StorylineBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StorylineCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StorylineFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StorylineMissionBattleship;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StorylineMissionCruiser;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StorylineMissionFrigate;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.StructureEntities;
import fr.guiguilechat.jcelechat.model.sde.items.types.entity.TemporaryCloud;

public abstract class Entity
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
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(0.0)
    public double ArmorUniformity;
    /**
     * If this module is in use and this attribute is 1, then assistance modules cannot be used on the ship.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int DisallowAssistance;
    /**
     * The distance from a target an entity starts using its weapons.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(15000)
    public int EntityAttackRange;
    /**
     * The distance outside of which the entity activates their MWD equivalent.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(2500)
    public int EntityChaseMaxDistance;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityEquipmentMax;
    /**
     * 
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityEquipmentMin;
    /**
     * The distance at which the entity orbits, follows.. and more.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(500.0)
    public double EntityFlyRange;
    /**
     * The maximum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityLootCountMax;
    /**
     * Deprecated. The minimum number of pieces of loot dropped by this entity.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int EntityLootCountMin;
    /**
     * distance from maximum range at which accuracy has fallen by half
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(1)
    public int Falloff;
    /**
     * The maximum hitpoints of an object.
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultIntValue(0)
    public int Hp;
    /**
     * Distance below which range does not affect the to-hit equation.
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultIntValue(0)
    public int MaxRange;
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
     * DO NOT MESS WITH
     */
    @HighIsGood(true)
    @Stackable(true)
    @DefaultDoubleValue(1.0)
    public double StructureUniformity;
    /**
     * Weapon accuracy
     */
    @HighIsGood(true)
    @Stackable(false)
    @DefaultDoubleValue(0.0)
    public double TrackingSpeed;
    public static final Entity.MetaCat METACAT = new Entity.MetaCat();

    @Override
    public Number attribute(Attribute attribute) {
        switch (attribute.getId()) {
            case  265 :
            {
                return ArmorHP;
            }
            case  524 :
            {
                return ArmorUniformity;
            }
            case  854 :
            {
                return DisallowAssistance;
            }
            case  247 :
            {
                return EntityAttackRange;
            }
            case  665 :
            {
                return EntityChaseMaxDistance;
            }
            case  457 :
            {
                return EntityEquipmentMax;
            }
            case  456 :
            {
                return EntityEquipmentMin;
            }
            case  416 :
            {
                return EntityFlyRange;
            }
            case  251 :
            {
                return EntityLootCountMax;
            }
            case  250 :
            {
                return EntityLootCountMin;
            }
            case  158 :
            {
                return Falloff;
            }
            case  9 :
            {
                return Hp;
            }
            case  54 :
            {
                return MaxRange;
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
            case  525 :
            {
                return StructureUniformity;
            }
            case  160 :
            {
                return TrackingSpeed;
            }
            default:
            {
                return super.attribute((attribute));
            }
        }
    }

    @Override
    public IMetaCategory<Entity> getCategory() {
        return METACAT;
    }

    public static class MetaCat
        implements IMetaCategory<Entity>
    {

        @Override
        public int getCategoryId() {
            return  11;
        }

        @Override
        public String getName() {
            return "Entity";
        }

        @Override
        public Collection<IMetaGroup<? extends Entity>> groups() {
            return Arrays.asList(SentryGun.METAGROUP, PoliceDrone.METAGROUP, PirateDrone.METAGROUP, LCODrone.METAGROUP, MinorThreat.METAGROUP, RogueDrone.METAGROUP, FactionDrone.METAGROUP, Convoy.METAGROUP, ConvoyDrone.METAGROUP, ConcordDrone.METAGROUP, SpawnContainer.METAGROUP, LargeCollidableStructure.METAGROUP, Billboard.METAGROUP, TemporaryCloud.METAGROUP, MissionDrone.METAGROUP, DestructibleSentryGun.METAGROUP, CustomsOfficial.METAGROUP, DeadspaceOverseerSStructure.METAGROUP, DeadspaceOverseerSSentry.METAGROUP, DeadspaceOverseerSBelongings.METAGROUP, StorylineFrigate.METAGROUP, StorylineCruiser.METAGROUP, StorylineBattleship.METAGROUP, StorylineMissionFrigate.METAGROUP, StorylineMissionCruiser.METAGROUP, StorylineMissionBattleship.METAGROUP, AsteroidAngelCartelFrigate.METAGROUP, AsteroidAngelCartelCruiser.METAGROUP, AsteroidAngelCartelBattleship.METAGROUP, AsteroidAngelCartelOfficer.METAGROUP, AsteroidAngelCartelHauler.METAGROUP, AsteroidBloodRaidersCruiser.METAGROUP, AsteroidBloodRaidersBattleship.METAGROUP, AsteroidBloodRaidersFrigate.METAGROUP, AsteroidBloodRaidersHauler.METAGROUP, AsteroidBloodRaidersOfficer.METAGROUP, AsteroidGuristasBattleship.METAGROUP, AsteroidGuristasCruiser.METAGROUP, AsteroidGuristasFrigate.METAGROUP, AsteroidGuristasHauler.METAGROUP, AsteroidGuristasOfficer.METAGROUP, AsteroidSanshaSNationBattleship.METAGROUP, AsteroidSanshaSNationCruiser.METAGROUP, AsteroidSanshaSNationFrigate.METAGROUP, AsteroidSanshaSNationHauler.METAGROUP, AsteroidSanshaSNationOfficer.METAGROUP, AsteroidSerpentisBattleship.METAGROUP, AsteroidSerpentisCruiser.METAGROUP, AsteroidSerpentisFrigate.METAGROUP, AsteroidSerpentisHauler.METAGROUP, AsteroidSerpentisOfficer.METAGROUP, AsteroidAngelCartelDestroyer.METAGROUP, AsteroidAngelCartelBattleCruiser.METAGROUP, AsteroidBloodRaidersDestroyer.METAGROUP, AsteroidBloodRaidersBattleCruiser.METAGROUP, AsteroidGuristasDestroyer.METAGROUP, AsteroidGuristasBattleCruiser.METAGROUP, AsteroidSanshaSNationDestroyer.METAGROUP, AsteroidSanshaSNationBattleCruiser.METAGROUP, AsteroidSerpentisDestroyer.METAGROUP, AsteroidSerpentisBattleCruiser.METAGROUP, DeadspaceAngelCartelBattleCruiser.METAGROUP, DeadspaceAngelCartelBattleship.METAGROUP, DeadspaceAngelCartelCruiser.METAGROUP, DeadspaceAngelCartelDestroyer.METAGROUP, DeadspaceAngelCartelFrigate.METAGROUP, DeadspaceBloodRaidersBattleCruiser.METAGROUP, DeadspaceBloodRaidersBattleship.METAGROUP, DeadspaceBloodRaidersCruiser.METAGROUP, DeadspaceBloodRaidersDestroyer.METAGROUP, DeadspaceBloodRaidersFrigate.METAGROUP, DeadspaceGuristasBattleCruiser.METAGROUP, DeadspaceGuristasBattleship.METAGROUP, DeadspaceGuristasCruiser.METAGROUP, DeadspaceGuristasDestroyer.METAGROUP, DeadspaceGuristasFrigate.METAGROUP, DeadspaceSanshaSNationBattleCruiser.METAGROUP, DeadspaceSanshaSNationBattleship.METAGROUP, DeadspaceSanshaSNationCruiser.METAGROUP, DeadspaceSanshaSNationDestroyer.METAGROUP, DeadspaceSanshaSNationFrigate.METAGROUP, DeadspaceSerpentisBattleCruiser.METAGROUP, DeadspaceSerpentisBattleship.METAGROUP, DeadspaceSerpentisCruiser.METAGROUP, DeadspaceSerpentisDestroyer.METAGROUP, DeadspaceSerpentisFrigate.METAGROUP, MissionAmarrEmpireFrigate.METAGROUP, MissionAmarrEmpireBattlecruiser.METAGROUP, MissionAmarrEmpireBattleship.METAGROUP, MissionAmarrEmpireCruiser.METAGROUP, MissionAmarrEmpireDestroyer.METAGROUP, MissionAmarrEmpireOther.METAGROUP, MissionCaldariStateFrigate.METAGROUP, MissionCaldariStateBattlecruiser.METAGROUP, MissionCaldariStateCruiser.METAGROUP, MissionCaldariStateBattleship.METAGROUP, MissionCaldariStateOther.METAGROUP, MissionCaldariStateDestroyer.METAGROUP, MissionGallenteFederationFrigate.METAGROUP, MissionGallenteFederationCruiser.METAGROUP, MissionGallenteFederationDestroyer.METAGROUP, MissionGallenteFederationBattleship.METAGROUP, MissionGallenteFederationBattlecruiser.METAGROUP, MissionMinmatarRepublicFrigate.METAGROUP, MissionMinmatarRepublicDestroyer.METAGROUP, MissionMinmatarRepublicBattlecruiser.METAGROUP, MissionKhanidFrigate.METAGROUP, MissionKhanidCruiser.METAGROUP, MissionKhanidBattleship.METAGROUP, MissionCONCORDFrigate.METAGROUP, MissionCONCORDCruiser.METAGROUP, MissionCONCORDBattleship.METAGROUP, MissionMorduFrigate.METAGROUP, MissionMorduCruiser.METAGROUP, MissionMorduBattleship.METAGROUP, MissionMinmatarRepublicCruiser.METAGROUP, MissionMinmatarRepublicBattleship.METAGROUP, DestructibleAgentsInSpace.METAGROUP, AsteroidRogueDroneBattleCruiser.METAGROUP, AsteroidRogueDroneBattleship.METAGROUP, AsteroidRogueDroneCruiser.METAGROUP, AsteroidRogueDroneDestroyer.METAGROUP, AsteroidRogueDroneFrigate.METAGROUP, AsteroidRogueDroneHauler.METAGROUP, AsteroidRogueDroneSwarm.METAGROUP, LargeCollidableShip.METAGROUP, AsteroidAngelCartelCommanderFrigate.METAGROUP, AsteroidAngelCartelCommanderCruiser.METAGROUP, AsteroidBloodRaidersCommanderCruiser.METAGROUP, AsteroidBloodRaidersCommanderFrigate.METAGROUP, AsteroidAngelCartelCommanderBattleCruiser.METAGROUP, AsteroidAngelCartelCommanderDestroyer.METAGROUP, AsteroidBloodRaidersCommanderBattleCruiser.METAGROUP, AsteroidBloodRaidersCommanderDestroyer.METAGROUP, AsteroidGuristasCommanderBattleCruiser.METAGROUP, AsteroidGuristasCommanderCruiser.METAGROUP, AsteroidGuristasCommanderDestroyer.METAGROUP, AsteroidGuristasCommanderFrigate.METAGROUP, DeadspaceRogueDroneBattleCruiser.METAGROUP, DeadspaceRogueDroneBattleship.METAGROUP, DeadspaceRogueDroneCruiser.METAGROUP, DeadspaceRogueDroneDestroyer.METAGROUP, DeadspaceRogueDroneFrigate.METAGROUP, DeadspaceRogueDroneSwarm.METAGROUP, AsteroidSanshaSNationCommanderBattleCruiser.METAGROUP, AsteroidSanshaSNationCommanderCruiser.METAGROUP, AsteroidSanshaSNationCommanderDestroyer.METAGROUP, AsteroidSanshaSNationCommanderFrigate.METAGROUP, AsteroidSerpentisCommanderBattleCruiser.METAGROUP, AsteroidSerpentisCommanderCruiser.METAGROUP, AsteroidSerpentisCommanderDestroyer.METAGROUP, AsteroidSerpentisCommanderFrigate.METAGROUP, MissionGenericBattleships.METAGROUP, MissionGenericCruisers.METAGROUP, MissionGenericFrigates.METAGROUP, DeadspaceOverseerFrigate.METAGROUP, DeadspaceOverseerCruiser.METAGROUP, DeadspaceOverseerBattleship.METAGROUP, MissionThukkerCruiser.METAGROUP, MissionThukkerFrigate.METAGROUP, MissionGenericBattleCruisers.METAGROUP, MissionGenericDestroyers.METAGROUP, AsteroidRogueDroneCommanderBattleCruiser.METAGROUP, AsteroidRogueDroneCommanderBattleship.METAGROUP, AsteroidRogueDroneCommanderCruiser.METAGROUP, AsteroidRogueDroneCommanderDestroyer.METAGROUP, AsteroidRogueDroneCommanderFrigate.METAGROUP, AsteroidAngelCartelCommanderBattleship.METAGROUP, AsteroidBloodRaidersCommanderBattleship.METAGROUP, AsteroidGuristasCommanderBattleship.METAGROUP, AsteroidSanshaSNationCommanderBattleship.METAGROUP, AsteroidSerpentisCommanderBattleship.METAGROUP, MissionFighterDrone.METAGROUP, MissionAmarrEmpireCarrier.METAGROUP, MissionCaldariStateCarrier.METAGROUP, MissionGallenteFederationCarrier.METAGROUP, MissionMinmatarRepublicCarrier.METAGROUP, MissionFactionTransports.METAGROUP, CapturePoint.METAGROUP, MissionFactionBattleship.METAGROUP, FWInfrastructureHub.METAGROUP, MissionFactionIndustrials.METAGROUP, MissionContainer.METAGROUP, DeadspaceSleeperSleeplessSentinel.METAGROUP, DeadspaceSleeperAwakenedSentinel.METAGROUP, DeadspaceSleeperEmergentSentinel.METAGROUP, DeadspaceSleeperSleeplessDefender.METAGROUP, DeadspaceSleeperSleeplessPatroller.METAGROUP, DeadspaceSleeperAwakenedDefender.METAGROUP, DeadspaceSleeperAwakenedPatroller.METAGROUP, DeadspaceSleeperEmergentDefender.METAGROUP, DeadspaceSleeperEmergentPatroller.METAGROUP, MissionFactionCruiser.METAGROUP, MissionFactionFrigate.METAGROUP, IncursionSanshaSNationCapital.METAGROUP, IncursionSanshaSNationFrigate.METAGROUP, IncursionSanshaSNationCruiser.METAGROUP, IncursionSanshaSNationBattleship.METAGROUP, AsteroidRogueDroneOfficer.METAGROUP, AsteroidMordusLegionCommanderFrigate.METAGROUP, AsteroidMordusLegionCommanderCruiser.METAGROUP, AsteroidMordusLegionCommanderBattleship.METAGROUP, AmarrNavyRoamingBattleship.METAGROUP, AmarrNavyRoamingCruiser.METAGROUP, AmarrNavyRoamingCapital.METAGROUP, AmarrNavyRoamingLogistics.METAGROUP, AmarrNavyRoamingFrigate.METAGROUP, IrregularDrone.METAGROUP, IrregularFighter.METAGROUP, MissionGenericSupercarrier.METAGROUP, DeadspaceSleeperUpgradedAvenger.METAGROUP, DrifterResponseBattleship.METAGROUP, IrregularShuttle.METAGROUP, IrregularFrigate.METAGROUP, IrregularDestroyer.METAGROUP, IrregularCruiser.METAGROUP, IrregularBattlecruiser.METAGROUP, IrregularBattleship.METAGROUP, AsteroidAngelCartelDreadnought.METAGROUP, AsteroidAngelCartelTitan.METAGROUP, AsteroidBloodRaiderDreadnought.METAGROUP, AsteroidBloodRaiderTitan.METAGROUP, AsteroidGuristasDreadnought.METAGROUP, AsteroidGuristasTitan.METAGROUP, AsteroidSanshaSNationDreadnought.METAGROUP, AsteroidSanshaSNationSupercarrier.METAGROUP, AsteroidSerpentisDreadnought.METAGROUP, AsteroidSerpentisTitan.METAGROUP, AsteroidRogueDroneCarrier.METAGROUP, AsteroidRogueDroneSupercarrier.METAGROUP, RoamingSerpentisBattleship.METAGROUP, RoamingSerpentisCruiser.METAGROUP, RoamingSerpentisFrigate.METAGROUP, IrregularDreadnought.METAGROUP, IrregularCarrier.METAGROUP, RoamingAngelCartelBattleship.METAGROUP, RoamingAngelCartelCruiser.METAGROUP, RoamingAngelCartelFrigate.METAGROUP, RoamingBloodRaiderFrigate.METAGROUP, RoamingBloodRaiderCruiser.METAGROUP, RoamingBloodRaiderBattlecruiser.METAGROUP, RoamingBloodRaiderBattleship.METAGROUP, NPCMiningFrigate.METAGROUP, NPCMiningBarge.METAGROUP, NPCMiningExhumer.METAGROUP, NPCMiningHauler.METAGROUP, SeekerScouts.METAGROUP, HiddenZenithDrifters.METAGROUP, HiddenZenithAmarrBattleship.METAGROUP, HiddenZenithAmarrCruiser.METAGROUP, HiddenZenithAmarrFrigate.METAGROUP, HiddenZenithCaldariBattleship.METAGROUP, HiddenZenithCaldariCruiser.METAGROUP, HiddenZenithCaldariFrigate.METAGROUP, HiddenZenithGallenteBattleship.METAGROUP, HiddenZenithGallenteCruiser.METAGROUP, HiddenZenithGallenteFrigate.METAGROUP, HiddenZenithMinmatarBattleship.METAGROUP, HiddenZenithMinmatarCruiser.METAGROUP, HiddenZenithMinmatarFrigate.METAGROUP, NPCFrigate.METAGROUP, HiddenZenithAmarrCapital.METAGROUP, HiddenZenithCaldariCapital.METAGROUP, HiddenZenithGallenteCapital.METAGROUP, HiddenZenithMinmatarCapital.METAGROUP, NPCCruiser.METAGROUP, NPCBattleship.METAGROUP, StructureEntities.METAGROUP, NPCTitan.METAGROUP, NPCForceAuxiliary.METAGROUP, NPCDreadnought.METAGROUP, IrregularIndustrial.METAGROUP, NPCIndustrialCommand.METAGROUP, NPCBattlecruiser.METAGROUP, IrregularFreighter.METAGROUP, IrregularContainer.METAGROUP, IrregularUnidentified.METAGROUP, DrifterReinforcements.METAGROUP, AbyssalSpaceshipEntities.METAGROUP, AbyssalDroneEntities.METAGROUP, PrecursorCache.METAGROUP);
        }
    }
}
