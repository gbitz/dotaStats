package com.opendota.matchDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Kills per min.
 */
@Generated("com.robohorse.robopojogenerator")
public class KillsPerMin{

	@JsonProperty("pct")
	private double pct;

	@JsonProperty("raw")
	private double raw;

	/**
	 * Set pct.
	 *
	 * @param pct the pct
	 */
	public void setPct(double pct){
		this.pct = pct;
	}

	/**
	 * Get pct double.
	 *
	 * @return the double
	 */
	public double getPct(){
		return pct;
	}

	/**
	 * Set raw.
	 *
	 * @param raw the raw
	 */
	public void setRaw(double raw){
		this.raw = raw;
	}

	/**
	 * Get raw double.
	 *
	 * @return the double
	 */
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