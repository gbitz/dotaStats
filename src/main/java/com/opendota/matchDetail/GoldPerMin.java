package com.opendota.matchDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Gold per min.
 */
@Generated("com.robohorse.robopojogenerator")
public class GoldPerMin{

	@JsonProperty("pct")
	private double pct;

	@JsonProperty("raw")
	private int raw;

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
	public void setRaw(int raw){
		this.raw = raw;
	}

	/**
	 * Get raw int.
	 *
	 * @return the int
	 */
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