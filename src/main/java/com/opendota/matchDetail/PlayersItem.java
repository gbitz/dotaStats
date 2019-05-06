package com.opendota.matchDetail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PlayersItem{



	@JsonProperty("cluster")
	private int cluster;

	@JsonProperty("performance_others")
	private Object performanceOthers;

	@JsonProperty("gold_spent")
	private int goldSpent;



	@JsonProperty("observer_kills")
	private int observerKills;

	@JsonProperty("purchase_tpscroll")
	private int purchaseTpscroll;



	@JsonProperty("lane_role")
	private int laneRole;

	@JsonProperty("observer_uses")
	private int observerUses;

	@JsonProperty("patch")
	private int patch;

	@JsonProperty("neutral_kills")
	private int neutralKills;

	@JsonProperty("roshan_kills")
	private int roshanKills;


	@JsonProperty("pings")
	private int pings;

	@JsonProperty("deaths")
	private int deaths;


	@JsonProperty("gold_per_min")
	private int goldPerMin;

	@JsonProperty("lose")
	private int lose;

	@JsonProperty("party_size")
	private int partySize;

	@JsonProperty("kda")
	private int kda;

	@JsonProperty("purchase_ward_observer")
	private int purchaseWardObserver;


	@JsonProperty("kills_per_min")
	private double killsPerMin;



	@JsonProperty("buyback_count")
	private int buybackCount;

	@JsonProperty("necronomicon_kills")
	private int necronomiconKills;



	@JsonProperty("kills_log")
	private List<KillsLogItem> killsLog;

	@JsonProperty("rune_pickups")
	private int runePickups;



	@JsonProperty("lh_t")
	private List<Integer> lhT;

	@JsonProperty("repicked")
	private Object repicked;

	@JsonProperty("gold_t")
	private List<Integer> goldT;

	@JsonProperty("additional_units")
	private Object additionalUnits;

	@JsonProperty("randomed")
	private boolean randomed;

	@JsonProperty("gold")
	private int gold;

	@JsonProperty("radiant_win")
	private boolean radiantWin;

	@JsonProperty("camps_stacked")
	private int campsStacked;

	@JsonProperty("ancient_kills")
	private int ancientKills;

	@JsonProperty("actions_per_min")
	private int actionsPerMin;

	@JsonProperty("roshans_killed")
	private int roshansKilled;

	@JsonProperty("match_id")
	private long matchId;

	@JsonProperty("life_state_dead")
	private int lifeStateDead;

	@JsonProperty("lane_kills")
	private int laneKills;

	@JsonProperty("hero_kills")
	private int heroKills;

	@JsonProperty("stuns")
	private double stuns;

	@JsonProperty("account_id")
	private int accountId;

	@JsonProperty("leaver_status")
	private int leaverStatus;

	@JsonProperty("hero_healing")
	private int heroHealing;

	@JsonProperty("game_mode")
	private int gameMode;

	@JsonProperty("obs_placed")
	private int obsPlaced;

	@JsonProperty("total_xp")
	private int totalXp;

	@JsonProperty("gold_reasons")
	private GoldReasons goldReasons;

	@JsonProperty("is_contributor")
	private boolean isContributor;

	@JsonProperty("total_gold")
	private int totalGold;

	@JsonProperty("buyback_log")
	private List<Object> buybackLog;

	@JsonProperty("sentry_kills")
	private int sentryKills;


	@JsonProperty("xp_per_min")
	private int xpPerMin;



	@JsonProperty("towers_killed")
	private int towersKilled;

	@JsonProperty("level")
	private int level;

	@JsonProperty("abandons")
	private int abandons;

	@JsonProperty("player_slot")
	private int playerSlot;


	@JsonProperty("start_time")
	private int startTime;

	@JsonProperty("last_hits")
	private int lastHits;

	@JsonProperty("sentry_uses")
	private int sentryUses;



	@JsonProperty("item_5")
	private int item5;

	@JsonProperty("item_4")
	private int item4;


	@JsonProperty("item_3")
	private int item3;

	@JsonProperty("item_2")
	private int item2;

	@JsonProperty("item_1")
	private int item1;

	@JsonProperty("lane_efficiency")
	private double laneEfficiency;

	@JsonProperty("creeps_stacked")
	private int creepsStacked;

	@JsonProperty("item_0")
	private int item0;

	@JsonProperty("region")
	private int region;

	@JsonProperty("kills")
	private int kills;

	@JsonProperty("hero_damage")
	private int heroDamage;

	@JsonProperty("tower_kills")
	private int towerKills;

	@JsonProperty("backpack_1")
	private int backpack1;

	@JsonProperty("backpack_2")
	private int backpack2;

	@JsonProperty("denies")
	private int denies;

	@JsonProperty("backpack_0")
	private int backpack0;



	@JsonProperty("courier_kills")
	private int courierKills;

	@JsonProperty("dn_t")
	private List<Integer> dnT;

	@JsonProperty("duration")
	private int duration;

	@JsonProperty("permanent_buffs")
	private Object permanentBuffs;

	@JsonProperty("times")
	private List<Integer> times;

	@JsonProperty("lane_efficiency_pct")
	private int laneEfficiencyPct;

	@JsonProperty("assists")
	private int assists;

	@JsonProperty("tower_damage")
	private int towerDamage;

	@JsonProperty("xp_t")
	private List<Integer> xpT;

	@JsonProperty("rank_tier")
	private int rankTier;

	@JsonProperty("connection_log")
	private List<Object> connectionLog;

	@JsonProperty("isRadiant")
	private boolean isRadiant;

	@JsonProperty("hero_id")
	private int heroId;

	@JsonProperty("win")
	private int win;

	@JsonProperty("lane")
	private int lane;

	@JsonProperty("pred_vict")
	private boolean predVict;

	@JsonProperty("sen_log")
	private List<Object> senLog;

	@JsonProperty("sen_left_log")
	private List<Object> senLeftLog;

	@JsonProperty("is_roaming")
	private boolean isRoaming;



	@JsonProperty("lobby_type")
	private int lobbyType;



	@JsonProperty("killed")
	private Killed killed;

	@JsonProperty("sen_placed")
	private int senPlaced;

	@JsonProperty("ability_upgrades_arr")
	private List<Integer> abilityUpgradesArr;

	@JsonProperty("firstblood_claimed")
	private int firstbloodClaimed;

	@JsonProperty("party_id")
	private int partyId;

	@JsonProperty("teamfight_participation")
	private double teamfightParticipation;

	@JsonProperty("last_login")
	private String lastLogin;

	@JsonProperty("personaname")
	private String personaname;

	@JsonProperty("name")
	private Object name;

	@JsonProperty("purchase_ward_sentry")
	private int purchaseWardSentry;

	public void setCluster(int cluster){
		this.cluster = cluster;
	}

	public int getCluster(){
		return cluster;
	}

	public void setPerformanceOthers(Object performanceOthers){
		this.performanceOthers = performanceOthers;
	}

	public Object getPerformanceOthers(){
		return performanceOthers;
	}

	public void setGoldSpent(int goldSpent){
		this.goldSpent = goldSpent;
	}

	public int getGoldSpent(){
		return goldSpent;
	}


	public void setObserverKills(int observerKills){
		this.observerKills = observerKills;
	}

	public int getObserverKills(){
		return observerKills;
	}

	public void setPurchaseTpscroll(int purchaseTpscroll){
		this.purchaseTpscroll = purchaseTpscroll;
	}

	public int getPurchaseTpscroll(){
		return purchaseTpscroll;
	}



	public void setLaneRole(int laneRole){
		this.laneRole = laneRole;
	}

	public int getLaneRole(){
		return laneRole;
	}

	public void setObserverUses(int observerUses){
		this.observerUses = observerUses;
	}

	public int getObserverUses(){
		return observerUses;
	}

	public void setPatch(int patch){
		this.patch = patch;
	}

	public int getPatch(){
		return patch;
	}

	public void setNeutralKills(int neutralKills){
		this.neutralKills = neutralKills;
	}

	public int getNeutralKills(){
		return neutralKills;
	}

	public void setRoshanKills(int roshanKills){
		this.roshanKills = roshanKills;
	}

	public int getRoshanKills(){
		return roshanKills;
	}


	public void setPings(int pings){
		this.pings = pings;
	}

	public int getPings(){
		return pings;
	}

	public void setDeaths(int deaths){
		this.deaths = deaths;
	}

	public int getDeaths(){
		return deaths;
	}


	public void setGoldPerMin(int goldPerMin){
		this.goldPerMin = goldPerMin;
	}

	public int getGoldPerMin(){
		return goldPerMin;
	}

	public void setLose(int lose){
		this.lose = lose;
	}

	public int getLose(){
		return lose;
	}

	public void setPartySize(int partySize){
		this.partySize = partySize;
	}

	public int getPartySize(){
		return partySize;
	}

	public void setKda(int kda){
		this.kda = kda;
	}

	public int getKda(){
		return kda;
	}

	public void setPurchaseWardObserver(int purchaseWardObserver){
		this.purchaseWardObserver = purchaseWardObserver;
	}

	public int getPurchaseWardObserver(){
		return purchaseWardObserver;
	}



	public void setKillsPerMin(double killsPerMin){
		this.killsPerMin = killsPerMin;
	}

	public double getKillsPerMin(){
		return killsPerMin;
	}



	public void setBuybackCount(int buybackCount){
		this.buybackCount = buybackCount;
	}

	public int getBuybackCount(){
		return buybackCount;
	}

	public void setNecronomiconKills(int necronomiconKills){
		this.necronomiconKills = necronomiconKills;
	}

	public int getNecronomiconKills(){
		return necronomiconKills;
	}



	public void setKillsLog(List<KillsLogItem> killsLog){
		this.killsLog = killsLog;
	}

	public List<KillsLogItem> getKillsLog(){
		return killsLog;
	}

	public void setRunePickups(int runePickups){
		this.runePickups = runePickups;
	}

	public int getRunePickups(){
		return runePickups;
	}



	public void setLhT(List<Integer> lhT){
		this.lhT = lhT;
	}

	public List<Integer> getLhT(){
		return lhT;
	}

	public void setRepicked(Object repicked){
		this.repicked = repicked;
	}

	public Object getRepicked(){
		return repicked;
	}

	public void setGoldT(List<Integer> goldT){
		this.goldT = goldT;
	}

	public List<Integer> getGoldT(){
		return goldT;
	}



	public void setAdditionalUnits(Object additionalUnits){
		this.additionalUnits = additionalUnits;
	}

	public Object getAdditionalUnits(){
		return additionalUnits;
	}

	public void setRandomed(boolean randomed){
		this.randomed = randomed;
	}

	public boolean isRandomed(){
		return randomed;
	}

	public void setGold(int gold){
		this.gold = gold;
	}

	public int getGold(){
		return gold;
	}

	public void setRadiantWin(boolean radiantWin){
		this.radiantWin = radiantWin;
	}

	public boolean isRadiantWin(){
		return radiantWin;
	}

	public void setCampsStacked(int campsStacked){
		this.campsStacked = campsStacked;
	}

	public int getCampsStacked(){
		return campsStacked;
	}



	public void setAncientKills(int ancientKills){
		this.ancientKills = ancientKills;
	}

	public int getAncientKills(){
		return ancientKills;
	}

	public void setActionsPerMin(int actionsPerMin){
		this.actionsPerMin = actionsPerMin;
	}

	public int getActionsPerMin(){
		return actionsPerMin;
	}

	public void setRoshansKilled(int roshansKilled){
		this.roshansKilled = roshansKilled;
	}

	public int getRoshansKilled(){
		return roshansKilled;
	}

	public void setMatchId(long matchId){
		this.matchId = matchId;
	}

	public long getMatchId(){
		return matchId;
	}

	public void setLifeStateDead(int lifeStateDead){
		this.lifeStateDead = lifeStateDead;
	}

	public int getLifeStateDead(){
		return lifeStateDead;
	}

	public void setLaneKills(int laneKills){
		this.laneKills = laneKills;
	}

	public int getLaneKills(){
		return laneKills;
	}

	public void setHeroKills(int heroKills){
		this.heroKills = heroKills;
	}

	public int getHeroKills(){
		return heroKills;
	}

	public void setStuns(double stuns){
		this.stuns = stuns;
	}

	public double getStuns(){
		return stuns;
	}

	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	public int getAccountId(){
		return accountId;
	}

	public void setLeaverStatus(int leaverStatus){
		this.leaverStatus = leaverStatus;
	}

	public int getLeaverStatus(){
		return leaverStatus;
	}

	public void setHeroHealing(int heroHealing){
		this.heroHealing = heroHealing;
	}

	public int getHeroHealing(){
		return heroHealing;
	}


	public void setGameMode(int gameMode){
		this.gameMode = gameMode;
	}

	public int getGameMode(){
		return gameMode;
	}

	public void setObsPlaced(int obsPlaced){
		this.obsPlaced = obsPlaced;
	}

	public int getObsPlaced(){
		return obsPlaced;
	}

	public void setTotalXp(int totalXp){
		this.totalXp = totalXp;
	}

	public int getTotalXp(){
		return totalXp;
	}



	public void setGoldReasons(GoldReasons goldReasons){
		this.goldReasons = goldReasons;
	}

	public GoldReasons getGoldReasons(){
		return goldReasons;
	}

	public void setIsContributor(boolean isContributor){
		this.isContributor = isContributor;
	}

	public boolean isIsContributor(){
		return isContributor;
	}



	public void setTotalGold(int totalGold){
		this.totalGold = totalGold;
	}

	public int getTotalGold(){
		return totalGold;
	}

	public void setBuybackLog(List<Object> buybackLog){
		this.buybackLog = buybackLog;
	}

	public List<Object> getBuybackLog(){
		return buybackLog;
	}

	public void setSentryKills(int sentryKills){
		this.sentryKills = sentryKills;
	}

	public int getSentryKills(){
		return sentryKills;
	}


	public void setXpPerMin(int xpPerMin){
		this.xpPerMin = xpPerMin;
	}

	public int getXpPerMin(){
		return xpPerMin;
	}



	public void setTowersKilled(int towersKilled){
		this.towersKilled = towersKilled;
	}

	public int getTowersKilled(){
		return towersKilled;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel(){
		return level;
	}

	public void setAbandons(int abandons){
		this.abandons = abandons;
	}

	public int getAbandons(){
		return abandons;
	}

	public void setPlayerSlot(int playerSlot){
		this.playerSlot = playerSlot;
	}

	public int getPlayerSlot(){
		return playerSlot;
	}



	public void setStartTime(int startTime){
		this.startTime = startTime;
	}

	public int getStartTime(){
		return startTime;
	}

	public void setLastHits(int lastHits){
		this.lastHits = lastHits;
	}

	public int getLastHits(){
		return lastHits;
	}

	public void setSentryUses(int sentryUses){
		this.sentryUses = sentryUses;
	}

	public int getSentryUses(){
		return sentryUses;
	}



	public void setItem5(int item5){
		this.item5 = item5;
	}

	public int getItem5(){
		return item5;
	}

	public void setItem4(int item4){
		this.item4 = item4;
	}

	public int getItem4(){
		return item4;
	}



	public void setItem3(int item3){
		this.item3 = item3;
	}

	public int getItem3(){
		return item3;
	}

	public void setItem2(int item2){
		this.item2 = item2;
	}

	public int getItem2(){
		return item2;
	}

	public void setItem1(int item1){
		this.item1 = item1;
	}

	public int getItem1(){
		return item1;
	}

	public void setLaneEfficiency(double laneEfficiency){
		this.laneEfficiency = laneEfficiency;
	}

	public double getLaneEfficiency(){
		return laneEfficiency;
	}

	public void setCreepsStacked(int creepsStacked){
		this.creepsStacked = creepsStacked;
	}

	public int getCreepsStacked(){
		return creepsStacked;
	}

	public void setItem0(int item0){
		this.item0 = item0;
	}

	public int getItem0(){
		return item0;
	}

	public void setRegion(int region){
		this.region = region;
	}

	public int getRegion(){
		return region;
	}

	public void setKills(int kills){
		this.kills = kills;
	}

	public int getKills(){
		return kills;
	}

	public void setHeroDamage(int heroDamage){
		this.heroDamage = heroDamage;
	}

	public int getHeroDamage(){
		return heroDamage;
	}

	public void setTowerKills(int towerKills){
		this.towerKills = towerKills;
	}

	public int getTowerKills(){
		return towerKills;
	}

	public void setBackpack1(int backpack1){
		this.backpack1 = backpack1;
	}

	public int getBackpack1(){
		return backpack1;
	}

	public void setBackpack2(int backpack2){
		this.backpack2 = backpack2;
	}

	public int getBackpack2(){
		return backpack2;
	}



	public void setDenies(int denies){
		this.denies = denies;
	}

	public int getDenies(){
		return denies;
	}

	public void setBackpack0(int backpack0){
		this.backpack0 = backpack0;
	}

	public int getBackpack0(){
		return backpack0;
	}



	public void setCourierKills(int courierKills){
		this.courierKills = courierKills;
	}

	public int getCourierKills(){
		return courierKills;
	}



	public void setDnT(List<Integer> dnT){
		this.dnT = dnT;
	}

	public List<Integer> getDnT(){
		return dnT;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setPermanentBuffs(Object permanentBuffs){
		this.permanentBuffs = permanentBuffs;
	}

	public Object getPermanentBuffs(){
		return permanentBuffs;
	}

	public void setTimes(List<Integer> times){
		this.times = times;
	}

	public List<Integer> getTimes(){
		return times;
	}

	public void setLaneEfficiencyPct(int laneEfficiencyPct){
		this.laneEfficiencyPct = laneEfficiencyPct;
	}

	public int getLaneEfficiencyPct(){
		return laneEfficiencyPct;
	}

	public void setAssists(int assists){
		this.assists = assists;
	}

	public int getAssists(){
		return assists;
	}

	public void setTowerDamage(int towerDamage){
		this.towerDamage = towerDamage;
	}

	public int getTowerDamage(){
		return towerDamage;
	}

	public void setXpT(List<Integer> xpT){
		this.xpT = xpT;
	}

	public List<Integer> getXpT(){
		return xpT;
	}

	public void setRankTier(int rankTier){
		this.rankTier = rankTier;
	}

	public int getRankTier(){
		return rankTier;
	}

	public void setConnectionLog(List<Object> connectionLog){
		this.connectionLog = connectionLog;
	}

	public List<Object> getConnectionLog(){
		return connectionLog;
	}

	public void setIsRadiant(boolean isRadiant){
		this.isRadiant = isRadiant;
	}

	public boolean isIsRadiant(){
		return isRadiant;
	}

	public void setHeroId(int heroId){
		this.heroId = heroId;
	}

	public int getHeroId(){
		return heroId;
	}

	public void setWin(int win){
		this.win = win;
	}

	public int getWin(){
		return win;
	}

	public void setLane(int lane){
		this.lane = lane;
	}

	public int getLane(){
		return lane;
	}

	public void setPredVict(boolean predVict){
		this.predVict = predVict;
	}

	public boolean isPredVict(){
		return predVict;
	}

	public void setSenLog(List<Object> senLog){
		this.senLog = senLog;
	}

	public List<Object> getSenLog(){
		return senLog;
	}

	public void setSenLeftLog(List<Object> senLeftLog){
		this.senLeftLog = senLeftLog;
	}

	public List<Object> getSenLeftLog(){
		return senLeftLog;
	}

	public void setIsRoaming(boolean isRoaming){
		this.isRoaming = isRoaming;
	}

	public boolean isIsRoaming(){
		return isRoaming;
	}


	public void setLobbyType(int lobbyType){
		this.lobbyType = lobbyType;
	}

	public int getLobbyType(){
		return lobbyType;
	}



	public void setKilled(Killed killed){
		this.killed = killed;
	}

	public Killed getKilled(){
		return killed;
	}

	public void setSenPlaced(int senPlaced){
		this.senPlaced = senPlaced;
	}

	public int getSenPlaced(){
		return senPlaced;
	}

	public void setAbilityUpgradesArr(List<Integer> abilityUpgradesArr){
		this.abilityUpgradesArr = abilityUpgradesArr;
	}

	public List<Integer> getAbilityUpgradesArr(){
		return abilityUpgradesArr;
	}

	public void setFirstbloodClaimed(int firstbloodClaimed){
		this.firstbloodClaimed = firstbloodClaimed;
	}

	public int getFirstbloodClaimed(){
		return firstbloodClaimed;
	}

	public void setPartyId(int partyId){
		this.partyId = partyId;
	}

	public int getPartyId(){
		return partyId;
	}

	public void setTeamfightParticipation(double teamfightParticipation){
		this.teamfightParticipation = teamfightParticipation;
	}

	public double getTeamfightParticipation(){
		return teamfightParticipation;
	}

	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	public String getLastLogin(){
		return lastLogin;
	}

	public void setPersonaname(String personaname){
		this.personaname = personaname;
	}

	public String getPersonaname(){
		return personaname;
	}

	public void setName(Object name){
		this.name = name;
	}

	public Object getName(){
		return name;
	}

	public void setPurchaseWardSentry(int purchaseWardSentry){
		this.purchaseWardSentry = purchaseWardSentry;
	}

	public int getPurchaseWardSentry(){
		return purchaseWardSentry;
	}

	@Override
 	public String toString(){
		return 
			"PlayersItem{" + 
			",cluster = '" + cluster + '\'' +
			",performance_others = '" + performanceOthers + '\'' + 
			",gold_spent = '" + goldSpent + '\'' + 
			",observer_kills = '" + observerKills + '\'' +
			",purchase_tpscroll = '" + purchaseTpscroll + '\'' + 
			",lane_role = '" + laneRole + '\'' +
			",observer_uses = '" + observerUses + '\'' + 
			",patch = '" + patch + '\'' + 
			",neutral_kills = '" + neutralKills + '\'' + 
			",roshan_kills = '" + roshanKills + '\'' + 
			",pings = '" + pings + '\'' +
			",deaths = '" + deaths + '\'' + 
			",gold_per_min = '" + goldPerMin + '\'' +
			",lose = '" + lose + '\'' + 
			",party_size = '" + partySize + '\'' + 
			",kda = '" + kda + '\'' + 
			",purchase_ward_observer = '" + purchaseWardObserver + '\'' + 
			",kills_per_min = '" + killsPerMin + '\'' +
			",buyback_count = '" + buybackCount + '\'' +
			",necronomicon_kills = '" + necronomiconKills + '\'' + 
			",kills_log = '" + killsLog + '\'' +
			",rune_pickups = '" + runePickups + '\'' + 
			",lh_t = '" + lhT + '\'' +
			",repicked = '" + repicked + '\'' + 
			",gold_t = '" + goldT + '\'' + 
			",additional_units = '" + additionalUnits + '\'' +
			",randomed = '" + randomed + '\'' + 
			",gold = '" + gold + '\'' + 
			",radiant_win = '" + radiantWin + '\'' + 
			",camps_stacked = '" + campsStacked + '\'' + 
			",ancient_kills = '" + ancientKills + '\'' +
			",actions_per_min = '" + actionsPerMin + '\'' + 
			",roshans_killed = '" + roshansKilled + '\'' + 
			",match_id = '" + matchId + '\'' + 
			",life_state_dead = '" + lifeStateDead + '\'' + 
			",lane_kills = '" + laneKills + '\'' + 
			",hero_kills = '" + heroKills + '\'' + 
			",stuns = '" + stuns + '\'' + 
			",account_id = '" + accountId + '\'' + 
			",leaver_status = '" + leaverStatus + '\'' + 
			",hero_healing = '" + heroHealing + '\'' + 
			",game_mode = '" + gameMode + '\'' +
			",obs_placed = '" + obsPlaced + '\'' + 
			",total_xp = '" + totalXp + '\'' + 
			",gold_reasons = '" + goldReasons + '\'' +
			",is_contributor = '" + isContributor + '\'' + 
			",total_gold = '" + totalGold + '\'' +
			",buyback_log = '" + buybackLog + '\'' + 
			",sentry_kills = '" + sentryKills + '\'' + 
			",xp_per_min = '" + xpPerMin + '\'' +
			",towers_killed = '" + towersKilled + '\'' +
			",level = '" + level + '\'' + 
			",abandons = '" + abandons + '\'' + 
			",player_slot = '" + playerSlot + '\'' + 
			",start_time = '" + startTime + '\'' +
			",last_hits = '" + lastHits + '\'' + 
			",sentry_uses = '" + sentryUses + '\'' + 
			",item_5 = '" + item5 + '\'' +
			",item_4 = '" + item4 + '\'' + 
			",item_3 = '" + item3 + '\'' +
			",item_2 = '" + item2 + '\'' + 
			",item_1 = '" + item1 + '\'' + 
			",lane_efficiency = '" + laneEfficiency + '\'' + 
			",creeps_stacked = '" + creepsStacked + '\'' + 
			",item_0 = '" + item0 + '\'' + 
			",region = '" + region + '\'' + 
			",kills = '" + kills + '\'' + 
			",hero_damage = '" + heroDamage + '\'' + 
			",tower_kills = '" + towerKills + '\'' + 
			",backpack_1 = '" + backpack1 + '\'' + 
			",backpack_2 = '" + backpack2 + '\'' + 
			",denies = '" + denies + '\'' +
			",backpack_0 = '" + backpack0 + '\'' + 
			",courier_kills = '" + courierKills + '\'' +
			",dn_t = '" + dnT + '\'' +
			",duration = '" + duration + '\'' + 
			",permanent_buffs = '" + permanentBuffs + '\'' + 
			",times = '" + times + '\'' + 
			",lane_efficiency_pct = '" + laneEfficiencyPct + '\'' + 
			",assists = '" + assists + '\'' + 
			",tower_damage = '" + towerDamage + '\'' + 
			",xp_t = '" + xpT + '\'' + 
			",rank_tier = '" + rankTier + '\'' + 
			",connection_log = '" + connectionLog + '\'' + 
			",isRadiant = '" + isRadiant + '\'' + 
			",hero_id = '" + heroId + '\'' + 
			",win = '" + win + '\'' + 
			",lane = '" + lane + '\'' + 
			",pred_vict = '" + predVict + '\'' + 
			",sen_log = '" + senLog + '\'' + 
			",sen_left_log = '" + senLeftLog + '\'' + 
			",is_roaming = '" + isRoaming + '\'' + 
			",lobby_type = '" + lobbyType + '\'' +
			",killed = '" + killed + '\'' +
			",sen_placed = '" + senPlaced + '\'' + 
			",ability_upgrades_arr = '" + abilityUpgradesArr + '\'' + 
			",firstblood_claimed = '" + firstbloodClaimed + '\'' + 
			",party_id = '" + partyId + '\'' + 
			",teamfight_participation = '" + teamfightParticipation + '\'' + 
			",last_login = '" + lastLogin + '\'' + 
			",personaname = '" + personaname + '\'' + 
			",name = '" + name + '\'' + 
			",purchase_ward_sentry = '" + purchaseWardSentry + '\'' + 
			"}";
		}
}