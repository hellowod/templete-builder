using System;
using System.Collections.Generic;

/***
 * SkillPrototypeTbl.cs
 * SkillPrototypeCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class SkillPrototypeTbl
    {
		// #id
		public ﻿int Id {get; set; }
		// 职业说明代码不用
		public string JobDesc {get; set; }
		// 名称
		public string Name {get; set; }
		// 图标
		public string Icon {get; set; }
		// 静态描述
		public string Des {get; set; }
		// 是否适用于辅助锁定
		public int AutoLock {get; set; }
		// 是否受玩家方向操作影响
		public int DirectionControl {get; set; }
		// 目标(1敌,2友,3自身)
		public int Target {get; set; }
		// 攻击生效方式
		public int HitType {get; set; }
		// 技能cd(毫秒)
		public int ColdDown {get; set; }
		// 技能打击数
		public int HitCount {get; set; }
		// 技能形状(1矩2扇3圆4点)
		public string Shape {get; set; }
		// 形状参数1(扇形半径米矩形宽米)
		public string ShapeArgument1 {get; set; }
		// 形状参数2(扇形弧度矩形长米)
		public string ShapeArgument2 {get; set; }
		// 技能释放距离,空放时使用该距离的点作为技能释放点, 否则使用被选取目标坐标为释放点
		public string Distance {get; set; }
		// 击退攻击次数
		public string RepelHits {get; set; }
		// 击退距离
		public string RepelDistance {get; set; }
		// 位移攻击次数
		public string MoveHits {get; set; }
		// 位移距离
		public string MoveDistance {get; set; }
		// 每一段打击的伤害分配比例(万分之), 总和应该为10000, 分摊的是AtkArgument字段带来的伤害
		public string HitDamagePercent {get; set; }
		// 每一段打击的护甲值伤害百分比
		public string ArmorDamagePercent {get; set; }
		// 是否解除控制效果(1是0否)
		public int ReliveRestrict {get; set; }
		// 技能释放时间(持续时间LastTime)内免疫控制1是0否
		public int LastImmuneRestrict {get; set; }
		// 起始动作id
		public int StartAnimation {get; set; }
		// 结束动作id
		public int EndAnimation {get; set; }
		// 召唤id
		public int SummonId {get; set; }
		// 召唤物初始等级
		public int SummonLevel {get; set; }
		// 即时攻击百分比系数(万分之)对敌伤害对友治疗根据职业决定物理还是魔法
		public int AtkArgument {get; set; }
		// 对护甲值伤害
		public int ArmorArgument {get; set; }
		// 即时攻击百分比系数(万分之)升级加值
		public int AtkArgumentLevelup {get; set; }
		// 即时攻击护甲值百分比系数(万分之)升级加值
		public int ArmorArgumentLevelup {get; set; }
		// 施加状态持续时间(秒)
		public int StateLastTime {get; set; }
		// 持续时间内魔法罩吸收伤害比例
		public int StateShieldResist {get; set; }
		// 持续时间内魔法罩吸收伤害上限
		public int StateShieldHp {get; set; }
		// 施加状态时间内眩晕
		public int StateStun {get; set; }
		// 施加状态时间内定身
		public int StateRestrain {get; set; }
		// 施加状态时间内免控
		public int StateImmuneRestrict {get; set; }
		// 施加状态时间内无敌
		public int StateInvincible {get; set; }
		// 施加状态时间内嘲讽
		public int StateSneer {get; set; }
		// 施加状态时间内吸血比例(万分之)
		public int StateSuck {get; set; }
		// 施加状态时间内生命上限百分比掉血(万分之)
		public int StatePercentHP {get; set; }
		// 施加状态时间内总攻击系数万分之(对敌伤害对友治疗)
		public int StateAtkArgument {get; set; }
		// 施加状态时间内总攻击百分比升级系数加值
		public int StateAtkArgumentLevelup {get; set; }
		// 持续时间内影响角色的属性枚举列表
		public string StateRoleAttributeList {get; set; }
		// 持续时间内影响角色的属性变化方式列表, 1百分比2绝对值, 与属性列表一一对应
		public string StateRoleAttributeChange {get; set; }
		// 持续时间内影响角色的属性数值列表, 正+负-, 与属性列表一一对应
		public string StateRoleAttributeValue {get; set; }
		// 持续效果特效
		public int LastEffectsID {get; set; }
		// 区域基准点据玩家距离
		public float AreaDistance {get; set; }
		// 区域效果持续时间(秒)
		public int AreaEffectTime {get; set; }
		// 区域效果形状(1线2圆)
		public int AreaEffectShape {get; set; }
		// 区域效果形状参数1(线:长度米; 圆形:半径米)
		public int AreaEffectShapeArgument {get; set; }
		// 技能释放优先级, 低优先级的技能会被高优先级技能的释放打断
		public int Priority {get; set; }
		// 吸附敌人范围
		public float Gather {get; set; }
		// 技能持续时间（毫秒）
		public int SkillTime {get; set; }
		// 硬直时间
		public int HitTime {get; set; }
		// 1物理2魔法3跟随角色主属性
		public int DamageType {get; set; }
		// 持续状态时间内物理免疫
		public int StateImmunePhysics {get; set; }
		// 持续状态事件内魔法免疫
		public int StateImmuneMagic {get; set; }
		// 技能等级基础战斗力, 最终技能战斗力 = BaseBattleScore * 技能等级
		public int BaseBattleScore {get; set; }
		
	}
	
    public class SkillPrototypeCfg
    {
		public const string FILENAME = "SkillPrototype";
		public Dictionary<int, BaseTbl> Init()
		{
			Table table = TableLoad.LoadTbl(FILENAME);
			if(table == null)
			{
				return null;
			}
			var dict = new Dictionary<int, BaseTbl>();
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
}