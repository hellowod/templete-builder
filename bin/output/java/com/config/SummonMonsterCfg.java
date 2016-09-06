package com.config;

import java.util.HashMap;

/***
 * SummonMonsterTbl.java
 * SummonMonsterCfg.java
 *
 * @Author: abaojin
 */
public class SummonMonsterTbl {

	// #主键
	private ﻿int Id;
	// 召唤物名称
	private string Name;
	// 怪物伤害类型1物理2魔法
	private int DamageType;
	// 模型文件路径
	private string Model;
	// 召唤物拥有的技能
	private int SkillId;
	// 死亡效果（没有为空）
	private string DeadEffect;
	// 死亡音效（音效表ID）
	private int DeadSound;
	// 攻击音效（音效表ID）
	private int AttackSound;
	// 待机音效（音效表ID）
	private int WaitSound;
	// 被击音效(音效ID)
	private int HitSound;
	// 力量
	private int Str;
	// 等级加值
	private int StrLevelup;
	// 敏捷
	private int Dex;
	// 等级加值
	private int DexLevelup;
	// 智力
	private int Wit;
	// 等级加值
	private int WitLevelup;
	// 体力
	private int Vit;
	// 等级加值
	private int VitLevelup;
	// 物攻下限
	private int AtkMin;
	// 等级加值
	private int AtkMinLevelup;
	// 物攻上限
	private int AtkMax;
	// 等级加值
	private int AtkMaxLevelup;
	// 物理防御
	private int Def;
	// 等级加值
	private int DefLevelup;
	// 魔法防御
	private int Mdef;
	// 等级加值
	private int MdefLevelup;
	// 魔攻下限
	private int MtkMin;
	// 等级加值
	private int MtkMinLevelup;
	// 魔攻上限
	private int MtkMax;
	// 等级加值
	private int MtkMaxLevelup;
	// 生命上限
	private int Hp;
	// 等级加值
	private int HpLevelup;
	// 幸运一击概率
	private int CrtChance;
	// 等级加值
	private int CrtChanceLevelup;
	// 幸运一击倍率
	private int CrtBonus;
	// 等级加值
	private int CrtBonusLevelup;
	// 卓越一击概率
	private int BrilliantChance;
	// 等级加值
	private int BrilliantChanceLevelup;
	// 物理护甲穿透
	private int DefPierce;
	// 等级加值
	private int DefPierceLevelup;
	// 魔法护甲穿透
	private int MdefPierce;
	// 等级加值
	private int MdefPierceLevelup;
	// 无视防御概率
	private int IgnoreAllDef;
	// 等级加值
	private int IgnoreAllDefLevelup;
	// 双倍伤害概率
	private int DoubleChance;
	// 等级加值
	private int DoubleChanceLevelup;
	// 移动速度
	private int MoveSpeed;
	// 等级加值
	private int MoveSpeedLevelup;
	// 对BOSS护甲伤害提升
	private int BonusToArmor;
	// 等级加值
	private int BonusToArmorLevelup;
	// 对怪物伤害提升
	private int BonusToMonster;
	// 等级加值
	private int BonusToMonsterLevelup;
	// 经验提升
	private int ExpUp;
	// 等级加值
	private int ExpUpLevelup;
	// 抗幸运一击概率
	private int CrtChanceResist;
	// 等级加值
	private int CrtChanceResistLevelup;
	// 抗幸运一击伤害
	private int CrtBonusResist;
	// 等级加值
	private int CrtBonusResistLevelup;
	// 反伤比例
	private int ReboundDmg;
	// 等级加值
	private int ReboundDmgLevelup;
	// 生命值提升百分比
	private int HpBonus;
	// 等级加值
	private int HpBonusLevelup;
	// 伤害减少百分比
	private int DmgReduce;
	// 等级加值
	private int DmgReduceLevelup;
	// 击杀怪物后恢复生命
	private int KillCure;
	// 等级加值
	private int KillCureLevelup;
	// 攻击力增加百分比
	private int AllAtkBonus;
	// 等级加值
	private int AllAtkBonusLevelup;
	// 掉宝加成值
	private int MF;
	// 等级加值
	private int MFLevelup;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getName(){
		return Name
	}
	public void setName(string Name){
		this.Name = Name
	}
	
