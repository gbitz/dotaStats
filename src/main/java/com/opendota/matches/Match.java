package com.opendota.matches;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Match.
 */
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