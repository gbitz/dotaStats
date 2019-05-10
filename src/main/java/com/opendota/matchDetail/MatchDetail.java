package com.opendota.matchDetail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class MatchDetail{

	public MatchDetail() {

	}
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

	public String getHeroImg() {
		return heroImg;
	}

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

	public void setFirstBloodTime(int firstBloodTime){
		this.firstBloodTime = firstBloodTime;
	}

	public int getFirstBloodTime(){
		return firstBloodTime;
	}

	public void setCluster(int cluster){
		this.cluster = cluster;
	}

	public int getCluster(){
		return cluster;
	}

	public void setMatchSeqNum(long matchSeqNum){
		this.matchSeqNum = matchSeqNum;
	}

	public long getMatchSeqNum(){
		return matchSeqNum;
	}

	public void setReplaySalt(int replaySalt){
		this.replaySalt = replaySalt;
	}

	public int getReplaySalt(){
		return replaySalt;
	}

	public void setHumanPlayers(int humanPlayers){
		this.humanPlayers = humanPlayers;
	}

	public int getHumanPlayers(){
		return humanPlayers;
	}


	public void setSeriesType(int seriesType){
		this.seriesType = seriesType;
	}

	public int getSeriesType(){
		return seriesType;
	}

	public void setBarracksStatusRadiant(int barracksStatusRadiant){
		this.barracksStatusRadiant = barracksStatusRadiant;
	}

	public int getBarracksStatusRadiant(){
		return barracksStatusRadiant;
	}


	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setPatch(int patch){
		this.patch = patch;
	}

	public int getPatch(){
		return patch;
	}

	public void setLoss(int loss){
		this.loss = loss;
	}

	public int getLoss(){
		return loss;
	}

	public void setRadiantWin(boolean radiantWin){
		this.radiantWin = radiantWin;
	}

	public boolean isRadiantWin(){
		return radiantWin;
	}

	public void setRadiantXpAdv(List<Integer> radiantXpAdv){
		this.radiantXpAdv = radiantXpAdv;
	}

	public List<Integer> getRadiantXpAdv(){
		return radiantXpAdv;
	}

	public void setEngine(int engine){
		this.engine = engine;
	}

	public int getEngine(){
		return engine;
	}

	public void setSkill(int skill){
		this.skill = skill;
	}

	public int getSkill(){
		return skill;
	}

	public void setNegativeVotes(int negativeVotes){
		this.negativeVotes = negativeVotes;
	}

	public int getNegativeVotes(){
		return negativeVotes;
	}


	public void setDireTeamId(Object direTeamId){
		this.direTeamId = direTeamId;
	}

	public Object getDireTeamId(){
		return direTeamId;
	}

	public void setReplayUrl(String replayUrl){
		this.replayUrl = replayUrl;
	}

	public String getReplayUrl(){
		return replayUrl;
	}

	public void setTowerStatusRadiant(int towerStatusRadiant){
		this.towerStatusRadiant = towerStatusRadiant;
	}

	public int getTowerStatusRadiant(){
		return towerStatusRadiant;
	}


	public void setPlayers(List<PlayersItem> players){
		this.players = players;
	}

	public List<PlayersItem> getPlayers(){
		return players;
	}

	public void setMatchId(long matchId){
		this.matchId = matchId;
	}

	public long getMatchId(){
		return matchId;
	}

	public void setLobbyType(int lobbyType){
		this.lobbyType = lobbyType;
	}

	public int getLobbyType(){
		return lobbyType;
	}

	public void setVersion(int version){
		this.version = version;
	}

	public int getVersion(){
		return version;
	}

	public void setSeriesId(int seriesId){
		this.seriesId = seriesId;
	}

	public int getSeriesId(){
		return seriesId;
	}

	public void setStartTime(int startTime){
		this.startTime = startTime;
	}

	public int getStartTime(){
		return startTime;
	}



	public void setJsonMemberThrow(int jsonMemberThrow){
		this.jsonMemberThrow = jsonMemberThrow;
	}

	public int getJsonMemberThrow(){
		return jsonMemberThrow;
	}



	public void setLeagueid(int leagueid){
		this.leagueid = leagueid;
	}

	public int getLeagueid(){
		return leagueid;
	}

	public void setDireScore(int direScore){
		this.direScore = direScore;
	}

	public int getDireScore(){
		return direScore;
	}

	public void setGameMode(int gameMode){
		this.gameMode = gameMode;
	}

	public int getGameMode(){
		return gameMode;
	}

	public void setPositiveVotes(int positiveVotes){
		this.positiveVotes = positiveVotes;
	}

	public int getPositiveVotes(){
		return positiveVotes;
	}

	public void setRadiantScore(int radiantScore){
		this.radiantScore = radiantScore;
	}

	public int getRadiantScore(){
		return radiantScore;
	}

	public void setRadiantTeamId(Object radiantTeamId){
		this.radiantTeamId = radiantTeamId;
	}

	public Object getRadiantTeamId(){
		return radiantTeamId;
	}

	public void setTowerStatusDire(int towerStatusDire){
		this.towerStatusDire = towerStatusDire;
	}

	public int getTowerStatusDire(){
		return towerStatusDire;
	}


	public void setBarracksStatusDire(int barracksStatusDire){
		this.barracksStatusDire = barracksStatusDire;
	}

	public int getBarracksStatusDire(){
		return barracksStatusDire;
	}

	public void setRegion(int region){
		this.region = region;
	}

	public int getRegion(){
		return region;
	}

	public void setRadiantGoldAdv(List<Integer> radiantGoldAdv){
		this.radiantGoldAdv = radiantGoldAdv;
	}

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