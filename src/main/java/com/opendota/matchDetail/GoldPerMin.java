package com.opendota.matchDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class GoldPerMin{

	@JsonProperty("pct")
	private double pct;

	@JsonProperty("raw")
	private int raw;

	public void setPct(double pct){
		this.pct = pct;
	}

	public double getPct(){
		return pct;
	}

	public void setRaw(int raw){
		this.raw = raw;
	}

	public int getRaw(){
		return raw;
	}

	@Override
 	public String toString(){
		return 
			"GoldPerMin{" + 
			"pct = '" + pct + '\'' + 
			",raw = '" + raw + '\'' + 
			"}";
		}
}