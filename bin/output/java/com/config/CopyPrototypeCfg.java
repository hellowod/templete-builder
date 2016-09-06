package com.config;

import java.util.HashMap;

/***
 * CopyPrototypeTbl.java
 * CopyPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class CopyPrototypeTbl {

	// #主键
	private ﻿int Id;
	// 程序不用的注释数据
	private string MarkDes;
	// 副本名称图片文字
	private string NameImg;
	// 副本界面背景图
	private string BgImg;
	// 解锁等级
	private int Unlocklevel;
	// 副本名称
	private string Name;
	// 副本描述
	private string Des;
	// 单人难度周次数限制
	private int SingleWeekCount;
	// 组队难度周次数限制
	private int TeamWeekCount;
	// 场景表场景id
	private int SceneID;
	// 前置副本ID
	private int PrepositionCopy;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getMarkDes(){
		return MarkDes
	}
	public void setMarkDes(string MarkDes){
		this.MarkDes = MarkDes
	}
	
	public string getNameImg(){
		return NameImg
	}
	public void setNameImg(string NameImg){
		this.NameImg = NameImg
	}
	
	public string getBgImg(){
		return BgImg
	}
	public void setBgImg(string BgImg){
		this.BgImg = BgImg
	}
	
	public int getUnlocklevel(){
		return Unlocklevel
	}
	public void setUnlocklevel(int Unlocklevel){
		this.Unlocklevel = Unlocklevel
	}
	
	public string getName(){
		return Name
	}
	public void setName(string Name){
		this.Name = Name
	}
	
	public string getDes(){
		return Des
	}
	public void setDes(string Des){
		this.Des = Des
	}
	
	public int getSingleWeekCount(){
		return SingleWeekCount
	}
	public void setSingleWeekCount(int SingleWeekCount){
		this.SingleWeekCount = SingleWeekCount
	}
	
	public int getTeamWeekCount(){
		return TeamWeekCount
	}
	public void setTeamWeekCount(int TeamWeekCount){
		this.TeamWeekCount = TeamWeekCount
	}
	
	public int getSceneID(){
		return SceneID
	}
	public void setSceneID(int SceneID){
		this.SceneID = SceneID
	}
	
	public int getPrepositionCopy(){
		return PrepositionCopy
	}
	public void setPrepositionCopy(int PrepositionCopy){
		this.PrepositionCopy = PrepositionCopy
	}
	
}

public class CopyPrototypeCfg {
	public const string FILENAME = "CopyPrototype";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			CopyPrototypeTbl record = new CopyPrototypeTbl();
			
			record.MarkDes = table.GetString(i, "MarkDes");
			record.NameImg = table.GetString(i, "NameImg");
			record.BgImg = table.GetString(i, "BgImg");
			record.Unlocklevel = table.GetInt(i, "Unlocklevel");
			record.Name = table.GetString(i, "Name");
			record.Des = table.GetString(i, "Des");
			record.SingleWeekCount = table.GetInt(i, "SingleWeekCount");
			record.TeamWeekCount = table.GetInt(i, "TeamWeekCount");
			record.SceneID = table.GetInt(i, "SceneID");
			record.PrepositionCopy = table.GetInt(i, "PrepositionCopy");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}