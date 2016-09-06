package com.config;

import java.util.HashMap;

/***
 * SkillPrototypeTbl.java
 * SkillPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class SkillPrototypeTbl
{
	// #id
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 职业说明代码不用
	private string JobDesc;
	
	public string getJobDesc(){
		return JobDesc
	}
	
	public void setJobDesc(string JobDesc){
		this.JobDesc = JobDesc
	}
	
	// 名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 图标
	private string Icon;
	
	public string getIcon(){
		return Icon
	}
	
	public void setIcon(string Icon){
		this.Icon = Icon
	}
	
	// 静态描述
	private string Des;
	
	public string getDes(){
		return Des
	}
	
	public void setDes(string Des){
		this.Des = Des
	}
	
	// 是否适用于辅助锁定
	private int AutoLock;
	
	public int getAutoLock(){
		return AutoLock
	}
	
	public void setAutoLock(int AutoLock){
		this.AutoLock = AutoLock
	}
	
	// 是否受玩家方向操作影响
	private int DirectionControl;
	
	public int getDirectionControl(){
		return DirectionControl
	}
	
	public void setDirectionControl(int DirectionControl){
		this.DirectionControl = DirectionControl
	}
	
	// 目标(1敌,2友,3自身)
	private int Target;
	
	public int getTarget(){
		return Target
	}
	
	public void setTarget(int Target){
		this.Target = Target
	}
	
	// 攻击生效方式
	private int HitType;
	
	public int getHitType(){
		return HitType
	}
	
	public void setHitType(int HitType){
		this.HitType = HitType
	}
	
	// 技能cd(毫秒)
	private int ColdDown;
	
	public int getColdDown(){
		return ColdDown
	}
	
	public void setColdDown(int ColdDown){
		this.ColdDown = ColdDown
	}
	
	// 技能打击数
	private int HitCount;
	
	public int getHitCount(){
		return HitCount
	}
	
	public void setHitCount(int HitCount){
		this.HitCount = HitCount
	}
	
	// 技能形状(1矩2扇3圆4点)
	private string Shape;
	
	public string getShape(){
		return Shape
	}
	
	public void setShape(string Shape){
		this.Shape = Shape
	}
	
	// 形状参数1(扇形半径米矩形宽米)
	private string ShapeArgument1;
	
	public string getShapeArgument1(){
		return ShapeArgument1
	}
	
	public void setShapeArgument1(string ShapeArgument1){
		this.ShapeArgument1 = ShapeArgument1
	}
	
	// 形状参数2(扇形弧度矩形长米)
	private string ShapeArgument2;
	
	public string getShapeArgument2(){
		return ShapeArgument2
	}
	
	public void setShapeArgument2(string ShapeArgument2){
		this.ShapeArgument2 = ShapeArgument2
	}
	
	// 技能释放距离,空放时使用该距离的点作为技能释放点, 否则使用被选取目标坐标为释放点
	private string Distance;
	
	public string getDistance(){
		return Distance
	}
	
	public void setDistance(string Distance){
		this.Distance = Distance
	}
	
	// 击退攻击次数
	private string RepelHits;
	
	public string getRepelHits(){
		return RepelHits
	}
	
	public void setRepelHits(string RepelHits){
		this.RepelHits = RepelHits
	}
	
	// 击退距离
	private string RepelDistance;
	
	public string getRepelDistance(){
		return RepelDistance
	}
	
	public void setRepelDistance(string RepelDistance){
		this.RepelDistance = RepelDistance
	}
	
	// 位移攻击次数
	private string MoveHits;
	
	public string getMoveHits(){
		return MoveHits
	}
	
	public void setMoveHits(string MoveHits){
		this.MoveHits = MoveHits
	}
	
	// 位移距离
	private string MoveDistance;
	
	public string getMoveDistance(){
		return MoveDistance
	}
	
	public void setMoveDistance(string MoveDistance){
		this.MoveDistance = MoveDistance
	}
	
	// 每一段打击的伤害分配比例(万分之), 总和应该为10000, 分摊的是AtkArgument字段带来的伤害
	private string HitDamagePercent;
	
	public string getHitDamagePercent(){
		return HitDamagePercent
	}
	
	public void setHitDamagePercent(string HitDamagePercent){
		this.HitDamagePercent = HitDamagePercent
	}
	
	// 每一段打击的护甲值伤害百分比
	private string ArmorDamagePercent;
	
	public string getArmorDamagePercent(){
		return ArmorDamagePercent
	}
	
	public void setArmorDamagePercent(string ArmorDamagePercent){
		this.ArmorDamagePercent = ArmorDamagePercent
	}
	
	// 是否解除控制效果(1是0否)
	private int ReliveRestrict;
	
	public int getReliveRestrict(){
		return ReliveRestrict
	}
	
	public void setReliveRestrict(int ReliveRestrict){
		this.ReliveRestrict = ReliveRestrict
	}
	
	// 技能释放时间(持续时间LastTime)内免疫控制1是0否
	private int LastImmuneRestrict;
	
	public int getLastImmuneRestrict(){
		return LastImmuneRestrict
	}
	
	public void setLastImmuneRestrict(int LastImmuneRestrict){
		this.LastImmuneRestrict = LastImmuneRestrict
	}
	
	// 起始动作id
	private int StartAnimation;
	
	public int getStartAnimation(){
		return StartAnimation
	}
	
	public void setStartAnimation(int StartAnimation){
		this.StartAnimation = StartAnimation
	}
	
	// 结束动作id
	private int EndAnimation;
	
	public int getEndAnimation(){
		return EndAnimation
	}
	
	public void setEndAnimation(int EndAnimation){
		this.EndAnimation = EndAnimation
	}
	
	// 召唤id
	private int SummonId;
	
	public int getSummonId(){
		return SummonId
	}
	
	public void setSummonId(int SummonId){
		this.SummonId = SummonId
	}
	
	// 召唤物初始等级
	private int SummonLevel;
	
	public int getSummonLevel(){
		return SummonLevel
	}
	
	public void setSummonLevel(int SummonLevel){
		this.SummonLevel = SummonLevel
	}
	
	// 即时攻击百分比系数(万分之)对敌伤害对友治疗根据职业决定物理还是魔法
	private int AtkArgument;
	
	public int getAtkArgument(){
		return AtkArgument
	}
	
	public void setAtkArgument(int AtkArgument){
		this.AtkArgument = AtkArgument
	}
	
	// 对护甲值伤害
	private int ArmorArgument;
	
	public int getArmorArgument(){
		return ArmorArgument
	}
	
	public void setArmorArgument(int ArmorArgument){
		this.ArmorArgument = ArmorArgument
	}
	
	// 即时攻击百分比系数(万分之)升级加值
	private int AtkArgumentLevelup;
	
	public int getAtkArgumentLevelup(){
		return AtkArgumentLevelup
	}
	
	public void setAtkArgumentLevelup(int AtkArgumentLevelup){
		this.AtkArgumentLevelup = AtkArgumentLevelup
	}
	
	// 即时攻击护甲值百分比系数(万分之)升级加值
	private int ArmorArgumentLevelup;
	
	public int getArmorArgumentLevelup(){
		return ArmorArgumentLevelup
	}
	
	public void setArmorArgumentLevelup(int ArmorArgumentLevelup){
		this.ArmorArgumentLevelup = ArmorArgumentLevelup
	}
	
	// 施加状态持续时间(秒)
	private int StateLastTime;
	
	public int getStateLastTime(){
		return StateLastTime
	}
	
	public void setStateLastTime(int StateLastTime){
		this.StateLastTime = StateLastTime
	}
	
	// 持续时间内魔法罩吸收伤害比例
	private int StateShieldResist;
	
	public int getStateShieldResist(){
		return StateShieldResist
	}
	
	public void setStateShieldResist(int StateShieldResist){
		this.StateShieldResist = StateShieldResist
	}
	
	// 持续时间内魔法罩吸收伤害上限
	private int StateShieldHp;
	
	public int getStateShieldHp(){
		return StateShieldHp
	}
	
	public void setStateShieldHp(int StateShieldHp){
		this.StateShieldHp = StateShieldHp
	}
	
	// 施加状态时间内眩晕
	private int StateStun;
	
	public int getStateStun(){
		return StateStun
	}
	
	public void setStateStun(int StateStun){
		this.StateStun = StateStun
	}
	
	// 施加状态时间内定身
	private int StateRestrain;
	
	public int getStateRestrain(){
		return StateRestrain
	}
	
	public void setStateRestrain(int StateRestrain){
		this.StateRestrain = StateRestrain
	}
	
	// 施加状态时间内免控
	private int StateImmuneRestrict;
	
	public int getStateImmuneRestrict(){
		return StateImmuneRestrict
	}
	
	public void setStateImmuneRestrict(int StateImmuneRestrict){
		this.StateImmuneRestrict = StateImmuneRestrict
	}
	
	// 施加状态时间内无敌
	private int StateInvincible;
	
	public int getStateInvincible(){
		return StateInvincible
	}
	
	public void setStateInvincible(int StateInvincible){
		this.StateInvincible = StateInvincible
	}
	
	// 施加状态时间内嘲讽
	private int StateSneer;
	
	public int getStateSneer(){
		return StateSneer
	}
	
	public void setStateSneer(int StateSneer){
		this.StateSneer = StateSneer
	}
	
	// 施加状态时间内吸血比例(万分之)
	private int StateSuck;
	
	public int getStateSuck(){
		return StateSuck
	}
	
	public void setStateSuck(int StateSuck){
		this.StateSuck = StateSuck
	}
	
	// 施加状态时间内生命上限百分比掉血(万分之)
	private int StatePercentHP;
	
	public int getStatePercentHP(){
		return StatePercentHP
	}
	
	public void setStatePercentHP(int StatePercentHP){
		this.StatePercentHP = StatePercentHP
	}
	
	// 施加状态时间内总攻击系数万分之(对敌伤害对友治疗)
	private int StateAtkArgument;
	
	public int getStateAtkArgument(){
		return StateAtkArgument
	}
	
	public void setStateAtkArgument(int StateAtkArgument){
		this.StateAtkArgument = StateAtkArgument
	}
	
	// 施加状态时间内总攻击百分比升级系数加值
	private int StateAtkArgumentLevelup;
	
	public int getStateAtkArgumentLevelup(){
		return StateAtkArgumentLevelup
	}
	
	public void setStateAtkArgumentLevelup(int StateAtkArgumentLevelup){
		this.StateAtkArgumentLevelup = StateAtkArgumentLevelup
	}
	
	// 持续时间内影响角色的属性枚举列表
	private string StateRoleAttributeList;
	
	public string getStateRoleAttributeList(){
		return StateRoleAttributeList
	}
	
	public void setStateRoleAttributeList(string StateRoleAttributeList){
		this.StateRoleAttributeList = StateRoleAttributeList
	}
	
	// 持续时间内影响角色的属性变化方式列表, 1百分比2绝对值, 与属性列表一一对应
	private string StateRoleAttributeChange;
	
	public string getStateRoleAttributeChange(){
		return StateRoleAttributeChange
	}
	
	public void setStateRoleAttributeChange(string StateRoleAttributeChange){
		this.StateRoleAttributeChange = StateRoleAttributeChange
	}
	
	// 持续时间内影响角色的属性数值列表, 正+负-, 与属性列表一一对应
	private string StateRoleAttributeValue;
	
	public string getStateRoleAttributeValue(){
		return StateRoleAttributeValue
	}
	
	public void setStateRoleAttributeValue(string StateRoleAttributeValue){
		this.StateRoleAttributeValue = StateRoleAttributeValue
	}
	
	// 持续效果特效
	private int LastEffectsID;
	
	public int getLastEffectsID(){
		return LastEffectsID
	}
	
	public void setLastEffectsID(int LastEffectsID){
		this.LastEffectsID = LastEffectsID
	}
	
	// 区域基准点据玩家距离
	private float AreaDistance;
	
	public float getAreaDistance(){
		return AreaDistance
	}
	
	public void setAreaDistance(float AreaDistance){
		this.AreaDistance = AreaDistance
	}
	
	// 区域效果持续时间(秒)
	private int AreaEffectTime;
	
	public int getAreaEffectTime(){
		return AreaEffectTime
	}
	
	public void setAreaEffectTime(int AreaEffectTime){
		this.AreaEffectTime = AreaEffectTime
	}
	
	// 区域效果形状(1线2圆)
	private int AreaEffectShape;
	
	public int getAreaEffectShape(){
		return AreaEffectShape
	}
	
	public void setAreaEffectShape(int AreaEffectShape){
		this.AreaEffectShape = AreaEffectShape
	}
	
	// 区域效果形状参数1(线:长度米; 圆形:半径米)
	private int AreaEffectShapeArgument;
	
	public int getAreaEffectShapeArgument(){
		return AreaEffectShapeArgument
	}
	
	public void setAreaEffectShapeArgument(int AreaEffectShapeArgument){
		this.AreaEffectShapeArgument = AreaEffectShapeArgument
	}
	
	// 技能释放优先级, 低优先级的技能会被高优先级技能的释放打断
	private int Priority;
	
	public int getPriority(){
		return Priority
	}
	
	public void setPriority(int Priority){
		this.Priority = Priority
	}
	
	// 吸附敌人范围
	private float Gather;
	
	public float getGather(){
		return Gather
	}
	
	public void setGather(float Gather){
		this.Gather = Gather
	}
	
	// 技能持续时间（毫秒）
	private int SkillTime;
	
	public int getSkillTime(){
		return SkillTime
	}
	
	public void setSkillTime(int SkillTime){
		this.SkillTime = SkillTime
	}
	
	// 硬直时间
	private int HitTime;
	
	public int getHitTime(){
		return HitTime
	}
	
	public void setHitTime(int HitTime){
		this.HitTime = HitTime
	}
	
	// 1物理2魔法3跟随角色主属性
	private int DamageType;
	
	public int getDamageType(){
		return DamageType
	}
	
	public void setDamageType(int DamageType){
		this.DamageType = DamageType
	}
	
	// 持续状态时间内物理免疫
	private int StateImmunePhysics;
	
	public int getStateImmunePhysics(){
		return StateImmunePhysics
	}
	
	public void setStateImmunePhysics(int StateImmunePhysics){
		this.StateImmunePhysics = StateImmunePhysics
	}
	
	// 持续状态事件内魔法免疫
	private int StateImmuneMagic;
	
	public int getStateImmuneMagic(){
		return StateImmuneMagic
	}
	
	public void setStateImmuneMagic(int StateImmuneMagic){
		this.StateImmuneMagic = StateImmuneMagic
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

public class SkillPrototypeCfg
{
	public const string FILENAME = "SkillPrototype";
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
			SkillPrototypeTbl record = new SkillPrototypeTbl();
			
			record.JobDesc = table.GetString(i, "JobDesc");
			record.Name = table.GetString(i, "Name");
			record.Icon = table.GetString(i, "Icon");
			record.Des = table.GetString(i, "Des");
			record.AutoLock = table.GetInt(i, "AutoLock");
			record.DirectionControl = table.GetInt(i, "DirectionControl");
			record.Target = table.GetInt(i, "Target");
			record.HitType = table.GetInt(i, "HitType");
			record.ColdDown = table.GetInt(i, "ColdDown");
			record.HitCount = table.GetInt(i, "HitCount");
			record.Shape = table.GetString(i, "Shape");
			record.ShapeArgument1 = table.GetString(i, "ShapeArgument1");
			record.ShapeArgument2 = table.GetString(i, "ShapeArgument2");
			record.Distance = table.GetString(i, "Distance");
			record.RepelHits = table.GetString(i, "RepelHits");
			record.RepelDistance = table.GetString(i, "RepelDistance");
			record.MoveHits = table.GetString(i, "MoveHits");
			record.MoveDistance = table.GetString(i, "MoveDistance");
			record.HitDamagePercent = table.GetString(i, "HitDamagePercent");
			record.ArmorDamagePercent = table.GetString(i, "ArmorDamagePercent");
			record.ReliveRestrict = table.GetInt(i, "ReliveRestrict");
			record.LastImmuneRestrict = table.GetInt(i, "LastImmuneRestrict");
			record.StartAnimation = table.GetInt(i, "StartAnimation");
			record.EndAnimation = table.GetInt(i, "EndAnimation");
			record.SummonId = table.GetInt(i, "SummonId");
			record.SummonLevel = table.GetInt(i, "SummonLevel");
			record.AtkArgument = table.GetInt(i, "AtkArgument");
			record.ArmorArgument = table.GetInt(i, "ArmorArgument");
			record.AtkArgumentLevelup = table.GetInt(i, "AtkArgumentLevelup");
			record.ArmorArgumentLevelup = table.GetInt(i, "ArmorArgumentLevelup");
			record.StateLastTime = table.GetInt(i, "StateLastTime");
			record.StateShieldResist = table.GetInt(i, "StateShieldResist");
			record.StateShieldHp = table.GetInt(i, "StateShieldHp");
			record.StateStun = table.GetInt(i, "StateStun");
			record.StateRestrain = table.GetInt(i, "StateRestrain");
			record.StateImmuneRestrict = table.GetInt(i, "StateImmuneRestrict");
			record.StateInvincible = table.GetInt(i, "StateInvincible");
			record.StateSneer = table.GetInt(i, "StateSneer");
			record.StateSuck = table.GetInt(i, "StateSuck");
			record.StatePercentHP = table.GetInt(i, "StatePercentHP");
			record.StateAtkArgument = table.GetInt(i, "StateAtkArgument");
			record.StateAtkArgumentLevelup = table.GetInt(i, "StateAtkArgumentLevelup");
			record.StateRoleAttributeList = table.GetString(i, "StateRoleAttributeList");
			record.StateRoleAttributeChange = table.GetString(i, "StateRoleAttributeChange");
			record.StateRoleAttributeValue = table.GetString(i, "StateRoleAttributeValue");
			record.LastEffectsID = table.GetInt(i, "LastEffectsID");
			record.AreaDistance = table.GetFloat(i, "AreaDistance");
			record.AreaEffectTime = table.GetInt(i, "AreaEffectTime");
			record.AreaEffectShape = table.GetInt(i, "AreaEffectShape");
			record.AreaEffectShapeArgument = table.GetInt(i, "AreaEffectShapeArgument");
			record.Priority = table.GetInt(i, "Priority");
			record.Gather = table.GetFloat(i, "Gather");
			record.SkillTime = table.GetInt(i, "SkillTime");
			record.HitTime = table.GetInt(i, "HitTime");
			record.DamageType = table.GetInt(i, "DamageType");
			record.StateImmunePhysics = table.GetInt(i, "StateImmunePhysics");
			record.StateImmuneMagic = table.GetInt(i, "StateImmuneMagic");
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