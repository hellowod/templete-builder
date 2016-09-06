package com.config;

import java.util.HashMap;

/***
 * RoleInitialTbl.java
 * RoleInitialCfg.java
 *
 * @Author: abaojin
 */
public class RoleInitialTbl
{
	// #初始力量
	private ﻿int InitialStr;
	
	public ﻿int getInitialStr(){
		return InitialStr
	}
	
	public void setInitialStr(﻿int InitialStr){
		this.InitialStr = InitialStr
	}
	
	// 初始敏捷
	private int InitialDex;
	
	public int getInitialDex(){
		return InitialDex
	}
	
	public void setInitialDex(int InitialDex){
		this.InitialDex = InitialDex
	}
	
	// 初始智力
	private int InitialWit;
	
	public int getInitialWit(){
		return InitialWit
	}
	
	public void setInitialWit(int InitialWit){
		this.InitialWit = InitialWit
	}
	
	// 初始体力
	private int InitialVit;
	
	public int getInitialVit(){
		return InitialVit
	}
	
	public void setInitialVit(int InitialVit){
		this.InitialVit = InitialVit
	}
	
	// 初始物攻下限
	private int InitialAtkMin;
	
	public int getInitialAtkMin(){
		return InitialAtkMin
	}
	
	public void setInitialAtkMin(int InitialAtkMin){
		this.InitialAtkMin = InitialAtkMin
	}
	
	// 初始物攻上限
	private int InitialAtkMax;
	
	public int getInitialAtkMax(){
		return InitialAtkMax
	}
	
	public void setInitialAtkMax(int InitialAtkMax){
		this.InitialAtkMax = InitialAtkMax
	}
	
	// 初始物理防御
	private int InitialDef;
	
	public int getInitialDef(){
		return InitialDef
	}
	
	public void setInitialDef(int InitialDef){
		this.InitialDef = InitialDef
	}
	
	// 初始魔法防御
	private int InitialMdef;
	
	public int getInitialMdef(){
		return InitialMdef
	}
	
	public void setInitialMdef(int InitialMdef){
		this.InitialMdef = InitialMdef
	}
	
	// 初始魔攻下限
	private int InitialMtkMin;
	
	public int getInitialMtkMin(){
		return InitialMtkMin
	}
	
	public void setInitialMtkMin(int InitialMtkMin){
		this.InitialMtkMin = InitialMtkMin
	}
	
	// 初始魔攻上限
	private int InitialMtkMax;
	
	public int getInitialMtkMax(){
		return InitialMtkMax
	}
	
	public void setInitialMtkMax(int InitialMtkMax){
		this.InitialMtkMax = InitialMtkMax
	}
	
	// 初始生命上限
	private int InitialHp;
	
	public int getInitialHp(){
		return InitialHp
	}
	
	public void setInitialHp(int InitialHp){
		this.InitialHp = InitialHp
	}
	
	// 初始幸运一击概率
	private int InitialCrtChance;
	
	public int getInitialCrtChance(){
		return InitialCrtChance
	}
	
	public void setInitialCrtChance(int InitialCrtChance){
		this.InitialCrtChance = InitialCrtChance
	}
	
	// 初始幸运一击倍率
	private int InitialCrtBonus;
	
	public int getInitialCrtBonus(){
		return InitialCrtBonus
	}
	
	public void setInitialCrtBonus(int InitialCrtBonus){
		this.InitialCrtBonus = InitialCrtBonus
	}
	
	// 初始卓越一击
	private int InitialBrilliantChance;
	
	public int getInitialBrilliantChance(){
		return InitialBrilliantChance
	}
	
	public void setInitialBrilliantChance(int InitialBrilliantChance){
		this.InitialBrilliantChance = InitialBrilliantChance
	}
	
	// 初始物理护甲穿透
	private int InitialDefPierce;
	
	public int getInitialDefPierce(){
		return InitialDefPierce
	}
	
	public void setInitialDefPierce(int InitialDefPierce){
		this.InitialDefPierce = InitialDefPierce
	}
	
	// 初始魔法护甲穿透
	private int InitialMdefPierce;
	
	public int getInitialMdefPierce(){
		return InitialMdefPierce
	}
	
	public void setInitialMdefPierce(int InitialMdefPierce){
		this.InitialMdefPierce = InitialMdefPierce
	}
	
	// 初始无视防御概率
	private int InitialIgnoreAllDef;
	
	public int getInitialIgnoreAllDef(){
		return InitialIgnoreAllDef
	}
	
	public void setInitialIgnoreAllDef(int InitialIgnoreAllDef){
		this.InitialIgnoreAllDef = InitialIgnoreAllDef
	}
	
	// 初始双倍伤害概率
	private int InitialDoubleChance;
	
	public int getInitialDoubleChance(){
		return InitialDoubleChance
	}
	
	public void setInitialDoubleChance(int InitialDoubleChance){
		this.InitialDoubleChance = InitialDoubleChance
	}
	
	// 初始移动速度(厘米/秒)
	private int InitialMoveSpeed;
	
	public int getInitialMoveSpeed(){
		return InitialMoveSpeed
	}
	
	public void setInitialMoveSpeed(int InitialMoveSpeed){
		this.InitialMoveSpeed = InitialMoveSpeed
	}
	
	// 初始对BOSS护甲伤害提升
	private int InitialBonusToArmor;
	
	public int getInitialBonusToArmor(){
		return InitialBonusToArmor
	}
	
	public void setInitialBonusToArmor(int InitialBonusToArmor){
		this.InitialBonusToArmor = InitialBonusToArmor
	}
	
