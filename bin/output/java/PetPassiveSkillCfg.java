package com.config;

import java.util.HashMap;

/***
 * PetPassiveSkillTbl.java
 * PetPassiveSkillCfg.java
 *
 * @Author: abaojin
 */
public class PetPassiveSkillTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 技能名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 静态描述
	private string Des;
	
	public string getDes(){
		return Des
	}
	
	public void setDes(string Des){
		this.Des = Des
	}
	
	// 技能图标
	private string Icon;
	
	public string getIcon(){
		return Icon
	}
	
	public void setIcon(string Icon){
		this.Icon = Icon
	}
	
	// 作用效果目标1 主人2 宠物自身
	private int Target;
	
	public int getTarget(){
		return Target
	}
	
	public void setTarget(int Target){
		this.Target = Target
	}
	
	// 力量
	private int Str;
	
	public int getStr(){
		return Str
	}
	
	public void setStr(int Str){
		this.Str = Str
	}
	
	// 升级加值
	private int StrIntensify;
	
	public int getStrIntensify(){
		return StrIntensify
	}
	
	public void setStrIntensify(int StrIntensify){
		this.StrIntensify = StrIntensify
	}
	
	// 敏捷
	private int Dex;
	
	public int getDex(){
		return Dex
	}
	
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	// 升级加值
	private int DexIntensify;
	
	public int getDexIntensify(){
		return DexIntensify
	}
	
	public void setDexIntensify(int DexIntensify){
		this.DexIntensify = DexIntensify
	}
	
	// 智力
	private int Wit;
	
	public int getWit(){
		return Wit
	}
	
	public void setWit(int Wit){
		this.Wit = Wit
	}
	
	// 升级加值
	private int WitIntensify;
	
	public int getWitIntensify(){
		return WitIntensify
	}
	
	public void setWitIntensify(int WitIntensify){
		this.WitIntensify = WitIntensify
	}
	
	// 体力
	private int Vit;
	
	public int getVit(){
		return Vit
	}
	
	public void setVit(int Vit){
		this.Vit = Vit
	}
	
	// 升级加值
	private int VitIntensify;
	
	public int getVitIntensify(){
		return VitIntensify
	}
	
	public void setVitIntensify(int VitIntensify){
		this.VitIntensify = VitIntensify
	}
	
	// 物攻下限
	private int AtkMin;
	
	public int getAtkMin(){
		return AtkMin
	}
	
	public void setAtkMin(int AtkMin){
		this.AtkMin = AtkMin
	}
	
	// 升级加值
	private int AtkMinIntensify;
	
	public int getAtkMinIntensify(){
		return AtkMinIntensify
	}
	
	public void setAtkMinIntensify(int AtkMinIntensify){
		this.AtkMinIntensify = AtkMinIntensify
	}
	
	// 物攻上限
	private int AtkMax;
	
	public int getAtkMax(){
		return AtkMax
	}
	
	public void setAtkMax(int AtkMax){
		this.AtkMax = AtkMax
	}
	
	// 升级加值
	private int AtkMaxIntensify;
	
	public int getAtkMaxIntensify(){
		return AtkMaxIntensify
	}
	
	public void setAtkMaxIntensify(int AtkMaxIntensify){
		this.AtkMaxIntensify = AtkMaxIntensify
	}
	
	// 物理防御
	private int Def;
	
	public int getDef(){
		return Def
	}
	
	public void setDef(int Def){
		this.Def = Def
	}
	
	// 升级加值
	private int DefIntensify;
	
	public int getDefIntensify(){
		return DefIntensify
	}
	
	public void setDefIntensify(int DefIntensify){
		this.DefIntensify = DefIntensify
	}
	
	// 魔法防御
	private int Mdef;
	
	public int getMdef(){
		return Mdef
	}
	
	public void setMdef(int Mdef){
		this.Mdef = Mdef
	}
	
	// 升级加值
	private int MdefIntensify;
	
	public int getMdefIntensify(){
		return MdefIntensify
	}
	
	public void setMdefIntensify(int MdefIntensify){
		this.MdefIntensify = MdefIntensify
	}
	
	// 魔攻下限
	private int MtkMin;
	
	public int getMtkMin(){
		return MtkMin
	}
	
	public void setMtkMin(int MtkMin){
		this.MtkMin = MtkMin
	}
	
	// 升级加值
	private int MtkMinIntensify;
	
	public int getMtkMinIntensify(){
		return MtkMinIntensify
	}
	
	public void setMtkMinIntensify(int MtkMinIntensify){
		this.MtkMinIntensify = MtkMinIntensify
	}
	
	// 魔攻上限
	private int MtkMax;
	
	public int getMtkMax(){
		return MtkMax
	}
	
	public void setMtkMax(int MtkMax){
		this.MtkMax = MtkMax
	}
	
	// 升级加值
	private int MtkMaxIntensify;
	
	public int getMtkMaxIntensify(){
		return MtkMaxIntensify
	}
	
	public void setMtkMaxIntensify(int MtkMaxIntensify){
		this.MtkMaxIntensify = MtkMaxIntensify
	}
	
	// 生命上限
	private int Hp;
	
	public int getHp(){
		return Hp
	}
	
	public void setHp(int Hp){
		this.Hp = Hp
	}
	
	// 升级加值
	private int HpIntensify;
	
	public int getHpIntensify(){
		return HpIntensify
	}
	
	public void setHpIntensify(int HpIntensify){
		this.HpIntensify = HpIntensify
	}
	
	// 幸运一击概率
	private int CrtChance;
	
	public int getCrtChance(){
		return CrtChance
	}
	
	public void setCrtChance(int CrtChance){
		this.CrtChance = CrtChance
	}
	
	// 升级加值
	private int CrtChanceIntensify;
	
	public int getCrtChanceIntensify(){
		return CrtChanceIntensify
	}
	
	public void setCrtChanceIntensify(int CrtChanceIntensify){
		this.CrtChanceIntensify = CrtChanceIntensify
	}
	
	// 幸运一击倍率
	private int CrtBonus;
	
	public int getCrtBonus(){
		return CrtBonus
	}
	
	public void setCrtBonus(int CrtBonus){
		this.CrtBonus = CrtBonus
	}
	
	// 升级加值
	private int CrtBonusIntensify;
	
	public int getCrtBonusIntensify(){
		return CrtBonusIntensify
	}
	
	public void setCrtBonusIntensify(int CrtBonusIntensify){
		this.CrtBonusIntensify = CrtBonusIntensify
	}
	
	// 卓越一击概率
	private int BrilliantChance;
	
	public int getBrilliantChance(){
		return BrilliantChance
	}
	
	public void setBrilliantChance(int BrilliantChance){
		this.BrilliantChance = BrilliantChance
	}
	
	// 升级加值
	private int BrilliantChanceIntensify;
	
	public int getBrilliantChanceIntensify(){
		return BrilliantChanceIntensify
	}
	
	public void setBrilliantChanceIntensify(int BrilliantChanceIntensify){
		this.BrilliantChanceIntensify = BrilliantChanceIntensify
	}
	
	// 物理护甲穿透
	private int DefPierce;
	
	public int getDefPierce(){
		return DefPierce
	}
	
	public void setDefPierce(int DefPierce){
		this.DefPierce = DefPierce
	}
	
	// 升级加值
	private int DefPierceIntensify;
	
	public int getDefPierceIntensify(){
		return DefPierceIntensify
	}
	
	public void setDefPierceIntensify(int DefPierceIntensify){
		this.DefPierceIntensify = DefPierceIntensify
	}
	
	// 魔法护甲穿透
	private int MdefPierce;
	
	public int getMdefPierce(){
		return MdefPierce
	}
	
	public void setMdefPierce(int MdefPierce){
		this.MdefPierce = MdefPierce
	}
	
	// 升级加值
	private int MdefPierceIntensify;
	
	public int getMdefPierceIntensify(){
		return MdefPierceIntensify
	}
	
	public void setMdefPierceIntensify(int MdefPierceIntensify){
		this.MdefPierceIntensify = MdefPierceIntensify
	}
	
	// 无视防御概率
	private int IgnoreAllDef;
	
	public int getIgnoreAllDef(){
		return IgnoreAllDef
	}
	
	public void setIgnoreAllDef(int IgnoreAllDef){
		this.IgnoreAllDef = IgnoreAllDef
	}
	
	// 升级加值
	private int IgnoreAllDefIntensify;
	
	public int getIgnoreAllDefIntensify(){
		return IgnoreAllDefIntensify
	}
	
	public void setIgnoreAllDefIntensify(int IgnoreAllDefIntensify){
		this.IgnoreAllDefIntensify = IgnoreAllDefIntensify
	}
	
	// 双倍伤害概率
	private int DoubleChance;
	
	public int getDoubleChance(){
		return DoubleChance
	}
	
	public void setDoubleChance(int DoubleChance){
		this.DoubleChance = DoubleChance
	}
	
	// 升级加值
	private int DoubleChanceIntensify;
	
	public int getDoubleChanceIntensify(){
		return DoubleChanceIntensify
	}
	
	public void setDoubleChanceIntensify(int DoubleChanceIntensify){
		this.DoubleChanceIntensify = DoubleChanceIntensify
	}
	
	// 移动速度
	private int MoveSpeed;
	
	public int getMoveSpeed(){
		return MoveSpeed
	}
	
	public void setMoveSpeed(int MoveSpeed){
		this.MoveSpeed = MoveSpeed
	}
	
	// 升级加值
	private int MoveSpeedIntensify;
	
	public int getMoveSpeedIntensify(){
		return MoveSpeedIntensify
	}
	
	public void setMoveSpeedIntensify(int MoveSpeedIntensify){
		this.MoveSpeedIntensify = MoveSpeedIntensify
	}
	
	// 对BOSS护甲伤害提升
	private int BonusToArmor;
	
	public int getBonusToArmor(){
		return BonusToArmor
	}
	
	public void setBonusToArmor(int BonusToArmor){
		this.BonusToArmor = BonusToArmor
	}
	
	// 升级加值
	private int BonusToArmorIntensify;
	
	public int getBonusToArmorIntensify(){
		return BonusToArmorIntensify
	}
	
	public void setBonusToArmorIntensify(int BonusToArmorIntensify){
		this.BonusToArmorIntensify = BonusToArmorIntensify
	}
	
	// 对怪物伤害提升
	private int BonusToMonster;
	
	public int getBonusToMonster(){
		return BonusToMonster
	}
	
	public void setBonusToMonster(int BonusToMonster){
		this.BonusToMonster = BonusToMonster
	}
	
	// 升级加值
	private int BonusToMonsterIntensify;
	
	public int getBonusToMonsterIntensify(){
		return BonusToMonsterIntensify
	}
	
	public void setBonusToMonsterIntensify(int BonusToMonsterIntensify){
		this.BonusToMonsterIntensify = BonusToMonsterIntensify
	}
	
	// 经验提升
	private int ExpUp;
	
	public int getExpUp(){
		return ExpUp
	}
	
	public void setExpUp(int ExpUp){
		this.ExpUp = ExpUp
	}
	
	// 升级加值
	private int ExpUpIntensify;
	
	public int getExpUpIntensify(){
		return ExpUpIntensify
	}
	
	public void setExpUpIntensify(int ExpUpIntensify){
		this.ExpUpIntensify = ExpUpIntensify
	}
	
	// 抗幸运一击概率
	private int CrtChanceResist;
	
	public int getCrtChanceResist(){
		return CrtChanceResist
	}
	
	public void setCrtChanceResist(int CrtChanceResist){
		this.CrtChanceResist = CrtChanceResist
	}
	
	// 升级加值
	private int CrtChanceResistIntensify;
	
	public int getCrtChanceResistIntensify(){
		return CrtChanceResistIntensify
	}
	
	public void setCrtChanceResistIntensify(int CrtChanceResistIntensify){
		this.CrtChanceResistIntensify = CrtChanceResistIntensify
	}
	
	// 抗幸运一击伤害
	private int CrtBonusResist;
	
	public int getCrtBonusResist(){
		return CrtBonusResist
	}
	
	public void setCrtBonusResist(int CrtBonusResist){
		this.CrtBonusResist = CrtBonusResist
	}
	
	// 升级加值
	private int CrtBonusResistIntensify;
	
	public int getCrtBonusResistIntensify(){
		return CrtBonusResistIntensify
	}
	
	public void setCrtBonusResistIntensify(int CrtBonusResistIntensify){
		this.CrtBonusResistIntensify = CrtBonusResistIntensify
	}
	
	// 反伤比例
	private int ReboundDmg;
	
	public int getReboundDmg(){
		return ReboundDmg
	}
	
	public void setReboundDmg(int ReboundDmg){
		this.ReboundDmg = ReboundDmg
	}
	
	// 升级加值
	private int ReboundDmgIntensify;
	
	public int getReboundDmgIntensify(){
		return ReboundDmgIntensify
	}
	
	public void setReboundDmgIntensify(int ReboundDmgIntensify){
		this.ReboundDmgIntensify = ReboundDmgIntensify
	}
	
	// 生命值提升百分比
	private int HpBonus;
	
	public int getHpBonus(){
		return HpBonus
	}
	
	public void setHpBonus(int HpBonus){
		this.HpBonus = HpBonus
	}
	
	// 升级加值
	private int HpBonusIntensify;
	
	public int getHpBonusIntensify(){
		return HpBonusIntensify
	}
	
	public void setHpBonusIntensify(int HpBonusIntensify){
		this.HpBonusIntensify = HpBonusIntensify
	}
	
	// 伤害减少百分比
	private int DmgReduce;
	
	public int getDmgReduce(){
		return DmgReduce
	}
	
	public void setDmgReduce(int DmgReduce){
		this.DmgReduce = DmgReduce
	}
	
	// 升级加值
	private int DmgReduceIntensify;
	
	public int getDmgReduceIntensify(){
		return DmgReduceIntensify
	}
	
	public void setDmgReduceIntensify(int DmgReduceIntensify){
		this.DmgReduceIntensify = DmgReduceIntensify
	}
	
	// 击杀怪物后恢复生命
	private int KillCure;
	
	public int getKillCure(){
		return KillCure
	}
	
	public void setKillCure(int KillCure){
		this.KillCure = KillCure
	}
	
	// 升级加值
	private int KillCureIntensify;
	
	public int getKillCureIntensify(){
		return KillCureIntensify
	}
	
	public void setKillCureIntensify(int KillCureIntensify){
		this.KillCureIntensify = KillCureIntensify
	}
	
	// 攻击力增加百分比
	private int AllAtkBonus;
	
	public int getAllAtkBonus(){
		return AllAtkBonus
	}
	
	public void setAllAtkBonus(int AllAtkBonus){
		this.AllAtkBonus = AllAtkBonus
	}
	
	// 升级加值
	private int AllAtkBonusIntensify;
	
	public int getAllAtkBonusIntensify(){
		return AllAtkBonusIntensify
	}
	
	public void setAllAtkBonusIntensify(int AllAtkBonusIntensify){
		this.AllAtkBonusIntensify = AllAtkBonusIntensify
	}
	
	// 掉宝加成值
	private int MF;
	
	public int getMF(){
		return MF
	}
	
	public void setMF(int MF){
		this.MF = MF
	}
	
	// 升级加值
	private int MFIntensify;
	
	public int getMFIntensify(){
		return MFIntensify
	}
	
	public void setMFIntensify(int MFIntensify){
		this.MFIntensify = MFIntensify
	}
	
	// 技能等级基础战斗力, 最终技能战斗力 = BaseBattleScore * 技能等级
	private int BaseBattleScore;
	
	public int getBaseBattleScore(){
		return BaseBattleScore
	}
	
	public void setBaseBattleScore(int BaseBattleScore){
		this.BaseBattleScore = BaseBattleScore
	}
	
	
}

