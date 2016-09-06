package com.config;

import java.util.HashMap;

/***
 * SkillAnimationTbl.java
 * SkillAnimationCfg.java
 *
 * @Author: abaojin
 */
public class SkillAnimationTbl
{
	// #本行程序不读 动画ID
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 描述代码不用纯注释
	private string Desc;
	
	public string getDesc(){
		return Desc
	}
	
	public void setDesc(string Desc){
		this.Desc = Desc
	}
	
	// 动画名称
	private string AinmName;
	
	public string getAinmName(){
		return AinmName
	}
	
	public void setAinmName(string AinmName){
		this.AinmName = AinmName
	}
	
	// 动画触发条件
	private int AnimCondition;
	
	public int getAnimCondition(){
		return AnimCondition
	}
	
	public void setAnimCondition(int AnimCondition){
		this.AnimCondition = AnimCondition
	}
	
	// 结束后的下一动作
	private int NextAnimId;
	
	public int getNextAnimId(){
		return NextAnimId
	}
	
	public void setNextAnimId(int NextAnimId){
		this.NextAnimId = NextAnimId
	}
	
	// 特效表对应ID
	private int EffectSID;
	
	public int getEffectSID(){
		return EffectSID
	}
	
	public void setEffectSID(int EffectSID){
		this.EffectSID = EffectSID
	}
	
	// 是否随拥有者移动(0不移动 1移动)
	private int IsFellowOwner;
	
	public int getIsFellowOwner(){
		return IsFellowOwner
	}
	
	public void setIsFellowOwner(int IsFellowOwner){
		this.IsFellowOwner = IsFellowOwner
	}
	
	// 特效移动速度
	private float Speed;
	
	public float getSpeed(){
		return Speed
	}
	
	public void setSpeed(float Speed){
		this.Speed = Speed
	}
	
	// 动作持续时间
	private float ActTime;
	
	public float getActTime(){
		return ActTime
	}
	
	public void setActTime(float ActTime){
		this.ActTime = ActTime
	}
	
	// 特效播放时间
	private float EffectTime;
	
	public float getEffectTime(){
		return EffectTime
	}
	
	public void setEffectTime(float EffectTime){
		this.EffectTime = EffectTime
	}
	
	// 连击时间
	private float ComboTime;
	
	public float getComboTime(){
		return ComboTime
	}
	
	public void setComboTime(float ComboTime){
		this.ComboTime = ComboTime
	}
	
	// 技能持续时间
	private float SkillTime;
	
	public float getSkillTime(){
		return SkillTime
	}
	
	public void setSkillTime(float SkillTime){
		this.SkillTime = SkillTime
	}
	
	// 是否可转向
	private int RockerTurn;
	
	public int getRockerTurn(){
		return RockerTurn
	}
	
	public void setRockerTurn(int RockerTurn){
		this.RockerTurn = RockerTurn
	}
	
	// 是否可移动
	private int RockerMove;
	
	public int getRockerMove(){
		return RockerMove
	}
	
	public void setRockerMove(int RockerMove){
		this.RockerMove = RockerMove
	}
	
	// 玩家移动方向
	private int SelfMoveDirection;
	
	public int getSelfMoveDirection(){
		return SelfMoveDirection
	}
	
	public void setSelfMoveDirection(int SelfMoveDirection){
		this.SelfMoveDirection = SelfMoveDirection
	}
	
	// 攻击类型
	private int Attacktype;
	
	public int getAttacktype(){
		return Attacktype
	}
	
	public void setAttacktype(int Attacktype){
		this.Attacktype = Attacktype
	}
	
	// 攻击判定时间点
	private string Hitstime;
	
	public string getHitstime(){
		return Hitstime
	}
	
	public void setHitstime(string Hitstime){
		this.Hitstime = Hitstime
	}
	
	// 技能判定距离
	private string Distance;
	
	public string getDistance(){
		return Distance
	}
	
	public void setDistance(string Distance){
		this.Distance = Distance
	}
	
	// 移动时间点
	private string MoveTimes;
	
	public string getMoveTimes(){
		return MoveTimes
	}
	
	public void setMoveTimes(string MoveTimes){
		this.MoveTimes = MoveTimes
	}
	
	// 移动距离
	private string Move;
	
	public string getMove(){
		return Move
	}
	
	public void setMove(string Move){
		this.Move = Move
	}
	
	// 移动持续时间
	private string Movelast;
	
	public string getMovelast(){
		return Movelast
	}
	
	public void setMovelast(string Movelast){
		this.Movelast = Movelast
	}
	
	// 击退距离
	private string Repel;
	
	public string getRepel(){
		return Repel
	}
	
	public void setRepel(string Repel){
		this.Repel = Repel
	}
	
	// 击退持续时间
	private string RepelLast;
	
	public string getRepelLast(){
		return RepelLast
	}
	
	public void setRepelLast(string RepelLast){
		this.RepelLast = RepelLast
	}
	
	// 浮空高度
	private string FloatEnemy;
	
	public string getFloatEnemy(){
		return FloatEnemy
	}
	
	public void setFloatEnemy(string FloatEnemy){
		this.FloatEnemy = FloatEnemy
	}
	
	// 硬直幅度
	private float Hitrecover;
	
	public float getHitrecover(){
		return Hitrecover
	}
	
	public void setHitrecover(float Hitrecover){
		this.Hitrecover = Hitrecover
	}
	
	// 硬直时间
	private float Hitrecovertime;
	
	public float getHitrecovertime(){
		return Hitrecovertime
	}
	
	public void setHitrecovertime(float Hitrecovertime){
		this.Hitrecovertime = Hitrecovertime
	}
	
	// 技能音效
	private string SoundID;
	
	public string getSoundID(){
		return SoundID
	}
	
	public void setSoundID(string SoundID){
		this.SoundID = SoundID
	}
	
	// 命中音效
	private int HitSound;
	
	public int getHitSound(){
		return HitSound
	}
	
	public void setHitSound(int HitSound){
		this.HitSound = HitSound
	}
	
	// 音效播放时间点
	private string SoundTimes;
	
	public string getSoundTimes(){
		return SoundTimes
	}
	
	public void setSoundTimes(string SoundTimes){
		this.SoundTimes = SoundTimes
	}
	
	// 震屏时间点
	private string ShakeMoment;
	
	public string getShakeMoment(){
		return ShakeMoment
	}
	
	public void setShakeMoment(string ShakeMoment){
		this.ShakeMoment = ShakeMoment
	}
	
	// 震屏持续时间
	private string ShakeTimes;
	
	public string getShakeTimes(){
		return ShakeTimes
	}
	
	public void setShakeTimes(string ShakeTimes){
		this.ShakeTimes = ShakeTimes
	}
	
	// 震屏强度
	private string Shakeintensity;
	
	public string getShakeintensity(){
		return Shakeintensity
	}
	
	public void setShakeintensity(string Shakeintensity){
		this.Shakeintensity = Shakeintensity
	}
	
	
}

public class SkillAnimationCfg
{
	public const string FILENAME = "SkillAnimation";
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