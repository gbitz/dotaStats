package com.opendota.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Player.
 */
@Generated("com.robohorse.robopojogenerator")
public class Player{

	@JsonProperty("tracked_until")
	private String trackedUntil;

	@JsonProperty("solo_competitive_rank")
	private int soloCompetitiveRank;

	@JsonProperty("rank_tier")
	private int rankTier;

	@JsonProperty("competitive_rank")
	private Object competitiveRank;

	@JsonProperty("profile")
	private Profile profile;

	@JsonProperty("leaderboard_rank")
	private Object leaderboardRank;

	@JsonProperty("mmr_estimate")
	private MmrEstimate mmrEstimate;

	/**
	 * Set tracked until.
	 *
	 * @param trackedUntil the tracked until
	 */
	public void setTrackedUntil(String trackedUntil){
		this.trackedUntil = trackedUntil;
	}

	/**
	 * Get tracked until string.
	 *
	 * @return the string
	 */
	public String getTrackedUntil(){
		return trackedUntil;
	}

	/**
	 * Set solo competitive rank.
	 *
	 * @param soloCompetitiveRank the solo competitive rank
	 */
	public void setSoloCompetitiveRank(int soloCompetitiveRank){
		this.soloCompetitiveRank = soloCompetitiveRank;
	}

	/**
	 * Get solo competitive rank int.
	 *
	 * @return the int
	 */
	public int getSoloCompetitiveRank(){
		return soloCompetitiveRank;
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
	 * Set competitive rank.
	 *
	 * @param competitiveRank the competitive rank
	 */
	public void setCompetitiveRank(Object competitiveRank){
		this.competitiveRank = competitiveRank;
	}

	/**
	 * Get competitive rank object.
	 *
	 * @return the object
	 */
	public Object getCompetitiveRank(){
		return competitiveRank;
	}

	/**
	 * Set profile.
	 *
	 * @param profile the profile
	 */
	public void setProfile(Profile profile){
		this.profile = profile;
	}

	/**
	 * Get profile profile.
	 *
	 * @return the profile
	 */
	public Profile getProfile(){
		return profile;
	}

	/**
	 * Set leaderboard rank.
	 *
	 * @param leaderboardRank the leaderboard rank
	 */
	public void setLeaderboardRank(Object leaderboardRank){
		this.leaderboardRank = leaderboardRank;
	}

	/**
	 * Get leaderboard rank object.
	 *
	 * @return the object
	 */
	public Object getLeaderboardRank(){
		return leaderboardRank;
	}

	/**
	 * Set mmr estimate.
	 *
	 * @param mmrEstimate the mmr estimate
	 */
	public void setMmrEstimate(MmrEstimate mmrEstimate){
		this.mmrEstimate = mmrEstimate;
	}

	/**
	 * Get mmr estimate mmr estimate.
	 *
	 * @return the mmr estimate
	 */
	public MmrEstimate getMmrEstimate(){
		return mmrEstimate;
	}

	@Override
 	public String toString(){
		return 
			"Player{" + 
			"tracked_until = '" + trackedUntil + '\'' + 
			",solo_competitive_rank = '" + soloCompetitiveRank + '\'' + 
			",rank_tier = '" + rankTier + '\'' + 
			",competitive_rank = '" + competitiveRank + '\'' + 
			",profile = '" + profile + '\'' + 
			",leaderboard_rank = '" + leaderboardRank + '\'' + 
			",mmr_estimate = '" + mmrEstimate + '\'' + 
			"}";
		}
}