using System;
using System.Collections.Generic;

/***
 * SkillAnimationTbl.cs
 * SkillAnimationCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class SkillAnimationTbl
    {
		// #本行程序不读 动画ID
		public ﻿int Id {get; set; }
		// 描述代码不用纯注释
		public string Desc {get; set; }
		// 动画名称
		public string AinmName {get; set; }
		// 动画触发条件
		public int AnimCondition {get; set; }
		// 结束后的下一动作
		public int NextAnimId {get; set; }
		// 特效表对应ID
		public int EffectSID {get; set; }
		// 是否随拥有者移动(0不移动 1移动)
		public int IsFellowOwner {get; set; }
		// 特效移动速度
		public float Speed {get; set; }
		// 动作持续时间
		public float ActTime {get; set; }
		// 特效播放时间
		public float EffectTime {get; set; }
		// 连击时间
		public float ComboTime {get; set; }
		// 技能持续时间
		public float SkillTime {get; set; }
		// 是否可转向
		public int RockerTurn {get; set; }
		// 是否可移动
		public int RockerMove {get; set; }
		// 玩家移动方向
		public int SelfMoveDirection {get; set; }
		// 攻击类型
		public int Attacktype {get; set; }
		// 攻击判定时间点
		public string Hitstime {get; set; }
		// 技能判定距离
		public string Distance {get; set; }
		// 移动时间点
		public string MoveTimes {get; set; }
		// 移动距离
		public string Move {get; set; }
		// 移动持续时间
		public string Movelast {get; set; }
		// 击退距离
		public string Repel {get; set; }
		// 击退持续时间
		public string RepelLast {get; set; }
		// 浮空高度
		public string FloatEnemy {get; set; }
		// 硬直幅度
		public float Hitrecover {get; set; }
		// 硬直时间
		public float Hitrecovertime {get; set; }
		// 技能音效
		public string SoundID {get; set; }
		// 命中音效
		public int HitSound {get; set; }
		// 音效播放时间点
		public string SoundTimes {get; set; }
		// 震屏时间点
		public string ShakeMoment {get; set; }
		// 震屏持续时间
		public string ShakeTimes {get; set; }
		// 震屏强度
		public string Shakeintensity {get; set; }
		
	}
	
    public class SkillAnimationCfg
    {
		public const string FILENAME = "SkillAnimation";
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
				SkillAnimationTbl record = new SkillAnimationTbl();
				
				record.Desc = table.GetString(i, "Desc");
				record.AinmName = table.GetString(i, "AinmName");
				record.AnimCondition = table.GetInt(i, "AnimCondition");
				record.NextAnimId = table.GetInt(i, "NextAnimId");
				record.EffectSID = table.GetInt(i, "EffectSID");
				record.IsFellowOwner = table.GetInt(i, "IsFellowOwner");
				record.Speed = table.GetFloat(i, "Speed");
				record.ActTime = table.GetFloat(i, "ActTime");
				record.EffectTime = table.GetFloat(i, "EffectTime");
				record.ComboTime = table.GetFloat(i, "ComboTime");
				record.SkillTime = table.GetFloat(i, "SkillTime");
				record.RockerTurn = table.GetInt(i, "RockerTurn");
				record.RockerMove = table.GetInt(i, "RockerMove");
				record.SelfMoveDirection = table.GetInt(i, "SelfMoveDirection");
				record.Attacktype = table.GetInt(i, "Attacktype");
				record.Hitstime = table.GetString(i, "Hitstime");
				record.Distance = table.GetString(i, "Distance");
				record.MoveTimes = table.GetString(i, "MoveTimes");
				record.Move = table.GetString(i, "Move");
				record.Movelast = table.GetString(i, "Movelast");
				record.Repel = table.GetString(i, "Repel");
				record.RepelLast = table.GetString(i, "RepelLast");
				record.FloatEnemy = table.GetString(i, "FloatEnemy");
				record.Hitrecover = table.GetFloat(i, "Hitrecover");
				record.Hitrecovertime = table.GetFloat(i, "Hitrecovertime");
				record.SoundID = table.GetString(i, "SoundID");
				record.HitSound = table.GetInt(i, "HitSound");
				record.SoundTimes = table.GetString(i, "SoundTimes");
				record.ShakeMoment = table.GetString(i, "ShakeMoment");
				record.ShakeTimes = table.GetString(i, "ShakeTimes");
				record.Shakeintensity = table.GetString(i, "Shakeintensity");
				
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