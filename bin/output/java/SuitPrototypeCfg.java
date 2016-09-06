package com.config;

import java.util.HashMap;

/***
 * SuitPrototypeTbl.java
 * SuitPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class SuitPrototypeTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 套装名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 套装id
	private int SuitId;
	
	public int getSuitId(){
		return SuitId
	}
	
	public void setSuitId(int SuitId){
		this.SuitId = SuitId
	}
	
	// 对应的套装穿戴数量
	private int Count;
	
	public int getCount(){
		return Count
	}
	
	public void setCount(int Count){
		this.Count = Count
	}
	
	// 力量
	private int Str;
	
	public int getStr(){
		return Str
	}
	
	public void setStr(int Str){
		this.Str = Str
	}
	
	// 敏捷
	private int Dex;
	
	public int getDex(){
		return Dex
	}
	
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	// 智力
	private int Wit;
	
	public int getWit(){
		return Wit
	}
	
	public void setWit(int Wit){
		this.Wit = Wit
	}
	
	// 体力
	private int Vit;
	
	public int getVit(){
		return Vit
	}
	
	public void setVit(int Vit){
		this.Vit = Vit
	}
	
	// 物攻下限
	private int AtkMin;
	
	public int getAtkMin(){
		return AtkMin
	}
	
	public void setAtkMin(int AtkMin){
		this.AtkMin = AtkMin
	}
	
	// 物攻上限
	private int AtkMax;
	
	public int getAtkMax(){
		return AtkMax
	}
	
	public void setAtkMax(int AtkMax){
		this.AtkMax = AtkMax
	}
	
	// 物理防御
	private int Def;
	
	public int getDef(){
		return Def
	}
	
	public void setDef(int Def){
		this.Def = Def
	}
	
	// 魔法防御
	private int Mdef;
	
	public int getMdef(){
		return Mdef
	}
	
	public void setMdef(int Mdef){
		this.Mdef = Mdef
	}
	
	// 魔攻下限
	private int MtkMin;
	
	public int getMtkMin(){
		return MtkMin
	}
	
	public void setMtkMin(int MtkMin){
		this.MtkMin = MtkMin
	}
	
	// 魔攻上限
	private int MtkMax;
	
	public int getMtkMax(){
		return MtkMax
	}
	
	public void setMtkMax(int MtkMax){
		this.MtkMax = MtkMax
	}
	
	// 生命上限
	private int Hp;
	
	public int getHp(){
		return Hp
	}
	
	public void setHp(int Hp){
		this.Hp = Hp
	}
	
	// 幸运一击概率
	private int CrtChance;
	
	public int getCrtChance(){
		return CrtChance
	}
	
	public void setCrtChance(int CrtChance){
		this.CrtChance = CrtChance
	}
	
	// 幸运一击倍率
	private int CrtBonus;
	
	public int getCrtBonus(){
		return CrtBonus
	}
	
	public void setCrtBonus(int CrtBonus){
		this.CrtBonus = CrtBonus
	}
	
	// 卓越一击概率
	private int BrilliantChance;
	
	public int getBrilliantChance(){
		return BrilliantChance
	}
	
	public void setBrilliantChance(int BrilliantChance){
		this.BrilliantChance = BrilliantChance
	}
	
	// 物理护甲穿透
	private int DefPierce;
	
	public int getDefPierce(){
		return DefPierce
	}
	
	public void setDefPierce(int DefPierce){
		this.DefPierce = DefPierce
	}
	
	// 魔法护甲穿透
	private int MdefPierce;
	
	public int getMdefPierce(){
		return MdefPierce
	}
	
	public void setMdefPierce(int MdefPierce){
		this.MdefPierce = MdefPierce
	}
	
	// 无视防御概率
	private int IgnoreAllDef;
	
	public int getIgnoreAllDef(){
		return IgnoreAllDef
	}
	
	public void setIgnoreAllDef(int IgnoreAllDef){
		this.IgnoreAllDef = IgnoreAllDef
	}
	
	// 双倍伤害概率
	private int DoubleChance;
	
	public int getDoubleChance(){
		return DoubleChance
	}
	
	public void setDoubleChance(int DoubleChance){
		this.DoubleChance = DoubleChance
	}
	
	// 移动速度
	private int MoveSpeed;
	
	public int getMoveSpeed(){
		return MoveSpeed
	}
	
	public void setMoveSpeed(int MoveSpeed){
		this.MoveSpeed = MoveSpeed
	}
	
	// 对BOSS护甲伤害提升
	private int BonusToArmor;
	
	public int getBonusToArmor(){
		return BonusToArmor
	}
	
	public void setBonusToArmor(int BonusToArmor){
		this.BonusToArmor = BonusToArmor
	}
	
	// 对怪物伤害提升
	private int BonusToMonster;
	
	public int getBonusToMonster(){
		return BonusToMonster
	}
	
	public void setBonusToMonster(int BonusToMonster){
		this.BonusToMonster = BonusToMonster
	}
	
	// 经验提升
	private int ExpUp;
	
	public int getExpUp(){
		return ExpUp
	}
	
	public void setExpUp(int ExpUp){
		this.ExpUp = ExpUp
	}
	
	// 抗幸运一击概率
	private int CrtChanceResist;
	
	public int getCrtChanceResist(){
		return CrtChanceResist
	}
	
	public void setCrtChanceResist(int CrtChanceResist){
		this.CrtChanceResist = CrtChanceResist
	}
	
	// 抗幸运一击伤害
	private int CrtBonusResist;
	
	public int getCrtBonusResist(){
		return CrtBonusResist
	}
	
	public void setCrtBonusResist(int CrtBonusResist){
		this.CrtBonusResist = CrtBonusResist
	}
	
	// 反伤比例
	private int ReboundDmg;
	
	public int getReboundDmg(){
		return ReboundDmg
	}
	
	public void setReboundDmg(int ReboundDmg){
		this.ReboundDmg = ReboundDmg
	}
	
	// 生命值提升百分比
	private int HpBonus;
	
	public int getHpBonus(){
		return HpBonus
	}
	
	public void setHpBonus(int HpBonus){
		this.HpBonus = HpBonus
	}
	
	// 伤害减少百分比
	private int DmgReduce;
	
	public int getDmgReduce(){
		return DmgReduce
	}
	
	public void setDmgReduce(int DmgReduce){
		this.DmgReduce = DmgReduce
	}
	
	// 击杀怪物后恢复生命
	private int KillCure;
	
	public int getKillCure(){
		return KillCure
	}
	
	public void setKillCure(int KillCure){
		this.KillCure = KillCure
	}
	
	// 攻击力增加百分比
	private int AllAtkBonus;
	
	public int getAllAtkBonus(){
		return AllAtkBonus
	}
	
	public void setAllAtkBonus(int AllAtkBonus){
		this.AllAtkBonus = AllAtkBonus
	}
	
	// 掉宝加成值
	private int MF;
	
	public int getMF(){
		return MF
	}
	
	public void setMF(int MF){
		this.MF = MF
	}
	
	
}

public class SuitPrototypeCfg
{
	public const string FILENAME = "SuitPrototype";
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
			SuitPrototypeTbl record = new SuitPrototypeTbl();
			
			record.Name = table.GetString(i, "Name");
			record.SuitId = table.GetInt(i, "SuitId");
			record.Count = table.GetInt(i, "Count");
			record.Str = table.GetInt(i, "Str");
			record.Dex = table.GetInt(i, "Dex");
			record.Wit = table.GetInt(i, "Wit");
			record.Vit = table.GetInt(i, "Vit");
			record.AtkMin = table.GetInt(i, "AtkMin");
			record.AtkMax = table.GetInt(i, "AtkMax");
			record.Def = table.GetInt(i, "Def");
			record.Mdef = table.GetInt(i, "Mdef");
			record.MtkMin = table.GetInt(i, "MtkMin");
			record.MtkMax = table.GetInt(i, "MtkMax");
			record.Hp = table.GetInt(i, "Hp");
			record.CrtChance = table.GetInt(i, "CrtChance");
			record.CrtBonus = table.GetInt(i, "CrtBonus");
			record.BrilliantChance = table.GetInt(i, "BrilliantChance");
			record.DefPierce = table.GetInt(i, "DefPierce");
			record.MdefPierce = table.GetInt(i, "MdefPierce");
			record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
			record.DoubleChance = table.GetInt(i, "DoubleChance");
			record.MoveSpeed = table.GetInt(i, "MoveSpeed");
			record.BonusToArmor = table.GetInt(i, "BonusToArmor");
			record.BonusToMonster = table.GetInt(i, "BonusToMonster");
			record.ExpUp = table.GetInt(i, "ExpUp");
			record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
			record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
			record.ReboundDmg = table.GetInt(i, "ReboundDmg");
			record.HpBonus = table.GetInt(i, "HpBonus");
			record.DmgReduce = table.GetInt(i, "DmgReduce");
			record.KillCure = table.GetInt(i, "KillCure");
			record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
			record.MF = table.GetInt(i, "MF");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}