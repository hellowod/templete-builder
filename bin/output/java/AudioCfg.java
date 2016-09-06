package com.config;

import java.util.HashMap;

/***
 * AudioTbl.java
 * AudioCfg.java
 *
 * @Author: abaojin
 */
public class AudioTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 描述
	private string Desc;
	
	public string getDesc(){
		return Desc
	}
	
	public void setDesc(string Desc){
		this.Desc = Desc
	}
	
	// 路径
	private string Path;
	
	public string getPath(){
		return Path
	}
	
	public void setPath(string Path){
		this.Path = Path
	}
	
	// 音量
	private float Volumn;
	
	public float getVolumn(){
		return Volumn
	}
	
	public void setVolumn(float Volumn){
		this.Volumn = Volumn
	}
	
	// 2d和3d转换
	private float PanLevel;
	
	public float getPanLevel(){
		return PanLevel
	}
	
	public void setPanLevel(float PanLevel){
		this.PanLevel = PanLevel
	}
	
	// 是否循环（1循环0不循环）
	private int IsLoop;
	
	public int getIsLoop(){
		return IsLoop
	}
	
	public void setIsLoop(int IsLoop){
		this.IsLoop = IsLoop
	}
	
	// 延迟时间
	private float DelayTime;
	
	public float getDelayTime(){
		return DelayTime
	}
	
	public void setDelayTime(float DelayTime){
		this.DelayTime = DelayTime
	}
	
	// 保留时间
	private float LifeTime;
	
	public float getLifeTime(){
		return LifeTime
	}
	
	public void setLifeTime(float LifeTime){
		this.LifeTime = LifeTime
	}
	
	
}

public class AudioCfg
{
	public const string FILENAME = "Audio";
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
			AudioTbl record = new AudioTbl();
			
			record.Desc = table.GetString(i, "Desc");
			record.Path = table.GetString(i, "Path");
			record.Volumn = table.GetFloat(i, "Volumn");
			record.PanLevel = table.GetFloat(i, "PanLevel");
			record.IsLoop = table.GetInt(i, "IsLoop");
			record.DelayTime = table.GetFloat(i, "DelayTime");
			record.LifeTime = table.GetFloat(i, "LifeTime");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}