	public int getDamageType(){
		return DamageType
	}
	public void setDamageType(int DamageType){
		this.DamageType = DamageType
	}
	
	public string getModel(){
		return Model
	}
	public void setModel(string Model){
		this.Model = Model
	}
	
	public int getSkillId(){
		return SkillId
	}
	public void setSkillId(int SkillId){
		this.SkillId = SkillId
	}
	
	public string getDeadEffect(){
		return DeadEffect
	}
	public void setDeadEffect(string DeadEffect){
		this.DeadEffect = DeadEffect
	}
	
	public int getDeadSound(){
		return DeadSound
	}
	public void setDeadSound(int DeadSound){
		this.DeadSound = DeadSound
	}
	
	public int getAttackSound(){
		return AttackSound
	}
	public void setAttackSound(int AttackSound){
		this.AttackSound = AttackSound
	}
	
	public int getWaitSound(){
		return WaitSound
	}
	public void setWaitSound(int WaitSound){
		this.WaitSound = WaitSound
	}
	
	public int getHitSound(){
		return HitSound
	}
	public void setHitSound(int HitSound){
		this.HitSound = HitSound
	}
	
	public int getStr(){
		return Str
	}
	public void setStr(int Str){
		this.Str = Str
	}
	
	public int getStrLevelup(){
		return StrLevelup
	}
	public void setStrLevelup(int StrLevelup){
		this.StrLevelup = StrLevelup
	}
	
	public int getDex(){
		return Dex
	}
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	public int getDexLevelup(){
		return DexLevelup
	}
	public void setDexLevelup(int DexLevelup){
		this.DexLevelup = DexLevelup
	}
	
	public int getWit(){
		return Wit
	}
	public void setWit(int Wit){
		this.Wit = Wit
	}
	
	public int getWitLevelup(){
		return WitLevelup
	}
	public void setWitLevelup(int WitLevelup){
		this.WitLevelup = WitLevelup
	}
	
	public int getVit(){
		return Vit
	}
	public void setVit(int Vit){
		this.Vit = Vit
	}
	
	public int getVitLevelup(){
		return VitLevelup
	}
	public void setVitLevelup(int VitLevelup){
		this.VitLevelup = VitLevelup
	}
	
	public int getAtkMin(){
		return AtkMin
	}
	public void setAtkMin(int AtkMin){
		this.AtkMin = AtkMin
	}
	
	public int getAtkMinLevelup(){
		return AtkMinLevelup
	}
	public void setAtkMinLevelup(int AtkMinLevelup){
		this.AtkMinLevelup = AtkMinLevelup
	}
	
	public int getAtkMax(){
		return AtkMax
	}
	public void setAtkMax(int AtkMax){
		this.AtkMax = AtkMax
	}
	
	public int getAtkMaxLevelup(){
		return AtkMaxLevelup
	}
	public void setAtkMaxLevelup(int AtkMaxLevelup){
		this.AtkMaxLevelup = AtkMaxLevelup
	}
	
	public int getDef(){
		return Def
	}
	public void setDef(int Def){
		this.Def = Def
	}
	
	public int getDefLevelup(){
		return DefLevelup
	}
	public void setDefLevelup(int DefLevelup){
		this.DefLevelup = DefLevelup
	}
	
	public int getMdef(){
		return Mdef
	}
	public void setMdef(int Mdef){
		this.Mdef = Mdef
	}
	
	public int getMdefLevelup(){
		return MdefLevelup
	}
	public void setMdefLevelup(int MdefLevelup){
		this.MdefLevelup = MdefLevelup
	}
	
	public int getMtkMin(){
		return MtkMin
	}
	public void setMtkMin(int MtkMin){
		this.MtkMin = MtkMin
	}
	
	public int getMtkMinLevelup(){
		return MtkMinLevelup
	}
	public void setMtkMinLevelup(int MtkMinLevelup){
		this.MtkMinLevelup = MtkMinLevelup
	}
	
	public int getMtkMax(){
		return MtkMax
	}
	public void setMtkMax(int MtkMax){
		this.MtkMax = MtkMax
	}
	
