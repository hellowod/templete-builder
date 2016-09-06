package com.config;

import java.util.HashMap;

/***
 * AudioTbl.java
 * AudioCfg.java
 *
 * @Author: abaojin
 */
public class AudioTbl {

	// #主键
	private ﻿int Id;
	// 描述
	private string Desc;
	// 路径
	private string Path;
	// 音量
	private float Volumn;
	// 2d和3d转换
	private float PanLevel;
	// 是否循环（1循环0不循环）
	private int IsLoop;
	// 延迟时间
	private float DelayTime;
	// 保留时间
	private float LifeTime;
	
	
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
	
	public string getPath(){
		return Path
	}
	public void setPath(string Path){
		this.Path = Path
	}
	
	public float getVolumn(){
		return Volumn
	}
	public void setVolumn(float Volumn){
		this.Volumn = Volumn
	}
	
	public float getPanLevel(){
		return PanLevel
	}
	public void setPanLevel(float PanLevel){
		this.PanLevel = PanLevel
	}
	
	public int getIsLoop(){
		return IsLoop
	}
	public void setIsLoop(int IsLoop){
		this.IsLoop = IsLoop
	}
	
	public float getDelayTime(){
		return DelayTime
	}
	public void setDelayTime(float DelayTime){
		this.DelayTime = DelayTime
	}
	
	public float getLifeTime(){
		return LifeTime
	}
	public void setLifeTime(float LifeTime){
		this.LifeTime = LifeTime
	}
	
}

public class AudioCfg {
	public const string FILENAME = "Audio";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			AudioTbl record = new AudioTbl();
			
			record.Desc = table.GetString(i, "Desc");
			record.Path = table.GetString(i, "Path");
			record.Volumn = table.GetFloat(i, "Volumn");
			record.PanLevel = table.GetFloat(i, "PanLevel");
			record.IsLoop = table.GetInt(i, "IsLoop");
			record.DelayTime = table.GetFloat(i, "DelayTime");
			record.LifeTime = table.GetFloat(i, "LifeTime");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}