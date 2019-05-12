package com.opendota.hero;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Hero.
 */
@Generated("com.robohorse.robopojogenerator")
public class Hero{

	@JsonProperty("primary_attr")
	private String primaryAttr;

	@JsonProperty("attack_type")
	private String attackType;

	@JsonProperty("roles")
	private List<String> roles;

	@JsonProperty("legs")
	private int legs;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("localized_name")
	private String localizedName;

	/**
	 * Set primary attr.
	 *
	 * @param primaryAttr the primary attr
	 */
	public void setPrimaryAttr(String primaryAttr){
		this.primaryAttr = primaryAttr;
	}

	/**
	 * Get primary attr string.
	 *
	 * @return the string
	 */
	public String getPrimaryAttr(){
		return primaryAttr;
	}

	/**
	 * Set attack type.
	 *
	 * @param attackType the attack type
	 */
	public void setAttackType(String attackType){
		this.attackType = attackType;
	}

	/**
	 * Get attack type string.
	 *
	 * @return the string
	 */
	public String getAttackType(){
		return attackType;
	}

	/**
	 * Set roles.
	 *
	 * @param roles the roles
	 */
	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	/**
	 * Get roles list.
	 *
	 * @return the list
	 */
	public List<String> getRoles(){
		return roles;
	}

	/**
	 * Set legs.
	 *
	 * @param legs the legs
	 */
	public void setLegs(int legs){
		this.legs = legs;
	}

	/**
	 * Get legs int.
	 *
	 * @return the int
	 */
	public int getLegs(){
		return legs;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
	public int getId(){
		return id;
	}

	/**
	 * Set localized name.
	 *
	 * @param localizedName the localized name
	 */
	public void setLocalizedName(String localizedName){
		this.localizedName = localizedName;
	}

	/**
	 * Get localized name string.
	 *
	 * @return the string
	 */
	public String getLocalizedName(){
		return localizedName;
	}

	@Override
 	public String toString(){
		return 
			"Hero{" + 
			"primary_attr = '" + primaryAttr + '\'' + 
			",attack_type = '" + attackType + '\'' + 
			",roles = '" + roles + '\'' + 
			",legs = '" + legs + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",localized_name = '" + localizedName + '\'' + 
			"}";
		}
}