public class PetPassiveSkillCfg
{
	public const string FILENAME = "PetPassiveSkill";
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
			PetPassiveSkillTbl record = new PetPassiveSkillTbl();
			
			record.Name = table.GetString(i, "Name");
			record.Des = table.GetString(i, "Des");
			record.Icon = table.GetString(i, "Icon");
			record.Target = table.GetInt(i, "Target");
			record.Str = table.GetInt(i, "Str");
			record.StrIntensify = table.GetInt(i, "StrIntensify");
			record.Dex = table.GetInt(i, "Dex");
			record.DexIntensify = table.GetInt(i, "DexIntensify");
			record.Wit = table.GetInt(i, "Wit");
			record.WitIntensify = table.GetInt(i, "WitIntensify");
			record.Vit = table.GetInt(i, "Vit");
			record.VitIntensify = table.GetInt(i, "VitIntensify");
			record.AtkMin = table.GetInt(i, "AtkMin");
			record.AtkMinIntensify = table.GetInt(i, "AtkMinIntensify");
			record.AtkMax = table.GetInt(i, "AtkMax");
			record.AtkMaxIntensify = table.GetInt(i, "AtkMaxIntensify");
			record.Def = table.GetInt(i, "Def");
			record.DefIntensify = table.GetInt(i, "DefIntensify");
			record.Mdef = table.GetInt(i, "Mdef");
			record.MdefIntensify = table.GetInt(i, "MdefIntensify");
			record.MtkMin = table.GetInt(i, "MtkMin");
			record.MtkMinIntensify = table.GetInt(i, "MtkMinIntensify");
			record.MtkMax = table.GetInt(i, "MtkMax");
			record.MtkMaxIntensify = table.GetInt(i, "MtkMaxIntensify");
			record.Hp = table.GetInt(i, "Hp");
			record.HpIntensify = table.GetInt(i, "HpIntensify");
			record.CrtChance = table.GetInt(i, "CrtChance");
			record.CrtChanceIntensify = table.GetInt(i, "CrtChanceIntensify");
			record.CrtBonus = table.GetInt(i, "CrtBonus");
			record.CrtBonusIntensify = table.GetInt(i, "CrtBonusIntensify");
			record.BrilliantChance = table.GetInt(i, "BrilliantChance");
			record.BrilliantChanceIntensify = table.GetInt(i, "BrilliantChanceIntensify");
			record.DefPierce = table.GetInt(i, "DefPierce");
			record.DefPierceIntensify = table.GetInt(i, "DefPierceIntensify");
			record.MdefPierce = table.GetInt(i, "MdefPierce");
			record.MdefPierceIntensify = table.GetInt(i, "MdefPierceIntensify");
			record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
			record.IgnoreAllDefIntensify = table.GetInt(i, "IgnoreAllDefIntensify");
			record.DoubleChance = table.GetInt(i, "DoubleChance");
			record.DoubleChanceIntensify = table.GetInt(i, "DoubleChanceIntensify");
			record.MoveSpeed = table.GetInt(i, "MoveSpeed");
			record.MoveSpeedIntensify = table.GetInt(i, "MoveSpeedIntensify");
			record.BonusToArmor = table.GetInt(i, "BonusToArmor");
			record.BonusToArmorIntensify = table.GetInt(i, "BonusToArmorIntensify");
			record.BonusToMonster = table.GetInt(i, "BonusToMonster");
			record.BonusToMonsterIntensify = table.GetInt(i, "BonusToMonsterIntensify");
			record.ExpUp = table.GetInt(i, "ExpUp");
			record.ExpUpIntensify = table.GetInt(i, "ExpUpIntensify");
			record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
			record.CrtChanceResistIntensify = table.GetInt(i, "CrtChanceResistIntensify");
			record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
			record.CrtBonusResistIntensify = table.GetInt(i, "CrtBonusResistIntensify");
			record.ReboundDmg = table.GetInt(i, "ReboundDmg");
			record.ReboundDmgIntensify = table.GetInt(i, "ReboundDmgIntensify");
			record.HpBonus = table.GetInt(i, "HpBonus");
			record.HpBonusIntensify = table.GetInt(i, "HpBonusIntensify");
			record.DmgReduce = table.GetInt(i, "DmgReduce");
			record.DmgReduceIntensify = table.GetInt(i, "DmgReduceIntensify");
			record.KillCure = table.GetInt(i, "KillCure");
			record.KillCureIntensify = table.GetInt(i, "KillCureIntensify");
			record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
			record.AllAtkBonusIntensify = table.GetInt(i, "AllAtkBonusIntensify");
			record.MF = table.GetInt(i, "MF");
			record.MFIntensify = table.GetInt(i, "MFIntensify");
			record.BaseBattleScore = table.GetInt(i, "BaseBattleScore");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}