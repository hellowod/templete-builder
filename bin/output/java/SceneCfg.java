package com.config;

import java.util.HashMap;

/***
 * SceneTbl.java
 * SceneCfg.java
 *
 * @Author: abaojin
 */
public class SceneTbl
{
	// #主键(场景id)
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 备注(场景名称)
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 场景类型
	private int SceneType;
	
	public int getSceneType(){
		return SceneType
	}
	
	public void setSceneType(int SceneType){
		this.SceneType = SceneType
	}
	
	// 场景文件路径
	private string Path;
	
	public string getPath(){
		return Path
	}
	
	public void setPath(string Path){
		this.Path = Path
	}
	
	// 进入场景时显示场景名称
	private string NameImage;
	
	public string getNameImage(){
		return NameImage
	}
	
	public void setNameImage(string NameImage){
		this.NameImage = NameImage
	}
	
	// 可行走区域
	private string SceneBlock;
	
	public string getSceneBlock(){
		return SceneBlock
	}
	
	public void setSceneBlock(string SceneBlock){
		this.SceneBlock = SceneBlock
	}
	
	// 场景元素初始化配置
	private string SceneElement;
	
	public string getSceneElement(){
		return SceneElement
	}
	
	public void setSceneElement(string SceneElement){
		this.SceneElement = SceneElement
	}
	
	// 主背景音ID
	private int MainSoundId;
	
	public int getMainSoundId(){
		return MainSoundId
	}
	
	public void setMainSoundId(int MainSoundId){
		this.MainSoundId = MainSoundId
	}
	
	// 野外北京音ID
	private int FieldSoundId;
	
	public int getFieldSoundId(){
		return FieldSoundId
	}
	
	public void setFieldSoundId(int FieldSoundId){
		this.FieldSoundId = FieldSoundId
	}
	
	// 该场景对应的地图是否允许PVP1可0不可
	private int IsPVP;
	
	public int getIsPVP(){
		return IsPVP
	}
	
	public void setIsPVP(int IsPVP){
		this.IsPVP = IsPVP
	}
	
	
}

public class SceneCfg
{
	public const string FILENAME = "Scene";
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
			SceneTbl record = new SceneTbl();
			
			record.Name = table.GetString(i, "Name");
			record.SceneType = table.GetInt(i, "SceneType");
			record.Path = table.GetString(i, "Path");
			record.NameImage = table.GetString(i, "NameImage");
			record.SceneBlock = table.GetString(i, "SceneBlock");
			record.SceneElement = table.GetString(i, "SceneElement");
			record.MainSoundId = table.GetInt(i, "MainSoundId");
			record.FieldSoundId = table.GetInt(i, "FieldSoundId");
			record.IsPVP = table.GetInt(i, "IsPVP");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}