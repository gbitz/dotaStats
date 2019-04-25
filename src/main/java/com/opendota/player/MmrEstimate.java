package com.opendota.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class MmrEstimate{

	@JsonProperty("estimate")
	private int estimate;

	public void setEstimate(int estimate){
		this.estimate = estimate;
	}

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