package com.opendota.heroStats;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class HeroStats{

	@JsonProperty("primary_attr")
	private String primaryAttr;

	@JsonProperty("attack_range")
	private int attackRange;

	@JsonProperty("attack_type")
	private String attackType;

	@JsonProperty("5_pick")
	private int jsonMember5Pick;

	@JsonProperty("pro_pick")
	private int proPick;

	@JsonProperty("1_win")
	private int jsonMember1Win;

	@JsonProperty("base_health")
	private int baseHealth;

	@JsonProperty("legs")
	private int legs;

	@JsonProperty("8_win")
	private int jsonMember8Win;

	@JsonProperty("id")
	private int id;

	@JsonProperty("6_pick")
	private int jsonMember6Pick;

	@JsonProperty("str_gain")
	private double strGain;

	@JsonProperty("2_win")
	private int jsonMember2Win;

	@JsonProperty("attack_rate")
	private double attackRate;

	@JsonProperty("base_str")
	private int baseStr;

	@JsonProperty("3_win")
	private int jsonMember3Win;

	@JsonProperty("agi_gain")
	private double agiGain;

	@JsonProperty("8_pick")
	private int jsonMember8Pick;

	@JsonProperty("name")
	private String name;

	@JsonProperty("projectile_speed")
	private int projectileSpeed;

	@JsonProperty("null_win")
	private int nullWin;

	@JsonProperty("pro_win")
	private int proWin;

	@JsonProperty("img")
	private String img;

	@JsonProperty("cm_enabled")
	private boolean cmEnabled;

	@JsonProperty("5_win")
	private int jsonMember5Win;

	@JsonProperty("roles")
	private List<String> roles;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("base_mana")
	private int baseMana;

	@JsonProperty("localized_name")
	private String localizedName;

	@JsonProperty("2_pick")
	private int jsonMember2Pick;

	@JsonProperty("4_win")
	private int jsonMember4Win;

	@JsonProperty("hero_id")
	private int heroId;

	@JsonProperty("3_pick")
	private int jsonMember3Pick;

	@JsonProperty("7_pick")
	private int jsonMember7Pick;

	@JsonProperty("7_win")
	private int jsonMember7Win;

	@JsonProperty("base_armor")
	private int baseArmor;

	@JsonProperty("1_pick")
	private int jsonMember1Pick;

	@JsonProperty("4_pick")
	private int jsonMember4Pick;

	@JsonProperty("base_mana_regen")
	private int baseManaRegen;

	@JsonProperty("base_attack_max")
	private int baseAttackMax;

	@JsonProperty("base_int")
	private int baseInt;

	@JsonProperty("int_gain")
	private double intGain;

	@JsonProperty("move_speed")
	private int moveSpeed;

	@JsonProperty("turn_rate")
	private double turnRate;

	@JsonProperty("null_pick")
	private int nullPick;

	@JsonProperty("pro_ban")
	private int proBan;

	@JsonProperty("6_win")
	private int jsonMember6Win;

	@JsonProperty("base_attack_min")
	private int baseAttackMin;

	@JsonProperty("base_agi")
	private int baseAgi;

	@JsonProperty("base_health_regen")
	private double baseHealthRegen;

	@JsonProperty("base_mr")
	private int baseMr;

	public void setPrimaryAttr(String primaryAttr){
		this.primaryAttr = primaryAttr;
	}

	public String getPrimaryAttr(){
		return primaryAttr;
	}

	public void setAttackRange(int attackRange){
		this.attackRange = attackRange;
	}

	public int getAttackRange(){
		return attackRange;
	}

	public void setAttackType(String attackType){
		this.attackType = attackType;
	}

	public String getAttackType(){
		return attackType;
	}

	public void setJsonMember5Pick(int jsonMember5Pick){
		this.jsonMember5Pick = jsonMember5Pick;
	}

	public int getJsonMember5Pick(){
		return jsonMember5Pick;
	}

	public void setProPick(int proPick){
		this.proPick = proPick;
	}

	public int getProPick(){
		return proPick;
	}

	public void setJsonMember1Win(int jsonMember1Win){
		this.jsonMember1Win = jsonMember1Win;
	}

	public int getJsonMember1Win(){
		return jsonMember1Win;
	}

	public void setBaseHealth(int baseHealth){
		this.baseHealth = baseHealth;
	}

	public int getBaseHealth(){
		return baseHealth;
	}

	public void setLegs(int legs){
		this.legs = legs;
	}

	public int getLegs(){
		return legs;
	}

	public void setJsonMember8Win(int jsonMember8Win){
		this.jsonMember8Win = jsonMember8Win;
	}

	public int getJsonMember8Win(){
		return jsonMember8Win;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setJsonMember6Pick(int jsonMember6Pick){
		this.jsonMember6Pick = jsonMember6Pick;
	}

	public int getJsonMember6Pick(){
		return jsonMember6Pick;
	}

	public void setStrGain(double strGain){
		this.strGain = strGain;
	}

	public double getStrGain(){
		return strGain;
	}

	public void setJsonMember2Win(int jsonMember2Win){
		this.jsonMember2Win = jsonMember2Win;
	}

	public int getJsonMember2Win(){
		return jsonMember2Win;
	}

	public void setAttackRate(double attackRate){
		this.attackRate = attackRate;
	}

	public double getAttackRate(){
		return attackRate;
	}

	public void setBaseStr(int baseStr){
		this.baseStr = baseStr;
	}

	public int getBaseStr(){
		return baseStr;
	}

	public void setJsonMember3Win(int jsonMember3Win){
		this.jsonMember3Win = jsonMember3Win;
	}

	public int getJsonMember3Win(){
		return jsonMember3Win;
	}

	public void setAgiGain(double agiGain){
		this.agiGain = agiGain;
	}

	public double getAgiGain(){
		return agiGain;
	}

	public void setJsonMember8Pick(int jsonMember8Pick){
		this.jsonMember8Pick = jsonMember8Pick;
	}

	public int getJsonMember8Pick(){
		return jsonMember8Pick;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setProjectileSpeed(int projectileSpeed){
		this.projectileSpeed = projectileSpeed;
	}

	public int getProjectileSpeed(){
		return projectileSpeed;
	}

	public void setNullWin(int nullWin){
		this.nullWin = nullWin;
	}

	public int getNullWin(){
		return nullWin;
	}

	public void setProWin(int proWin){
		this.proWin = proWin;
	}

	public int getProWin(){
		return proWin;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setCmEnabled(boolean cmEnabled){
		this.cmEnabled = cmEnabled;
	}

	public boolean isCmEnabled(){
		return cmEnabled;
	}

	public void setJsonMember5Win(int jsonMember5Win){
		this.jsonMember5Win = jsonMember5Win;
	}

	public int getJsonMember5Win(){
		return jsonMember5Win;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setBaseMana(int baseMana){
		this.baseMana = baseMana;
	}

	public int getBaseMana(){
		return baseMana;
	}

	public void setLocalizedName(String localizedName){
		this.localizedName = localizedName;
	}

	public String getLocalizedName(){
		return localizedName;
	}

	public void setJsonMember2Pick(int jsonMember2Pick){
		this.jsonMember2Pick = jsonMember2Pick;
	}

	public int getJsonMember2Pick(){
		return jsonMember2Pick;
	}

	public void setJsonMember4Win(int jsonMember4Win){
		this.jsonMember4Win = jsonMember4Win;
	}

	public int getJsonMember4Win(){
		return jsonMember4Win;
	}

	public void setHeroId(int heroId){
		this.heroId = heroId;
	}

	public int getHeroId(){
		return heroId;
	}

	public void setJsonMember3Pick(int jsonMember3Pick){
		this.jsonMember3Pick = jsonMember3Pick;
	}

	public int getJsonMember3Pick(){
		return jsonMember3Pick;
	}

	public void setJsonMember7Pick(int jsonMember7Pick){
		this.jsonMember7Pick = jsonMember7Pick;
	}

	public int getJsonMember7Pick(){
		return jsonMember7Pick;
	}

	public void setJsonMember7Win(int jsonMember7Win){
		this.jsonMember7Win = jsonMember7Win;
	}

	public int getJsonMember7Win(){
		return jsonMember7Win;
	}

	public void setBaseArmor(int baseArmor){
		this.baseArmor = baseArmor;
	}

	public int getBaseArmor(){
		return baseArmor;
	}

	public void setJsonMember1Pick(int jsonMember1Pick){
		this.jsonMember1Pick = jsonMember1Pick;
	}

	public int getJsonMember1Pick(){
		return jsonMember1Pick;
	}

	public void setJsonMember4Pick(int jsonMember4Pick){
		this.jsonMember4Pick = jsonMember4Pick;
	}

	public int getJsonMember4Pick(){
		return jsonMember4Pick;
	}

	public void setBaseManaRegen(int baseManaRegen){
		this.baseManaRegen = baseManaRegen;
	}

	public int getBaseManaRegen(){
		return baseManaRegen;
	}

	public void setBaseAttackMax(int baseAttackMax){
		this.baseAttackMax = baseAttackMax;
	}

	public int getBaseAttackMax(){
		return baseAttackMax;
	}

	public void setBaseInt(int baseInt){
		this.baseInt = baseInt;
	}

	public int getBaseInt(){
		return baseInt;
	}

	public void setIntGain(double intGain){
		this.intGain = intGain;
	}

	public double getIntGain(){
		return intGain;
	}

	public void setMoveSpeed(int moveSpeed){
		this.moveSpeed = moveSpeed;
	}

	public int getMoveSpeed(){
		return moveSpeed;
	}

	public void setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}

	public double getTurnRate(){
		return turnRate;
	}

	public void setNullPick(int nullPick){
		this.nullPick = nullPick;
	}

	public int getNullPick(){
		return nullPick;
	}

	public void setProBan(int proBan){
		this.proBan = proBan;
	}

	public int getProBan(){
		return proBan;
	}

	public void setJsonMember6Win(int jsonMember6Win){
		this.jsonMember6Win = jsonMember6Win;
	}

	public int getJsonMember6Win(){
		return jsonMember6Win;
	}

	public void setBaseAttackMin(int baseAttackMin){
		this.baseAttackMin = baseAttackMin;
	}

	public int getBaseAttackMin(){
		return baseAttackMin;
	}

	public void setBaseAgi(int baseAgi){
		this.baseAgi = baseAgi;
	}

	public int getBaseAgi(){
		return baseAgi;
	}

	public void setBaseHealthRegen(double baseHealthRegen){
		this.baseHealthRegen = baseHealthRegen;
	}

	public double getBaseHealthRegen(){
		return baseHealthRegen;
	}

	public void setBaseMr(int baseMr){
		this.baseMr = baseMr;
	}

	public int getBaseMr(){
		return baseMr;
	}

	@Override
 	public String toString(){
		return 
			"HeroStats{" + 
			"primary_attr = '" + primaryAttr + '\'' + 
			",attack_range = '" + attackRange + '\'' + 
			",attack_type = '" + attackType + '\'' + 
			",5_pick = '" + jsonMember5Pick + '\'' + 
			",pro_pick = '" + proPick + '\'' + 
			",1_win = '" + jsonMember1Win + '\'' + 
			",base_health = '" + baseHealth + '\'' + 
			",legs = '" + legs + '\'' + 
			",8_win = '" + jsonMember8Win + '\'' + 
			",id = '" + id + '\'' + 
			",6_pick = '" + jsonMember6Pick + '\'' + 
			",str_gain = '" + strGain + '\'' + 
			",2_win = '" + jsonMember2Win + '\'' + 
			",attack_rate = '" + attackRate + '\'' + 
			",base_str = '" + baseStr + '\'' + 
			",3_win = '" + jsonMember3Win + '\'' + 
			",agi_gain = '" + agiGain + '\'' + 
			",8_pick = '" + jsonMember8Pick + '\'' + 
			",name = '" + name + '\'' + 
			",projectile_speed = '" + projectileSpeed + '\'' + 
			",null_win = '" + nullWin + '\'' + 
			",pro_win = '" + proWin + '\'' + 
			",img = '" + img + '\'' + 
			",cm_enabled = '" + cmEnabled + '\'' + 
			",5_win = '" + jsonMember5Win + '\'' + 
			",roles = '" + roles + '\'' + 
			",icon = '" + icon + '\'' + 
			",base_mana = '" + baseMana + '\'' + 
			",localized_name = '" + localizedName + '\'' + 
			",2_pick = '" + jsonMember2Pick + '\'' + 
			",4_win = '" + jsonMember4Win + '\'' + 
			",hero_id = '" + heroId + '\'' + 
			",3_pick = '" + jsonMember3Pick + '\'' + 
			",7_pick = '" + jsonMember7Pick + '\'' + 
			",7_win = '" + jsonMember7Win + '\'' + 
			",base_armor = '" + baseArmor + '\'' + 
			",1_pick = '" + jsonMember1Pick + '\'' + 
			",4_pick = '" + jsonMember4Pick + '\'' + 
			",base_mana_regen = '" + baseManaRegen + '\'' + 
			",base_attack_max = '" + baseAttackMax + '\'' + 
			",base_int = '" + baseInt + '\'' + 
			",int_gain = '" + intGain + '\'' + 
			",move_speed = '" + moveSpeed + '\'' + 
			",turn_rate = '" + turnRate + '\'' + 
			",null_pick = '" + nullPick + '\'' + 
			",pro_ban = '" + proBan + '\'' + 
			",6_win = '" + jsonMember6Win + '\'' + 
			",base_attack_min = '" + baseAttackMin + '\'' + 
			",base_agi = '" + baseAgi + '\'' + 
			",base_health_regen = '" + baseHealthRegen + '\'' + 
			",base_mr = '" + baseMr + '\'' + 
			"}";
		}
}