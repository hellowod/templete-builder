package com.config;

import java.util.HashMap;

/***
 * EquipmentPrototypeTbl.java
 * EquipmentPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class EquipmentPrototypeTbl
{
	// #主键和外键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 程序不用的注释数据
	private string MarkDes;
	
	public string getMarkDes(){
		return MarkDes
	}
	
	public void setMarkDes(string MarkDes){
		this.MarkDes = MarkDes
	}
	
	// 装备模型文件
	private string Model;
	
	public string getModel(){
		return Model
	}
	
	public void setModel(string Model){
		this.Model = Model
	}
	
	// 可穿戴职业枚举
	private string Occupation;
	
	public string getOccupation(){
		return Occupation
	}
	
	public void setOccupation(string Occupation){
		this.Occupation = Occupation
	}
	
	// 装备类型
	private int EquipType;
	
	public int getEquipType(){
		return EquipType
	}
	
	public void setEquipType(int EquipType){
		this.EquipType = EquipType
	}
	
	// 所属套装id
	private int SuitId;
	
	public int getSuitId(){
		return SuitId
	}
	
	public void setSuitId(int SuitId){
		this.SuitId = SuitId
	}
	
	// 装备稀有度下限
	private int RarityMin;
	
	public int getRarityMin(){
		return RarityMin
	}
	
	public void setRarityMin(int RarityMin){
		this.RarityMin = RarityMin
	}
	
	// 装备稀有度上限
	private int RarityMax;
	
	public int getRarityMax(){
		return RarityMax
	}
	
	public void setRarityMax(int RarityMax){
		this.RarityMax = RarityMax
	}
	
	// 是否有红色凹槽
	private int ExistRedGem;
	
	public int getExistRedGem(){
		return ExistRedGem
	}
	
	public void setExistRedGem(int ExistRedGem){
		this.ExistRedGem = ExistRedGem
	}
	
	// 是否有绿色凹槽
	private int ExistGreenGem;
	
	public int getExistGreenGem(){
		return ExistGreenGem
	}
	
	public void setExistGreenGem(int ExistGreenGem){
		this.ExistGreenGem = ExistGreenGem
	}
	
	// 是否有蓝色凹槽
	private int ExistBlueGem;
	
	public int getExistBlueGem(){
		return ExistBlueGem
	}
	
	public void setExistBlueGem(int ExistBlueGem){
		this.ExistBlueGem = ExistBlueGem
	}
	
	// 是否有橙色凹槽
	private int ExistOrangeGem;
	
	public int getExistOrangeGem(){
		return ExistOrangeGem
	}
	
	public void setExistOrangeGem(int ExistOrangeGem){
		this.ExistOrangeGem = ExistOrangeGem
	}
	
	// 力量
	private int Str;
	
	public int getStr(){
		return Str
	}
	
	public void setStr(int Str){
		this.Str = Str
	}
	
	// 智力
	private int Wit;
	
	public int getWit(){
		return Wit
	}
	
	public void setWit(int Wit){
		this.Wit = Wit
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
	
	// 攻击力增加百分比
	private int AllAtkBonus;
	
	public int getAllAtkBonus(){
		return AllAtkBonus
	}
	
	public void setAllAtkBonus(int AllAtkBonus){
		this.AllAtkBonus = AllAtkBonus
	}
	
	// 敏捷
	private int Dex;
	
	public int getDex(){
		return Dex
	}
	
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	// 体力
	private int Vit;
	
	public int getVit(){
		return Vit
	}
	
	public void setVit(int Vit){
		this.Vit = Vit
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
	
	// 生命值上限
	private int Hp;
	
	public int getHp(){
		return Hp
	}
	
	public void setHp(int Hp){
		this.Hp = Hp
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
	
	// 移动速度
	private int MoveSpeed;
	
	public int getMoveSpeed(){
		return MoveSpeed
	}
	
	public void setMoveSpeed(int MoveSpeed){
		this.MoveSpeed = MoveSpeed
	}
	
	// 反伤比例
	private int ReboundDmg;
	
	public int getReboundDmg(){
		return ReboundDmg
	}
	
	public void setReboundDmg(int ReboundDmg){
		this.ReboundDmg = ReboundDmg
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
	
	// 击杀怪物后恢复生命
	private int KillCure;
	
	public int getKillCure(){
		return KillCure
	}
	
	public void setKillCure(int KillCure){
		this.KillCure = KillCure
	}
	
	// 掉宝加成值
	private int MF;
	
	public int getMF(){
		return MF
	}
	
	public void setMF(int MF){
		this.MF = MF
	}
	
	// 力量强化值
	private int StrIntensify;
	
	public int getStrIntensify(){
		return StrIntensify
	}
	
	public void setStrIntensify(int StrIntensify){
		this.StrIntensify = StrIntensify
	}
	
	// 智力强化值
	private int WitIntensify;
	
	public int getWitIntensify(){
		return WitIntensify
	}
	
	public void setWitIntensify(int WitIntensify){
		this.WitIntensify = WitIntensify
	}
	
	// 物攻下限强化值
	private int AtkMinIntensify;
	
	public int getAtkMinIntensify(){
		return AtkMinIntensify
	}
	
	public void setAtkMinIntensify(int AtkMinIntensify){
		this.AtkMinIntensify = AtkMinIntensify
	}
	
	// 物攻上限强化值
	private int AtkMaxIntensify;
	
	public int getAtkMaxIntensify(){
		return AtkMaxIntensify
	}
	
	public void setAtkMaxIntensify(int AtkMaxIntensify){
		this.AtkMaxIntensify = AtkMaxIntensify
	}
	
	// 魔攻下限强化值
	private int MtkMinIntensify;
	
	public int getMtkMinIntensify(){
		return MtkMinIntensify
	}
	
	public void setMtkMinIntensify(int MtkMinIntensify){
		this.MtkMinIntensify = MtkMinIntensify
	}
	
	// 魔攻上限强化值
	private int MtkMaxIntensify;
	
	public int getMtkMaxIntensify(){
		return MtkMaxIntensify
	}
	
	public void setMtkMaxIntensify(int MtkMaxIntensify){
		this.MtkMaxIntensify = MtkMaxIntensify
	}
	
	// 幸运一击概率/10000强化值
	private int CrtChanceIntensify;
	
	public int getCrtChanceIntensify(){
		return CrtChanceIntensify
	}
	
	public void setCrtChanceIntensify(int CrtChanceIntensify){
		this.CrtChanceIntensify = CrtChanceIntensify
	}
	
	// 幸运一击倍率强化值
	private int CrtBonusIntensify;
	
	public int getCrtBonusIntensify(){
		return CrtBonusIntensify
	}
	
	public void setCrtBonusIntensify(int CrtBonusIntensify){
		this.CrtBonusIntensify = CrtBonusIntensify
	}
	
	// 卓越一击概率/10000强化值
	private int BrilliantChanceIntensify;
	
	public int getBrilliantChanceIntensify(){
		return BrilliantChanceIntensify
	}
	
	public void setBrilliantChanceIntensify(int BrilliantChanceIntensify){
		this.BrilliantChanceIntensify = BrilliantChanceIntensify
	}
	
	// 物理护甲穿透强化值
	private int DefPierceIntensify;
	
	public int getDefPierceIntensify(){
		return DefPierceIntensify
	}
	
	public void setDefPierceIntensify(int DefPierceIntensify){
		this.DefPierceIntensify = DefPierceIntensify
	}
	
	// 魔法护甲穿透强化值
	private int MdefPierceIntensify;
	
	public int getMdefPierceIntensify(){
		return MdefPierceIntensify
	}
	
	public void setMdefPierceIntensify(int MdefPierceIntensify){
		this.MdefPierceIntensify = MdefPierceIntensify
	}
	
	// 无视防御概率强化值
	private int IgnoreAllDefIntensify;
	
	public int getIgnoreAllDefIntensify(){
		return IgnoreAllDefIntensify
	}
	
	public void setIgnoreAllDefIntensify(int IgnoreAllDefIntensify){
		this.IgnoreAllDefIntensify = IgnoreAllDefIntensify
	}
	
	// 双倍伤害概率强化值
	private int DoubleChanceIntensify;
	
	public int getDoubleChanceIntensify(){
		return DoubleChanceIntensify
	}
	
	public void setDoubleChanceIntensify(int DoubleChanceIntensify){
		this.DoubleChanceIntensify = DoubleChanceIntensify
	}
	
	// 攻击力增加百分比强化值
	private int AllAtkBonusIntensify;
	
	public int getAllAtkBonusIntensify(){
		return AllAtkBonusIntensify
	}
	
	public void setAllAtkBonusIntensify(int AllAtkBonusIntensify){
		this.AllAtkBonusIntensify = AllAtkBonusIntensify
	}
	
	// 敏捷强化值
	private int DexIntensify;
	
	public int getDexIntensify(){
		return DexIntensify
	}
	
	public void setDexIntensify(int DexIntensify){
		this.DexIntensify = DexIntensify
	}
	
	// 体力强化值
	private int VitIntensify;
	
	public int getVitIntensify(){
		return VitIntensify
	}
	
	public void setVitIntensify(int VitIntensify){
		this.VitIntensify = VitIntensify
	}
	
	// 物理防御强化值
	private int DefIntensify;
	
	public int getDefIntensify(){
		return DefIntensify
	}
	
	public void setDefIntensify(int DefIntensify){
		this.DefIntensify = DefIntensify
	}
	
	// 魔法防御强化值
	private int MdefIntensify;
	
	public int getMdefIntensify(){
		return MdefIntensify
	}
	
	public void setMdefIntensify(int MdefIntensify){
		this.MdefIntensify = MdefIntensify
	}
	
	// 生命上限强化值
	private int HpIntensify;
	
	public int getHpIntensify(){
		return HpIntensify
	}
	
	public void setHpIntensify(int HpIntensify){
		this.HpIntensify = HpIntensify
	}
	
	// 抗幸运一击概率强化值
	private int CrtChanceResistIntensify;
	
	public int getCrtChanceResistIntensify(){
		return CrtChanceResistIntensify
	}
	
	public void setCrtChanceResistIntensify(int CrtChanceResistIntensify){
		this.CrtChanceResistIntensify = CrtChanceResistIntensify
	}
	
	// 抗幸运一击伤害强化值
	private int CrtBonusResistIntensify;
	
	public int getCrtBonusResistIntensify(){
		return CrtBonusResistIntensify
	}
	
	public void setCrtBonusResistIntensify(int CrtBonusResistIntensify){
		this.CrtBonusResistIntensify = CrtBonusResistIntensify
	}
	
	// 生命值提升百分比强化值
	private int HpBonusIntensify;
	
	public int getHpBonusIntensify(){
		return HpBonusIntensify
	}
	
	public void setHpBonusIntensify(int HpBonusIntensify){
		this.HpBonusIntensify = HpBonusIntensify
	}
	
	// 伤害减少百分比强化值
	private int DmgReduceIntensify;
	
	public int getDmgReduceIntensify(){
		return DmgReduceIntensify
	}
	
	public void setDmgReduceIntensify(int DmgReduceIntensify){
		this.DmgReduceIntensify = DmgReduceIntensify
	}
	
	// 移动速度强化值
	private int MoveSpeedIntensify;
	
	public int getMoveSpeedIntensify(){
		return MoveSpeedIntensify
	}
	
	public void setMoveSpeedIntensify(int MoveSpeedIntensify){
		this.MoveSpeedIntensify = MoveSpeedIntensify
	}
	
	// 反伤比例强化值
	private int ReboundDmgIntensify;
	
	public int getReboundDmgIntensify(){
		return ReboundDmgIntensify
	}
	
	public void setReboundDmgIntensify(int ReboundDmgIntensify){
		this.ReboundDmgIntensify = ReboundDmgIntensify
	}
	
	// 对BOSS护甲伤害提升强化值
	private int BonusToArmorIntensify;
	
	public int getBonusToArmorIntensify(){
		return BonusToArmorIntensify
	}
	
	public void setBonusToArmorIntensify(int BonusToArmorIntensify){
		this.BonusToArmorIntensify = BonusToArmorIntensify
	}
	
	// 对怪物伤害提升强化值
	private int BonusToMonsterIntensify;
	
	public int getBonusToMonsterIntensify(){
		return BonusToMonsterIntensify
	}
	
	public void setBonusToMonsterIntensify(int BonusToMonsterIntensify){
		this.BonusToMonsterIntensify = BonusToMonsterIntensify
	}
	
	// 经验提升强化值
	private int ExpUpIntensify;
	
	public int getExpUpIntensify(){
		return ExpUpIntensify
	}
	
	public void setExpUpIntensify(int ExpUpIntensify){
		this.ExpUpIntensify = ExpUpIntensify
	}
	
	// 击杀怪物后恢复生命强化值
	private int KillCureIntensify;
	
	public int getKillCureIntensify(){
		return KillCureIntensify
	}
	
	public void setKillCureIntensify(int KillCureIntensify){
		this.KillCureIntensify = KillCureIntensify
	}
	
	// 掉宝加成值强化值
	private int MFIntensify;
	
	public int getMFIntensify(){
		return MFIntensify
	}
	
	public void setMFIntensify(int MFIntensify){
		this.MFIntensify = MFIntensify
	}
	
	// 流光ID组(ID不能为0)如n,则n至n+13表示该装备的+0至+13的流光效果数据的id
	private int StreamLightId;
	
	public int getStreamLightId(){
		return StreamLightId
	}
	
	public void setStreamLightId(int StreamLightId){
		this.StreamLightId = StreamLightId
	}
	
	
}

public class EquipmentPrototypeCfg
{
	public const string FILENAME = "EquipmentPrototype";
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
			EquipmentPrototypeTbl record = new EquipmentPrototypeTbl();
			
			record.MarkDes = table.GetString(i, "MarkDes");
			record.Model = table.GetString(i, "Model");
			record.Occupation = table.GetString(i, "Occupation");
			record.EquipType = table.GetInt(i, "EquipType");
			record.SuitId = table.GetInt(i, "SuitId");
			record.RarityMin = table.GetInt(i, "RarityMin");
			record.RarityMax = table.GetInt(i, "RarityMax");
			record.ExistRedGem = table.GetInt(i, "ExistRedGem");
			record.ExistGreenGem = table.GetInt(i, "ExistGreenGem");
			record.ExistBlueGem = table.GetInt(i, "ExistBlueGem");
			record.ExistOrangeGem = table.GetInt(i, "ExistOrangeGem");
			record.Str = table.GetInt(i, "Str");
			record.Wit = table.GetInt(i, "Wit");
			record.AtkMin = table.GetInt(i, "AtkMin");
			record.AtkMax = table.GetInt(i, "AtkMax");
			record.MtkMin = table.GetInt(i, "MtkMin");
			record.MtkMax = table.GetInt(i, "MtkMax");
			record.CrtChance = table.GetInt(i, "CrtChance");
			record.CrtBonus = table.GetInt(i, "CrtBonus");
			record.BrilliantChance = table.GetInt(i, "BrilliantChance");
			record.DefPierce = table.GetInt(i, "DefPierce");
			record.MdefPierce = table.GetInt(i, "MdefPierce");
			record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
			record.DoubleChance = table.GetInt(i, "DoubleChance");
			record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
			record.Dex = table.GetInt(i, "Dex");
			record.Vit = table.GetInt(i, "Vit");
			record.Def = table.GetInt(i, "Def");
			record.Mdef = table.GetInt(i, "Mdef");
			record.Hp = table.GetInt(i, "Hp");
			record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
			record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
			record.HpBonus = table.GetInt(i, "HpBonus");
			record.DmgReduce = table.GetInt(i, "DmgReduce");
			record.MoveSpeed = table.GetInt(i, "MoveSpeed");
			record.ReboundDmg = table.GetInt(i, "ReboundDmg");
			record.BonusToArmor = table.GetInt(i, "BonusToArmor");
			record.BonusToMonster = table.GetInt(i, "BonusToMonster");
			record.ExpUp = table.GetInt(i, "ExpUp");
			record.KillCure = table.GetInt(i, "KillCure");
			record.MF = table.GetInt(i, "MF");
			record.StrIntensify = table.GetInt(i, "StrIntensify");
			record.WitIntensify = table.GetInt(i, "WitIntensify");
			record.AtkMinIntensify = table.GetInt(i, "AtkMinIntensify");
			record.AtkMaxIntensify = table.GetInt(i, "AtkMaxIntensify");
			record.MtkMinIntensify = table.GetInt(i, "MtkMinIntensify");
			record.MtkMaxIntensify = table.GetInt(i, "MtkMaxIntensify");
			record.CrtChanceIntensify = table.GetInt(i, "CrtChanceIntensify");
			record.CrtBonusIntensify = table.GetInt(i, "CrtBonusIntensify");
			record.BrilliantChanceIntensify = table.GetInt(i, "BrilliantChanceIntensify");
			record.DefPierceIntensify = table.GetInt(i, "DefPierceIntensify");
			record.MdefPierceIntensify = table.GetInt(i, "MdefPierceIntensify");
			record.IgnoreAllDefIntensify = table.GetInt(i, "IgnoreAllDefIntensify");
			record.DoubleChanceIntensify = table.GetInt(i, "DoubleChanceIntensify");
			record.AllAtkBonusIntensify = table.GetInt(i, "AllAtkBonusIntensify");
			record.DexIntensify = table.GetInt(i, "DexIntensify");
			record.VitIntensify = table.GetInt(i, "VitIntensify");
			record.DefIntensify = table.GetInt(i, "DefIntensify");
			record.MdefIntensify = table.GetInt(i, "MdefIntensify");
			record.HpIntensify = table.GetInt(i, "HpIntensify");
			record.CrtChanceResistIntensify = table.GetInt(i, "CrtChanceResistIntensify");
			record.CrtBonusResistIntensify = table.GetInt(i, "CrtBonusResistIntensify");
			record.HpBonusIntensify = table.GetInt(i, "HpBonusIntensify");
			record.DmgReduceIntensify = table.GetInt(i, "DmgReduceIntensify");
			record.MoveSpeedIntensify = table.GetInt(i, "MoveSpeedIntensify");
			record.ReboundDmgIntensify = table.GetInt(i, "ReboundDmgIntensify");
			record.BonusToArmorIntensify = table.GetInt(i, "BonusToArmorIntensify");
			record.BonusToMonsterIntensify = table.GetInt(i, "BonusToMonsterIntensify");
			record.ExpUpIntensify = table.GetInt(i, "ExpUpIntensify");
			record.KillCureIntensify = table.GetInt(i, "KillCureIntensify");
			record.MFIntensify = table.GetInt(i, "MFIntensify");
			record.StreamLightId = table.GetInt(i, "StreamLightId");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}