	// 初始对怪物伤害提升
	private int InitialBonusToMonster;
	
	public int getInitialBonusToMonster(){
		return InitialBonusToMonster
	}
	
	public void setInitialBonusToMonster(int InitialBonusToMonster){
		this.InitialBonusToMonster = InitialBonusToMonster
	}
	
	// 初始经验提升
	private int InitialExpUp;
	
	public int getInitialExpUp(){
		return InitialExpUp
	}
	
	public void setInitialExpUp(int InitialExpUp){
		this.InitialExpUp = InitialExpUp
	}
	
	// 初始抗幸运一击概率
	private int InitialCrtChanceResist;
	
	public int getInitialCrtChanceResist(){
		return InitialCrtChanceResist
	}
	
	public void setInitialCrtChanceResist(int InitialCrtChanceResist){
		this.InitialCrtChanceResist = InitialCrtChanceResist
	}
	
	// 初始抗幸运一击伤害
	private int InitialCrtBonusResist;
	
	public int getInitialCrtBonusResist(){
		return InitialCrtBonusResist
	}
	
	public void setInitialCrtBonusResist(int InitialCrtBonusResist){
		this.InitialCrtBonusResist = InitialCrtBonusResist
	}
	
	// 初始反伤比例
	private int InitialReboundDmg;
	
	public int getInitialReboundDmg(){
		return InitialReboundDmg
	}
	
	public void setInitialReboundDmg(int InitialReboundDmg){
		this.InitialReboundDmg = InitialReboundDmg
	}
	
	// 初始生命值提升百分比
	private int InitialHpBonus;
	
	public int getInitialHpBonus(){
		return InitialHpBonus
	}
	
	public void setInitialHpBonus(int InitialHpBonus){
		this.InitialHpBonus = InitialHpBonus
	}
	
	// 初始伤害减少百分比
	private int InitialDmgReduce;
	
	public int getInitialDmgReduce(){
		return InitialDmgReduce
	}
	
	public void setInitialDmgReduce(int InitialDmgReduce){
		this.InitialDmgReduce = InitialDmgReduce
	}
	
	// 初始击杀怪物后恢复生命
	private int InitialKillCure;
	
	public int getInitialKillCure(){
		return InitialKillCure
	}
	
	public void setInitialKillCure(int InitialKillCure){
		this.InitialKillCure = InitialKillCure
	}
	
	// 初始攻击力增加百分比
	private int InitialAllAtkBonus;
	
	public int getInitialAllAtkBonus(){
		return InitialAllAtkBonus
	}
	
	public void setInitialAllAtkBonus(int InitialAllAtkBonus){
		this.InitialAllAtkBonus = InitialAllAtkBonus
	}
	
	// 初始mf值
	private int InitialMF;
	
	public int getInitialMF(){
		return InitialMF
	}
	
	public void setInitialMF(int InitialMF){
		this.InitialMF = InitialMF
	}
	
	
}

public class RoleInitialCfg
{
	public const string FILENAME = "RoleInitial";
	public HashMap<int, BaseTbl> Init()
	{
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null)
		{
			return null;
		}
		var dict = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i)
		{
			RoleInitialTbl record = new RoleInitialTbl();
			
			record.InitialDex = table.GetInt(i, "InitialDex");
			record.InitialWit = table.GetInt(i, "InitialWit");
			record.InitialVit = table.GetInt(i, "InitialVit");
			record.InitialAtkMin = table.GetInt(i, "InitialAtkMin");
			record.InitialAtkMax = table.GetInt(i, "InitialAtkMax");
			record.InitialDef = table.GetInt(i, "InitialDef");
			record.InitialMdef = table.GetInt(i, "InitialMdef");
			record.InitialMtkMin = table.GetInt(i, "InitialMtkMin");
			record.InitialMtkMax = table.GetInt(i, "InitialMtkMax");
			record.InitialHp = table.GetInt(i, "InitialHp");
			record.InitialCrtChance = table.GetInt(i, "InitialCrtChance");
			record.InitialCrtBonus = table.GetInt(i, "InitialCrtBonus");
			record.InitialBrilliantChance = table.GetInt(i, "InitialBrilliantChance");
			record.InitialDefPierce = table.GetInt(i, "InitialDefPierce");
			record.InitialMdefPierce = table.GetInt(i, "InitialMdefPierce");
			record.InitialIgnoreAllDef = table.GetInt(i, "InitialIgnoreAllDef");
			record.InitialDoubleChance = table.GetInt(i, "InitialDoubleChance");
			record.InitialMoveSpeed = table.GetInt(i, "InitialMoveSpeed");
			record.InitialBonusToArmor = table.GetInt(i, "InitialBonusToArmor");
			record.InitialBonusToMonster = table.GetInt(i, "InitialBonusToMonster");
			record.InitialExpUp = table.GetInt(i, "InitialExpUp");
			record.InitialCrtChanceResist = table.GetInt(i, "InitialCrtChanceResist");
			record.InitialCrtBonusResist = table.GetInt(i, "InitialCrtBonusResist");
			record.InitialReboundDmg = table.GetInt(i, "InitialReboundDmg");
			record.InitialHpBonus = table.GetInt(i, "InitialHpBonus");
			record.InitialDmgReduce = table.GetInt(i, "InitialDmgReduce");
			record.InitialKillCure = table.GetInt(i, "InitialKillCure");
			record.InitialAllAtkBonus = table.GetInt(i, "InitialAllAtkBonus");
			record.InitialMF = table.GetInt(i, "InitialMF");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}