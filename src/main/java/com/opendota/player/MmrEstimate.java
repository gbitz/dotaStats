package com.opendota.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Mmr estimate.
 */
@Generated("com.robohorse.robopojogenerator")
public class MmrEstimate{

	@JsonProperty("estimate")
	private int estimate;

	/**
	 * Set estimate.
	 *
	 * @param estimate the estimate
	 */
	public void setEstimate(int estimate){
		this.estimate = estimate;
	}

	/**
	 * Get estimate int.
	 *
	 * @return the int
	 */
	public int getEstimate(){
		return estimate;
	}

	@Override
 	public String toString(){
		return 
			"MmrEstimate{" + 
			"estimate = '" + estimate + '\'' + 
			"}";
		}
}