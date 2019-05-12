package com.opendota.matchDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Kills log item.
 */
@Generated("com.robohorse.robopojogenerator")
public class KillsLogItem{

	@JsonProperty("time")
	private int time;

	@JsonProperty("key")
	private String key;

	/**
	 * Set time.
	 *
	 * @param time the time
	 */
	public void setTime(int time){
		this.time = time;
	}

	/**
	 * Get time int.
	 *
	 * @return the int
	 */
	public int getTime(){
		return time;
	}

	/**
	 * Set key.
	 *
	 * @param key the key
	 */
	public void setKey(String key){
		this.key = key;
	}

	/**
	 * Get key string.
	 *
	 * @return the string
	 */
	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"KillsLogItem{" + 
			"time = '" + time + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}