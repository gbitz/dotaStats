package com.opendota.heroStats;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Hero stats.
 */
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
	 * Set attack range.
	 *
	 * @param attackRange the attack range
	 */
	public void setAttackRange(int attackRange){
		this.attackRange = attackRange;
	}

	/**
	 * Get attack range int.
	 *
	 * @return the int
	 */
	public int getAttackRange(){
		return attackRange;
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
	 * Set json member 5 pick.
	 *
	 * @param jsonMember5Pick the json member 5 pick
	 */
	public void setJsonMember5Pick(int jsonMember5Pick){
		this.jsonMember5Pick = jsonMember5Pick;
	}

	/**
	 * Get json member 5 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember5Pick(){
		return jsonMember5Pick;
	}

	/**
	 * Set pro pick.
	 *
	 * @param proPick the pro pick
	 */
	public void setProPick(int proPick){
		this.proPick = proPick;
	}

	/**
	 * Get pro pick int.
	 *
	 * @return the int
	 */
	public int getProPick(){
		return proPick;
	}

	/**
	 * Set json member 1 win.
	 *
	 * @param jsonMember1Win the json member 1 win
	 */
	public void setJsonMember1Win(int jsonMember1Win){
		this.jsonMember1Win = jsonMember1Win;
	}

	/**
	 * Get json member 1 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember1Win(){
		return jsonMember1Win;
	}

	/**
	 * Set base health.
	 *
	 * @param baseHealth the base health
	 */
	public void setBaseHealth(int baseHealth){
		this.baseHealth = baseHealth;
	}

	/**
	 * Get base health int.
	 *
	 * @return the int
	 */
	public int getBaseHealth(){
		return baseHealth;
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
	 * Set json member 8 win.
	 *
	 * @param jsonMember8Win the json member 8 win
	 */
	public void setJsonMember8Win(int jsonMember8Win){
		this.jsonMember8Win = jsonMember8Win;
	}

	/**
	 * Get json member 8 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember8Win(){
		return jsonMember8Win;
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
	 * Set json member 6 pick.
	 *
	 * @param jsonMember6Pick the json member 6 pick
	 */
	public void setJsonMember6Pick(int jsonMember6Pick){
		this.jsonMember6Pick = jsonMember6Pick;
	}

	/**
	 * Get json member 6 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember6Pick(){
		return jsonMember6Pick;
	}

	/**
	 * Set str gain.
	 *
	 * @param strGain the str gain
	 */
	public void setStrGain(double strGain){
		this.strGain = strGain;
	}

	/**
	 * Get str gain double.
	 *
	 * @return the double
	 */
	public double getStrGain(){
		return strGain;
	}

	/**
	 * Set json member 2 win.
	 *
	 * @param jsonMember2Win the json member 2 win
	 */
	public void setJsonMember2Win(int jsonMember2Win){
		this.jsonMember2Win = jsonMember2Win;
	}

	/**
	 * Get json member 2 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember2Win(){
		return jsonMember2Win;
	}

	/**
	 * Set attack rate.
	 *
	 * @param attackRate the attack rate
	 */
	public void setAttackRate(double attackRate){
		this.attackRate = attackRate;
	}

	/**
	 * Get attack rate double.
	 *
	 * @return the double
	 */
	public double getAttackRate(){
		return attackRate;
	}

	/**
	 * Set base str.
	 *
	 * @param baseStr the base str
	 */
	public void setBaseStr(int baseStr){
		this.baseStr = baseStr;
	}

	/**
	 * Get base str int.
	 *
	 * @return the int
	 */
	public int getBaseStr(){
		return baseStr;
	}

	/**
	 * Set json member 3 win.
	 *
	 * @param jsonMember3Win the json member 3 win
	 */
	public void setJsonMember3Win(int jsonMember3Win){
		this.jsonMember3Win = jsonMember3Win;
	}

	/**
	 * Get json member 3 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember3Win(){
		return jsonMember3Win;
	}

	/**
	 * Set agi gain.
	 *
	 * @param agiGain the agi gain
	 */
	public void setAgiGain(double agiGain){
		this.agiGain = agiGain;
	}

	/**
	 * Get agi gain double.
	 *
	 * @return the double
	 */
	public double getAgiGain(){
		return agiGain;
	}

	/**
	 * Set json member 8 pick.
	 *
	 * @param jsonMember8Pick the json member 8 pick
	 */
	public void setJsonMember8Pick(int jsonMember8Pick){
		this.jsonMember8Pick = jsonMember8Pick;
	}

	/**
	 * Get json member 8 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember8Pick(){
		return jsonMember8Pick;
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
	 * Set projectile speed.
	 *
	 * @param projectileSpeed the projectile speed
	 */
	public void setProjectileSpeed(int projectileSpeed){
		this.projectileSpeed = projectileSpeed;
	}

	/**
	 * Get projectile speed int.
	 *
	 * @return the int
	 */
	public int getProjectileSpeed(){
		return projectileSpeed;
	}

	/**
	 * Set null win.
	 *
	 * @param nullWin the null win
	 */
	public void setNullWin(int nullWin){
		this.nullWin = nullWin;
	}

	/**
	 * Get null win int.
	 *
	 * @return the int
	 */
	public int getNullWin(){
		return nullWin;
	}

	/**
	 * Set pro win.
	 *
	 * @param proWin the pro win
	 */
	public void setProWin(int proWin){
		this.proWin = proWin;
	}

	/**
	 * Get pro win int.
	 *
	 * @return the int
	 */
	public int getProWin(){
		return proWin;
	}

	/**
	 * Set img.
	 *
	 * @param img the img
	 */
	public void setImg(String img){
		this.img = img;
	}

	/**
	 * Get img string.
	 *
	 * @return the string
	 */
	public String getImg(){
		return img;
	}

	/**
	 * Set cm enabled.
	 *
	 * @param cmEnabled the cm enabled
	 */
	public void setCmEnabled(boolean cmEnabled){
		this.cmEnabled = cmEnabled;
	}

	/**
	 * Is cm enabled boolean.
	 *
	 * @return the boolean
	 */
	public boolean isCmEnabled(){
		return cmEnabled;
	}

	/**
	 * Set json member 5 win.
	 *
	 * @param jsonMember5Win the json member 5 win
	 */
	public void setJsonMember5Win(int jsonMember5Win){
		this.jsonMember5Win = jsonMember5Win;
	}

	/**
	 * Get json member 5 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember5Win(){
		return jsonMember5Win;
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
	 * Set icon.
	 *
	 * @param icon the icon
	 */
	public void setIcon(String icon){
		this.icon = icon;
	}

	/**
	 * Get icon string.
	 *
	 * @return the string
	 */
	public String getIcon(){
		return icon;
	}

	/**
	 * Set base mana.
	 *
	 * @param baseMana the base mana
	 */
	public void setBaseMana(int baseMana){
		this.baseMana = baseMana;
	}

	/**
	 * Get base mana int.
	 *
	 * @return the int
	 */
	public int getBaseMana(){
		return baseMana;
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

	/**
	 * Set json member 2 pick.
	 *
	 * @param jsonMember2Pick the json member 2 pick
	 */
	public void setJsonMember2Pick(int jsonMember2Pick){
		this.jsonMember2Pick = jsonMember2Pick;
	}

	/**
	 * Get json member 2 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember2Pick(){
		return jsonMember2Pick;
	}

	/**
	 * Set json member 4 win.
	 *
	 * @param jsonMember4Win the json member 4 win
	 */
	public void setJsonMember4Win(int jsonMember4Win){
		this.jsonMember4Win = jsonMember4Win;
	}

	/**
	 * Get json member 4 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember4Win(){
		return jsonMember4Win;
	}

	/**
	 * Set hero id.
	 *
	 * @param heroId the hero id
	 */
	public void setHeroId(int heroId){
		this.heroId = heroId;
	}

	/**
	 * Get hero id int.
	 *
	 * @return the int
	 */
	public int getHeroId(){
		return heroId;
	}

	/**
	 * Set json member 3 pick.
	 *
	 * @param jsonMember3Pick the json member 3 pick
	 */
	public void setJsonMember3Pick(int jsonMember3Pick){
		this.jsonMember3Pick = jsonMember3Pick;
	}

	/**
	 * Get json member 3 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember3Pick(){
		return jsonMember3Pick;
	}

	/**
	 * Set json member 7 pick.
	 *
	 * @param jsonMember7Pick the json member 7 pick
	 */
	public void setJsonMember7Pick(int jsonMember7Pick){
		this.jsonMember7Pick = jsonMember7Pick;
	}

	/**
	 * Get json member 7 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember7Pick(){
		return jsonMember7Pick;
	}

	/**
	 * Set json member 7 win.
	 *
	 * @param jsonMember7Win the json member 7 win
	 */
	public void setJsonMember7Win(int jsonMember7Win){
		this.jsonMember7Win = jsonMember7Win;
	}

	/**
	 * Get json member 7 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember7Win(){
		return jsonMember7Win;
	}

	/**
	 * Set base armor.
	 *
	 * @param baseArmor the base armor
	 */
	public void setBaseArmor(int baseArmor){
		this.baseArmor = baseArmor;
	}

	/**
	 * Get base armor int.
	 *
	 * @return the int
	 */
	public int getBaseArmor(){
		return baseArmor;
	}

	/**
	 * Set json member 1 pick.
	 *
	 * @param jsonMember1Pick the json member 1 pick
	 */
	public void setJsonMember1Pick(int jsonMember1Pick){
		this.jsonMember1Pick = jsonMember1Pick;
	}

	/**
	 * Get json member 1 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember1Pick(){
		return jsonMember1Pick;
	}

	/**
	 * Set json member 4 pick.
	 *
	 * @param jsonMember4Pick the json member 4 pick
	 */
	public void setJsonMember4Pick(int jsonMember4Pick){
		this.jsonMember4Pick = jsonMember4Pick;
	}

	/**
	 * Get json member 4 pick int.
	 *
	 * @return the int
	 */
	public int getJsonMember4Pick(){
		return jsonMember4Pick;
	}

	/**
	 * Set base mana regen.
	 *
	 * @param baseManaRegen the base mana regen
	 */
	public void setBaseManaRegen(int baseManaRegen){
		this.baseManaRegen = baseManaRegen;
	}

	/**
	 * Get base mana regen int.
	 *
	 * @return the int
	 */
	public int getBaseManaRegen(){
		return baseManaRegen;
	}

	/**
	 * Set base attack max.
	 *
	 * @param baseAttackMax the base attack max
	 */
	public void setBaseAttackMax(int baseAttackMax){
		this.baseAttackMax = baseAttackMax;
	}

	/**
	 * Get base attack max int.
	 *
	 * @return the int
	 */
	public int getBaseAttackMax(){
		return baseAttackMax;
	}

	/**
	 * Set base int.
	 *
	 * @param baseInt the base int
	 */
	public void setBaseInt(int baseInt){
		this.baseInt = baseInt;
	}

	/**
	 * Get base int int.
	 *
	 * @return the int
	 */
	public int getBaseInt(){
		return baseInt;
	}

	/**
	 * Set int gain.
	 *
	 * @param intGain the int gain
	 */
	public void setIntGain(double intGain){
		this.intGain = intGain;
	}

	/**
	 * Get int gain double.
	 *
	 * @return the double
	 */
	public double getIntGain(){
		return intGain;
	}

	/**
	 * Set move speed.
	 *
	 * @param moveSpeed the move speed
	 */
	public void setMoveSpeed(int moveSpeed){
		this.moveSpeed = moveSpeed;
	}

	/**
	 * Get move speed int.
	 *
	 * @return the int
	 */
	public int getMoveSpeed(){
		return moveSpeed;
	}

	/**
	 * Set turn rate.
	 *
	 * @param turnRate the turn rate
	 */
	public void setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}

	/**
	 * Get turn rate double.
	 *
	 * @return the double
	 */
	public double getTurnRate(){
		return turnRate;
	}

	/**
	 * Set null pick.
	 *
	 * @param nullPick the null pick
	 */
	public void setNullPick(int nullPick){
		this.nullPick = nullPick;
	}

	/**
	 * Get null pick int.
	 *
	 * @return the int
	 */
	public int getNullPick(){
		return nullPick;
	}

	/**
	 * Set pro ban.
	 *
	 * @param proBan the pro ban
	 */
	public void setProBan(int proBan){
		this.proBan = proBan;
	}

	/**
	 * Get pro ban int.
	 *
	 * @return the int
	 */
	public int getProBan(){
		return proBan;
	}

	/**
	 * Set json member 6 win.
	 *
	 * @param jsonMember6Win the json member 6 win
	 */
	public void setJsonMember6Win(int jsonMember6Win){
		this.jsonMember6Win = jsonMember6Win;
	}

	/**
	 * Get json member 6 win int.
	 *
	 * @return the int
	 */
	public int getJsonMember6Win(){
		return jsonMember6Win;
	}

	/**
	 * Set base attack min.
	 *
	 * @param baseAttackMin the base attack min
	 */
	public void setBaseAttackMin(int baseAttackMin){
		this.baseAttackMin = baseAttackMin;
	}

	/**
	 * Get base attack min int.
	 *
	 * @return the int
	 */
	public int getBaseAttackMin(){
		return baseAttackMin;
	}

	/**
	 * Set base agi.
	 *
	 * @param baseAgi the base agi
	 */
	public void setBaseAgi(int baseAgi){
		this.baseAgi = baseAgi;
	}

	/**
	 * Get base agi int.
	 *
	 * @return the int
	 */
	public int getBaseAgi(){
		return baseAgi;
	}

	/**
	 * Set base health regen.
	 *
	 * @param baseHealthRegen the base health regen
	 */
	public void setBaseHealthRegen(double baseHealthRegen){
		this.baseHealthRegen = baseHealthRegen;
	}

	/**
	 * Get base health regen double.
	 *
	 * @return the double
	 */
	public double getBaseHealthRegen(){
		return baseHealthRegen;
	}

	/**
	 * Set base mr.
	 *
	 * @param baseMr the base mr
	 */
	public void setBaseMr(int baseMr){
		this.baseMr = baseMr;
	}

	/**
	 * Get base mr int.
	 *
	 * @return the int
	 */
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