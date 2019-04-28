package com.opendota.matches;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Match{

	@JsonProperty("kills")
	private int kills;

	@JsonProperty("match_id")
	private long matchId;

	@JsonProperty("player_slot")
	private int playerSlot;

	@JsonProperty("party_size")
	private int partySize;

	@JsonProperty("lobby_type")
	private int lobbyType;

	@JsonProperty("version")
	private int version;

	@JsonProperty("duration")
	private int duration;

	@JsonProperty("start_time")
	private int startTime;

	@JsonProperty("radiant_win")
	private boolean radiantWin;

	@JsonProperty("leaver_status")
	private int leaverStatus;

	@JsonProperty("assists")
	private int assists;

	@JsonProperty("skill")
	private int skill;

	@JsonProperty("game_mode")
	private int gameMode;

	@JsonProperty("hero_id")
	private int heroId;

	@JsonProperty("deaths")
	private int deaths;

	public void setKills(int kills){
		this.kills = kills;
	}

	public int getKills(){
		return kills;
	}

	public void setMatchId(long matchId){
		this.matchId = matchId;
	}

	public long getMatchId(){
		return matchId;
	}

	public void setPlayerSlot(int playerSlot){
		this.playerSlot = playerSlot;
	}

	public int getPlayerSlot(){
		return playerSlot;
	}

	public void setPartySize(int partySize){
		this.partySize = partySize;
	}

	public int getPartySize(){
		return partySize;
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

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setStartTime(int startTime){
		this.startTime = startTime;
	}

	public int getStartTime(){
		return startTime;
	}

	public void setRadiantWin(boolean radiantWin){
		this.radiantWin = radiantWin;
	}

	public boolean isRadiantWin(){
		return radiantWin;
	}

	public void setLeaverStatus(int leaverStatus){
		this.leaverStatus = leaverStatus;
	}

	public int getLeaverStatus(){
		return leaverStatus;
	}

	public void setAssists(int assists){
		this.assists = assists;
	}

	public int getAssists(){
		return assists;
	}

	public void setSkill(int skill){
		this.skill = skill;
	}

	public int getSkill(){
		return skill;
	}

	public void setGameMode(int gameMode){
		this.gameMode = gameMode;
	}

	public int getGameMode(){
		return gameMode;
	}

	public void setHeroId(int heroId){
		this.heroId = heroId;
	}

	public int getHeroId(){
		return heroId;
	}

	public void setDeaths(int deaths){
		this.deaths = deaths;
	}

	public int getDeaths(){
		return deaths;
	}

	@Override
 	public String toString(){
		return 
			"Match{" + 
			"kills = '" + kills + '\'' + 
			",match_id = '" + matchId + '\'' + 
			",player_slot = '" + playerSlot + '\'' + 
			",party_size = '" + partySize + '\'' + 
			",lobby_type = '" + lobbyType + '\'' + 
			",version = '" + version + '\'' + 
			",duration = '" + duration + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",radiant_win = '" + radiantWin + '\'' + 
			",leaver_status = '" + leaverStatus + '\'' + 
			",assists = '" + assists + '\'' + 
			",skill = '" + skill + '\'' + 
			",game_mode = '" + gameMode + '\'' + 
			",hero_id = '" + heroId + '\'' + 
			",deaths = '" + deaths + '\'' + 
			"}";
		}
}