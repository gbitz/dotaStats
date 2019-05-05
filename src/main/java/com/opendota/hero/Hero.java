package com.opendota.hero;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setPrimaryAttr(String primaryAttr){
		this.primaryAttr = primaryAttr;
	}

	public String getPrimaryAttr(){
		return primaryAttr;
	}

	public void setAttackType(String attackType){
		this.attackType = attackType;
	}

	public String getAttackType(){
		return attackType;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

	public void setLegs(int legs){
		this.legs = legs;
	}

	public int getLegs(){
		return legs;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLocalizedName(String localizedName){
		this.localizedName = localizedName;
	}

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