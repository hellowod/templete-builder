package com.config;

import java.util.HashMap;

/***
 * SceneBoxTbl.java
 * SceneBoxCfg.java
 *
 * @Author: abaojin
 */
public class SceneBoxTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 备注
	private string Comment;
	
	public string getComment(){
		return Comment
	}
	
	public void setComment(string Comment){
		this.Comment = Comment
	}
	
	// 宝箱品质
	private int Quality;
	
	public int getQuality(){
		return Quality
	}
	
	public void setQuality(int Quality){
		this.Quality = Quality
	}
	
	// 名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 模型路径
	private string ModelPath;
	
	public string getModelPath(){
		return ModelPath
	}
	
	public void setModelPath(string ModelPath){
		this.ModelPath = ModelPath
	}
	
	// 存在特效id（特效表）
	private int ExistEffect;
	
	public int getExistEffect(){
		return ExistEffect
	}
	
	public void setExistEffect(int ExistEffect){
		this.ExistEffect = ExistEffect
	}
	
	// 打开特效id
	private int OpenEffect;
	
	public int getOpenEffect(){
		return OpenEffect
	}
	
	public void setOpenEffect(int OpenEffect){
		this.OpenEffect = OpenEffect
	}
	
	
}

public class SceneBoxCfg
{
	public const string FILENAME = "SceneBox";
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
			SceneBoxTbl record = new SceneBoxTbl();
			
			record.Comment = table.GetString(i, "Comment");
			record.Quality = table.GetInt(i, "Quality");
			record.Name = table.GetString(i, "Name");
			record.ModelPath = table.GetString(i, "ModelPath");
			record.ExistEffect = table.GetInt(i, "ExistEffect");
			record.OpenEffect = table.GetInt(i, "OpenEffect");
			
			if(!dict.ContainsKey(record.Id))
			{
				continue;
			}
			dict.Add(record.Id, record);
		}
		return dict;
	}	
}