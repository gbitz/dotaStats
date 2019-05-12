package com.opendota.matchDetail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Match detail.
 */
@Generated("com.robohorse.robopojogenerator")
public class MatchDetail{

	/**
	 * Instantiates a new Match detail.
	 */
	public MatchDetail() {

	}

	/**
	 * Instantiates a new Match detail.
	 *
	 * @param matchId the match id
	 */
	public MatchDetail(long matchId) {
		this.matchId = matchId;
	}


	@JsonProperty("first_blood_time")
	private int firstBloodTime;

	@JsonProperty("cluster")
	private int cluster;

	@JsonProperty("match_seq_num")
	private long matchSeqNum;

	@JsonProperty("replay_salt")
	private int replaySalt;

	@JsonProperty("human_players")
	private int humanPlayers;


	@JsonProperty("series_type")
	private int seriesType;

	@JsonProperty("barracks_status_radiant")
	private int barracksStatusRadiant;


	@JsonProperty("duration")
	private int duration;

	@JsonProperty("patch")
	private int patch;

	@JsonProperty("loss")
	private int loss;

	@JsonProperty("radiant_win")
	private boolean radiantWin;

	@JsonProperty("radiant_xp_adv")
	private List<Integer> radiantXpAdv;


	@JsonProperty("engine")
	private int engine;

	@JsonProperty("skill")
	private int skill;

	@JsonProperty("negative_votes")
	private int negativeVotes;


	@JsonProperty("dire_team_id")
	private Object direTeamId;

	@JsonProperty("replay_url")
	private String replayUrl;

	@JsonProperty("tower_status_radiant")
	private int towerStatusRadiant;

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

	@JsonProperty("players")
	private List<PlayersItem> players;

	@JsonProperty("match_id")
	private long matchId;

	@JsonProperty("lobby_type")
	private int lobbyType;

	@JsonProperty("version")
	private int version;

	@JsonProperty("series_id")
	private int seriesId;

	@JsonProperty("start_time")
	private int startTime;



	@JsonProperty("throw")
	private int jsonMemberThrow;



	@JsonProperty("leagueid")
	private int leagueid;

	@JsonProperty("dire_score")
	private int direScore;

	@JsonProperty("game_mode")
	private int gameMode;

	@JsonProperty("positive_votes")
	private int positiveVotes;

	@JsonProperty("radiant_score")
	private int radiantScore;

	@JsonProperty("radiant_team_id")
	private Object radiantTeamId;

	@JsonProperty("tower_status_dire")
	private int towerStatusDire;


	@JsonProperty("barracks_status_dire")
	private int barracksStatusDire;

	@JsonProperty("region")
	private int region;

	@JsonProperty("radiant_gold_adv")
	private List<Integer> radiantGoldAdv;

	/**
	 * Set first blood time.
	 *
	 * @param firstBloodTime the first blood time
	 */
	public void setFirstBloodTime(int firstBloodTime){
		this.firstBloodTime = firstBloodTime;
	}

	/**
	 * Get first blood time int.
	 *
	 * @return the int
	 */
	public int getFirstBloodTime(){
		return firstBloodTime;
	}

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
	 * Set match seq num.
	 *
	 * @param matchSeqNum the match seq num
	 */
	public void setMatchSeqNum(long matchSeqNum){
		this.matchSeqNum = matchSeqNum;
	}

	/**
	 * Get match seq num long.
	 *
	 * @return the long
	 */
	public long getMatchSeqNum(){
		return matchSeqNum;
	}

	/**
	 * Set replay salt.
	 *
	 * @param replaySalt the replay salt
	 */
	public void setReplaySalt(int replaySalt){
		this.replaySalt = replaySalt;
	}

	/**
	 * Get replay salt int.
	 *
	 * @return the int
	 */
	public int getReplaySalt(){
		return replaySalt;
	}

	/**
	 * Set human players.
	 *
	 * @param humanPlayers the human players
	 */
	public void setHumanPlayers(int humanPlayers){
		this.humanPlayers = humanPlayers;
	}

	/**
	 * Get human players int.
	 *
	 * @return the int
	 */
	public int getHumanPlayers(){
		return humanPlayers;
	}


	/**
	 * Set series type.
	 *
	 * @param seriesType the series type
	 */
	public void setSeriesType(int seriesType){
		this.seriesType = seriesType;
	}

	/**
	 * Get series type int.
	 *
	 * @return the int
	 */
	public int getSeriesType(){
		return seriesType;
	}

