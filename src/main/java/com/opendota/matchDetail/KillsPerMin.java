package com.opendota.matchDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class KillsPerMin{

	@JsonProperty("pct")
	private double pct;

	@JsonProperty("raw")
	private double raw;

	public void setPct(double pct){
		this.pct = pct;
	}

	public double getPct(){
		return pct;
	}

	public void setRaw(double raw){
		this.raw = raw;
	}

	public double getRaw(){
		return raw;
	}

	@Override
 	public String toString(){
		return 
			"KillsPerMin{" + 
			"pct = '" + pct + '\'' + 
			",raw = '" + raw + '\'' + 
			"}";
		}
}