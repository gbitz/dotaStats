package com.opendota.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Profile.
 */
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

	/**
	 * Set profileurl.
	 *
	 * @param profileurl the profileurl
	 */
	public void setProfileurl(String profileurl){
		this.profileurl = profileurl;
	}

	/**
	 * Get profileurl string.
	 *
	 * @return the string
	 */
	public String getProfileurl(){
		return profileurl;
	}

	/**
	 * Set last login.
	 *
	 * @param lastLogin the last login
	 */
	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	/**
	 * Get last login string.
	 *
	 * @return the string
	 */
	public String getLastLogin(){
		return lastLogin;
	}

	/**
	 * Set avatarfull.
	 *
	 * @param avatarfull the avatarfull
	 */
	public void setAvatarfull(String avatarfull){
		this.avatarfull = avatarfull;
	}

	/**
	 * Get avatarfull string.
	 *
	 * @return the string
	 */
	public String getAvatarfull(){
		return avatarfull;
	}

	/**
	 * Set avatarmedium.
	 *
	 * @param avatarmedium the avatarmedium
	 */
	public void setAvatarmedium(String avatarmedium){
		this.avatarmedium = avatarmedium;
	}

	/**
	 * Get avatarmedium string.
	 *
	 * @return the string
	 */
	public String getAvatarmedium(){
		return avatarmedium;
	}

	/**
	 * Set avatar.
	 *
	 * @param avatar the avatar
	 */
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	/**
	 * Get avatar string.
	 *
	 * @return the string
	 */
	public String getAvatar(){
		return avatar;
	}

	/**
	 * Set personaname.
	 *
	 * @param personaname the personaname
	 */
	public void setPersonaname(String personaname){
		this.personaname = personaname;
	}

	/**
	 * Get personaname string.
	 *
	 * @return the string
	 */
	public String getPersonaname(){
		return personaname;
	}

	/**
	 * Set plus.
	 *
	 * @param plus the plus
	 */
	public void setPlus(boolean plus){
		this.plus = plus;
	}

	/**
	 * Is plus boolean.
	 *
	 * @return the boolean
	 */
	public boolean isPlus(){
		return plus;
	}

	/**
	 * Set is contributor.
	 *
	 * @param isContributor the is contributor
	 */
	public void setIsContributor(boolean isContributor){
		this.isContributor = isContributor;
	}

	/**
	 * Is is contributor boolean.
	 *
	 * @return the boolean
	 */
	public boolean isIsContributor(){
		return isContributor;
	}

	/**
	 * Set cheese.
	 *
	 * @param cheese the cheese
	 */
	public void setCheese(int cheese){
		this.cheese = cheese;
	}

	/**
	 * Get cheese int.
	 *
	 * @return the int
	 */
	public int getCheese(){
		return cheese;
	}

	/**
	 * Set steamid.
	 *
	 * @param steamid the steamid
	 */
	public void setSteamid(String steamid){
		this.steamid = steamid;
	}

	/**
	 * Get steamid string.
	 *
	 * @return the string
	 */
	public String getSteamid(){
		return steamid;
	}

	/**
	 * Set account id.
	 *
	 * @param accountId the account id
	 */
	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	/**
	 * Get account id int.
	 *
	 * @return the int
	 */
	public int getAccountId(){
		return accountId;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(Object name){
		this.name = name;
	}

	/**
	 * Get name object.
	 *
	 * @return the object
	 */
	public Object getName(){
		return name;
	}

	/**
	 * Set loccountrycode.
	 *
	 * @param loccountrycode the loccountrycode
	 */
	public void setLoccountrycode(Object loccountrycode){
		this.loccountrycode = loccountrycode;
	}

	/**
	 * Get loccountrycode object.
	 *
	 * @return the object
	 */
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