	/**
	 * Set barracks status radiant.
	 *
	 * @param barracksStatusRadiant the barracks status radiant
	 */
	public void setBarracksStatusRadiant(int barracksStatusRadiant){
		this.barracksStatusRadiant = barracksStatusRadiant;
	}

	/**
	 * Get barracks status radiant int.
	 *
	 * @return the int
	 */
	public int getBarracksStatusRadiant(){
		return barracksStatusRadiant;
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
	 * Set loss.
	 *
	 * @param loss the loss
	 */
	public void setLoss(int loss){
		this.loss = loss;
	}

	/**
	 * Get loss int.
	 *
	 * @return the int
	 */
	public int getLoss(){
		return loss;
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
	 * Set radiant xp adv.
	 *
	 * @param radiantXpAdv the radiant xp adv
	 */
	public void setRadiantXpAdv(List<Integer> radiantXpAdv){
		this.radiantXpAdv = radiantXpAdv;
	}

	/**
	 * Get radiant xp adv list.
	 *
	 * @return the list
	 */
	public List<Integer> getRadiantXpAdv(){
		return radiantXpAdv;
	}

	/**
	 * Set engine.
	 *
	 * @param engine the engine
	 */
	public void setEngine(int engine){
		this.engine = engine;
	}

	/**
	 * Get engine int.
	 *
	 * @return the int
	 */
	public int getEngine(){
		return engine;
	}

	/**
	 * Set skill.
	 *
	 * @param skill the skill
	 */
	public void setSkill(int skill){
		this.skill = skill;
	}

	/**
	 * Get skill int.
	 *
	 * @return the int
	 */
	public int getSkill(){
		return skill;
	}

	/**
	 * Set negative votes.
	 *
	 * @param negativeVotes the negative votes
	 */
	public void setNegativeVotes(int negativeVotes){
		this.negativeVotes = negativeVotes;
	}

	/**
	 * Get negative votes int.
	 *
	 * @return the int
	 */
	public int getNegativeVotes(){
		return negativeVotes;
	}


	/**
	 * Set dire team id.
	 *
	 * @param direTeamId the dire team id
	 */
	public void setDireTeamId(Object direTeamId){
		this.direTeamId = direTeamId;
	}

	/**
	 * Get dire team id object.
	 *
	 * @return the object
	 */
	public Object getDireTeamId(){
		return direTeamId;
	}

	/**
	 * Set replay url.
	 *
	 * @param replayUrl the replay url
	 */
	public void setReplayUrl(String replayUrl){
		this.replayUrl = replayUrl;
	}

	/**
	 * Get replay url string.
	 *
	 * @return the string
	 */
	public String getReplayUrl(){
		return replayUrl;
	}

	/**
	 * Set tower status radiant.
	 *
	 * @param towerStatusRadiant the tower status radiant
	 */
	public void setTowerStatusRadiant(int towerStatusRadiant){
		this.towerStatusRadiant = towerStatusRadiant;
	}

	/**
	 * Get tower status radiant int.
	 *
	 * @return the int
	 */
	public int getTowerStatusRadiant(){
		return towerStatusRadiant;
	}


	/**
	 * Set players.
	 *
	 * @param players the players
	 */
	public void setPlayers(List<PlayersItem> players){
		this.players = players;
	}

	/**
	 * Get players list.
	 *
	 * @return the list
	 */
	public List<PlayersItem> getPlayers(){
		return players;
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
	 * Set version.
	 *
	 * @param version the version
	 */
	public void setVersion(int version){
		this.version = version;
	}

	/**
	 * Get version int.
	 *
	 * @return the int
	 */
	public int getVersion(){
		return version;
	}

	/**
	 * Set series id.
	 *
	 * @param seriesId the series id
	 */
	public void setSeriesId(int seriesId){
		this.seriesId = seriesId;
	}

	/**
	 * Get series id int.
	 *
	 * @return the int
	 */
	public int getSeriesId(){
		return seriesId;
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
	 * Set json member throw.
	 *
	 * @param jsonMemberThrow the json member throw
	 */
	public void setJsonMemberThrow(int jsonMemberThrow){
		this.jsonMemberThrow = jsonMemberThrow;
	}

	/**
	 * Get json member throw int.
	 *
	 * @return the int
	 */
	public int getJsonMemberThrow(){
		return jsonMemberThrow;
	}


	/**
	 * Set leagueid.
	 *
	 * @param leagueid the leagueid
	 */
	public void setLeagueid(int leagueid){
		this.leagueid = leagueid;
	}

	/**
	 * Get leagueid int.
	 *
	 * @return the int
	 */
	public int getLeagueid(){
		return leagueid;
	}

	/**
	 * Set dire score.
	 *
	 * @param direScore the dire score
	 */
	public void setDireScore(int direScore){
		this.direScore = direScore;
	}

	/**
	 * Get dire score int.
	 *
	 * @return the int
	 */
	public int getDireScore(){
		return direScore;
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
	 * Set positive votes.
	 *
	 * @param positiveVotes the positive votes
	 */
	public void setPositiveVotes(int positiveVotes){
		this.positiveVotes = positiveVotes;
	}

	/**
	 * Get positive votes int.
	 *
	 * @return the int
	 */
	public int getPositiveVotes(){
		return positiveVotes;
	}

	/**
	 * Set radiant score.
	 *
	 * @param radiantScore the radiant score
	 */
	public void setRadiantScore(int radiantScore){
		this.radiantScore = radiantScore;
	}

	/**
	 * Get radiant score int.
	 *
	 * @return the int
	 */
	public int getRadiantScore(){
		return radiantScore;
	}

	/**
	 * Set radiant team id.
	 *
	 * @param radiantTeamId the radiant team id
	 */
	public void setRadiantTeamId(Object radiantTeamId){
		this.radiantTeamId = radiantTeamId;
	}

	/**
	 * Get radiant team id object.
	 *
	 * @return the object
	 */
	public Object getRadiantTeamId(){
		return radiantTeamId;
	}

	/**
	 * Set tower status dire.
	 *
	 * @param towerStatusDire the tower status dire
	 */
	public void setTowerStatusDire(int towerStatusDire){
		this.towerStatusDire = towerStatusDire;
	}

	/**
	 * Get tower status dire int.
	 *
	 * @return the int
	 */
	public int getTowerStatusDire(){
		return towerStatusDire;
	}


	/**
	 * Set barracks status dire.
	 *
	 * @param barracksStatusDire the barracks status dire
	 */
	public void setBarracksStatusDire(int barracksStatusDire){
		this.barracksStatusDire = barracksStatusDire;
	}

	/**
	 * Get barracks status dire int.
	 *
	 * @return the int
	 */
	public int getBarracksStatusDire(){
		return barracksStatusDire;
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
	 * Set radiant gold adv.
	 *
	 * @param radiantGoldAdv the radiant gold adv
	 */
	public void setRadiantGoldAdv(List<Integer> radiantGoldAdv){
		this.radiantGoldAdv = radiantGoldAdv;
	}

	/**
	 * Get radiant gold adv list.
	 *
	 * @return the list
	 */
	public List<Integer> getRadiantGoldAdv(){
		return radiantGoldAdv;
	}

	@Override
 	public String toString(){
		return 
			"MatchDetail{" + 
			"first_blood_time = '" + firstBloodTime + '\'' + 
			",cluster = '" + cluster + '\'' + 
			",match_seq_num = '" + matchSeqNum + '\'' + 
			",replay_salt = '" + replaySalt + '\'' + 
			",human_players = '" + humanPlayers + '\'' + 
			",series_type = '" + seriesType + '\'' +
			",barracks_status_radiant = '" + barracksStatusRadiant + '\'' + 
			",duration = '" + duration + '\'' +
			",patch = '" + patch + '\'' + 
			",loss = '" + loss + '\'' + 
			",radiant_win = '" + radiantWin + '\'' + 
			",radiant_xp_adv = '" + radiantXpAdv + '\'' + 
			",engine = '" + engine + '\'' +
			",skill = '" + skill + '\'' + 
			",negative_votes = '" + negativeVotes + '\'' + 
			",dire_team_id = '" + direTeamId + '\'' +
			",replay_url = '" + replayUrl + '\'' + 
			",tower_status_radiant = '" + towerStatusRadiant + '\'' + 
			",players = '" + players + '\'' +
			",match_id = '" + matchId + '\'' + 
			",lobby_type = '" + lobbyType + '\'' + 
			",version = '" + version + '\'' + 
			",series_id = '" + seriesId + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",throw = '" + jsonMemberThrow + '\'' +
			",leagueid = '" + leagueid + '\'' +
			",dire_score = '" + direScore + '\'' + 
			",game_mode = '" + gameMode + '\'' + 
			",positive_votes = '" + positiveVotes + '\'' + 
			",radiant_score = '" + radiantScore + '\'' + 
			",radiant_team_id = '" + radiantTeamId + '\'' + 
			",tower_status_dire = '" + towerStatusDire + '\'' + 
			",barracks_status_dire = '" + barracksStatusDire + '\'' +
			",region = '" + region + '\'' + 
			",radiant_gold_adv = '" + radiantGoldAdv + '\'' + 
			"}";
		}
}