	public int getMtkMaxLevelup(){
		return MtkMaxLevelup
	}
	public void setMtkMaxLevelup(int MtkMaxLevelup){
		this.MtkMaxLevelup = MtkMaxLevelup
	}
	
	public int getHp(){
		return Hp
	}
	public void setHp(int Hp){
		this.Hp = Hp
	}
	
	public int getHpLevelup(){
		return HpLevelup
	}
	public void setHpLevelup(int HpLevelup){
		this.HpLevelup = HpLevelup
	}
	
	public int getCrtChance(){
		return CrtChance
	}
	public void setCrtChance(int CrtChance){
		this.CrtChance = CrtChance
	}
	
	public int getCrtChanceLevelup(){
		return CrtChanceLevelup
	}
	public void setCrtChanceLevelup(int CrtChanceLevelup){
		this.CrtChanceLevelup = CrtChanceLevelup
	}
	
	public int getCrtBonus(){
		return CrtBonus
	}
	public void setCrtBonus(int CrtBonus){
		this.CrtBonus = CrtBonus
	}
	
	public int getCrtBonusLevelup(){
		return CrtBonusLevelup
	}
	public void setCrtBonusLevelup(int CrtBonusLevelup){
		this.CrtBonusLevelup = CrtBonusLevelup
	}
	
	public int getBrilliantChance(){
		return BrilliantChance
	}
	public void setBrilliantChance(int BrilliantChance){
		this.BrilliantChance = BrilliantChance
	}
	
	public int getBrilliantChanceLevelup(){
		return BrilliantChanceLevelup
	}
	public void setBrilliantChanceLevelup(int BrilliantChanceLevelup){
		this.BrilliantChanceLevelup = BrilliantChanceLevelup
	}
	
	public int getDefPierce(){
		return DefPierce
	}
	public void setDefPierce(int DefPierce){
		this.DefPierce = DefPierce
	}
	
	public int getDefPierceLevelup(){
		return DefPierceLevelup
	}
	public void setDefPierceLevelup(int DefPierceLevelup){
		this.DefPierceLevelup = DefPierceLevelup
	}
	
	public int getMdefPierce(){
		return MdefPierce
	}
	public void setMdefPierce(int MdefPierce){
		this.MdefPierce = MdefPierce
	}
	
	public int getMdefPierceLevelup(){
		return MdefPierceLevelup
	}
	public void setMdefPierceLevelup(int MdefPierceLevelup){
		this.MdefPierceLevelup = MdefPierceLevelup
	}
	
	public int getIgnoreAllDef(){
		return IgnoreAllDef
	}
	public void setIgnoreAllDef(int IgnoreAllDef){
		this.IgnoreAllDef = IgnoreAllDef
	}
	
	public int getIgnoreAllDefLevelup(){
		return IgnoreAllDefLevelup
	}
	public void setIgnoreAllDefLevelup(int IgnoreAllDefLevelup){
		this.IgnoreAllDefLevelup = IgnoreAllDefLevelup
	}
	
	public int getDoubleChance(){
		return DoubleChance
	}
	public void setDoubleChance(int DoubleChance){
		this.DoubleChance = DoubleChance
	}
	
	public int getDoubleChanceLevelup(){
		return DoubleChanceLevelup
	}
	public void setDoubleChanceLevelup(int DoubleChanceLevelup){
		this.DoubleChanceLevelup = DoubleChanceLevelup
	}
	
	public int getMoveSpeed(){
		return MoveSpeed
	}
	public void setMoveSpeed(int MoveSpeed){
		this.MoveSpeed = MoveSpeed
	}
	
	public int getMoveSpeedLevelup(){
		return MoveSpeedLevelup
	}
	public void setMoveSpeedLevelup(int MoveSpeedLevelup){
		this.MoveSpeedLevelup = MoveSpeedLevelup
	}
	
	public int getBonusToArmor(){
		return BonusToArmor
	}
	public void setBonusToArmor(int BonusToArmor){
		this.BonusToArmor = BonusToArmor
	}
	
	public int getBonusToArmorLevelup(){
		return BonusToArmorLevelup
	}
	public void setBonusToArmorLevelup(int BonusToArmorLevelup){
		this.BonusToArmorLevelup = BonusToArmorLevelup
	}
	
