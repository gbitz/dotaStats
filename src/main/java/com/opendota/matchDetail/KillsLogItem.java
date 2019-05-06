package com.opendota.matchDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class KillsLogItem{

	@JsonProperty("time")
	private int time;

	@JsonProperty("key")
	private String key;

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	public void setKey(String key){
		this.key = key;
	}

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