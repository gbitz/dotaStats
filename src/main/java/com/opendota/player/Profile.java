package com.opendota.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Profile{

	@JsonProperty("profileurl")
	private String profileurl;

	@JsonProperty("last_login")
	private String lastLogin;

	@JsonProperty("avatarfull")
	private String avatarfull;

	@JsonProperty("avatarmedium")
	private String avatarmedium;

	@JsonProperty("avatar")
	private String avatar;

	@JsonProperty("personaname")
	private String personaname;

	@JsonProperty("plus")
	private boolean plus;

	@JsonProperty("is_contributor")
	private boolean isContributor;

	@JsonProperty("cheese")
	private int cheese;

	@JsonProperty("steamid")
	private String steamid;

	@JsonProperty("account_id")
	private int accountId;

	@JsonProperty("name")
	private Object name;

	@JsonProperty("loccountrycode")
	private Object loccountrycode;

	public void setProfileurl(String profileurl){
		this.profileurl = profileurl;
	}

	public String getProfileurl(){
		return profileurl;
	}

	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	public String getLastLogin(){
		return lastLogin;
	}

	public void setAvatarfull(String avatarfull){
		this.avatarfull = avatarfull;
	}

	public String getAvatarfull(){
		return avatarfull;
	}

	public void setAvatarmedium(String avatarmedium){
		this.avatarmedium = avatarmedium;
	}

	public String getAvatarmedium(){
		return avatarmedium;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setPersonaname(String personaname){
		this.personaname = personaname;
	}

	public String getPersonaname(){
		return personaname;
	}

	public void setPlus(boolean plus){
		this.plus = plus;
	}

	public boolean isPlus(){
		return plus;
	}

	public void setIsContributor(boolean isContributor){
		this.isContributor = isContributor;
	}

	public boolean isIsContributor(){
		return isContributor;
	}

	public void setCheese(int cheese){
		this.cheese = cheese;
	}

	public int getCheese(){
		return cheese;
	}

	public void setSteamid(String steamid){
		this.steamid = steamid;
	}

	public String getSteamid(){
		return steamid;
	}

	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	public int getAccountId(){
		return accountId;
	}

	public void setName(Object name){
		this.name = name;
	}

	public Object getName(){
		return name;
	}

	public void setLoccountrycode(Object loccountrycode){
		this.loccountrycode = loccountrycode;
	}

	public Object getLoccountrycode(){
		return loccountrycode;
	}

	@Override
 	public String toString(){
		return 
			"Profile{" + 
			"profileurl = '" + profileurl + '\'' + 
			",last_login = '" + lastLogin + '\'' + 
			",avatarfull = '" + avatarfull + '\'' + 
			",avatarmedium = '" + avatarmedium + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",personaname = '" + personaname + '\'' + 
			",plus = '" + plus + '\'' + 
			",is_contributor = '" + isContributor + '\'' + 
			",cheese = '" + cheese + '\'' + 
			",steamid = '" + steamid + '\'' + 
			",account_id = '" + accountId + '\'' + 
			",name = '" + name + '\'' + 
			",loccountrycode = '" + loccountrycode + '\'' + 
			"}";
		}
}