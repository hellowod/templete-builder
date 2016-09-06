package com.config;

import java.util.HashMap;

/***
 * SummonMonsterTbl.java
 * SummonMonsterCfg.java
 *
 * @Author: abaojin
 */
public class SummonMonsterTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 召唤物名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 怪物伤害类型1物理2魔法
	private int DamageType;
	
	public int getDamageType(){
		return DamageType
	}
	
	public void setDamageType(int DamageType){
		this.DamageType = DamageType
	}
	
	// 模型文件路径
	private string Model;
	
	public string getModel(){
		return Model
	}
	
	public void setModel(string Model){
		this.Model = Model
	}
	
	// 召唤物拥有的技能
	private int SkillId;
	
	public int getSkillId(){
		return SkillId
	}
	
	public void setSkillId(int SkillId){
		this.SkillId = SkillId
	}
	
	// 死亡效果（没有为空）
	private string DeadEffect;
	
	public string getDeadEffect(){
		return DeadEffect
	}
	
	public void setDeadEffect(string DeadEffect){
		this.DeadEffect = DeadEffect
	}
	
	// 死亡音效（音效表ID）
	private int DeadSound;
	
	public int getDeadSound(){
		return DeadSound
	}
	
	public void setDeadSound(int DeadSound){
		this.DeadSound = DeadSound
	}
	
	// 攻击音效（音效表ID）
	private int AttackSound;
	
	public int getAttackSound(){
		return AttackSound
	}
	
	public void setAttackSound(int AttackSound){
		this.AttackSound = AttackSound
	}
	
	// 待机音效（音效表ID）
	private int WaitSound;
	
	public int getWaitSound(){
		return WaitSound
	}
	
	public void setWaitSound(int WaitSound){
		this.WaitSound = WaitSound
	}
	
	// 被击音效(音效ID)
	private int HitSound;
	
	public int getHitSound(){
		return HitSound
	}
	
	public void setHitSound(int HitSound){
		this.HitSound = HitSound
	}
	
	// 力量
	private int Str;
	
	public int getStr(){
		return Str
	}
	
	public void setStr(int Str){
		this.Str = Str
	}
	
	// 等级加值
	private int StrLevelup;
	
	public int getStrLevelup(){
		return StrLevelup
	}
	
	public void setStrLevelup(int StrLevelup){
		this.StrLevelup = StrLevelup
	}
	
	// 敏捷
	private int Dex;
	
	public int getDex(){
		return Dex
	}
	
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	// 等级加值
	private int DexLevelup;
	
	public int getDexLevelup(){
		return DexLevelup
	}
	
	public void setDexLevelup(int DexLevelup){
		this.DexLevelup = DexLevelup
	}
	
	// 智力
	private int Wit;
	
	public int getWit(){
		return Wit
	}
	
	public void setWit(int Wit){
		this.Wit = Wit
	}
	
	// 等级加值
	private int WitLevelup;
	
	public int getWitLevelup(){
		return WitLevelup
	}
	
	public void setWitLevelup(int WitLevelup){
		this.WitLevelup = WitLevelup
	}
	
	// 体力
	private int Vit;
	
	public int getVit(){
		return Vit
	}
	
	public void setVit(int Vit){
		this.Vit = Vit
	}
	
	// 等级加值
	private int VitLevelup;
	
	public int getVitLevelup(){
		return VitLevelup
	}
	
	public void setVitLevelup(int VitLevelup){
		this.VitLevelup = VitLevelup
	}
	
	// 物攻下限
	private int AtkMin;
	
	public int getAtkMin(){
		return AtkMin
	}
	
	public void setAtkMin(int AtkMin){
		this.AtkMin = AtkMin
	}
	
	// 等级加值
	private int AtkMinLevelup;
	
	public int getAtkMinLevelup(){
		return AtkMinLevelup
	}
	
	public void setAtkMinLevelup(int AtkMinLevelup){
		this.AtkMinLevelup = AtkMinLevelup
	}
	
	// 物攻上限
	private int AtkMax;
	
	public int getAtkMax(){
		return AtkMax
	}
	
	public void setAtkMax(int AtkMax){
		this.AtkMax = AtkMax
	}
	
	// 等级加值
	private int AtkMaxLevelup;
	
	public int getAtkMaxLevelup(){
		return AtkMaxLevelup
	}
	
	public void setAtkMaxLevelup(int AtkMaxLevelup){
		this.AtkMaxLevelup = AtkMaxLevelup
	}
	
	// 物理防御
	private int Def;
	
	public int getDef(){
		return Def
	}
	
	public void setDef(int Def){
		this.Def = Def
	}
	
	// 等级加值
	private int DefLevelup;
	
	public int getDefLevelup(){
		return DefLevelup
	}
	
	public void setDefLevelup(int DefLevelup){
		this.DefLevelup = DefLevelup
	}
	
	// 魔法防御
	private int Mdef;
	
	public int getMdef(){
		return Mdef
	}
	
	public void setMdef(int Mdef){
		this.Mdef = Mdef
	}
	
	// 等级加值
	private int MdefLevelup;
	
	public int getMdefLevelup(){
		return MdefLevelup
	}
	
	public void setMdefLevelup(int MdefLevelup){
		this.MdefLevelup = MdefLevelup
	}
	
	// 魔攻下限
	private int MtkMin;
	
	public int getMtkMin(){
		return MtkMin
	}
	
	public void setMtkMin(int MtkMin){
		this.MtkMin = MtkMin
	}
	
	// 等级加值
	private int MtkMinLevelup;
	
	public int getMtkMinLevelup(){
		return MtkMinLevelup
	}
	
	public void setMtkMinLevelup(int MtkMinLevelup){
		this.MtkMinLevelup = MtkMinLevelup
	}
	
	// 魔攻上限
	private int MtkMax;
	
	public int getMtkMax(){
		return MtkMax
	}
	
	public void setMtkMax(int MtkMax){
		this.MtkMax = MtkMax
	}
	
	// 等级加值
	private int MtkMaxLevelup;
	
	public int getMtkMaxLevelup(){
		return MtkMaxLevelup
	}
	
	public void setMtkMaxLevelup(int MtkMaxLevelup){
		this.MtkMaxLevelup = MtkMaxLevelup
	}
	
	// 生命上限
	private int Hp;
	
	public int getHp(){
		return Hp
	}
	
	public void setHp(int Hp){
		this.Hp = Hp
	}
	
	// 等级加值
	private int HpLevelup;
	
	public int getHpLevelup(){
		return HpLevelup
	}
	
	public void setHpLevelup(int HpLevelup){
		this.HpLevelup = HpLevelup
	}
	
	// 幸运一击概率
	private int CrtChance;
	
	public int getCrtChance(){
		return CrtChance
	}
	
	public void setCrtChance(int CrtChance){
		this.CrtChance = CrtChance
	}
	
	// 等级加值
	private int CrtChanceLevelup;
	
	public int getCrtChanceLevelup(){
		return CrtChanceLevelup
	}
	
	public void setCrtChanceLevelup(int CrtChanceLevelup){
		this.CrtChanceLevelup = CrtChanceLevelup
	}
	
	// 幸运一击倍率
	private int CrtBonus;
	
	public int getCrtBonus(){
		return CrtBonus
	}
	
	public void setCrtBonus(int CrtBonus){
		this.CrtBonus = CrtBonus
	}
	
	// 等级加值
	private int CrtBonusLevelup;
	
	public int getCrtBonusLevelup(){
		return CrtBonusLevelup
	}
	
	public void setCrtBonusLevelup(int CrtBonusLevelup){
		this.CrtBonusLevelup = CrtBonusLevelup
	}
	
	// 卓越一击概率
	private int BrilliantChance;
	
	public int getBrilliantChance(){
		return BrilliantChance
	}
	
	public void setBrilliantChance(int BrilliantChance){
		this.BrilliantChance = BrilliantChance
	}
	
	// 等级加值
	private int BrilliantChanceLevelup;
	
	public int getBrilliantChanceLevelup(){
		return BrilliantChanceLevelup
	}
	
	public void setBrilliantChanceLevelup(int BrilliantChanceLevelup){
		this.BrilliantChanceLevelup = BrilliantChanceLevelup
	}
	
	// 物理护甲穿透
	private int DefPierce;
	
	public int getDefPierce(){
		return DefPierce
	}
	
	public void setDefPierce(int DefPierce){
		this.DefPierce = DefPierce
	}
	
	// 等级加值
	private int DefPierceLevelup;
	
	public int getDefPierceLevelup(){
		return DefPierceLevelup
	}
	
	public void setDefPierceLevelup(int DefPierceLevelup){
		this.DefPierceLevelup = DefPierceLevelup
	}
	
	// 魔法护甲穿透
	private int MdefPierce;
	
	public int getMdefPierce(){
		return MdefPierce
	}
	
	public void setMdefPierce(int MdefPierce){
		this.MdefPierce = MdefPierce
	}
	
	// 等级加值
	private int MdefPierceLevelup;
	
	public int getMdefPierceLevelup(){
		return MdefPierceLevelup
	}
	
	public void setMdefPierceLevelup(int MdefPierceLevelup){
		this.MdefPierceLevelup = MdefPierceLevelup
	}
	
	// 无视防御概率
	private int IgnoreAllDef;
	
	public int getIgnoreAllDef(){
		return IgnoreAllDef
	}
	
	public void setIgnoreAllDef(int IgnoreAllDef){
		this.IgnoreAllDef = IgnoreAllDef
	}
	
	// 等级加值
	private int IgnoreAllDefLevelup;
	
	public int getIgnoreAllDefLevelup(){
		return IgnoreAllDefLevelup
	}
	
	public void setIgnoreAllDefLevelup(int IgnoreAllDefLevelup){
		this.IgnoreAllDefLevelup = IgnoreAllDefLevelup
	}
	
	// 双倍伤害概率
	private int DoubleChance;
	
	public int getDoubleChance(){
		return DoubleChance
	}
	
	public void setDoubleChance(int DoubleChance){
		this.DoubleChance = DoubleChance
	}
	
	// 等级加值
	private int DoubleChanceLevelup;
	
	public int getDoubleChanceLevelup(){
		return DoubleChanceLevelup
	}
	
	public void setDoubleChanceLevelup(int DoubleChanceLevelup){
		this.DoubleChanceLevelup = DoubleChanceLevelup
	}
	
	// 移动速度
	private int MoveSpeed;
	
	public int getMoveSpeed(){
		return MoveSpeed
	}
	
	public void setMoveSpeed(int MoveSpeed){
		this.MoveSpeed = MoveSpeed
	}
	
	// 等级加值
	private int MoveSpeedLevelup;
	
	public int getMoveSpeedLevelup(){
		return MoveSpeedLevelup
	}
	
	public void setMoveSpeedLevelup(int MoveSpeedLevelup){
		this.MoveSpeedLevelup = MoveSpeedLevelup
	}
	
	// 对BOSS护甲伤害提升
	private int BonusToArmor;
	
	public int getBonusToArmor(){
		return BonusToArmor
	}
	
	public void setBonusToArmor(int BonusToArmor){
		this.BonusToArmor = BonusToArmor
	}
	
	// 等级加值
	private int BonusToArmorLevelup;
	
	public int getBonusToArmorLevelup(){
		return BonusToArmorLevelup
	}
	
	public void setBonusToArmorLevelup(int BonusToArmorLevelup){
		this.BonusToArmorLevelup = BonusToArmorLevelup
	}
	
	// 对怪物伤害提升
	private int BonusToMonster;
	
	public int getBonusToMonster(){
		return BonusToMonster
	}
	
	public void setBonusToMonster(int BonusToMonster){
		this.BonusToMonster = BonusToMonster
	}
	
	// 等级加值
	private int BonusToMonsterLevelup;
	
	public int getBonusToMonsterLevelup(){
		return BonusToMonsterLevelup
	}
	
	public void setBonusToMonsterLevelup(int BonusToMonsterLevelup){
		this.BonusToMonsterLevelup = BonusToMonsterLevelup
	}
	
	// 经验提升
	private int ExpUp;
	
	public int getExpUp(){
		return ExpUp
	}
	
	public void setExpUp(int ExpUp){
		this.ExpUp = ExpUp
	}
	
	// 等级加值
	private int ExpUpLevelup;
	
	public int getExpUpLevelup(){
		return ExpUpLevelup
	}
	
	public void setExpUpLevelup(int ExpUpLevelup){
		this.ExpUpLevelup = ExpUpLevelup
	}
	
	// 抗幸运一击概率
	private int CrtChanceResist;
	
	public int getCrtChanceResist(){
		return CrtChanceResist
	}
	
	public void setCrtChanceResist(int CrtChanceResist){
		this.CrtChanceResist = CrtChanceResist
	}
	
	// 等级加值
	private int CrtChanceResistLevelup;
	
	public int getCrtChanceResistLevelup(){
		return CrtChanceResistLevelup
	}
	
	public void setCrtChanceResistLevelup(int CrtChanceResistLevelup){
		this.CrtChanceResistLevelup = CrtChanceResistLevelup
	}
	
	// 抗幸运一击伤害
	private int CrtBonusResist;
	
	public int getCrtBonusResist(){
		return CrtBonusResist
	}
	
	public void setCrtBonusResist(int CrtBonusResist){
		this.CrtBonusResist = CrtBonusResist
	}
	
	// 等级加值
	private int CrtBonusResistLevelup;
	
	public int getCrtBonusResistLevelup(){
		return CrtBonusResistLevelup
	}
	
	public void setCrtBonusResistLevelup(int CrtBonusResistLevelup){
		this.CrtBonusResistLevelup = CrtBonusResistLevelup
	}
	
	// 反伤比例
	private int ReboundDmg;
	
	public int getReboundDmg(){
		return ReboundDmg
	}
	
	public void setReboundDmg(int ReboundDmg){
		this.ReboundDmg = ReboundDmg
	}
	
	// 等级加值
	private int ReboundDmgLevelup;
	
	public int getReboundDmgLevelup(){
		return ReboundDmgLevelup
	}
	
	public void setReboundDmgLevelup(int ReboundDmgLevelup){
		this.ReboundDmgLevelup = ReboundDmgLevelup
	}
	
	// 生命值提升百分比
	private int HpBonus;
	
	public int getHpBonus(){
		return HpBonus
	}
	
	public void setHpBonus(int HpBonus){
		this.HpBonus = HpBonus
	}
	
	// 等级加值
	private int HpBonusLevelup;
	
	public int getHpBonusLevelup(){
		return HpBonusLevelup
	}
	
	public void setHpBonusLevelup(int HpBonusLevelup){
		this.HpBonusLevelup = HpBonusLevelup
	}
	
	// 伤害减少百分比
	private int DmgReduce;
	
	public int getDmgReduce(){
		return DmgReduce
	}
	
	public void setDmgReduce(int DmgReduce){
		this.DmgReduce = DmgReduce
	}
	
	// 等级加值
	private int DmgReduceLevelup;
	
	public int getDmgReduceLevelup(){
		return DmgReduceLevelup
	}
	
	public void setDmgReduceLevelup(int DmgReduceLevelup){
		this.DmgReduceLevelup = DmgReduceLevelup
	}
	
	// 击杀怪物后恢复生命
	private int KillCure;
	
	public int getKillCure(){
		return KillCure
	}
	
	public void setKillCure(int KillCure){
		this.KillCure = KillCure
	}
	
	// 等级加值
	private int KillCureLevelup;
	
	public int getKillCureLevelup(){
		return KillCureLevelup
	}
	
	public void setKillCureLevelup(int KillCureLevelup){
		this.KillCureLevelup = KillCureLevelup
	}
	
	// 攻击力增加百分比
	private int AllAtkBonus;
	
	public int getAllAtkBonus(){
		return AllAtkBonus
	}
	
	public void setAllAtkBonus(int AllAtkBonus){
		this.AllAtkBonus = AllAtkBonus
	}
	
	// 等级加值
	private int AllAtkBonusLevelup;
	
	public int getAllAtkBonusLevelup(){
		return AllAtkBonusLevelup
	}
	
	public void setAllAtkBonusLevelup(int AllAtkBonusLevelup){
		this.AllAtkBonusLevelup = AllAtkBonusLevelup
	}
	
	// 掉宝加成值
	private int MF;
	
	public int getMF(){
		return MF
	}
	
	public void setMF(int MF){
		this.MF = MF
	}
	
	// 等级加值
	private int MFLevelup;
	
	public int getMFLevelup(){
		return MFLevelup
	}
	
	public void setMFLevelup(int MFLevelup){
		this.MFLevelup = MFLevelup
	}
	
	
}

