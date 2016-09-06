/***
 * SkillAnimationTbl.cpp
 * SkillAnimationCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct SkillAnimationTbl
    {
		// #本行程序不读 动画ID
		public ﻿int Id;
		// 描述代码不用纯注释
		public string Desc;
		// 动画名称
		public string AinmName;
		// 动画触发条件
		public int AnimCondition;
		// 结束后的下一动作
		public int NextAnimId;
		// 特效表对应ID
		public int EffectSID;
		// 是否随拥有者移动(0不移动 1移动)
		public int IsFellowOwner;
		// 特效移动速度
		public float Speed;
		// 动作持续时间
		public float ActTime;
		// 特效播放时间
		public float EffectTime;
		// 连击时间
		public float ComboTime;
		// 技能持续时间
		public float SkillTime;
		// 是否可转向
		public int RockerTurn;
		// 是否可移动
		public int RockerMove;
		// 玩家移动方向
		public int SelfMoveDirection;
		// 攻击类型
		public int Attacktype;
		// 攻击判定时间点
		public string Hitstime;
		// 技能判定距离
		public string Distance;
		// 移动时间点
		public string MoveTimes;
		// 移动距离
		public string Move;
		// 移动持续时间
		public string Movelast;
		// 击退距离
		public string Repel;
		// 击退持续时间
		public string RepelLast;
		// 浮空高度
		public string FloatEnemy;
		// 硬直幅度
		public float Hitrecover;
		// 硬直时间
		public float Hitrecovertime;
		// 技能音效
		public string SoundID;
		// 命中音效
		public int HitSound;
		// 音效播放时间点
		public string SoundTimes;
		// 震屏时间点
		public string ShakeMoment;
		// 震屏持续时间
		public string ShakeTimes;
		// 震屏强度
		public string Shakeintensity;
		
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