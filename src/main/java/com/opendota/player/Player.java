package com.opendota.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setTrackedUntil(String trackedUntil){
		this.trackedUntil = trackedUntil;
	}

	public String getTrackedUntil(){
		return trackedUntil;
	}

	public void setSoloCompetitiveRank(int soloCompetitiveRank){
		this.soloCompetitiveRank = soloCompetitiveRank;
	}

	public int getSoloCompetitiveRank(){
		return soloCompetitiveRank;
	}

	public void setRankTier(int rankTier){
		this.rankTier = rankTier;
	}

	public int getRankTier(){
		return rankTier;
	}

	public void setCompetitiveRank(Object competitiveRank){
		this.competitiveRank = competitiveRank;
	}

	public Object getCompetitiveRank(){
		return competitiveRank;
	}

	public void setProfile(Profile profile){
		this.profile = profile;
	}

	public Profile getProfile(){
		return profile;
	}

	public void setLeaderboardRank(Object leaderboardRank){
		this.leaderboardRank = leaderboardRank;
	}

	public Object getLeaderboardRank(){
		return leaderboardRank;
	}

	public void setMmrEstimate(MmrEstimate mmrEstimate){
		this.mmrEstimate = mmrEstimate;
	}

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