public class SummonMonsterCfg
{
	public const string FILENAME = "SummonMonster";
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
			SummonMonsterTbl record = new SummonMonsterTbl();
			
			record.Name = table.GetString(i, "Name");
			record.DamageType = table.GetInt(i, "DamageType");
			record.Model = table.GetString(i, "Model");
			record.SkillId = table.GetInt(i, "SkillId");
			record.DeadEffect = table.GetString(i, "DeadEffect");
			record.DeadSound = table.GetInt(i, "DeadSound");
			record.AttackSound = table.GetInt(i, "AttackSound");
			record.WaitSound = table.GetInt(i, "WaitSound");
			record.HitSound = table.GetInt(i, "HitSound");
			record.Str = table.GetInt(i, "Str");
			record.StrLevelup = table.GetInt(i, "StrLevelup");
			record.Dex = table.GetInt(i, "Dex");
			record.DexLevelup = table.GetInt(i, "DexLevelup");
			record.Wit = table.GetInt(i, "Wit");
			record.WitLevelup = table.GetInt(i, "WitLevelup");
			record.Vit = table.GetInt(i, "Vit");
			record.VitLevelup = table.GetInt(i, "VitLevelup");
			record.AtkMin = table.GetInt(i, "AtkMin");
			record.AtkMinLevelup = table.GetInt(i, "AtkMinLevelup");
			record.AtkMax = table.GetInt(i, "AtkMax");
			record.AtkMaxLevelup = table.GetInt(i, "AtkMaxLevelup");
			record.Def = table.GetInt(i, "Def");
			record.DefLevelup = table.GetInt(i, "DefLevelup");
			record.Mdef = table.GetInt(i, "Mdef");
			record.MdefLevelup = table.GetInt(i, "MdefLevelup");
			record.MtkMin = table.GetInt(i, "MtkMin");
			record.MtkMinLevelup = table.GetInt(i, "MtkMinLevelup");
			record.MtkMax = table.GetInt(i, "MtkMax");
			record.MtkMaxLevelup = table.GetInt(i, "MtkMaxLevelup");
			record.Hp = table.GetInt(i, "Hp");
			record.HpLevelup = table.GetInt(i, "HpLevelup");
			record.CrtChance = table.GetInt(i, "CrtChance");
			record.CrtChanceLevelup = table.GetInt(i, "CrtChanceLevelup");
			record.CrtBonus = table.GetInt(i, "CrtBonus");
			record.CrtBonusLevelup = table.GetInt(i, "CrtBonusLevelup");
			record.BrilliantChance = table.GetInt(i, "BrilliantChance");
			record.BrilliantChanceLevelup = table.GetInt(i, "BrilliantChanceLevelup");
			record.DefPierce = table.GetInt(i, "DefPierce");
			record.DefPierceLevelup = table.GetInt(i, "DefPierceLevelup");
			record.MdefPierce = table.GetInt(i, "MdefPierce");
			record.MdefPierceLevelup = table.GetInt(i, "MdefPierceLevelup");
			record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
			record.IgnoreAllDefLevelup = table.GetInt(i, "IgnoreAllDefLevelup");
			record.DoubleChance = table.GetInt(i, "DoubleChance");
			record.DoubleChanceLevelup = table.GetInt(i, "DoubleChanceLevelup");
			record.MoveSpeed = table.GetInt(i, "MoveSpeed");
			record.MoveSpeedLevelup = table.GetInt(i, "MoveSpeedLevelup");
			record.BonusToArmor = table.GetInt(i, "BonusToArmor");
			record.BonusToArmorLevelup = table.GetInt(i, "BonusToArmorLevelup");
			record.BonusToMonster = table.GetInt(i, "BonusToMonster");
			record.BonusToMonsterLevelup = table.GetInt(i, "BonusToMonsterLevelup");
			record.ExpUp = table.GetInt(i, "ExpUp");
			record.ExpUpLevelup = table.GetInt(i, "ExpUpLevelup");
			record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
			record.CrtChanceResistLevelup = table.GetInt(i, "CrtChanceResistLevelup");
			record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
			record.CrtBonusResistLevelup = table.GetInt(i, "CrtBonusResistLevelup");
			record.ReboundDmg = table.GetInt(i, "ReboundDmg");
			record.ReboundDmgLevelup = table.GetInt(i, "ReboundDmgLevelup");
			record.HpBonus = table.GetInt(i, "HpBonus");
			record.HpBonusLevelup = table.GetInt(i, "HpBonusLevelup");
			record.DmgReduce = table.GetInt(i, "DmgReduce");
			record.DmgReduceLevelup = table.GetInt(i, "DmgReduceLevelup");
			record.KillCure = table.GetInt(i, "KillCure");
			record.KillCureLevelup = table.GetInt(i, "KillCureLevelup");
			record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
			record.AllAtkBonusLevelup = table.GetInt(i, "AllAtkBonusLevelup");
			record.MF = table.GetInt(i, "MF");
			record.MFLevelup = table.GetInt(i, "MFLevelup");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}