	public int getBonusToMonster(){
		return BonusToMonster
	}
	public void setBonusToMonster(int BonusToMonster){
		this.BonusToMonster = BonusToMonster
	}
	
	public int getBonusToMonsterLevelup(){
		return BonusToMonsterLevelup
	}
	public void setBonusToMonsterLevelup(int BonusToMonsterLevelup){
		this.BonusToMonsterLevelup = BonusToMonsterLevelup
	}
	
	public int getExpUp(){
		return ExpUp
	}
	public void setExpUp(int ExpUp){
		this.ExpUp = ExpUp
	}
	
	public int getExpUpLevelup(){
		return ExpUpLevelup
	}
	public void setExpUpLevelup(int ExpUpLevelup){
		this.ExpUpLevelup = ExpUpLevelup
	}
	
	public int getCrtChanceResist(){
		return CrtChanceResist
	}
	public void setCrtChanceResist(int CrtChanceResist){
		this.CrtChanceResist = CrtChanceResist
	}
	
	public int getCrtChanceResistLevelup(){
		return CrtChanceResistLevelup
	}
	public void setCrtChanceResistLevelup(int CrtChanceResistLevelup){
		this.CrtChanceResistLevelup = CrtChanceResistLevelup
	}
	
	public int getCrtBonusResist(){
		return CrtBonusResist
	}
	public void setCrtBonusResist(int CrtBonusResist){
		this.CrtBonusResist = CrtBonusResist
	}
	
	public int getCrtBonusResistLevelup(){
		return CrtBonusResistLevelup
	}
	public void setCrtBonusResistLevelup(int CrtBonusResistLevelup){
		this.CrtBonusResistLevelup = CrtBonusResistLevelup
	}
	
	public int getReboundDmg(){
		return ReboundDmg
	}
	public void setReboundDmg(int ReboundDmg){
		this.ReboundDmg = ReboundDmg
	}
	
	public int getReboundDmgLevelup(){
		return ReboundDmgLevelup
	}
	public void setReboundDmgLevelup(int ReboundDmgLevelup){
		this.ReboundDmgLevelup = ReboundDmgLevelup
	}
	
	public int getHpBonus(){
		return HpBonus
	}
	public void setHpBonus(int HpBonus){
		this.HpBonus = HpBonus
	}
	
	public int getHpBonusLevelup(){
		return HpBonusLevelup
	}
	public void setHpBonusLevelup(int HpBonusLevelup){
		this.HpBonusLevelup = HpBonusLevelup
	}
	
	public int getDmgReduce(){
		return DmgReduce
	}
	public void setDmgReduce(int DmgReduce){
		this.DmgReduce = DmgReduce
	}
	
	public int getDmgReduceLevelup(){
		return DmgReduceLevelup
	}
	public void setDmgReduceLevelup(int DmgReduceLevelup){
		this.DmgReduceLevelup = DmgReduceLevelup
	}
	
	public int getKillCure(){
		return KillCure
	}
	public void setKillCure(int KillCure){
		this.KillCure = KillCure
	}
	
	public int getKillCureLevelup(){
		return KillCureLevelup
	}
	public void setKillCureLevelup(int KillCureLevelup){
		this.KillCureLevelup = KillCureLevelup
	}
	
	public int getAllAtkBonus(){
		return AllAtkBonus
	}
	public void setAllAtkBonus(int AllAtkBonus){
		this.AllAtkBonus = AllAtkBonus
	}
	
	public int getAllAtkBonusLevelup(){
		return AllAtkBonusLevelup
	}
	public void setAllAtkBonusLevelup(int AllAtkBonusLevelup){
		this.AllAtkBonusLevelup = AllAtkBonusLevelup
	}
	
	public int getMF(){
		return MF
	}
	public void setMF(int MF){
		this.MF = MF
	}
	
	public int getMFLevelup(){
		return MFLevelup
	}
	public void setMFLevelup(int MFLevelup){
		this.MFLevelup = MFLevelup
	}
	
}

public class SummonMonsterCfg {
	public const string FILENAME = "SummonMonster";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
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
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}