package com.opendota.matchDetail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Players item.
 */
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

	/**
	 * Gets hero img.
	 *
	 * @return the hero img
	 */
	public String getHeroImg() {
		return heroImg;
	}

	/**
	 * Sets hero img.
	 *
	 * @param heroImg the hero img
	 */
	public void setHeroImg(String heroImg) {
		this.heroImg = heroImg;
	}

	@JsonProperty("heroImg")
	private String heroImg;

	@JsonProperty("name")
	private Object name;

	@JsonProperty("purchase_ward_sentry")
	private int purchaseWardSentry;

	/**
	 * Set cluster.
	 *
	 * @param cluster the cluster
	 */
	public void setCluster(int cluster){
		this.cluster = cluster;
	}

	/**
	 * Get cluster int.
	 *
	 * @return the int
	 */
	public int getCluster(){
		return cluster;
	}

	/**
	 * Set performance others.
	 *
	 * @param performanceOthers the performance others
	 */
	public void setPerformanceOthers(Object performanceOthers){
		this.performanceOthers = performanceOthers;
	}

	/**
	 * Get performance others object.
	 *
	 * @return the object
	 */
	public Object getPerformanceOthers(){
		return performanceOthers;
	}

	/**
	 * Set gold spent.
	 *
	 * @param goldSpent the gold spent
	 */
	public void setGoldSpent(int goldSpent){
		this.goldSpent = goldSpent;
	}

	/**
	 * Get gold spent int.
	 *
	 * @return the int
	 */
	public int getGoldSpent(){
		return goldSpent;
	}


	/**
	 * Set observer kills.
	 *
	 * @param observerKills the observer kills
	 */
	public void setObserverKills(int observerKills){
		this.observerKills = observerKills;
	}

	/**
	 * Get observer kills int.
	 *
	 * @return the int
	 */
	public int getObserverKills(){
		return observerKills;
	}

	/**
	 * Set purchase tpscroll.
	 *
	 * @param purchaseTpscroll the purchase tpscroll
	 */
	public void setPurchaseTpscroll(int purchaseTpscroll){
		this.purchaseTpscroll = purchaseTpscroll;
	}

	/**
	 * Get purchase tpscroll int.
	 *
	 * @return the int
	 */
	public int getPurchaseTpscroll(){
		return purchaseTpscroll;
	}


	/**
	 * Set lane role.
	 *
	 * @param laneRole the lane role
	 */
	public void setLaneRole(int laneRole){
		this.laneRole = laneRole;
	}

	/**
	 * Get lane role int.
	 *
	 * @return the int
	 */
	public int getLaneRole(){
		return laneRole;
	}

	/**
	 * Set observer uses.
	 *
	 * @param observerUses the observer uses
	 */
	public void setObserverUses(int observerUses){
		this.observerUses = observerUses;
	}

	/**
	 * Get observer uses int.
	 *
	 * @return the int
	 */
	public int getObserverUses(){
		return observerUses;
	}

	/**
	 * Set patch.
	 *
	 * @param patch the patch
	 */
	public void setPatch(int patch){
		this.patch = patch;
	}

	/**
	 * Get patch int.
	 *
	 * @return the int
	 */
	public int getPatch(){
		return patch;
	}

	/**
	 * Set neutral kills.
	 *
	 * @param neutralKills the neutral kills
	 */
	public void setNeutralKills(int neutralKills){
		this.neutralKills = neutralKills;
	}

	/**
	 * Get neutral kills int.
	 *
	 * @return the int
	 */
	public int getNeutralKills(){
		return neutralKills;
	}

	/**
	 * Set roshan kills.
	 *
	 * @param roshanKills the roshan kills
	 */
	public void setRoshanKills(int roshanKills){
		this.roshanKills = roshanKills;
	}

	/**
	 * Get roshan kills int.
	 *
	 * @return the int
	 */
	public int getRoshanKills(){
		return roshanKills;
	}


	/**
	 * Set pings.
	 *
	 * @param pings the pings
	 */
	public void setPings(int pings){
		this.pings = pings;
	}

	/**
	 * Get pings int.
	 *
	 * @return the int
	 */
	public int getPings(){
		return pings;
	}

	/**
	 * Set deaths.
	 *
	 * @param deaths the deaths
	 */
	public void setDeaths(int deaths){
		this.deaths = deaths;
	}

	/**
	 * Get deaths int.
	 *
	 * @return the int
	 */
	public int getDeaths(){
		return deaths;
	}


	/**
	 * Set gold per min.
	 *
	 * @param goldPerMin the gold per min
	 */
	public void setGoldPerMin(int goldPerMin){
		this.goldPerMin = goldPerMin;
	}

	/**
	 * Get gold per min int.
	 *
	 * @return the int
	 */
	public int getGoldPerMin(){
		return goldPerMin;
	}

	/**
	 * Set lose.
	 *
	 * @param lose the lose
	 */
	public void setLose(int lose){
		this.lose = lose;
	}

	/**
	 * Get lose int.
	 *
	 * @return the int
	 */
	public int getLose(){
		return lose;
	}

	/**
	 * Set party size.
	 *
	 * @param partySize the party size
	 */
	public void setPartySize(int partySize){
		this.partySize = partySize;
	}

	/**
	 * Get party size int.
	 *
	 * @return the int
	 */
	public int getPartySize(){
		return partySize;
	}

	/**
	 * Set kda.
	 *
	 * @param kda the kda
	 */
	public void setKda(int kda){
		this.kda = kda;
	}

	/**
	 * Get kda int.
	 *
	 * @return the int
	 */
	public int getKda(){
		return kda;
	}

	/**
	 * Set purchase ward observer.
	 *
	 * @param purchaseWardObserver the purchase ward observer
	 */
	public void setPurchaseWardObserver(int purchaseWardObserver){
		this.purchaseWardObserver = purchaseWardObserver;
	}

	/**
	 * Get purchase ward observer int.
	 *
	 * @return the int
	 */
	public int getPurchaseWardObserver(){
		return purchaseWardObserver;
	}


	/**
	 * Set kills per min.
	 *
	 * @param killsPerMin the kills per min
	 */
	public void setKillsPerMin(double killsPerMin){
		this.killsPerMin = killsPerMin;
	}

	/**
	 * Get kills per min double.
	 *
	 * @return the double
	 */
	public double getKillsPerMin(){
		return killsPerMin;
	}


	/**
	 * Set buyback count.
	 *
	 * @param buybackCount the buyback count
	 */
	public void setBuybackCount(int buybackCount){
		this.buybackCount = buybackCount;
	}

	/**
	 * Get buyback count int.
	 *
	 * @return the int
	 */
	public int getBuybackCount(){
		return buybackCount;
	}

	/**
	 * Set necronomicon kills.
	 *
	 * @param necronomiconKills the necronomicon kills
	 */
	public void setNecronomiconKills(int necronomiconKills){
		this.necronomiconKills = necronomiconKills;
	}

	/**
	 * Get necronomicon kills int.
	 *
	 * @return the int
	 */
	public int getNecronomiconKills(){
		return necronomiconKills;
	}


	/**
	 * Set kills log.
	 *
	 * @param killsLog the kills log
	 */
	public void setKillsLog(List<KillsLogItem> killsLog){
		this.killsLog = killsLog;
	}

	/**
	 * Get kills log list.
	 *
	 * @return the list
	 */
	public List<KillsLogItem> getKillsLog(){
		return killsLog;
	}

	/**
	 * Set rune pickups.
	 *
	 * @param runePickups the rune pickups
	 */
	public void setRunePickups(int runePickups){
		this.runePickups = runePickups;
	}

	/**
	 * Get rune pickups int.
	 *
	 * @return the int
	 */
	public int getRunePickups(){
		return runePickups;
	}


	/**
	 * Set lh t.
	 *
	 * @param lhT the lh t
	 */
	public void setLhT(List<Integer> lhT){
		this.lhT = lhT;
	}

	/**
	 * Get lh t list.
	 *
	 * @return the list
	 */
	public List<Integer> getLhT(){
		return lhT;
	}

	/**
	 * Set repicked.
	 *
	 * @param repicked the repicked
	 */
	public void setRepicked(Object repicked){
		this.repicked = repicked;
	}

	/**
	 * Get repicked object.
	 *
	 * @return the object
	 */
	public Object getRepicked(){
		return repicked;
	}

	/**
	 * Set gold t.
	 *
	 * @param goldT the gold t
	 */
	public void setGoldT(List<Integer> goldT){
		this.goldT = goldT;
	}

	/**
	 * Get gold t list.
	 *
	 * @return the list
	 */
	public List<Integer> getGoldT(){
		return goldT;
	}


	/**
	 * Set additional units.
	 *
	 * @param additionalUnits the additional units
	 */
	public void setAdditionalUnits(Object additionalUnits){
		this.additionalUnits = additionalUnits;
	}

	/**
	 * Get additional units object.
	 *
	 * @return the object
	 */
	public Object getAdditionalUnits(){
		return additionalUnits;
	}

	/**
	 * Set randomed.
	 *
	 * @param randomed the randomed
	 */
	public void setRandomed(boolean randomed){
		this.randomed = randomed;
	}

	/**
	 * Is randomed boolean.
	 *
	 * @return the boolean
	 */
	public boolean isRandomed(){
		return randomed;
	}

	/**
	 * Set gold.
	 *
	 * @param gold the gold
	 */
	public void setGold(int gold){
		this.gold = gold;
	}

	/**
	 * Get gold int.
	 *
	 * @return the int
	 */
	public int getGold(){
		return gold;
	}

	/**
	 * Set radiant win.
	 *
	 * @param radiantWin the radiant win
	 */
	public void setRadiantWin(boolean radiantWin){
		this.radiantWin = radiantWin;
	}

	/**
	 * Is radiant win boolean.
	 *
	 * @return the boolean
	 */
	public boolean isRadiantWin(){
		return radiantWin;
	}

	/**
	 * Set camps stacked.
	 *
	 * @param campsStacked the camps stacked
	 */
	public void setCampsStacked(int campsStacked){
		this.campsStacked = campsStacked;
	}

	/**
	 * Get camps stacked int.
	 *
	 * @return the int
	 */
	public int getCampsStacked(){
		return campsStacked;
	}


	/**
	 * Set ancient kills.
	 *
	 * @param ancientKills the ancient kills
	 */
	public void setAncientKills(int ancientKills){
		this.ancientKills = ancientKills;
	}

	/**
	 * Get ancient kills int.
	 *
	 * @return the int
	 */
	public int getAncientKills(){
		return ancientKills;
	}

	/**
	 * Set actions per min.
	 *
	 * @param actionsPerMin the actions per min
	 */
	public void setActionsPerMin(int actionsPerMin){
		this.actionsPerMin = actionsPerMin;
	}

	/**
	 * Get actions per min int.
	 *
	 * @return the int
	 */
	public int getActionsPerMin(){
		return actionsPerMin;
	}

	/**
	 * Set roshans killed.
	 *
	 * @param roshansKilled the roshans killed
	 */
	public void setRoshansKilled(int roshansKilled){
		this.roshansKilled = roshansKilled;
	}

	/**
	 * Get roshans killed int.
	 *
	 * @return the int
	 */
	public int getRoshansKilled(){
		return roshansKilled;
	}

	/**
	 * Set match id.
	 *
	 * @param matchId the match id
	 */
	public void setMatchId(long matchId){
		this.matchId = matchId;
	}

	/**
	 * Get match id long.
	 *
	 * @return the long
	 */
	public long getMatchId(){
		return matchId;
	}

	/**
	 * Set life state dead.
	 *
	 * @param lifeStateDead the life state dead
	 */
	public void setLifeStateDead(int lifeStateDead){
		this.lifeStateDead = lifeStateDead;
	}

	/**
	 * Get life state dead int.
	 *
	 * @return the int
	 */
	public int getLifeStateDead(){
		return lifeStateDead;
	}

	/**
	 * Set lane kills.
	 *
	 * @param laneKills the lane kills
	 */
	public void setLaneKills(int laneKills){
		this.laneKills = laneKills;
	}

	/**
	 * Get lane kills int.
	 *
	 * @return the int
	 */
	public int getLaneKills(){
		return laneKills;
	}

	/**
	 * Set hero kills.
	 *
	 * @param heroKills the hero kills
	 */
	public void setHeroKills(int heroKills){
		this.heroKills = heroKills;
	}

	/**
	 * Get hero kills int.
	 *
	 * @return the int
	 */
	public int getHeroKills(){
		return heroKills;
	}

	/**
	 * Set stuns.
	 *
	 * @param stuns the stuns
	 */
	public void setStuns(double stuns){
		this.stuns = stuns;
	}

	/**
	 * Get stuns double.
	 *
	 * @return the double
	 */
	public double getStuns(){
		return stuns;
	}

	/**
	 * Set account id.
	 *
	 * @param accountId the account id
	 */
	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	/**
	 * Get account id int.
	 *
	 * @return the int
	 */
	public int getAccountId(){
		return accountId;
	}

	/**
	 * Set leaver status.
	 *
	 * @param leaverStatus the leaver status
	 */
	public void setLeaverStatus(int leaverStatus){
		this.leaverStatus = leaverStatus;
	}

	/**
	 * Get leaver status int.
	 *
	 * @return the int
	 */
	public int getLeaverStatus(){
		return leaverStatus;
	}

	/**
	 * Set hero healing.
	 *
	 * @param heroHealing the hero healing
	 */
	public void setHeroHealing(int heroHealing){
		this.heroHealing = heroHealing;
	}

	/**
	 * Get hero healing int.
	 *
	 * @return the int
	 */
	public int getHeroHealing(){
		return heroHealing;
	}


	/**
	 * Set game mode.
	 *
	 * @param gameMode the game mode
	 */
	public void setGameMode(int gameMode){
		this.gameMode = gameMode;
	}

	/**
	 * Get game mode int.
	 *
	 * @return the int
	 */
	public int getGameMode(){
		return gameMode;
	}

	/**
	 * Set obs placed.
	 *
	 * @param obsPlaced the obs placed
	 */
	public void setObsPlaced(int obsPlaced){
		this.obsPlaced = obsPlaced;
	}

	/**
	 * Get obs placed int.
	 *
	 * @return the int
	 */
	public int getObsPlaced(){
		return obsPlaced;
	}

	/**
	 * Set total xp.
	 *
	 * @param totalXp the total xp
	 */
	public void setTotalXp(int totalXp){
		this.totalXp = totalXp;
	}

	/**
	 * Get total xp int.
	 *
	 * @return the int
	 */
	public int getTotalXp(){
		return totalXp;
	}


	/**
	 * Set gold reasons.
	 *
	 * @param goldReasons the gold reasons
	 */
	public void setGoldReasons(GoldReasons goldReasons){
		this.goldReasons = goldReasons;
	}

	/**
	 * Get gold reasons gold reasons.
	 *
	 * @return the gold reasons
	 */
	public GoldReasons getGoldReasons(){
		return goldReasons;
	}

	/**
	 * Set is contributor.
	 *
	 * @param isContributor the is contributor
	 */
	public void setIsContributor(boolean isContributor){
		this.isContributor = isContributor;
	}

	/**
	 * Is is contributor boolean.
	 *
	 * @return the boolean
	 */
	public boolean isIsContributor(){
		return isContributor;
	}


	/**
	 * Set total gold.
	 *
	 * @param totalGold the total gold
	 */
	public void setTotalGold(int totalGold){
		this.totalGold = totalGold;
	}

	/**
	 * Get total gold int.
	 *
	 * @return the int
	 */
	public int getTotalGold(){
		return totalGold;
	}

	/**
	 * Set buyback log.
	 *
	 * @param buybackLog the buyback log
	 */
	public void setBuybackLog(List<Object> buybackLog){
		this.buybackLog = buybackLog;
	}

	/**
	 * Get buyback log list.
	 *
	 * @return the list
	 */
	public List<Object> getBuybackLog(){
		return buybackLog;
	}

	/**
	 * Set sentry kills.
	 *
	 * @param sentryKills the sentry kills
	 */
	public void setSentryKills(int sentryKills){
		this.sentryKills = sentryKills;
	}

	/**
	 * Get sentry kills int.
	 *
	 * @return the int
	 */
	public int getSentryKills(){
		return sentryKills;
	}


	/**
	 * Set xp per min.
	 *
	 * @param xpPerMin the xp per min
	 */
	public void setXpPerMin(int xpPerMin){
		this.xpPerMin = xpPerMin;
	}

	/**
	 * Get xp per min int.
	 *
	 * @return the int
	 */
	public int getXpPerMin(){
		return xpPerMin;
	}


	/**
	 * Set towers killed.
	 *
	 * @param towersKilled the towers killed
	 */
	public void setTowersKilled(int towersKilled){
		this.towersKilled = towersKilled;
	}

	/**
	 * Get towers killed int.
	 *
	 * @return the int
	 */
	public int getTowersKilled(){
		return towersKilled;
	}

	/**
	 * Set level.
	 *
	 * @param level the level
	 */
	public void setLevel(int level){
		this.level = level;
	}

	/**
	 * Get level int.
	 *
	 * @return the int
	 */
	public int getLevel(){
		return level;
	}

	/**
	 * Set abandons.
	 *
	 * @param abandons the abandons
	 */
	public void setAbandons(int abandons){
		this.abandons = abandons;
	}

	/**
	 * Get abandons int.
	 *
	 * @return the int
	 */
	public int getAbandons(){
		return abandons;
	}

	/**
	 * Set player slot.
	 *
	 * @param playerSlot the player slot
	 */
	public void setPlayerSlot(int playerSlot){
		this.playerSlot = playerSlot;
	}

	/**
	 * Get player slot int.
	 *
	 * @return the int
	 */
	public int getPlayerSlot(){
		return playerSlot;
	}


	/**
	 * Set start time.
	 *
	 * @param startTime the start time
	 */
	public void setStartTime(int startTime){
		this.startTime = startTime;
	}

	/**
	 * Get start time int.
	 *
	 * @return the int
	 */
	public int getStartTime(){
		return startTime;
	}

	/**
	 * Set last hits.
	 *
	 * @param lastHits the last hits
	 */
	public void setLastHits(int lastHits){
		this.lastHits = lastHits;
	}

	/**
	 * Get last hits int.
	 *
	 * @return the int
	 */
	public int getLastHits(){
		return lastHits;
	}

	/**
	 * Set sentry uses.
	 *
	 * @param sentryUses the sentry uses
	 */
	public void setSentryUses(int sentryUses){
		this.sentryUses = sentryUses;
	}

	/**
	 * Get sentry uses int.
	 *
	 * @return the int
	 */
	public int getSentryUses(){
		return sentryUses;
	}


	/**
	 * Set item 5.
	 *
	 * @param item5 the item 5
	 */
	public void setItem5(int item5){
		this.item5 = item5;
	}

	/**
	 * Get item 5 int.
	 *
	 * @return the int
	 */
	public int getItem5(){
		return item5;
	}

	/**
	 * Set item 4.
	 *
	 * @param item4 the item 4
	 */
	public void setItem4(int item4){
		this.item4 = item4;
	}

	/**
	 * Get item 4 int.
	 *
	 * @return the int
	 */
	public int getItem4(){
		return item4;
	}


	/**
	 * Set item 3.
	 *
	 * @param item3 the item 3
	 */
	public void setItem3(int item3){
		this.item3 = item3;
	}

	/**
	 * Get item 3 int.
	 *
	 * @return the int
	 */
	public int getItem3(){
		return item3;
	}

	/**
	 * Set item 2.
	 *
	 * @param item2 the item 2
	 */
	public void setItem2(int item2){
		this.item2 = item2;
	}

	/**
	 * Get item 2 int.
	 *
	 * @return the int
	 */
	public int getItem2(){
		return item2;
	}

	/**
	 * Set item 1.
	 *
	 * @param item1 the item 1
	 */
	public void setItem1(int item1){
		this.item1 = item1;
	}

	/**
	 * Get item 1 int.
	 *
	 * @return the int
	 */
	public int getItem1(){
		return item1;
	}

	/**
	 * Set lane efficiency.
	 *
	 * @param laneEfficiency the lane efficiency
	 */
	public void setLaneEfficiency(double laneEfficiency){
		this.laneEfficiency = laneEfficiency;
	}

	/**
	 * Get lane efficiency double.
	 *
	 * @return the double
	 */
	public double getLaneEfficiency(){
		return laneEfficiency;
	}

	/**
	 * Set creeps stacked.
	 *
	 * @param creepsStacked the creeps stacked
	 */
	public void setCreepsStacked(int creepsStacked){
		this.creepsStacked = creepsStacked;
	}

	/**
	 * Get creeps stacked int.
	 *
	 * @return the int
	 */
	public int getCreepsStacked(){
		return creepsStacked;
	}

	/**
	 * Set item 0.
	 *
	 * @param item0 the item 0
	 */
	public void setItem0(int item0){
		this.item0 = item0;
	}

	/**
	 * Get item 0 int.
	 *
	 * @return the int
	 */
	public int getItem0(){
		return item0;
	}

	/**
	 * Set region.
	 *
	 * @param region the region
	 */
	public void setRegion(int region){
		this.region = region;
	}

	/**
	 * Get region int.
	 *
	 * @return the int
	 */
	public int getRegion(){
		return region;
	}

	/**
	 * Set kills.
	 *
	 * @param kills the kills
	 */
	public void setKills(int kills){
		this.kills = kills;
	}

	/**
	 * Get kills int.
	 *
	 * @return the int
	 */
	public int getKills(){
		return kills;
	}

	/**
	 * Set hero damage.
	 *
	 * @param heroDamage the hero damage
	 */
	public void setHeroDamage(int heroDamage){
		this.heroDamage = heroDamage;
	}

	/**
	 * Get hero damage int.
	 *
	 * @return the int
	 */
	public int getHeroDamage(){
		return heroDamage;
	}

	/**
	 * Set tower kills.
	 *
	 * @param towerKills the tower kills
	 */
	public void setTowerKills(int towerKills){
		this.towerKills = towerKills;
	}

	/**
	 * Get tower kills int.
	 *
	 * @return the int
	 */
	public int getTowerKills(){
		return towerKills;
	}

	/**
	 * Set backpack 1.
	 *
	 * @param backpack1 the backpack 1
	 */
	public void setBackpack1(int backpack1){
		this.backpack1 = backpack1;
	}

	/**
	 * Get backpack 1 int.
	 *
	 * @return the int
	 */
	public int getBackpack1(){
		return backpack1;
	}

	/**
	 * Set backpack 2.
	 *
	 * @param backpack2 the backpack 2
	 */
	public void setBackpack2(int backpack2){
		this.backpack2 = backpack2;
	}

	/**
	 * Get backpack 2 int.
	 *
	 * @return the int
	 */
	public int getBackpack2(){
		return backpack2;
	}


	/**
	 * Set denies.
	 *
	 * @param denies the denies
	 */
	public void setDenies(int denies){
		this.denies = denies;
	}

	/**
	 * Get denies int.
	 *
	 * @return the int
	 */
	public int getDenies(){
		return denies;
	}

	/**
	 * Set backpack 0.
	 *
	 * @param backpack0 the backpack 0
	 */
	public void setBackpack0(int backpack0){
		this.backpack0 = backpack0;
	}

	/**
	 * Get backpack 0 int.
	 *
	 * @return the int
	 */
	public int getBackpack0(){
		return backpack0;
	}


	/**
	 * Set courier kills.
	 *
	 * @param courierKills the courier kills
	 */
	public void setCourierKills(int courierKills){
		this.courierKills = courierKills;
	}

	/**
	 * Get courier kills int.
	 *
	 * @return the int
	 */
	public int getCourierKills(){
		return courierKills;
	}


	/**
	 * Set dn t.
	 *
	 * @param dnT the dn t
	 */
	public void setDnT(List<Integer> dnT){
		this.dnT = dnT;
	}

	/**
	 * Get dn t list.
	 *
	 * @return the list
	 */
	public List<Integer> getDnT(){
		return dnT;
	}

	/**
	 * Set duration.
	 *
	 * @param duration the duration
	 */
	public void setDuration(int duration){
		this.duration = duration;
	}

	/**
	 * Get duration int.
	 *
	 * @return the int
	 */
	public int getDuration(){
		return duration;
	}

	/**
	 * Set permanent buffs.
	 *
	 * @param permanentBuffs the permanent buffs
	 */
	public void setPermanentBuffs(Object permanentBuffs){
		this.permanentBuffs = permanentBuffs;
	}

	/**
	 * Get permanent buffs object.
	 *
	 * @return the object
	 */
	public Object getPermanentBuffs(){
		return permanentBuffs;
	}

	/**
	 * Set times.
	 *
	 * @param times the times
	 */
	public void setTimes(List<Integer> times){
		this.times = times;
	}

	/**
	 * Get times list.
	 *
	 * @return the list
	 */
	public List<Integer> getTimes(){
		return times;
	}

	/**
	 * Set lane efficiency pct.
	 *
	 * @param laneEfficiencyPct the lane efficiency pct
	 */
	public void setLaneEfficiencyPct(int laneEfficiencyPct){
		this.laneEfficiencyPct = laneEfficiencyPct;
	}

	/**
	 * Get lane efficiency pct int.
	 *
	 * @return the int
	 */
	public int getLaneEfficiencyPct(){
		return laneEfficiencyPct;
	}

	/**
	 * Set assists.
	 *
	 * @param assists the assists
	 */
	public void setAssists(int assists){
		this.assists = assists;
	}

	/**
	 * Get assists int.
	 *
	 * @return the int
	 */
	public int getAssists(){
		return assists;
	}

	/**
	 * Set tower damage.
	 *
	 * @param towerDamage the tower damage
	 */
	public void setTowerDamage(int towerDamage){
		this.towerDamage = towerDamage;
	}

	/**
	 * Get tower damage int.
	 *
	 * @return the int
	 */
	public int getTowerDamage(){
		return towerDamage;
	}

	/**
	 * Set xp t.
	 *
	 * @param xpT the xp t
	 */
	public void setXpT(List<Integer> xpT){
		this.xpT = xpT;
	}

	/**
	 * Get xp t list.
	 *
	 * @return the list
	 */
	public List<Integer> getXpT(){
		return xpT;
	}

	/**
	 * Set rank tier.
	 *
	 * @param rankTier the rank tier
	 */
	public void setRankTier(int rankTier){
		this.rankTier = rankTier;
	}

	/**
	 * Get rank tier int.
	 *
	 * @return the int
	 */
	public int getRankTier(){
		return rankTier;
	}

	/**
	 * Set connection log.
	 *
	 * @param connectionLog the connection log
	 */
	public void setConnectionLog(List<Object> connectionLog){
		this.connectionLog = connectionLog;
	}

	/**
	 * Get connection log list.
	 *
	 * @return the list
	 */
	public List<Object> getConnectionLog(){
		return connectionLog;
	}

	/**
	 * Set is radiant.
	 *
	 * @param isRadiant the is radiant
	 */
	public void setIsRadiant(boolean isRadiant){
		this.isRadiant = isRadiant;
	}

	/**
	 * Is is radiant boolean.
	 *
	 * @return the boolean
	 */
	public boolean isIsRadiant(){
		return isRadiant;
	}

	/**
	 * Set hero id.
	 *
	 * @param heroId the hero id
	 */
	public void setHeroId(int heroId){
		this.heroId = heroId;
	}

	/**
	 * Get hero id int.
	 *
	 * @return the int
	 */
	public int getHeroId(){
		return heroId;
	}

	/**
	 * Set win.
	 *
	 * @param win the win
	 */
	public void setWin(int win){
		this.win = win;
	}

	/**
	 * Get win int.
	 *
	 * @return the int
	 */
	public int getWin(){
		return win;
	}

	/**
	 * Set lane.
	 *
	 * @param lane the lane
	 */
	public void setLane(int lane){
		this.lane = lane;
	}

	/**
	 * Get lane int.
	 *
	 * @return the int
	 */
	public int getLane(){
		return lane;
	}

	/**
	 * Set pred vict.
	 *
	 * @param predVict the pred vict
	 */
	public void setPredVict(boolean predVict){
		this.predVict = predVict;
	}

	/**
	 * Is pred vict boolean.
	 *
	 * @return the boolean
	 */
	public boolean isPredVict(){
		return predVict;
	}

	/**
	 * Set sen log.
	 *
	 * @param senLog the sen log
	 */
	public void setSenLog(List<Object> senLog){
		this.senLog = senLog;
	}

	/**
	 * Get sen log list.
	 *
	 * @return the list
	 */
	public List<Object> getSenLog(){
		return senLog;
	}

	/**
	 * Set sen left log.
	 *
	 * @param senLeftLog the sen left log
	 */
	public void setSenLeftLog(List<Object> senLeftLog){
		this.senLeftLog = senLeftLog;
	}

	/**
	 * Get sen left log list.
	 *
	 * @return the list
	 */
	public List<Object> getSenLeftLog(){
		return senLeftLog;
	}

	/**
	 * Set is roaming.
	 *
	 * @param isRoaming the is roaming
	 */
	public void setIsRoaming(boolean isRoaming){
		this.isRoaming = isRoaming;
	}

	/**
	 * Is is roaming boolean.
	 *
	 * @return the boolean
	 */
	public boolean isIsRoaming(){
		return isRoaming;
	}


	/**
	 * Set lobby type.
	 *
	 * @param lobbyType the lobby type
	 */
	public void setLobbyType(int lobbyType){
		this.lobbyType = lobbyType;
	}

	/**
	 * Get lobby type int.
	 *
	 * @return the int
	 */
	public int getLobbyType(){
		return lobbyType;
	}


	/**
	 * Set killed.
	 *
	 * @param killed the killed
	 */
	public void setKilled(Killed killed){
		this.killed = killed;
	}

	/**
	 * Get killed killed.
	 *
	 * @return the killed
	 */
	public Killed getKilled(){
		return killed;
	}

	/**
	 * Set sen placed.
	 *
	 * @param senPlaced the sen placed
	 */
	public void setSenPlaced(int senPlaced){
		this.senPlaced = senPlaced;
	}

	/**
	 * Get sen placed int.
	 *
	 * @return the int
	 */
	public int getSenPlaced(){
		return senPlaced;
	}

	/**
	 * Set ability upgrades arr.
	 *
	 * @param abilityUpgradesArr the ability upgrades arr
	 */
	public void setAbilityUpgradesArr(List<Integer> abilityUpgradesArr){
		this.abilityUpgradesArr = abilityUpgradesArr;
	}

	/**
	 * Get ability upgrades arr list.
	 *
	 * @return the list
	 */
	public List<Integer> getAbilityUpgradesArr(){
		return abilityUpgradesArr;
	}

	/**
	 * Set firstblood claimed.
	 *
	 * @param firstbloodClaimed the firstblood claimed
	 */
	public void setFirstbloodClaimed(int firstbloodClaimed){
		this.firstbloodClaimed = firstbloodClaimed;
	}

	/**
	 * Get firstblood claimed int.
	 *
	 * @return the int
	 */
	public int getFirstbloodClaimed(){
		return firstbloodClaimed;
	}

	/**
	 * Set party id.
	 *
	 * @param partyId the party id
	 */
	public void setPartyId(int partyId){
		this.partyId = partyId;
	}

	/**
	 * Get party id int.
	 *
	 * @return the int
	 */
	public int getPartyId(){
		return partyId;
	}

	/**
	 * Set teamfight participation.
	 *
	 * @param teamfightParticipation the teamfight participation
	 */
	public void setTeamfightParticipation(double teamfightParticipation){
		this.teamfightParticipation = teamfightParticipation;
	}

	/**
	 * Get teamfight participation double.
	 *
	 * @return the double
	 */
	public double getTeamfightParticipation(){
		return teamfightParticipation;
	}

	/**
	 * Set last login.
	 *
	 * @param lastLogin the last login
	 */
	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	/**
	 * Get last login string.
	 *
	 * @return the string
	 */
	public String getLastLogin(){
		return lastLogin;
	}

	/**
	 * Set personaname.
	 *
	 * @param personaname the personaname
	 */
	public void setPersonaname(String personaname){
		this.personaname = personaname;
	}

	/**
	 * Get personaname string.
	 *
	 * @return the string
	 */
	public String getPersonaname(){
		return personaname;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(Object name){
		this.name = name;
	}

	/**
	 * Get name object.
	 *
	 * @return the object
	 */
	public Object getName(){
		return name;
	}

	/**
	 * Set purchase ward sentry.
	 *
	 * @param purchaseWardSentry the purchase ward sentry
	 */
	public void setPurchaseWardSentry(int purchaseWardSentry){
		this.purchaseWardSentry = purchaseWardSentry;
	}

	/**
	 * Get purchase ward sentry int.
	 *
	 * @return the int
	 */
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