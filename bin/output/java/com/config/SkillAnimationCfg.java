package com.config;

import java.util.HashMap;

/***
 * SkillAnimationTbl.java
 * SkillAnimationCfg.java
 *
 * @Author: abaojin
 */
public class SkillAnimationTbl {

	// #本行程序不读 动画ID
	private ﻿int Id;
	// 描述代码不用纯注释
	private string Desc;
	// 动画名称
	private string AinmName;
	// 动画触发条件
	private int AnimCondition;
	// 结束后的下一动作
	private int NextAnimId;
	// 特效表对应ID
	private int EffectSID;
	// 是否随拥有者移动(0不移动 1移动)
	private int IsFellowOwner;
	// 特效移动速度
	private float Speed;
	// 动作持续时间
	private float ActTime;
	// 特效播放时间
	private float EffectTime;
	// 连击时间
	private float ComboTime;
	// 技能持续时间
	private float SkillTime;
	// 是否可转向
	private int RockerTurn;
	// 是否可移动
	private int RockerMove;
	// 玩家移动方向
	private int SelfMoveDirection;
	// 攻击类型
	private int Attacktype;
	// 攻击判定时间点
	private string Hitstime;
	// 技能判定距离
	private string Distance;
	// 移动时间点
	private string MoveTimes;
	// 移动距离
	private string Move;
	// 移动持续时间
	private string Movelast;
	// 击退距离
	private string Repel;
	// 击退持续时间
	private string RepelLast;
	// 浮空高度
	private string FloatEnemy;
	// 硬直幅度
	private float Hitrecover;
	// 硬直时间
	private float Hitrecovertime;
	// 技能音效
	private string SoundID;
	// 命中音效
	private int HitSound;
	// 音效播放时间点
	private string SoundTimes;
	// 震屏时间点
	private string ShakeMoment;
	// 震屏持续时间
	private string ShakeTimes;
	// 震屏强度
	private string Shakeintensity;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getDesc(){
		return Desc
	}
	public void setDesc(string Desc){
		this.Desc = Desc
	}
	
	public string getAinmName(){
		return AinmName
	}
	public void setAinmName(string AinmName){
		this.AinmName = AinmName
	}
	
	public int getAnimCondition(){
		return AnimCondition
	}
	public void setAnimCondition(int AnimCondition){
		this.AnimCondition = AnimCondition
	}
	
	public int getNextAnimId(){
		return NextAnimId
	}
	public void setNextAnimId(int NextAnimId){
		this.NextAnimId = NextAnimId
	}
	
	public int getEffectSID(){
		return EffectSID
	}
	public void setEffectSID(int EffectSID){
		this.EffectSID = EffectSID
	}
	
	public int getIsFellowOwner(){
		return IsFellowOwner
	}
	public void setIsFellowOwner(int IsFellowOwner){
		this.IsFellowOwner = IsFellowOwner
	}
	
	public float getSpeed(){
		return Speed
	}
	public void setSpeed(float Speed){
		this.Speed = Speed
	}
	
	public float getActTime(){
		return ActTime
	}
	public void setActTime(float ActTime){
		this.ActTime = ActTime
	}
	
	public float getEffectTime(){
		return EffectTime
	}
	public void setEffectTime(float EffectTime){
		this.EffectTime = EffectTime
	}
	
	public float getComboTime(){
		return ComboTime
	}
	public void setComboTime(float ComboTime){
		this.ComboTime = ComboTime
	}
	
	public float getSkillTime(){
		return SkillTime
	}
	public void setSkillTime(float SkillTime){
		this.SkillTime = SkillTime
	}
	
	public int getRockerTurn(){
		return RockerTurn
	}
	public void setRockerTurn(int RockerTurn){
		this.RockerTurn = RockerTurn
	}
	
	public int getRockerMove(){
		return RockerMove
	}
	public void setRockerMove(int RockerMove){
		this.RockerMove = RockerMove
	}
	
	public int getSelfMoveDirection(){
		return SelfMoveDirection
	}
	public void setSelfMoveDirection(int SelfMoveDirection){
		this.SelfMoveDirection = SelfMoveDirection
	}
	
	public int getAttacktype(){
		return Attacktype
	}
	public void setAttacktype(int Attacktype){
		this.Attacktype = Attacktype
	}
	
	public string getHitstime(){
		return Hitstime
	}
	public void setHitstime(string Hitstime){
		this.Hitstime = Hitstime
	}
	
	public string getDistance(){
		return Distance
	}
	public void setDistance(string Distance){
		this.Distance = Distance
	}
	
	public string getMoveTimes(){
		return MoveTimes
	}
	public void setMoveTimes(string MoveTimes){
		this.MoveTimes = MoveTimes
	}
	
	public string getMove(){
		return Move
	}
	public void setMove(string Move){
		this.Move = Move
	}
	
	public string getMovelast(){
		return Movelast
	}
	public void setMovelast(string Movelast){
		this.Movelast = Movelast
	}
	
	public string getRepel(){
		return Repel
	}
	public void setRepel(string Repel){
		this.Repel = Repel
	}
	
	public string getRepelLast(){
		return RepelLast
	}
	public void setRepelLast(string RepelLast){
		this.RepelLast = RepelLast
	}
	
	public string getFloatEnemy(){
		return FloatEnemy
	}
	public void setFloatEnemy(string FloatEnemy){
		this.FloatEnemy = FloatEnemy
	}
	
	public float getHitrecover(){
		return Hitrecover
	}
	public void setHitrecover(float Hitrecover){
		this.Hitrecover = Hitrecover
	}
	
	public float getHitrecovertime(){
		return Hitrecovertime
	}
	public void setHitrecovertime(float Hitrecovertime){
		this.Hitrecovertime = Hitrecovertime
	}
	
	public string getSoundID(){
		return SoundID
	}
	public void setSoundID(string SoundID){
		this.SoundID = SoundID
	}
	
	public int getHitSound(){
		return HitSound
	}
	public void setHitSound(int HitSound){
		this.HitSound = HitSound
	}
	
	public string getSoundTimes(){
		return SoundTimes
	}
	public void setSoundTimes(string SoundTimes){
		this.SoundTimes = SoundTimes
	}
	
	public string getShakeMoment(){
		return ShakeMoment
	}
	public void setShakeMoment(string ShakeMoment){
		this.ShakeMoment = ShakeMoment
	}
	
	public string getShakeTimes(){
		return ShakeTimes
	}
	public void setShakeTimes(string ShakeTimes){
		this.ShakeTimes = ShakeTimes
	}
	
	public string getShakeintensity(){
		return Shakeintensity
	}
	public void setShakeintensity(string Shakeintensity){
		this.Shakeintensity = Shakeintensity
	}
	
}

public class SkillAnimationCfg {
	public const string FILENAME = "SkillAnimation";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
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
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}